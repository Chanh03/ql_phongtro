public void updateProgressBar() {
        timer = new Timer(10, new ActionListener() {
            int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Cập nhật giá trị cho ProgressBar
                pgbLoading.setValue(progress);
                progress++;
                // Dừng timer nếu đã hoàn thành
                if (progress > 100) {
                    timer.stop();
                    dispose(); // Ẩn frame hiện tại
                    dangNhapJFrame.setVisible(true); // Hiển thị frame mới
                }
            }
        });
        timer.start();
    }
