import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiantes e);
    public Estudiantes buscar (String correo_Institucional);
    public void eliminar (String correo_Institucional);
    public void actualizar (int ID, Estudiantes e);
    public ArrayList <Estudiantes> obtenerTodos (); 
}
