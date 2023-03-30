
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

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

    public void ingresar(Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        // Crear la cadeana "insert into...."
        // ejecutar con executeQuery
        try{
            String sql = "insert into estudiantes(nombres, apellidos, fechaNac, correoInst, correoPers,"
                    + "nroCelular, nroFijo,program ) values(?,?,?,?,?,?,?,?)";
            
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, e.nombres);
            pstmt.setString(2, e.apellidos);
            pstmt.setString(3, e.fechaDeNacimiento);
            pstmt.setString(4, e.correoInstitucional);
            pstmt.setString(5, e.correoPersonal);
            pstmt.setLong(6, e.numeroCelular);
            pstmt.setLong(7, e.numeroFijo);
            pstmt.setString(8, e.programaAcademico);
            
            pstmt.executeUpdate();

        } catch (SQLException ex) {
        System.out.println("Error insertando Datos.");
        ex.printStackTrace();
        }
    }

    public Estudiante buscar(String correoInstitucional) {
        Estudiante e = null;
        try {
            
            String consulta = String.format ("SELECT * FROM estudiantes WHERE correoInst='%s'", 
                    correoInstitucional);
  
            resultados = sentencia.executeQuery(consulta);
            
            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechaNac");
                String correoInst = resultados.getString("correoInst");
                String correoPers = resultados.getString("correoPers");
                long nroCelular = (long) resultados.getInt ("nroCelular");
                long nroFijo = (long) resultados.getInt ("nroFijo");
                String program = resultados.getString("program");
                
                e = new Estudiante (nombres, apellidos, fechaNac, correoInst, correoPers, nroCelular, nroFijo, program);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (e);
    }

    public void modificar(String correoInst, Estudiante nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        try{
            String sql = "update estudiantes "
                    + "set nombres=?, apellidos=?, fechaNac=?, correoInst=?, correoPers=?,"
                    + "nroCelular=?, nroFijo=?,program=? where correoInst=?";
            
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, nuevo.nombres);
            pstmt.setString(2, nuevo.apellidos);
            pstmt.setString(3, nuevo.fechaDeNacimiento);
            pstmt.setString(4, nuevo.correoInstitucional);
            pstmt.setString(5, nuevo.correoPersonal);
            pstmt.setLong(6, nuevo.numeroCelular);
            pstmt.setLong(7, nuevo.numeroFijo);
            pstmt.setString(8, nuevo.programaAcademico);
            pstmt.setString(9, nuevo.correoInstitucional);
            
            pstmt.executeUpdate();

        } catch (SQLException ex) {
        System.out.println("Error modificando Datos.");
        ex.printStackTrace();
        }

    }

    public void eliminar(String correoInst) {
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        try{
            String consulta = String.format("DELETE FROM estudiantes WHERE correoInst='%s'",
                    correoInst);
            
            sentencia.executeUpdate(consulta);

        } catch (SQLException ex) {
        System.out.println("Error eliminando Datos.");
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
                String fechaNac = resultados.getString("fechaNac");
                String correoInst = resultados.getString("correoInst");
                String correoPers = resultados.getString("correoPers");
                long nroCelular = (long) resultados.getInt ("nroCelular");
                long nroFijo = (long) resultados.getInt ("nroFijo");
                String program = resultados.getString("program");
                
                Estudiante e = new Estudiante (nombres, apellidos, fechaNac, correoInst, correoPers, nroCelular, nroFijo, program);
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
