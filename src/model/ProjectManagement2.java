
package model;

import connect.ConnectToSQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ProjectManagement2 {
    
     // Kết nối cơ sở dữ liệu
    public static Connection getConnection() {
        return ConnectToSQL.getConnection();
    }
    
    public ResultSet searchProject(String searchCriteria, String value) throws SQLException {
        // Biến chứa câu lệnh SQL để truy vấn
        String query = "";

        // Kiểm tra điều kiện tìm kiếm
        if (searchCriteria.equals("Employee_ID")) {
            query = "SELECT * FROM Project WHERE Employee_ID = ?";
        } else if (searchCriteria.equals("Project_ID")) {
            query = "SELECT * FROM Project WHERE Project_ID = ?";
        } else if (searchCriteria.equals("ALL")) {
            query = "SELECT * FROM Project"; // Truy vấn toàn bộ dữ liệu
        } else {
            throw new SQLException("Không tìm thấy tiêu chí tìm kiếm hợp lệ.");
        }

        // Kết nối và thực hiện truy vấn
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        // Gán giá trị cho câu truy vấn nếu không phải tìm kiếm "ALL"
        if (!searchCriteria.equals("ALL")) {
            ps.setString(1, value);
        }

        return ps.executeQuery(); // Trả về kết quả truy vấn dưới dạng ResultSet
    }

     // Phương thức thêm dự án mới
    public boolean addProject(int employeeId, int projectId, String projectName, String role, String startDate, String endDate, String status) throws SQLException {
        // Kiểm tra xem employeeId có tồn tại trong bảng add_employee không
        String checkEmployeeQuery = "SELECT COUNT(*) FROM add_employee WHERE Employee_ID = ?";
        Connection conn = getConnection();
        PreparedStatement psCheckEmployee = conn.prepareStatement(checkEmployeeQuery);
        psCheckEmployee.setInt(1, employeeId);

        ResultSet rsCheckEmployee = psCheckEmployee.executeQuery();
        if (rsCheckEmployee.next()) {
            int employeeCount = rsCheckEmployee.getInt(1);
            if (employeeCount == 0) {
                // Nếu không tìm thấy employeeId trong bảng add_employee, thông báo lỗi
                JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại trong hệ thống.");
                return false;
            }
        }

        // Nếu employeeId hợp lệ, tiếp tục thực hiện thêm dự án vào bảng Project
        String query = "INSERT INTO Project (Employee_ID, Project_ID, Project_Name, Role, Start_Date, End_Date, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, employeeId);
        ps.setInt(2, projectId);
        ps.setString(3, projectName);
        ps.setString(4, role);
        ps.setString(5, startDate);
        ps.setString(6, endDate);
        ps.setString(7, status);

        int rowsAffected = ps.executeUpdate();

        // Kiểm tra nếu có dòng nào bị ảnh hưởng, tức là thêm thành công
        return rowsAffected > 0;
    }

    
    public boolean updateProject(int employeeId, int projectId, String projectName, String role, String startDate, String endDate, String status) throws SQLException {
        // Kiểm tra xem employeeId có tồn tại trong bảng add_employee không
        String checkEmployeeQuery = "SELECT COUNT(*) FROM add_employee WHERE Employee_ID = ?";
        Connection conn = getConnection();
        PreparedStatement psCheckEmployee = conn.prepareStatement(checkEmployeeQuery);
        psCheckEmployee.setInt(1, employeeId);

        ResultSet rsCheckEmployee = psCheckEmployee.executeQuery();
        if (rsCheckEmployee.next()) {
            int employeeCount = rsCheckEmployee.getInt(1);
            if (employeeCount == 0) {
                // Nếu không tìm thấy employeeId trong bảng add_employee, thông báo lỗi
                JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại trong hệ thống.");
                return false;
            }
        }

        // Nếu employeeId hợp lệ, tiếp tục thực hiện cập nhật dự án vào bảng Project
        String query = "UPDATE Project SET Project_Name = ?, Role = ?, Start_Date = ?, End_Date = ?, Status = ? WHERE Employee_ID = ? AND Project_ID = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, projectName);
        ps.setString(2, role);
        ps.setString(3, startDate);
        ps.setString(4, endDate);
        ps.setString(5, status);
        ps.setInt(6, employeeId);
        ps.setInt(7, projectId);

        int rowsAffected = ps.executeUpdate();

        // Kiểm tra nếu có dòng nào bị ảnh hưởng, tức là cập nhật thành công
        return rowsAffected > 0;
    }

    public boolean removeProject(int employeeId, int projectId) throws SQLException {
        String query = "DELETE FROM Project WHERE Employee_ID = ? AND Project_ID = ?";

        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, employeeId);
        ps.setInt(2, projectId);

        int rowsAffected = ps.executeUpdate();

        // Kiểm tra nếu có dòng nào bị ảnh hưởng, tức là xóa thành công
        return rowsAffected > 0;
    }
    
}
