import java.sql.Statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.lang.NullPointerException;

interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void actualizar (String correoInst, Estudiante nuevo);
    public void eliminar (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}

public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    
     // Objetos para conectarnos a la BD
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;
    
    // Metodos
     
    
    public void crear() {            
        try {
            Class.forName("org.sqlite.JDBC");
            // conexion = DriverManager.getConnection(BD_URL, USUARIO, CLAVE);
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = (Statement) conexion.createStatement();
            //sentencia = conexion.createStatement();
            
        } catch (SQLException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit (1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void adicionar (Estudiante e) {
        try {
            String consulta = String.format ("INSERT INTO estudiantes VALUES ('%s', '%s', %s, '%s', '%s', %s,'%s', '%s')", 
            e.nombres, e.apellidos, e.fechaNacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroFijo, 
            e.programaAcademico);
        
            //System.out.println("Se agregó el estudiante");
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex){
            System.out.println("ErrorSQL, no se adiciono a la BD");
            ex.printStackTrace();
        }    
    }
    
      
    public Estudiante buscar(String correoInstitucional) {      
        Estudiante e = null;
        try {           
            String consulta = String.format ("SELECT * FROM estudiantes WHERE correoInstitucional='%s'", correoInstitucional);
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {                
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoIns = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numeroFijo = (long) resultados.getInt ("numeroFijo");
                String programaAcademico = resultados.getString("programaAcademico");
                
                e = new Estudiante (nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCelular, numeroFijo, programaAcademico );
                //listaEstudiantes.add (e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        try {
            String consulta = String.format (
                    "UPDATE estudiantes SET correoPersonal='%s', numeroCelular=%s ,numeroFijo=%s, programaAcademico='%s' WHERE correoInstitucional='%s'",
                    nuevo.correoPersonal, nuevo.numeroCelular, nuevo.numeroFijo, nuevo.programaAcademico ,correoInst );
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            System.out.println ("No actualizo la BD");
            ex.printStackTrace();
        } 
    }
    
    public void eliminar (String correoInst){
      
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            
            if (correoInst.equals (e.correoInstitucional))
               listaEstudiantes.remove(e);
         }
    }

    
    public ArrayList<Estudiante> obtenerTodos() {     
        
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

        try {
            String consulta = "SELECT * FROM estudiantes";
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
                String programaAcademico = resultados.getString("programaAcademico");

                Estudiante e = new Estudiante ( nombres,apellidos,fechaNacimiento , correoInstitucional,correoPersonal, numeroCelular, 
                        numeroFijo, programaAcademico);
                listaEstudiantes.add(e);
            }
            // Retorna una lista con todos los estudiantes
        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos");
            ex.printStackTrace();
        }
        return (listaEstudiantes);
    }
    
}