//package dao;

import java.util.ArrayList;
//import model.Estudiante;

public interface EstudianteInterface {
    public void crearEstudiante(Estudiante e);
    public Estudiante consultarEstudiante(String correo);
    public void modificarEstudiante(Estudiante datos, Estudiante estudiante);
    public void eliminarEstudiante(Estudiante e);
    public ArrayList<Estudiante> Estudiantes();
}
