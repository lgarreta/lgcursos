//package Reto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.List;

public class CModelo implements CInterfaz {

    ArrayList<CEstudiante> lista;

    //String url = "C:\\Users\\Juan\\Documents\\MisionTic\\Ciclo2\\Reto4\\BaseDeDatos\\base1.db";
    String url ="bd_estudiantes.db";
    
    Connection conexion;
    Statement sentencia;
    ResultSet rs;

    public void crear() {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:" + url);
            sentencia = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList obtenerTodos() {
        ArrayList<CEstudiante> listaDB = new ArrayList<CEstudiante>();
        try {
            String consulta = "SELECT * FROM estudiantes";
            rs = sentencia.executeQuery(consulta);

            while (rs.next()) {
                CEstudiante e = new CEstudiante();
                e.setName(rs.getString("nombres"));
                e.setApellidos(rs.getString("apellidos"));
                e.setFechaNacimiento(rs.getString("fechaNacimiento"));
                e.setCorreoInstitucional(rs.getString("correoInstitucional"));
                e.setCorreoPersonal(rs.getString("correoPersonal"));
                e.setNumeroCelular((long) rs.getInt("numeroCelular"));
                e.setNumeroFijo((long) rs.getInt("numeroFijo"));
                e.setProgramaAcademico(rs.getString("programaAcademico"));

                listaDB.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al mostrar");
        }
        return listaDB;
    }

    public void adicionar(CEstudiante fEstudiante) {
        try {
            PreparedStatement st = conexion.prepareStatement("INSERT INTO estudiantes (nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal,"
                    + "numeroCelular, numeroFijo, programaAcademico)"
                    + " VALUES (?,?,?,?,?,?,?,?)");

            st.setString(1, fEstudiante.getName());
            st.setString(2, fEstudiante.getApellidos());
            st.setString(3, fEstudiante.getFechaNacimiento());
            st.setString(4, fEstudiante.getCorreoInstitucional());
            st.setString(5, fEstudiante.getCorreoPersonal());
            st.setLong(6, fEstudiante.getNumeroCelular());
            st.setLong(7, fEstudiante.getNumeroFijo());
            st.setString(8, fEstudiante.getProgramaAcademico());
            st.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al adicionar");
        }

    }

    public CEstudiante buscar(String fCorreoInstitucional) {

        CEstudiante e = new CEstudiante();;

        try {
            String consulta = "select * from estudiantes where correoInstitucional = '" + fCorreoInstitucional + "'";
            rs = sentencia.executeQuery(consulta);

            e.setName(rs.getString("nombres"));
            e.setApellidos(rs.getString("apellidos"));
            e.setFechaNacimiento(rs.getString("fechaNacimiento"));
            e.setCorreoInstitucional(rs.getString("correoInstitucional"));
            e.setCorreoPersonal(rs.getString("correoPersonal"));
            e.setNumeroCelular((long) rs.getInt("numeroCelular"));
            e.setNumeroFijo((long) rs.getInt("numeroFijo"));
            e.setProgramaAcademico(rs.getString("programaAcademico"));

        } catch (SQLException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al buscar");
        }
        return e;
    }

    public void eliminar(String fCorreoInstitucional) {

        try {
            String consulta = "delete from estudiantes where CorreoInstitucional = '" + fCorreoInstitucional + "'";
            PreparedStatement st = conexion.prepareStatement(consulta);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void actualizar(String fCorreoInstitucional, CEstudiante fEstudiante) {

        try {
            PreparedStatement st = conexion.prepareStatement("update estudiantes set correoPersonal = ?,"
                    + "numeroCelular = ?, numeroFijo = ?, programaAcademico = ? "
                    + "where CorreoInstitucional = '" + fCorreoInstitucional + "'");
            
            st.setString(1, fEstudiante.getCorreoPersonal());
            st.setLong(2, fEstudiante.getNumeroCelular());
            st.setLong(3, fEstudiante.getNumeroFijo());
            st.setString(4, fEstudiante.getProgramaAcademico());
            st.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
