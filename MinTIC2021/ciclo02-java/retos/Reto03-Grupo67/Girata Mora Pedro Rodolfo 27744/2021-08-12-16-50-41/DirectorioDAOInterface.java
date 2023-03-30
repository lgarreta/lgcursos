import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInstitucional);
    public void eliminar (int ID);
    public void actualizar (int ID, Estudiante e);
    public ArrayList <Estudiante> obtenerTodos (); 
}
