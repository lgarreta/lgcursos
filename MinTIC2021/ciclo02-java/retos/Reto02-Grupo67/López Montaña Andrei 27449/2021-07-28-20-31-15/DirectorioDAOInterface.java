import java.util.ArrayList;


public interface DirectorioDAOInterface {
    public void crear ();
    public void adicionarEstudiante (Estudiante e);
    public Estudiante buscarEstudiante (String correoInst);
    public void modificarEstudiante (String correo,String nuevoCorreoP,long nuevoNumCel,long nuevoNumFij,String nuevoProgAca);
    public void eliminarEstudiante (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}
