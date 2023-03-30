//package dao;

import java.sql.*;

public class ConexionDB {
    private Connection conexion;
    
    public Connection conectarDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:bd_estudiantes.db");
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al conectar a db: " + ex);
        }
        return conexion;
    }
    
    public void desconectarDB() throws SQLException{
        if (!this.conexion.isClosed()){
            this.conexion.close();
        }
    }
}