
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

    public void adicionar(Estudiante e) {
        try {
            String adicion = String.format ("INSERT INTO estudiantes VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')",e.nombres,e.apellidos,e.fechaNac,e.correoInstitucional,e.correoPersonal,e.numeroCelular,e.numeroFijo,e.progAcademico);
            sentencia.executeUpdate(adicion);
        
        } catch (SQLException ex) {
            System.out.println("Error de SQL ");
            ex.printStackTrace();
            System.exit(1);
        } 
      
    }

    public Estudiante buscar(String correoInstitucional) {
        Estudiante e = null;
        try {
            
            String consulta = String.format ("Select * FROM estudiantes WHERE correoInstitucional='%s'", 
                    correoInstitucional);
  
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("correoInstitucional");
                String correoPer = resultados.getString("correoPersonal");
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                long nroFijo = (long) resultados.getInt ("numeroFijo");
                String progAca = resultados.getString("programa");
                e = new Estudiante (nombres, apellidos,fechaNac, correoInst, correoPer,nroCelular, nroFijo, progAca);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }

       public void eliminar(String correoInst) {
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        try {
            String cadena = "'"+correoInst+"'";
            String consulta = String.format ("DELETE FROM estudiantes WHERE correoInstitucional=='%s'",correoInst); 
            sentencia.executeUpdate(consulta);

        } catch (SQLException ex) {
            System.out.println("Error de SQL al eliminar");
            ex.printStackTrace();
            }
        
    }
     /*public void actualizar(String correoInst, Estudiante nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        }*/
    public void actualizar(Estudiante e) {
        
         try {
            String consulta = String.format("UPDATE Estudiantes "
                    + " SET "
                    + " correoPersonal = '%s'" 
                     + " ,numeroCelular = '%s'" 
                     + " ,numeroFijo = '%s'" 
                     + " ,programa = '%s'" 
                    + " WHERE correoInstitucional == '%s'" ,e.correoPersonal,e.numeroCelular,e.numeroFijo,e.progAcademico,e.correoInstitucional); 
            sentencia.executeUpdate(consulta);

        } catch (SQLException ex) {
            System.out.println("Error de SQL al actualizar");
            ex.printStackTrace();
            }         
    }


    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList <Estudiante> listaEstudiantes = new ArrayList <Estudiante> ();
             
        try {
            String consulta = "SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("correoInstitucional");
                String correoPer = resultados.getString("correoPersonal");
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                long nroFijo = (long) resultados.getInt ("numeroFijo");
                String progAca = resultados.getString("programa");
                Estudiante e = new Estudiante (nombres, apellidos,fechaNac, correoInst, correoPer,nroCelular, nroFijo, progAca);
             
                listaEstudiantes.add (e);
            }
            // Retorna una lista con todos los estudiantes
        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos.");
            ex.printStackTrace();
        }
        
        return (listaEstudiantes);
    }

    private Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(String correoInst, Estudiante nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
