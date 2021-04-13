package JDBC;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testInsert {
  public static void main(String[] args) {
    try {
      String connectionString = "jdbc:sqlserver://localhost:1434;databaseName=SQL_Java;integratedSecurity=true";
      var conn = DriverManager.getConnection(connectionString);
      if (conn != null) {
        Statement stmt = conn.createStatement();
        String sql = "INSERT Student(Name,Address,Age) VALUES ('Anh Tuan','Ha Noi',20)";
        var result = stmt.executeUpdate(sql);
        if (result > 0) {
          System.out.println("Insert Successful!");
        } else {
          System.out.println("Insert Failed");
        }

      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
