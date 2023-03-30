
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ClassCastException;


public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos de Conexion
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    ArrayList <Estudiante> listaEstudiantes;   
    //static final String USUARIO = "root";
    //static final String CLAVE = "root";
    
    // Objetos para conectarnos a la BD
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;
    PreparedStatement pS;

    // Metodos
    public void crear () {
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
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        
        try{
        String consulta = String.format ("INSERT INTO estudiantes VALUES ('%s', '%s','%s','%s','%s','%s','%s', '%s' )", e.nombres, e.apellidos, e.fechaNacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroFijo, e.programaAcademico);
        pS = conexion.prepareStatement(consulta);
        pS.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
        public ArrayList <Estudiante> buscar (String correoInst) {
        Estudiante e = null;
        ArrayList <Estudiante> listaEstudiantes = new ArrayList <Estudiante> ();
        listaEstudiantes = null;
        
        try {
            String cadena = "'" + correoInst + "'";
            String consulta = "SELECT * FROM estudiantes WHERE correoInstitucional = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            ArrayList <Estudiante> listaEncontrada = new ArrayList <> ();
                           
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNacimiento");
                String correoPer = resultados.getString("correoPersonal");
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                long nroFijo = (long) resultados.getInt ("numeroFijo");
                String programa = resultados.getString("programa");
                
                e = new Estudiante (nombres, apellidos, fechaNac, correoInst, correoPer, nroCelular, nroFijo, programa);
                
                listaEncontrada.add (e);            
                listaEstudiantes = listaEncontrada;
            }

        } catch (SQLException ex) {
            System.out.println ("Estudiante no encontrado");
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (listaEstudiantes);
    }
    
    public void actualizar (String correoInstitucional, Estudiante eNuevo) {
        // Buscar en el DAO el estudiante que tenga el correo igual al "correoInstitucional" 
        // y actualiza el estudiante con la nueva información 
        
        try {
        String consulta = String.format("UPDATE estudiantes SET correoPersonal='%s', numeroCelular='%s', numeroFijo='%s', programa='%s' WHERE correoInstitucional='%s'", eNuevo.correoPersonal, eNuevo.numeroCelular, eNuevo.numeroFijo, eNuevo.programaAcademico, correoInstitucional);  
        pS = conexion.prepareStatement(consulta);
        pS.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos.");
            ex.printStackTrace();
        }
    }
    
    public void eliminar (String correoInstitucional){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
    
        try{
        String consulta = String.format ("DELETE FROM estudiantes WHERE correoInstitucional = '%s'", correoInstitucional);
        pS = conexion.prepareStatement(consulta);
        pS.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error Obteniendo Datos.");
            ex.printStackTrace();
        }
              
    }


    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        
        Estudiante e = null;
        ArrayList <Estudiante> listaEstudiantesO = new ArrayList <Estudiante> ();
             
        try {
            String consulta = "SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNacimiento");
                String correoInstitucional = resultados.getString("correoInstitucional");
                String correoPer = resultados.getString("correoPersonal");
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                long nroFijo = (long) resultados.getInt ("numeroFijo");
                String programa = resultados.getString("programa");
                
                e = new Estudiante (nombres, apellidos, fechaNac, correoInstitucional, correoPer, nroCelular, nroFijo, programa);
                listaEstudiantesO.add (e);
            }

        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos.");
            ex.printStackTrace();
        }
        return (listaEstudiantesO);
    }

}