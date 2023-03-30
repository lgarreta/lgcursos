//package model;

//import dao.EstudianteDaoSqlImpl;
import java.util.ArrayList;

public class EstudianteModel {
    EstudianteDaoSqlImpl daoSql = new EstudianteDaoSqlImpl();
    
    public void agregarEstudiante(Estudiante e){
        daoSql.crearEstudiante(e);
    }
    public ArrayList<Estudiante> buscarEstudiantes(String dato, String campo){
        ArrayList<Estudiante> es = daoSql.consultarEstudiantes(dato, campo);
        return es;
    }
    public void modificarEstudiante(Estudiante datos,String correo){
        daoSql.modificarEstudiante(datos, correo);
    }
    public void eliminarEstudiante(String correo){
        daoSql.eliminarEstudiante(correo);
    }
    public boolean exist(String correo){
        boolean exist = daoSql.exist(correo);
        return exist;
    }
}