
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DirectorioDAO implements DirectorioDAOInterface {

    // Atributos de Conexion
    static final String BD_URL = "jdbc:mysql://localhost:3306/bd_ejemplo";
    static final String USUARIO = "root";
    static final String CLAVE = "root";

    // Objetos para conectarnos a la BD
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;

    // Metodos
    public void crear() {
        try {
            // Abre la conexion
            conexion = DriverManager.getConnection(BD_URL, USUARIO, CLAVE);
            sentencia = conexion.createStatement();

        } catch (SQLException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit (1);
        }
    }

    public void adicionar(Estudiantes e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
    }

    public Estudiantes buscar(String correoInstitucional) {
        Estudiantes e = null;
        try {
            
            String cadena = "'" + correoInstitucional + "'";
            String consulta = "SELECT * FROM Estudiantes WHERE correoInstitucional = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                int id = resultados.getInt("id");
                String nombres = resultados.getString("nombres");
                String correoInst = resultados.getString("correoInstitucional");
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                
                e = new Estudiantes (id, nombres, correoInst, nroCelular);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }

    public void actualizar(String correoInst, Estudiantes nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        System.out.println("Actualizando DAO con nuevo estudiante...");

    }

    public void eliminar(String correoInst) {
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
    }

    public ArrayList<Estudiantes> obtenerTodos() {
        ArrayList <Estudiantes> listaEstudiantes = new ArrayList <Estudiantes> ();
             
        try {

            String consulta = "SELECT * FROM Estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                int id = resultados.getInt("id");
                String nombres = resultados.getString("nombres");
                String correoInst = resultados.getString("correoInstitucional");
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                
                Estudiantes e = new Estudiantes (id, nombres, correoInst, nroCelular);
                listaEstudiantes.add (e);
            }
            // Retorna una lista con todos los estudiantes
        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos.");
            ex.printStackTrace();
        }
        
        return (listaEstudiantes);
    }

}
