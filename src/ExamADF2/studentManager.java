package ExamADF2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class studentManager {
  // private String enrollId;
  // private String firstName;
  // private String lastName;
  // private int age;

  public studentManager() {
  }

  public String addNewStudent(String enrollId, String firstName, String lastName, int age) throws SQLException {
    String message = "";
    try (Connection conn = DriverManager
        .getConnection("jdbc:sqlserver://localhost:1434;databaseName=SchoolDB;integratedSecurity=true")) {
      String sql = "INSERT INTO Students VALUES (?,?,?,?)";
      PreparedStatement psmt = conn.prepareStatement(sql);

      psmt.setString(1, enrollId);
      psmt.setString(2, firstName);
      psmt.setString(3, lastName);
      psmt.setInt(4, age);

      psmt.executeUpdate();
      message = "Thanh Cong";

    } catch (SQLException e) {
      message = e.getMessage();
    }
    return message;
  }

  public String deleteStudent(String enrollId) {
    String message = "";
    try (Connection conn = DriverManager
        .getConnection("jdbc:sqlserver://localhost:1434;databaseName=SchoolDB;integratedSecurity=true")) {
      String sql = "DELETE FROM Students WHERE EnrollId=?";
      PreparedStatement psmt = conn.prepareStatement(sql);

      psmt.setString(1, enrollId);

      psmt.executeUpdate();
      message = "Thanh Cong";

    } catch (SQLException e) {
      message = e.getMessage();
    }
    return message;
  }

  public void selectAllStudents() {
    try (Connection conn = DriverManager
        .getConnection("jdbc:sqlserver://localhost:1434;databaseName=SchoolDB;integratedSecurity=true")) {
      String sql = "SELECT * FROM Students";
      PreparedStatement psmt = conn.prepareStatement(sql);
      ResultSet rs = psmt.executeQuery();

      System.out.println("EnrollId" + "\t" + "Full Name" + "\t\t" + "Age");

      while (rs.next()) {
        System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + " " + rs.getString(3) + "\t\t" + rs.getInt(4));
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
