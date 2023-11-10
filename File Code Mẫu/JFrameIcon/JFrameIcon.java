public class XImages {

    public static Image getAppIcon() {
        URL iconURL = XImages.class.getResource("/icons/iconsss122121.png");

        if (iconURL != null) {
            // Đường dẫn hợp lệ, sử dụng nó để tạo ImageIcon
            return new ImageIcon(iconURL).getImage();
        } else {
            // Đường dẫn không hợp lệ, xử lý lỗi hoặc thông báo
            System.err.println("Không thể tìm thấy file icon.");
            return null; // hoặc trả về ảnh mặc định khác nếu cần
        }
    }
}
