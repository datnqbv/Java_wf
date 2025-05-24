package connect;

import java.sql.*;


public class ConnectToSQL {

    // Phương thức để lấy kết nối tới SQL Server
    public static Connection getConnection() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=EmployeeManagementNew4;encrypt=false;trustServerCertificate=true";
        String username = "sa";  // Điền vào thông tin tài khoản của bạn
        String password = "123456789";  // Điền vào mật khẩu của bạn

        try {
            // Tạo kết nối
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");
            return conn;
        } catch (SQLException e) {
            System.err.println("Lỗi kết nối: " + e.getMessage());
            return null;
        }
    }

    // Phương thức main để test kết nối
    public static void main(String[] args) {
        // Kiểm tra xem kết nối có thành công không
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Đã kết nối tới cơ sở dữ liệu.");
        } else {
            System.out.println("Không thể kết nối tới cơ sở dữ liệu.");
        }
    }
}