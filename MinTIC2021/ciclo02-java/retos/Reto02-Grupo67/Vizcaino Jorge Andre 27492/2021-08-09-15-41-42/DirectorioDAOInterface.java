
import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void actualizar (String correoInst,  String correo, long celular, long tlf, String program);
    public void eliminar (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}