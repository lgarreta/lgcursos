




import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void eliminar (String correoInst);
    public void actualizar (String correoInst, Estudiante nuevo);
    public ArrayList <Estudiante> obtenerTodos ();    
}
public class DirectorioDAO implements DirectorioDAOInterface {
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";

    
    
    
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;
   
   
    public void  crear () {
        try{
            
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection (BD_URL);
            sentencia = conexion.createStatement();
        
        
        }catch (SQLException ex){
            System.out.println ("ErrorSQL");
            ex.printStackTrace();
            System.exit(1);            
        }catch (ClassNotFoundException ex) {
            System.out.println ("ErrorSQL");
            ex.printStackTrace();
            System.exit(1);  
        }
            
    }
    public void adicionar(Estudiante e) {
        try {
            String adicion = String.format("INSERT INTO estudiantes VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')", e.nombres, e.apellidos, e.fechanacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroTelefono, e.programa);
            sentencia.executeUpdate(adicion);

        } catch (SQLException ex) {
            System.out.println("errorsql");
            ex.printStackTrace();
        }
        System.out.println("Se agregó el estudiante");
        
      
        
    }
    public Estudiante buscar (String correoInstitucional) {
        Estudiante e = null;
        try {
            
            
            String consulta = String.format("SELECT * FROM estudiantes WHERE correoInstitucional ='%s' " ,correoInstitucional); 
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechadenacimiento = resultados.getString("fechadenacimiento");
                String correoInst = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long )resultados.getInt("numeroCelular");
                long numeroTelefono = (long)resultados.getInt("numeroTelefono");
                String programa =  resultados.getString ("programa");
                
                e = new Estudiante (nombres,apellidos,fechadenacimiento,correoInstitucional,correoPersonal,numeroCelular,numeroTelefono,programa);
            

        } 
        }catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return (e);
    }
               
        
          
        
      
                        
    public void eliminar (String correoInstitucional) {
        try {
            String eliminar = String.format("DELETE FROM estudiantes WHERE correoInstitucional=='%s'" ,correoInstitucional);
            sentencia.executeUpdate(eliminar);
        } catch (SQLException ex) {
            System.out.println("errorsql");
            ex.printStackTrace();
        }
        System.out.println("Se eliminó el estudiante");
        
      
        
    
       

            
        }
        
        
        
    public void actualizar (String correoInstitucional, Estudiante nuevo) {
        try {
            String modificar = String.format("UPDATE estudiantes SET nombres =='%s' WHERE correoInstitucional =='aa'",correoInstitucional);
            sentencia.executeUpdate(modificar);
        } catch (SQLException ex) {
            System.out.println("errorsql");
            ex.printStackTrace();
        }
        
            
        
        
    }

    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList <Estudiante> listaEstudiantes = new ArrayList <Estudiante> ();
        try {
            
            String consulta = "select * from estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechadenacimiento = resultados.getString("fechadenacimiento");
                String correoInstitucional = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                int numeroCelular = (int)resultados.getInt("numeroCelular");
                int numeroTelefono = (int)resultados.getInt("numeroTelefono");
                String programa =  resultados.getString ("programa");
                
                Estudiante e = new Estudiante (nombres,apellidos,fechadenacimiento,correoInstitucional,correoPersonal,numeroCelular,numeroTelefono,programa);
                listaEstudiantes.add (e);
            }
            
           


        } catch (SQLException ex) {
            System.out.println("error sql");
            ex.printStackTrace();
        } return(listaEstudiantes);
    }
}
        
        

