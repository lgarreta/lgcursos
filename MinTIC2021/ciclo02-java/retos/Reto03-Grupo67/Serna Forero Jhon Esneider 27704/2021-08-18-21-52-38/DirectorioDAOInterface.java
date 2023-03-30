

import java.util.ArrayList;

public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void eliminar (String correoInst);
    public void modificar (String correoInst, Estudiante nuevo);
    public ArrayList <Estudiante> obtenerTodos ();
}
