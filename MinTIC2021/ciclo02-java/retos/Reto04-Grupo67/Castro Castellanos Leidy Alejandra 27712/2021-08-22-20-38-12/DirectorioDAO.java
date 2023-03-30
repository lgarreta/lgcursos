
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.Connection;

public class DirectorioDAO {
    // Atributos de Conexion
    static final String BD_URL = "jdbc:sqlite:C:\\Users\\aleja\\OneDrive\\Documentos\\Mision Tic\\Ciclo 2\\Semana 7\\bdatos\\RetoProgramaDirectorio\\bd_estudiantes.db";
    // Atributos
    Connection conexion;
    Statement sentencia;
    ResultSet resultados;

    // Metodos
    public void crear() {
        try {
            Class.forName("org.sqlite.JDBC");
            // Abre la conexion
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();

        } catch (SQLException ex) {
            System.out.println("Error SQL");
            ex.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            System.out.println("No encontrada SQL");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public void adicionar(Estudiantes e) {
        try {
            String adicion = String.format(
                    "INSERT INTO estudiantes VALUES('%s', '%s','%s', '%s', '%s', '%s', '%s', '%s')", e.nombres,
                    e.apellidos, e.fechaDeNacimiento, e.correoInstitucional, e.correoPersonal, e.numeroCelular, e.numeroFijo,
                    e.programaAcademico);
            sentencia.executeUpdate(adicion);

        } catch (SQLException ex) {
            System.out.println("SQL error");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public Estudiantes buscar(String correoInstitucional) {

        Estudiantes e = null;
        try {

            String buscar = String.format("SELECT * FROM estudiantes WHERE correoInstitucional = '%s'",
                    correoInstitucional);
            resultados = sentencia.executeQuery(buscar);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaDeNacimiento = resultados.getString("fechaNacimiento");
                String correoInst = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt("numeroCelular");
                long numeroFijo = (long) resultados.getInt("numeroFijo");
                String programaAcademico = resultados.getString("programa");

                e = new Estudiantes(nombres, apellidos, fechaDeNacimiento, correoInst, correoPersonal, numeroCelular, numeroFijo,
                        programaAcademico);
            }

        } catch (SQLException ex) {
            System.out.println("Error buscando Estudiante.");
            ex.printStackTrace();

        }
        return (e);
    }

    public void modificar(String correoInstitucional, Estudiantes e) {
        try {
            String actualizar = String.format(
                    "UPDATE estudiantes SET correoPersonal = '%s', numeroCelular = %s, numeroFijo = %s, programa= '%s'  WHERE correoInstitucional ='%s'",
                    e.correoPersonal, e.numeroCelular, e.numeroFijo, e.programaAcademico, correoInstitucional);
            sentencia.executeUpdate(actualizar);
            System.out.println(actualizar);

        } catch (SQLException ex) {
            System.out.println("Error modificando Estudiante.");
            ex.printStackTrace();

        }
    }

    public void eliminar(String correoInstitucional) {
        try {

            String eliminar = String.format("DELETE FROM estudiantes WHERE correoInstitucional ='%s'",
                    correoInstitucional);
            sentencia.executeUpdate(eliminar);

        } catch (SQLException ex) {
            System.out.println("Error eliminando Estudiante.");
            ex.printStackTrace();

        }

    }

    public ArrayList<Estudiantes> obtenerTodos() {
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>();

        try {

            String consulta = "SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);

            while (resultados.next()) {
                // Recuperamos datos de la BD
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaDeNacimiento = resultados.getString("fechaNacimiento");
                String correoInstitucional = resultados.getString("correoInstitucional");
                String correoPersonal = resultados.getString("correoPersonal");
                long numeroCelular = (long) resultados.getInt("numeroCelular");
                long numeroFijo = (long) resultados.getInt("numeroFijo");
                String programaAcademico = resultados.getString("programa");

                Estudiantes e = new Estudiantes(nombres, apellidos, fechaDeNacimiento, correoInstitucional, correoPersonal, numeroCelular,
                        numeroFijo, programaAcademico);
                listaEstudiantes.add(e);
            }
            // Retorna una lista con todos los estudiantes
        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos.");
            ex.printStackTrace();

        }
        return (listaEstudiantes);
    }

}