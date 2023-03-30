
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FirstExample {

    static final String BD_URL = "jdbc:mysql://localhost:3306/bd_ejemplo";
    static final String USUARIO = "root";
    static final String CLAVE = "root";

    public static void main(String[] args) {
        try {            
            // Abre la conexion
            Connection conexion = DriverManager.getConnection(BD_URL, USUARIO, CLAVE);
            Statement sentencia = conexion.createStatement();
            // Crea cadena de consulta
            String consulta = "SELECT * FROM Estudiantes";
            // Envía la consulta para que se ejecute
            ResultSet resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next ()) {
                int id = resultados.getInt ("id");
                String nombres = resultados.getString ("nombres");
                
                System.out.println ("ID: " + id + " NOMBRES: " + nombres);
            }
            System.out.println ("Hasta pronto!!");
            
        } catch (SQLException ex) {
            System.out.println ("Error SQL");
            ex.printStackTrace();
        }
    }

}
