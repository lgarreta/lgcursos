
//Interface del Directorio
import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public ArrayList <Estudiante> buscar (String correoInst);
    public void actualizar (String correoInst, Estudiante nuevo);
    public void eliminar (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}
