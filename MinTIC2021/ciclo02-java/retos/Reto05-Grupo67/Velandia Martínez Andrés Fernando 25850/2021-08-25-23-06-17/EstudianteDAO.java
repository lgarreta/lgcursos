/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EstudianteDAO {

    private DbConnection conexion;
    private Estudiante unEstudiante;

    public EstudianteDAO() {
        this.conexion = new DbConnection();
        this.unEstudiante = new Estudiante();
    }

    public boolean registrarEstudiante(Estudiante unEstudiante) {

        PreparedStatement ps = null;
        Connection con = conexion.getConnection();
        
        System.out.println("Nombre "+unEstudiante.getNombres());

        String sql = "INSERT INTO estudiante (nombres, apellidos, fechaNacimiento, correoInstitucional , correoPersonal,celular, fijo,programa) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, unEstudiante.getNombres());
            ps.setString(2, unEstudiante.getApellidos());
            ps.setString(3, unEstudiante.getFechaNacimiento());
            ps.setString(4, unEstudiante.getCorreoInstitucional());
            ps.setString(5, unEstudiante.getCorreoPersonal());
            ps.setString(6, unEstudiante.getCelular());
            ps.setString(7, unEstudiante.getFijo());
            ps.setString(8, unEstudiante.getPrograma());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public String listarEstudiantes() {
        PreparedStatement ps = null;
        Connection con;
        con = conexion.getConnection();
        ResultSet rs = null;
         String texto = "";

        String sql = "SELECT *FROM estudiante";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            String nombre = "";
            String apellido = "";
            String fechaNac = "";
            String correoInst = "";
            String correoPers = "";
            String celular = "";
            String fijo = "";
            String programa = "";
           
            int i = 0;
            while (rs.next()) {
                nombre = rs.getString("nombres");
                apellido = rs.getString("apellidos");
                fechaNac = rs.getString("fechaNacimiento");
                correoInst = rs.getString("correoInstitucional");
                correoPers = rs.getString("correoPersonal");
                celular = rs.getString("celular");
                fijo = rs.getString("fijo");
                programa = rs.getString("programa");
                i++;
                texto += nombre + "  " + apellido + "  " + fechaNac + "  " + correoInst + "  " + correoPers + "  " + celular + "  " + fijo + "  " + programa+"\n";
                System.out.println(nombre + "  " + apellido + "  " + fechaNac + "  " + correoInst + "  " + correoPers + "  " + celular + "  " + fijo + "  " + programa);
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        return texto;
    }

    public boolean actualizarDatosEstudiante(String correoInstitucional, String correoPersonal, String celular, String fijo, String programa) {
        PreparedStatement ps = null;
        Connection con;
        con = conexion.getConnection();

        String sql = "UPDATE estudiante SET correoPersonal=?, celular = ?, fijo = ?, programa = ? WHERE correoInstitucional=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(5, correoInstitucional);
            ps.setString(1, correoPersonal);
            ps.setString(2, celular);
            ps.setString(3, fijo);
            ps.setString(4, programa);

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    public boolean borrarEstudiante(String correoInstitucional) {
        PreparedStatement ps = null;
        Connection con;
        con = conexion.getConnection();

        String sql = "DELETE FROM estudiante WHERE correoInstitucional=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, correoInstitucional);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    public String consultarCorreo(String correoInstitucional) {
        String texto = "";
        String correo = correoInstitucional;
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        String correoPersonal = "";
        String celular = "";
        String fijo = "";
        String programa = "";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con;
        con = conexion.getConnection();

        String sql = "SELECT *FROM estudiante WHERE correoInstitucional = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            while (rs.next()== true) {
                nombre = rs.getString(1);
                apellido = rs.getString(2);
                fechaNacimiento = rs.getString(3);
                correoPersonal = rs.getString(5);
                celular = rs.getString(6);
                fijo = rs.getString(7);
                programa = rs.getString(8);
                texto+= nombre + " " + apellido + " " + fechaNacimiento + " " + correoInstitucional + "  " + correoPersonal + " " + celular + " " + fijo + " " + programa;
                System.out.println(nombre + " " + apellido + " " + fechaNacimiento + " " + correoInstitucional + "  " + correoPersonal + " " + celular + " " + fijo + " " + programa);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
          
        }
        return texto;
    }

   

}
