



import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiantes e);
    public Estudiantes buscar (String correoInst);
    public void actualizar (String correoInst, Estudiantes nuevo);
    public void eliminar (String correoInst);
    public ArrayList<Estudiantes> obtenerTodos ();
}
