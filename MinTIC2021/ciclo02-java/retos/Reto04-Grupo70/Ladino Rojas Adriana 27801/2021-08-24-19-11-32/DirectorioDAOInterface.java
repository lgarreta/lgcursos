import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiantes e);
    public Estudiantes buscar (String correoInstitucional);
    public void actualizar (String correoInstitucional, Estudiantes nuevo);
    public void eliminar (String correoInstitucional);
    public ArrayList<Estudiantes> obtenerTodos ();
}
