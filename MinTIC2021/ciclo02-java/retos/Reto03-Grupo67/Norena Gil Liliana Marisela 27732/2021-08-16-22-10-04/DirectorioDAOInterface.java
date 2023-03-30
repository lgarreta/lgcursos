import java.util.ArrayList;


interface DirectorioDAOInterface {
    public void crear ();
    public void ingresar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void modificar (String correoInst, Estudiante nuevo);
    public void eliminar (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}


    