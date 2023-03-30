import java.sql.*;

public class FirstExample {
   static final String BD_URL  = "jdbc:mysql://localhost:3306/bd_ejemplo";
   static final String USUARIO = "root";
   static final String CLAVE   = "root";

   public static void main(String[] args) {
      try {
		  // Abre la conexion
		 Connection conexion = DriverManager.getConnection (BD_URL, USUARIO, CLAVE);
         Statement sentencia = conexion.createStatement();

		 // Crea cadena de consulta
		 String consulta = "SELECT * FROM Estudiantes"; 
		 // Envía la consulta para que se ejecute
         ResultSet resultados = sentencia.executeQuery (consulta); 

         // Extract data from result set
         while (resultados.next()) {

			 int id          = resultados.getInt ("id");
			 String nombres  = resultados.getString ("nombres");

			 System.out.println ("ID: " + id + " NOMBRES: " + nombres);
         }
		 System.out.println ("Hasta pronto!");

      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
