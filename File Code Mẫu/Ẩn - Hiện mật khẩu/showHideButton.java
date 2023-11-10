public void showHideButton() {
        if (ckbShowHide.isSelected()) {
            txtMatKhau.setEchoChar((char) 0);
            ckbShowHide.setText("Hide");
        } else {
            txtMatKhau.setEchoChar('*');
            ckbShowHide.setText("Show");
        }
    }
