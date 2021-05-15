package Session6.JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleJDBCPrepareStatement {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      try (Connection conn = DriverManager
          .getConnection("jdbc:sqlserver://localhost:1434;databaseName=ExampleLogin;integratedSecurity=true")) {
        String sql = "SELECT * FROM Users";
        try (Statement stm = conn.createStatement()) {
          ResultSet rs = stm.executeQuery(sql);
          while (rs.next()) {
            String email = rs.getString("Email");
            String pass = rs.getString("Password");
            System.out.println(email + "\t" + pass);
          }
        } catch (SQLException e) {
          System.out.println(e.getMessage());
        }

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Password:");
        String password = sc.nextLine();

        sql = "SELECT * FROM Users WHERE Email=? AND Password=?";
        PreparedStatement psmt = conn.prepareStatement(sql);

        psmt.setString(1, email);
        psmt.setString(2, password);

        ResultSet rs = psmt.executeQuery();

        if (rs.next()) {
          System.out.println("Thanh Cong");
        } else {
          System.out.println("That bai");
        }

      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
