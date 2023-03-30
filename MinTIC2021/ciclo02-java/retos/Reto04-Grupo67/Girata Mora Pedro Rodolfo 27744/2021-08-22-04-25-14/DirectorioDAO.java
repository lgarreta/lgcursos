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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DirectorioDAO implements DirectorioDAOInterface {
    //Atributos de conexión
    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    Connection conexion;
    Statement sentencia;
    ResultSet rs;
    String consulta;
    String correo_Institucional;

// Objetos para conectarnos a la BD    
// Atributos
    ArrayList<Estudiantes> listaEstudiantes;
    public Estudiantes e;
    //private String correo_Institucional;
    //Metodo
    public void crear() {
        //Abre Conecciónn
        try {
            Class.forName("org.sqlite.JDBC");
            consulta = "SELECT * FROM Estudiantes";
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            listaEstudiantes = new ArrayList<Estudiantes>();
            recuperarse();
        } catch (SQLException ex) {
            System.out.println("Error Sql");
            ex.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            System.out.println ("Error DB");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public void adicionar(Estudiantes e) {
       try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            consulta = String.format(
                    "INSERT INTO estudiantes(nombres,apellidos,fechaNacimiento,correoInstitucional,correoPersonal,numeroCelular,numeroFijo,ProgramaAcademico)"
                    + " VALUES ('%s','%s','%s','%s','%s',%s,%s,'%s')",
                    e.Nombres,e.Apellidos,e.Fecha_de_Nacimiento,e.correo_Institucional,e.correo_Personal, e.Numero_Celular, e.Numero_Fijo, e.Programa_Academico, e.correo_Institucional);
           sentencia.executeUpdate(consulta); 
        } catch (SQLException ex) {
            System.out.println("Error SQL: sin adicionar a la BD.");
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
            System.out.println ("Error DB");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public Estudiantes buscar(String correo) {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            consulta = String.format("SELECT * FROM Estudiantes WHERE correoInstitucional = '%s' ", 
                    correo);
            rs = sentencia.executeQuery(consulta);

            while (rs.next()) {
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String fechaNacimiento = rs.getString("fechaNacimiento");
                String correoInstitucional = rs.getString("correoInstitucional");
                String correoPersonal = rs.getString("correoPersonal");
                long numeroCelular = (long) rs.getInt("numeroCelular");
                long numeroFijo = (long) rs.getInt("numeroFijo");
                String programaAcademico = rs.getString("programaAcademico");

                e = new Estudiantes(nombres, apellidos, fechaNacimiento, correoInstitucional,
                        correoPersonal, numeroCelular, numeroFijo, programaAcademico);
                
                System.out.println("nombre: " + nombres);
                System.out.println("Apellido: " + apellidos);
                System.out.println("Fecha nacimiento: " + fechaNacimiento);
                System.out.println("Correo nstitucional: " + correoInstitucional);
                System.out.println("Correo personal: " + correoPersonal);
                System.out.println("Número celular: " + numeroCelular);
                System.out.println("Número fijo: " + numeroFijo);
                System.out.println("Programa academico: " + programaAcademico);
            }
            return (e);
        } catch (SQLException ex) {
            System.out.println("No hay Registro del estudiante");
            ex.printStackTrace ();
            
        }catch (ClassNotFoundException ex) {
            System.out.println ("Error DB");
            ex.printStackTrace();
            System.exit(1);
        }
        return (e);
    }

    public void actualizar(int ID, Estudiantes e) { 
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            consulta = String.format(
                    "UPDATE estudiantes SET correoPersonal='%s', numeroCelular=%s, "
                    + "numeroFijo = %s, ProgramaAcademico = '%s'  WHERE correoInstitucional='%s'",
                    e.correo_Personal, e.Numero_Celular, e.Numero_Fijo, e.Programa_Academico, e.correo_Institucional);

            sentencia.executeUpdate(consulta);
            System.out.println(consulta);
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar la BD");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.out.println ("Error DB");
            ex.printStackTrace();
            System.exit(1);
        }

        listaEstudiantes.set(ID, e);
        guardarse();
    }
    public void eliminar(String correo) {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            consulta = String.format("DELETE FROM Estudiantes WHERE correoInstitucional = '%s' ", 
                    correo);
            sentencia.executeUpdate(consulta);
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar la BD");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println ("Error DB");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public ArrayList<Estudiantes> obtenerTodos() {
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList <Estudiantes> ();
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
            consulta = "select * from Estudiantes";
            rs = sentencia.executeQuery(consulta);
            while (rs.next()){
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String fechaNacimiento = rs.getString("FechaNacimiento");
                String correoInstitucional = rs.getString("CorreoInstitucional");
                String correoPersonal = rs.getString("correoPersonal");
                long numeroCelular = (long) rs.getInt("numeroCelular");
                long numeroFijo = (long) rs.getInt("numeroFijo");
                String programaAcademico = rs.getString("programaAcademico");
                
                Estudiantes e = new Estudiantes (nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCelular, numeroFijo, programaAcademico);
                
                
                System.out.println("nombre: " + nombres);
                System.out.println("Apellido: " + apellidos);
                System.out.println("Fecha nacimiento: " + fechaNacimiento);
                System.out.println("Correo nstitucional: " + correoInstitucional);
                System.out.println("Correo personal: " + correoPersonal);
                System.out.println("Número celular: " + numeroCelular);
                System.out.println("Número fijo: " + numeroFijo);
                System.out.println("Programa academico: " + programaAcademico);
                //listaEstudiantes.add (e);
            }
            
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println ("Error DB");
            ex.printStackTrace();
            System.exit(1);
        }
        return (listaEstudiantes);
    }
    private void recuperarse() {
        try {
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int N = (int) ois.readObject();

            for (int i = 0; i < N; i++) {
                Estudiantes E = (Estudiantes) ois.readObject();
                listaEstudiantes.add(E);
            }
            ois.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en entrada/Salida");
        } catch (ClassNotFoundException ex) {
          System.out.println ("Recuperado");
        }
    }
    private void guardarse() {
        try {
            FileOutputStream fos = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            int N = listaEstudiantes.size();
            oos.writeObject(N);

            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiantes e = listaEstudiantes.get(i);
                oos.writeObject(e);
            }
            oos.close();
        } catch (FileNotFoundException ex) {
            // System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en entrada/Salida");
        }
    }
    
}
