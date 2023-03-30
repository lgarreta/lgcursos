
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos de Conexion
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    //static final String USUARIO = "root";
    //static final String CLAVE = "root";
    
    // Objetos para conectarnos a la BD
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;
    
    
    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
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

    
    public void adicionar (Estudiante e) {
        try {
            // Adiciona el estudiante "e" al DAO, es decir a la lista
            // Crear la cadeana "insert into...."
            // ejecutar con executeQuery
            String consulta = String.format (
                    "INSERT INTO estudiantes VALUES ('%s','%s', '%s', '%s' , '%s', %s, %s,'%s')",
                    e.nombres,e.apellidos,e.fechaNacimiento, e.correoInstitucional,e.correoPersonal,e.numeroCelular,e.numeroFijo,e.programaAcademico
            );
            //System.out.println (consulta);
            sentencia.executeUpdate (consulta);
        } catch (SQLException ex) {
            System.out.println ("Error SQL: no pudo adicionar a la BD.");
            ex.printStackTrace();
                    
        }
    }

    
    public Estudiante buscar (String correoInst) {
        Estudiante e = null;
        try {
            
            
            String consulta = String.format (
                    "SELECT * FROM estudiantes WHERE correoInstitucional='%s'", 
                    correoInst
            );
            
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoInstitucional = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numeroFijo = (long) resultados.getInt ("numeroFijo");
                String programaAcademico = resultados.getString("programa");
                
                e = new Estudiante (nombres,apellidos,fechaNacimiento, correoInstitucional,correoPersonal, numeroCelular,numeroFijo,programaAcademico);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        try {
            // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst"
            // y lo cambia por el "nuevo" que llega
            String consulta = String.format (
                    "UPDATE estudiantes SET correoPersonal='%s', numeroCelular=%s,numeroFijo=%s,programa=%s WHERE correoInstitucional='%s'",
                    nuevo.correoPersonal, nuevo.numeroCelular, nuevo.numeroFijo,nuevo.programaAcademico, correoInst
            );
            
            sentencia.executeUpdate(consulta);
            System.out.println (consulta);
        } catch (SQLException ex) {
            System.out.println ("No se pudo actualizar la BD");
            ex.printStackTrace();
        }
    }
    
    public void eliminar(String correoInst) {
        
        try {
            String eliminar = String.format (
                    "DELETE FROM estudiantes WHERE correoInstitucional=='%s'",
                    correoInst
            );
            sentencia.executeUpdate(eliminar);
            System.out.println ("Se eliminó el estudiante ");
            //System.out.println (consulta)
            } catch (SQLException ex) {
            System.out.println ("No se pudo eliminar la BD");
            ex.printStackTrace();
        }
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
    }
    
    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList <Estudiante> listaEstudiantes = new ArrayList <Estudiante> ();
             
        try {

            String consulta = "SELECT * FROM Estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoInstitucional = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numeroFijo = (long) resultados.getInt ("numeroFijo");
                String programaAcademico = resultados.getString("programa");
                
                Estudiante e = new Estudiante (nombres,apellidos,fechaNacimiento, correoInstitucional,correoPersonal, numeroCelular,numeroFijo,programaAcademico);
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

    