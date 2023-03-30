



import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante> ();
    }
    
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);

    }
    
    public Estudiante buscar (String correoInst) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"
        System.out.println ("Buscando en el DAO");
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        }
        return (null);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        System.out.println ("Actualizando DAO con nuevo estudiante...");
 
        
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        System.out.println ("Eliminando estudiante del DAO...");
    
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);    
            
            if (correoInst.equals (e.correoInstitucional)) 
                listaEstudiantes.remove(e);
        }    

    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
}
