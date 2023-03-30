import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Directorio implements DirectorioDAO{

    static final String BD_URL  = "jdbc:sqlite:bd_estudiantes.db";
    private Connection conexion;
    private Statement sentencia;

    public Directorio(){
        try {
            Class.forName ("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
      	 e.printStackTrace();
      } 
    }

    @Override
    public void agregarEstudiante(ModeloEstudiante e) {
        try{
            String consulta = "INSERT INTO estudiantes VALUES (" + "'" + e.getNombre() + "'," + "'" + e.getApellido() + "'," + "'" + e.getFechaNacimiento() + "'," + "'" + e.getCorreoInstitucional() + "'," + "'" + e.getCorreoPersonal() + "'," + e.getNumeroCelular() + "," + e.getNumeroFijo() + "," + "'" + e.getProgramaAcademico() + "')";
            sentencia.executeUpdate (consulta); 
        } catch (SQLException ex) {
            Logger.getLogger(Directorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void buscarEstudiante(String correoI) {
        try{
            String consulta = "SELECT * FROM estudiantes WHERE estudiantes.correo_institucional = " + "'" + correoI + "'";
            ResultSet resultados = sentencia.executeQuery (consulta); 
            while (resultados.next()) {
                String nombre  = resultados.getString ("nombre");
                String apellido  = resultados.getString ("apellido");
                String fechaNacimiento = resultados.getString ("fecha_nacimiento");
                String correoInstitucional  = resultados.getString ("correo_institucional");
                String correoPersonal  = resultados.getString ("correo_personal");
                long numeroCelular  = (long) resultados.getInt("numero_celular");
                long numeroFijo  = (long) resultados.getInt ("numero_fijo");
                String programaAcademico = resultados.getString ("programa_academico");
                
                    System.out.println("Información del estudiante");
                    System.out.println("Nombres: " + nombre);
                    System.out.println("Apellidos: " + apellido);
                    System.out.println("Fecha nacimiento: " + fechaNacimiento);
                    System.out.println("Correo institucional: " + correoInstitucional);
                    System.out.println("Correo personal: " + correoPersonal);
                    System.out.println("Número de teléfono celular: " + numeroCelular);
                    System.out.println("Número de teléfono fijo: " + numeroFijo);
                    System.out.println("Programa académico: " + programaAcademico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Directorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificarEstudiante(String correoI, String correoP, long numeroC, long numeroF, String programa) {
        try{
            String consulta = "UPDATE estudiantes SET correo_personal = " + "'" + correoP + "', numero_celular = " + numeroC + " , numero_fijo = " + numeroF + ", programa_academico = " + "'" + programa + "' WHERE correo_institucional = " + "'" + correoI + "';"; 
            sentencia.executeUpdate (consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Directorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarEstudiante(String correoI) {
        try{
            String consulta = "DELETE FROM estudiantes WHERE correo_institucional = "+ "'" + correoI + "';";
            sentencia.executeUpdate (consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Directorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mostrarDirectorio() {    
        try{
            String consulta = "SELECT * FROM estudiantes;";
            ResultSet resultados = sentencia.executeQuery (consulta); 
            while (resultados.next()) {
                String nombre  = resultados.getString ("nombre");
                String apellido  = resultados.getString ("apellido");
                String fechaNacimiento = resultados.getString ("fecha_nacimiento");
                String correoInstitucional  = resultados.getString ("correo_institucional");
                String correoPersonal  = resultados.getString ("correo_personal");
                long numeroCelular  = (long) resultados.getInt("numero_celular");
                long numeroFijo  = (long) resultados.getInt ("numero_fijo");
                String programaAcademico = resultados.getString ("programa_academico");
                
                    System.out.println("Nombres: " + nombre);
                    System.out.println("Apellidos: " + apellido);
                    System.out.println("Fecha nacimiento: " + fechaNacimiento);
                    System.out.println("Correo institucional: " + correoInstitucional);
                    System.out.println("Correo personal: " + correoPersonal);
                    System.out.println("Número de teléfono celular: " + numeroCelular);
                    System.out.println("Número de teléfono fijo: " + numeroFijo);
                    System.out.println("Programa académico: " + programaAcademico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Directorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
