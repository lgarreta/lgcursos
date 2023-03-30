import java.io.ObjectOutputstrem;
import java.io.ObjectInputStrem;
import java.io.IOException;
import java.io.FileOutputStrem;
import java.io.FileNotFoundException;
import java.io.FileInputStrem;
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
    Connection conexion=null;
    Statement sentencia;
    ResultSet resultados;

    // Metodos
    public void crear() {
        try {
            Class.forName("org.sqlite.JDBC");
            // Abre la conexion
            // conexion = DriverManager.getConnection(BD_URL, USUARIO, CLAVE);
            conexion = DriverManager.getConnection(BD_URL);
            sentencia =(Statement) conexion.createStatement();

        } catch (SQLException|ClassNotFoundException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit (1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).long(Level.SEVERE, null, ex);
        }
    }

    public void adicionarEstudiante(Estudiantes e) {
        String cadena = "(" + "'" + e.nombres + "'." + "'" + e.apellidos + "'," + "'"+ e.fechanacimiento + "'," + "'" e.correoInstitucional
        String consulta ="INSERT INT estudiantes VALUES" + cadena;
        try{
            sentencia.executeUpdate(consulta);
        } catch(SQLException ex)
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        // Crear la cadeana "insert into...."
        // ejecutar con executeQuery
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
                String apellidos = resultados.getString("apellidos")
                String fechaNacimiento = resultados.getString("fechaNacimiento")
                String correoInst = resultados.getString("correoInstitucional");
                String correoPersonal = resultado.getString("correoPersonal")
                long nroFijo = (long) resultado.getstrInt("numeroFijo")
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                String programaAcademico = resultado.getString("programaAcademico")

                Estudiantes e = new Estudiantes (nombres, apellido, fechaNacimiento, correoInst, correoPersonal, nroCelular, programaAcademico);
                listaEstudiantes.add (e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }

    public void actualizar(String correoInst, Estudiantes nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        for(int i=0; i < listaEstudiantes.size();i++){
            Estudiante e = listaEstudiantes.get(i);
           
            if(correoInst.equals(e.correoInstitucional))
            listaEstudiantes.set(i.nuevo);

        //System.out.println("Actualizando DAO con nuevo estudiante...");
        }
        
    }

    public void eliminar(String correoInst) {
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        for(int i=0; i < listaEstudiantes.size();i++){
            Estudiante e = listaEstudiantes.get(i);
            
            if(correoInst.equals(e.correoInstitucional))
            listaEstudiantes.remove(e);
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
                String apellidos = resultados.getString("apellidos")
                String fechaNacimiento = resultados.getString("fechaNacimiento")
                String correoInst = resultados.getString("correoInstitucional");
                String correoPersonal = resultado.getString("correoPersonal")
                long nroFijo = (long) resultado.getstrInt("numeroFijo")
                long nroCelular = (long) resultados.getInt ("numeroCelular");
                String programaAcademico = resultado.getString("programaAcademico")

                Estudiantes e = new Estudiantes (nombres, apellido, fechaNacimiento, correoInst, correoPersonal, nroCelular, programaAcademico);
                listaEstudiantes.add (e);
            }
            // Retorna una lista con todos los estudiantes
        } catch (SQLException ex) {
            System.out.println( "Error Odteniendo Datos.")
            ex.printStackTrace();
        }
    
}
        
