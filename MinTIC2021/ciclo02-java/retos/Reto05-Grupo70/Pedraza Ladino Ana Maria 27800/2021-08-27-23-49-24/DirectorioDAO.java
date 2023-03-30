import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
            // Adiciona el estudiante "e" al DAO, es decir a la lista
            // Crear la cadeana "insert into...."
            // ejecutar con executeQuery
            String consulta = String.format (
                    "INSERT INTO estudiantes VALUES ('nombres', 'apellidos', 'fechaNacimiento', 'correoInstitucional', 'correoPersonal' , numeroCelular, numeroFijo, 'programa')",
                    e.nombres, e.apellidos, e.fechaNacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroFijo, e.programa);
           
            sentencia.executeUpdate (consulta);
        } catch (SQLException ex) {
            System.out.println ("Error SQL: no pudo adicionar a la BD.");
            ex.printStackTrace();
                    
        }
    }

    public Estudiantes buscar(String correoInstitucional) {
        Estudiantes e = null;
        try {
            
            String consulta = String.format (
                    "SELECT * FROM estudiantes WHERE correoInstitucional='%s'", 
                    correoInstitucional
            );
  
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("CorreoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numeroFijo = (long) resultados.getInt ("numeroFijo");
                String programa = resultados.getString("programaAcademico");
                
                e = new Estudiantes (nombres, apellidos, fechaNacimiento, correoInst, correoPersonal, numeroCelular, numeroFijo, programa);
            }

        } catch (SQLException ex) {
            System.out.println ("Estudiante no encontrado");
        }
        return (e);
    }

    public void actualizar(String correoInst, Estudiantes nuevo) {
        try {
            // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst"
            // y lo cambia por el "nuevo" que llega
            String consulta = String.format (
                    "UPDATE estudiantes SET nombres='%s', numeroCelular=%s WHERE correoInstitucional='%s'",
                    nuevo.nombres, nuevo.apellidos, nuevo.fechaNacimiento, correoInst, nuevo.numeroCelular, nuevo.numeroFijo, nuevo.programa);
            
            sentencia.executeUpdate(consulta);
            System.out.println (consulta);
        } catch (SQLException ex) {
            System.out.println ("No se pudo actualizar la BD");
            ex.printStackTrace();
        }

    }

    public void eliminar(String correoInst) {
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
try {
            System.out.println ("Se eliminó el estudiante");
            String consulta = String.format ("DELETE FROM estudiantes WHERE correoInstitucional='%s'");
            
            sentencia.executeUpdate(consulta);
            //System.out.println (consulta);
        } catch (SQLException ex) {
            System.out.println ("No se pudo eliminar");
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
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("CorreoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numeroFijo = (long) resultados.getInt ("numeroFijo");
                String programa = resultados.getString("programaAcademico");
               
Estudiantes e = new Estudiantes (nombres, apellidos, fechaNacimiento, correoInst, correoPersonal, numeroCelular, numeroFijo, programa);
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
