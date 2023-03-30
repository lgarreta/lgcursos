
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante> ();
    }
    
    public void adicionarEstudiante (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
        
    }
    
    public Estudiante buscarEstudiante (String correo) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"
     
        for (Estudiante e : listaEstudiantes) {
            if (e.getCorreoInstitucional().equals (correo)) {
                return(e);
                }
        }
        return(null);
    }
    
    public void modificarEstudiante (String correo,String nuevoCorreoP,long nuevoNumCel,long nuevoNumFij,String nuevoProgAca) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
       for (Estudiante e : listaEstudiantes) {
            if (e.getCorreoInstitucional().equals (correo)) {
                int posicion = listaEstudiantes.indexOf (e);
                e.setCorreoPersonal(nuevoCorreoP);
                e.setNumeroCelular(nuevoNumCel);
                e.setNumeroFijo(nuevoNumFij);
                e.setProgramaAcademico(nuevoProgAca);
                listaEstudiantes.set (posicion, e);
                }
        }
    }
    
public void eliminarEstudiante (String correo){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
    for (Estudiante e :listaEstudiantes) {
        if (e.getCorreoInstitucional().equals (correo)) {
            listaEstudiantes.remove (e);
            break;
            }
        }   

    }
    
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
}
