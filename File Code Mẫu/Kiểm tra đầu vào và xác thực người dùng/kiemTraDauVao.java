public void KiemTraDauVao() {
        String password = new String(txtMatKhau.getPassword());

        //Kiểm tra dữ liệu nhập vào
        if (txtTenDangNhap.getText().equalsIgnoreCase("")) {
            lblCanhBao.setText("Vui lòng nhập thông tin");
            updateCanhBao();
            txtTenDangNhap.requestFocus();
        } else if (password.equalsIgnoreCase("")) {
            lblCanhBao.setText("Vui lòng nhập thông tin");
            txtMatKhau.requestFocus();
            updateCanhBao();
        } else { //xác thực người dùng và phân quyền hệ thống
            try {
                con = JBDCUtils.getConnection("sa", "1234", "QUANLYPHONGTRO");
                String sql = "Select * from NguoiDung";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    String tenDangNhap = rs.getNString("TenDangNhap");
                    String matKhau = rs.getNString("MatKhau");
                    String chucVu = rs.getNString("ChucVu");

                    if (txtTenDangNhap.getText().equalsIgnoreCase(tenDangNhap) && password.equalsIgnoreCase(matKhau)) {
                        System.out.println("Đăng nhập thành công");
                        if (chucVu.equalsIgnoreCase("Quản Lí")) {
                            System.out.println("quuan li");
                        } else {
                            System.out.println("nv");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không chính xác", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
                    }
                }
                con.close();

            } catch (SQLException ex) {
                Logger.getLogger(DangNhapJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
