//package model;

//import dao.EstudianteDaoImpl;
import java.util.ArrayList;

public class EstudianteModel {
    EstudianteDaoImpl dao = new EstudianteDaoImpl();
    
    public void agregarEstudiante(Estudiante e){
        dao.crearEstudiante(e);
    }
    public Estudiante buscarEstudiante(String correo){
        Estudiante e = dao.consultarEstudiante(correo);
        return e;
    }
    public void modificarEstudiante(Estudiante datos,Estudiante e){
        dao.modificarEstudiante(datos, e);
    }
    public void eliminarEstudiante(Estudiante e){
        dao.eliminarEstudiante(e);
    }
    public ArrayList<Estudiante> listarEstudiantes(){
        ArrayList<Estudiante> es = dao.Estudiantes();
        return es;
    }
}