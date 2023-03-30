
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
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInst))
                return (e);
        }
        return (null);
    }
    
    public void actualizar (String correoInstu, String correo, long celular, long tlf, String program) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
    	   for (int i=0; i < listaEstudiantes.size (); i++) {
               Estudiante e = listaEstudiantes.get (i);
               //int indice= listaEstudiantes.indexOf(listaEstudiantes.get (i));
               if (e.correoInst.equals(correoInstu)) {
            	int posicion=  listaEstudiantes.indexOf(e);
                e.setCorreo(correo);
	            e.setCelular(celular);
	            e.setFijo(tlf);
	            e.setPrograma(program);
	            listaEstudiantes.set(posicion,e);
            }  
           }
           
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInst))
            	listaEstudiantes.remove (e);
                System.out.println ("Se eliminó el estudiante");
        }
        
    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
}
