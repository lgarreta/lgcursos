import java.util.ArrayList;

public interface DirectorioDAOinterface{
    public  void crear();
    public Estudiante adicionar(Estudiante e);
    public Estudiante buscar(String correoInstitucional);
    public Estudiante eliminar(String correoInstitucional);
    public Estudiante actualizar (String correoInstitucional,Estudiante nuevo);
    public ArrayList <Estudiante> obtenerTodos ();

}