public void updateCanhBao() {
        int i = 5000;
        timer = new Timer(i, new ActionListener() {
            int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Dừng timer nếu đã hoàn thành
                lblCanhBao.setText("");
                timer.stop();
            }
        });

        //chạy timer ở trên
        timer.start();
    }
