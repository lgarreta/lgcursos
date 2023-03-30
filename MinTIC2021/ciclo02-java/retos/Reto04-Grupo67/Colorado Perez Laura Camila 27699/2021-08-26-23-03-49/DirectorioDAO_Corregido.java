
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DirectorioDAO implements DirectorioDAOInterface {
    

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

    
    
    
    public void adicionar (Estudiante e) {
        try {

			// ERROR: doble comilla en la cadena. 
            //       "INSERT INTO estudiantes VALUES ('%s','%s', '%s', '%s' , '%s'', %s, %s,'%s')",
			// CORREGIDO
            String consulta = String.format (
                    "INSERT INTO estudiantes VALUES ('%s','%s', '%s', '%s' , '%s', %s, %s,'%s')",
                    e.nombres,e.apellidos, e.fechaNacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numerofijo,e.programaAcademico
            );
            sentencia.executeUpdate (consulta);
        } catch (SQLException ex) {
            System.out.println ("Error SQL: no pudo adicionar a la BD.");
            ex.printStackTrace();
                    
        }
       
    }
    
    public Estudiante buscar (String correoInst) {
        Estudiante e = null;
        try {
            
           // ERROR: Mal nombre de variable : no compila 
           //         "SELECT * FROM estudiantes WHERE correoInstitucional='%s'", 
           //         correoInstitucional
		   // CORREGIDO
            String consulta = String.format (
                    "SELECT * FROM estudiantes WHERE correoInstitucional='%s'", 
                    correoInst
            );
  
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres   = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoInstucional = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numerofijo = (long) resultados.getInt ("numerofijo");
                String programaAcademico = resultados.getString ("programaAcademico");
                
                e = new Estudiante ();
            }
        } catch (SQLException ex) {
            System.out.println ("Estudiante no encontrado");
        }
        return (e);
    
    
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        try {
            
			// ERROR: Creo que tocaba actualizar los otros campos también (fechaNacimiento, nombres, apellidos)
            String consulta = String.format (
                    "UPDATE estudiantes SET correoPersonal= '%s', numeroCelular=%s, numerofijo=%s, programaAcademico= '%s'WHERE correoInstitucional='%s' ",
                    nuevo.correoPersonal, nuevo.numeroCelular, nuevo.numerofijo, nuevo.programaAcademico
            );
            
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            System.out.println ("No se pudo actualizar la BD");
            ex.printStackTrace();
        }
       
      
    }
    public void eliminar (String correoInst){
        try { 
			// ERROR: (1)Falta colocar variable del correoInst al parametro %s, (2) Error de nombre de campp: correoInsitucional
            //    "DELETE  FROM estudiantes WHERE correoInsitucional= '%s' "
			//
			// CORREGIDO
            String consulta = String.format(
                "DELETE  FROM estudiantes WHERE correoInstitucional= '%s' ",
				correoInst
            );
            sentencia.executeUpdate(consulta);
    
        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Estudiante> obtenerTodos (){ 
        ArrayList <Estudiante> listaEstudiantes = new ArrayList <Estudiante> ();
             
        try {
            String consulta = "SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
            
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNacimiento = resultados.getString("fechaNacimiento");
                String correoInstitucional = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt ("numeroCelular");
                long numerofijo = (long) resultados.getInt ("numerofijo");
                String programaAcademico = resultados.getString("programaAcademico");

                Estudiante e = new Estudiante (nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCelular, numerofijo, programaAcademico);
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