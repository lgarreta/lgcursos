//package dao;

import java.sql.SQLException;
import java.util.ArrayList;
//import model.Estudiante;

public interface EstudianteInterface {
    public void crearEstudiante(Estudiante e);
    public ArrayList<Estudiante> consultarEstudiantes(String dato, String campo);
    public void modificarEstudiante(Estudiante datos, String correo) throws SQLException;
    public void eliminarEstudiante(String correo);
}
