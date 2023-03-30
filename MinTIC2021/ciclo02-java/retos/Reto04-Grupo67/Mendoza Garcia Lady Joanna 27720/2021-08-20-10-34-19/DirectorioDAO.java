
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOinterface {

    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;

    public void crear() {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de Clase no Encontrada");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public Estudiante adicionar(Estudiante e) {

        try{
            String adicion = String.format("INSERT INTO estudiantes VALUES('%s','%s','%s','%s','%s',%s,%s,'%s')" , e.nombres,e.apellidos,e.fechaNacimiento,e.correoInstitucional,e.correoPersonal,e.celular,e.telFijo,e.programaAcademico);
            sentencia.executeUpdate(adicion);

        }catch (SQLException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit(1);
            }

        return(e);
    }

    public Estudiante buscar(String correoInstitucional) {
        Estudiante e = null;
        try{
            String cadena = "'" +correoInstitucional+"'";
            String consultar= String.format("SELECT * FROM estudiantes WHERE correoInstitucional='%s'", correoInstitucional);
            resultados=sentencia.executeQuery(consultar);

            while (resultados.next()){
                String nombres=resultados.getString("nombres");
                String apellidos=resultados.getString("apellidos");
                String fechaNacimiento=resultados.getString("fechaNacimiento");
                String correoInst=resultados.getString("correoInstitucional");
                String correoPersonal=resultados.getString("correoPersonal");
                Long celular=resultados.getLong("celular");
                Long telFijo=resultados.getLong("telFijo");
                String programaAcademico=resultados.getString("programaAcademico");

                e= new Estudiante (nombres,apellidos,fechaNacimiento,correoInst,correoPersonal,celular,telFijo,programaAcademico);

            }

        }catch(SQLException ex){
            System.out.println("Error de SQL al buscar");
        }
        return(e);
    }
        
  
    

    public Estudiante eliminar(String correoInstitucional) {

        try {
            String cadena = "'" +correoInstitucional+"'";
            String eliminar= String.format("DELETE  FROM estudiantes WHERE correoInstitucional='%s'",correoInstitucional);
            sentencia.executeUpdate(eliminar);

        }catch(SQLException ex){
            System.out.println("Error de SQL al eliminar");
            ex.printStackTrace();
            }
        return(null);

    }


    public Estudiante actualizar(String correoInst, Estudiante nuevo) {

        try{
            String actualizar=String.format("UPDATE estudiantes set correoPersonal='%s',celular=%s,telfijo=%s,programaAcademico='%s' WHERE correoInstitucional='%s'", nuevo.correoPersonal,nuevo.celular,nuevo.telFijo,nuevo.programaAcademico,correoInst);
            sentencia.executeUpdate(actualizar);

        }catch(SQLException ex){
            System.out.println("Error de SQL al actualizar");
            ex.printStackTrace();
            }
        return(nuevo);
    }


    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList <Estudiante> listaEstudiantes= new ArrayList <Estudiante>();

        try{
            String consulta ="SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()){
                String nombres=resultados.getString("nombres");
                String apellidos=resultados.getString("apellidos");
                String fechaNacimiento=resultados.getString("fechaNacimiento");
                String correoInstitucional=resultados.getString("correoInstitucional");
                String correoPersonal=resultados.getString("correoPersonal");
                Long celular=resultados.getLong("celular");
                Long telFijo=resultados.getLong("telFijo");
                String programaAcademico=resultados.getString("programaAcademico");

                Estudiante e = new Estudiante (nombres,apellidos,fechaNacimiento,correoInstitucional,correoPersonal,celular,telFijo,programaAcademico);
                listaEstudiantes.add (e);
                }

        }catch (SQLException ex){
            System.out.println("Error de SQL Obteniendo todos los datos");
             ex.printStackTrace();
            }
        
            return(listaEstudiantes);
    }   

      
        

    
}
    