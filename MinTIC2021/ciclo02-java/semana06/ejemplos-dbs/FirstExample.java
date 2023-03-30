import java.sql.*;

public class FirstExample {
   static final String DB_URL = "jdbc:mysql://localhost:3306/db_simple";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT * FROM Estudiantes";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("numero"));
            //System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("nombres"));
            //System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
