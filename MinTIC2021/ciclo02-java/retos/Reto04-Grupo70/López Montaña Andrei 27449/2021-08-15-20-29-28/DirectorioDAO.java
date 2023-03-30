import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.lang.ClassNotFoundException;

public class DirectorioDAO implements DirectorioDAOInterface {

    static final String BD_URL = "jdbc:sqlite:bd_estudiantes.db";
    Connection conexion = null;
    Statement sentencia;
    ResultSet resultados;

    public void crear() {
        try {
      	 	Class.forName ("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(BD_URL);
            sentencia = conexion.createStatement();
        } catch (SQLException|ClassNotFoundException ex) {
			System.out.println ("Error creando conexion BD...");
			ex.printStackTrace ();
			System.exit (1);
        } 

    }

    public void adicionarEstudiante(Estudiante e) {
        String cadena = "(" + "'" + e.nombres + "'," + "'" + e.apellidos + "'," + "'" + e.fechaNacimiento + "'," + "'" + e.correoInstitucional + "'," + "'" + e.correoPersonal + "'," + "'" + e.numeroCelular + "'," + "'" + e.numeroFijo + "'," + "'" + e.programaAcademico + "'" + ")";
        String consulta = "INSERT INTO estudiantes VALUES" + cadena;
        try {
            resultados = sentencia.executeQuery(consulta);
        } catch (SQLException ex) {
			System.out.println ("Error adicionando");
			ex.printStackTrace ();
			System.exit (1);
        }
    }

    public Estudiante buscarEstudianteCorreo(String correoInstitucional) {
        Estudiante e = null;
        try {
            String cadena = "'" + correoInstitucional + "'";
            String consulta = "SELECT * FROM estudiantes WHERE correoinst = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()) {
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechanac");
                String correoInst = resultados.getString("correoinst");
                String correoPer = resultados.getString("correoper");
                long numCel = resultados.getLong("numcel");
                long numFij = resultados.getLong("numfij");
                String progAca = resultados.getString("progaca");
                e = new Estudiante(nombres, apellidos, fechaNac, correoInst, correoPer, numCel, numFij, progAca);
            }
        } catch (SQLException ex) {
        }
        return (e);
    }

    public ArrayList<Estudiante> buscarEstudianteApellido(String Apellidos) {
        ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
        Estudiante e = null;
        try {
            String cadena = "'" + Apellidos + "'";
            String consulta = "SELECT * FROM estudiantes WHERE apellidos = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()) {
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechanac");
                String correoInst = resultados.getString("correoinst");
                String correoPer = resultados.getString("correoper");
                long numCel = resultados.getLong("numcel");
                long numFij = resultados.getLong("numfij");
                String progAca = resultados.getString("progaca");
                e = new Estudiante(nombres, apellidos, fechaNac, correoInst, correoPer, numCel, numFij, progAca);
                listaEstudiante.add(e);
            }
        } catch (SQLException ex) {
        }
        return (listaEstudiante);
    }
    
    public String[] buscarEstudiantePrograma(String programa) {
        int cant = 0;
        int i = 0;
        try {
            String cadena = "'" + programa + "'";
            String consulta = "SELECT count (progaca) FROM estudiantes WHERE progaca = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            if(resultados.next()) {
            cant = resultados.getInt(1);}
            resultados = sentencia.executeQuery(consulta);
            cant = cant * 2;
            } catch (SQLException ex) {
            }
        String [] nomape = new String [cant]; 
        try{
            String cadena = "'" + programa + "'";
            String consulta = "SELECT nombres,apellidos FROM estudiantes WHERE progaca = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()) {
                nomape[i] = resultados.getString("nombres");
                i++;
                nomape[i] = resultados.getString("apellidos");
                i++;
                }
        } catch (SQLException ex) {
        }return(nomape);
     }

    public int buscarEstudianteCantidadPrograma(String programa) {
        int cant = 0;
        try {
            String cadena = "'" + programa + "'";
            String consulta = "SELECT count (progaca) FROM estudiantes WHERE progaca = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            if(resultados.next()) {
            cant = resultados.getInt(1);}
        }catch (SQLException ex) {
        }return(cant);
     }
    
    public ArrayList<Estudiante> buscarEstudianteFecha(String fecha) {
        ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
        Estudiante e = null;
        try {
            String cadena = "'" + fecha + "'";
            String consulta = "SELECT * FROM estudiantes WHERE fechanac = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()) {
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechanac");
                String correoInst = resultados.getString("correoinst");
                String correoPer = resultados.getString("correoper");
                long numCel = resultados.getLong("numcel");
                long numFij = resultados.getLong("numfij");
                String progAca = resultados.getString("progaca");
                e = new Estudiante(nombres, apellidos, fechaNac, correoInst, correoPer, numCel, numFij, progAca);
                listaEstudiante.add(e);
            }
        } catch (SQLException ex) {
        }
        return (listaEstudiante);
    }
    
    public String[] buscarCelularEstudiante(Long celular) {
        int cant = 0;
        int i = 0;
        try {
            String cadena = "'" + celular + "'";
            String consulta = "SELECT count (numcel) FROM estudiantes WHERE numcel = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            if(resultados.next()) {
            cant = resultados.getInt(1);}
        } catch (SQLException ex) {
        }
        cant = cant * 2;
        String [] nomaca = new String [cant];
        try{
            String cadena = "'" + celular + "'";
            String consulta = "SELECT nombres,progaca FROM estudiantes WHERE numcel = " + cadena;
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()) {
                nomaca[i] = resultados.getString("nombres");
                i++;
                nomaca[i] = resultados.getString("progaca");
                i++;
                }
            } catch (SQLException ex) {
            }return(nomaca);
     }
    
    public void modificarEstudiante(String correo, String nuevoCorP, long nuevoCel, long nuevoFij, String nuevoProg) {
        String consulta = "UPDATE estudiantes SET correoper = '" + nuevoCorP + "', numcel = '" + nuevoCel + "', numfij = '" + nuevoFij + "',progaca = '" + nuevoProg + "'" + " WHERE correoinst = '" + correo + "'";
        try {
            resultados = sentencia.executeQuery(consulta);
        } catch (SQLException ex) {
        }
    }

    public void eliminarEstudiante(String correo) {
        String cadena = "'" + correo + "'";
        String consulta = "DELETE FROM estudiantes WHERE correoinst = " + cadena;
        try {
            resultados = sentencia.executeQuery(consulta);
        } catch (SQLException ex) {
        }
    }

    public ArrayList<Estudiante> obtenerTodos() {
        ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
        try {
            String consulta = "SELECT * FROM estudiantes";
            resultados = sentencia.executeQuery(consulta);
            while (resultados.next()) {
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String fechaNac = resultados.getString("fechanac");
                String correoInst = resultados.getString("correoinst");
                String correoPer = resultados.getString("correoper");
                long numCel = resultados.getLong("numcel");
                long numFij = resultados.getLong("numfij");
                String progAca = resultados.getString("progaca");
                Estudiante e = new Estudiante(nombres, apellidos, fechaNac, correoInst, correoPer, numCel, numFij, progAca);
                listaEstudiante.add(e);
            }
        } catch (SQLException ex) {
            System.out.println("Error Obteniendo Datos. " + ex.getMessage());
        }
        return (listaEstudiante);
    }
}