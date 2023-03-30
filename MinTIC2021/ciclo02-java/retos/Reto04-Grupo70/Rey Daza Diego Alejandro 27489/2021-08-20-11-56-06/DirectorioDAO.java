
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
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";

    // Objetos para conectarnos a la BD
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;

    // Metodos
    public void crear() {
        try {
            Class.forName("org.sqlite.JDBC");
            // Abre la conexion
            // conexion = DriverManager.getConnection(BD_URL, USUARIO, CLAVE);
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();

        } catch (SQLException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit (1);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de Clase no encontrada");
            ex.printStackTrace();
            System.exit (1);
        }
    }

    public void adicionar(Estudiantes e) {
        try {
            String consulta = String.format("INSERT INTO estudiantes VALUES('%s','%s','%s','%s','%s','%s','%s','%s')", e.nombres, e.apellidos, e.nacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroFijo, e.programa);
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            System.out.println("Error al adicionar");
            ex.printStackTrace();

        }

        
        
    }

    public Estudiantes buscar(String correoInstitucional) {
        Estudiantes e = null;
        try {
            
            String consulta = String.format ("SELECT * FROM estudiantes WHERE correoInstitucional='%s'", 
                    correoInstitucional);
  
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                String programa = resultados.getString("programa");
                long nroCelular = (long) resultados.getInt("numeroCelular");
                long nRoFijo = (long) resultados.getInt("numeroFijo");
                
                e = new Estudiantes (nombres, apellidos, fechaNac,  correoInst, correoPersonal,  programa, nroCelular, nRoFijo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }

    public void actualizar(String correoInst, Estudiantes nuevo) {
        try {
            String consulta = String.format("UPDATE estudiantes SET correoPersonal = '%s', numeroCelular = %s, numeroFijo = %s, programa = '%s'",nuevo.correoPersonal, nuevo.numeroCelular, nuevo.numeroFijo,nuevo.programa, correoInst);
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            System.out.println("Error en actualizar");
            ex.printStackTrace();
        }
        
        

    }

    public void eliminar(String correoInst) {
         try {
            String consulta = String.format ("DELETE FROM estudiantes WHERE correoInstitucional=='%s'", correoInst);
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            System.out.println("Error al borrar");
            ex.printStackTrace();
            
        }
        
        
        
        
        
    }

    public ArrayList<Estudiantes> obtenerTodos() {
        ArrayList <Estudiantes> listaEstudiantes = new ArrayList <Estudiantes> ();
             
        try {
            String consulta = "SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                String programa = resultados.getString("programa");
                long nroCelular = (long) resultados.getInt("numeroCelular");
                long nRoFijo = (long) resultados.getInt("numeroFijo");
              

                
                
                
                Estudiantes e = new Estudiantes (nombres, apellidos, fechaNac,  correoInst, correoPersonal,  programa, nroCelular, nRoFijo);
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
