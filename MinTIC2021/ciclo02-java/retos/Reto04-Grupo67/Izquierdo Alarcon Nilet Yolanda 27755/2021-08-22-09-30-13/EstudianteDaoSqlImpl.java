//package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import view.EstudianteView;
//import model.Estudiante;

public class EstudianteDaoSqlImpl implements EstudianteInterface{
    ConexionDB cxn = new ConexionDB();
    EstudianteView vista = new EstudianteView();
    
    @Override
    public void crearEstudiante(Estudiante e){
        Connection conex = cxn.conectarDB();
        if(conex != null){
            String columnas = "(Nombre, Apellido, fNacimiento, cInstitucional, cPersonal, celular, fijo, programa)";
            String valores = "('" + e.getNombre() + "'," +
                "'" + e.getApellido() + "'," +
                "'" + e.getFechaNaci() + "'," +
                "'" + e.getCorreoInst() + "'," +
                "'" + e.getCorreoPers() + "'," +
                + e.getNumeroCelular() + "," +
                + e.getNumeroFijo() + "," +
                "'" + e.getPrograma() + "')";
            String query = "INSERT INTO Estudiantes " + columnas + " VALUES " + valores;
            
            try {
                ejecutarQuery(conex, query);
                vista.print("Se agregó el estudiante\n");
            } catch (SQLException ex) {
                vista.print("Ha ocurrido un error al agregar: " + ex);
            }
        } else{
            vista.print("No se ha podido establecer conexion con DB");
        }
    }
    
    @Override
    public ArrayList<Estudiante> consultarEstudiantes(String dato, String campo){
        Connection conex = cxn.conectarDB();
        ResultSet resultadoSql;
        ArrayList <Estudiante> es = new ArrayList <>();
        if (conex != null){
            String query = crearQuery(dato, campo);
            try {
               resultadoSql = ejecutarQueryResult(conex, query);
               
               if(campo.equals("cuenta")){
                    Estudiante e = new Estudiante();
                    e.setCuentaPrograma(resultadoSql.getInt("cuenta"));
                    es.add(e);
               }else{
                    while(resultadoSql.next()){
                        Estudiante e = new Estudiante();
                        e.setNombre(resultadoSql.getString("Nombre"));
                        e.setApellido(resultadoSql.getString("Apellido"));
                        e.setFechaNaci(resultadoSql.getString("fNacimiento"));
                        e.setCorreoInst(resultadoSql.getString("cInstitucional"));
                        e.setCorreoPers(resultadoSql.getString("cPersonal"));
                        e.setNumeroCelular(resultadoSql.getLong("celular"));
                        e.setNumeroFijo(resultadoSql.getLong("fijo"));
                        e.setPrograma(resultadoSql.getString("Programa")); 

                        es.add(e);
                    } 
               }
               
               
               cxn.desconectarDB();          
            } catch (SQLException ex) {
               vista.print("Ha ocurrido un error al consultar: " + ex);
            }
        } else{
            vista.print("No se ha podido establecer conexion con DB");     
        }
        return es;
    }
    
    @Override
    public void modificarEstudiante(Estudiante datosN, String correo){
        Connection conex = cxn.conectarDB();
        if(conex != null){
            String valores = "cPersonal = '" + datosN.getCorreoPers() + "'," +
            "celular = " + datosN.getNumeroCelular() + "," +
            "fijo = " + datosN.getNumeroFijo() + "," +
            "programa = '" + datosN.getPrograma() + "'";
            var query = "UPDATE estudiantes SET " + valores + " WHERE cInstitucional = '" + correo + "'";
            try {
                ejecutarQuery(conex, query);
                vista.print("Se modificó el estudiante\n");
            } catch (SQLException ex) {
                vista.print("Ha ocurrido un error al modificar: " + ex);
            }
        } else{
            vista.print("No se ha podido establecer conexion con DB");
        }    
    }
    
    @Override
    public void eliminarEstudiante(String correo){
        Connection conex = cxn.conectarDB();
        if(conex != null){
            String query = "DELETE FROM estudiantes WHERE cInstitucional = '" + correo + "'";
            try {
                ejecutarQuery(conex, query);
                vista.print("Se eliminó el estudiante\n");
            } catch (SQLException ex) {
                vista.print("No se ha podido eliminar el estudiante: " + ex);
            }
        } else{
            vista.print("No se ha podido establecer conexion con DB");
        }
    }
    
    //Ejecución de consultas
    
    public void ejecutarQuery(Connection conex, String query) throws SQLException{
        PreparedStatement sentenciaSql = conex.prepareStatement(query);
        sentenciaSql.execute();
        sentenciaSql.close();
        cxn.desconectarDB();
    }
    
    public ResultSet ejecutarQueryResult(Connection conex, String query) throws SQLException{
       Statement sentencia = conex.createStatement();
       ResultSet resultadoSql = sentencia.executeQuery(query);
       return resultadoSql;
    }
    
    //Verificar si el registro existe
    
    public boolean exist(String correo){
        boolean exist = false;
        try {
            Connection conex = cxn.conectarDB();
            var query = crearQuery(correo, "cInstitucional"); 
            ResultSet consulta = ejecutarQueryResult(conex, query);
            if(consulta.next()){
               exist = true; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDaoSqlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
    
    //Elaboración de consulta
    
    public String crearQuery(String dato, String campo){
        String allColumns = "Nombre, Apellido, fNacimiento, cInstitucional, cPersonal, celular, fijo, programa";
        String query;
        switch (campo){
            case "cInstitucional":
            case "apellido":
            case "fNacimiento":
            case "programa":
                query = "SELECT " + allColumns + " FROM estudiantes WHERE " + campo + " = '" + dato + "'";
                break;
            case "celular":
                long numero = Long.parseLong(dato);
                query = "SELECT " + allColumns + " FROM estudiantes WHERE celular = " + numero;
                break;
            case "cuenta":
                query = "SELECT COUNT(*) AS cuenta FROM estudiantes WHERE programa = '" + dato + "'";
                break;
            default:
                vista.print("El directorio de los estudiantes\n");
                query = "SELECT " + allColumns + " FROM Estudiantes";
                break;
        }
        return query;
    }
}