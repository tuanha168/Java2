package JDBC;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testSelect {
  public static void main(String[] args) {
    try {
      String connectionString = "jdbc:sqlserver://localhost:1434;databaseName=SQL_Java;integratedSecurity=true";
      var conn = DriverManager.getConnection(connectionString);
      if (conn != null) {
        Statement stmt = conn.createStatement();
        String sql = "select * from student";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
          System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
        }
      } else {
        System.out.println("Insert Failed");
      }
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
