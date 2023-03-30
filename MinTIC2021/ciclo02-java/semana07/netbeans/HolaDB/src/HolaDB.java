
import java.sql.*;

public class HolaDB {
    // Cadena de conexión con la ruta completa
    // Windows:
    // static final String BD_URL  = "jdbc:sqlite:c:\documentos\ejemplos\bd_estudiantes.db";
    // Linux o Mac
    //static final String BD_URL = "jdbc:sqlite:/home/lg/Downloads/bdatos/bd_estudiantes.db";

    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            // Abre la conexion
            Connection conexion = DriverManager.getConnection (BD_URL);
            Statement sentencia = conexion.createStatement();

            // Crea cadena de consulta
            String consulta = "SELECT * FROM estudiantes";
            // Envía la consulta para que se ejecute
            ResultSet resultados = sentencia.executeQuery(consulta);

            // Extract data from result set
            while (resultados.next()) {
                String nombres = resultados.getString("nombres");
                String programa = resultados.getString("programa");

                System.out.println(" NOMBRES: " + nombres + " PROG: " + programa);
            }
            System.out.println("Hasta pronto!");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
