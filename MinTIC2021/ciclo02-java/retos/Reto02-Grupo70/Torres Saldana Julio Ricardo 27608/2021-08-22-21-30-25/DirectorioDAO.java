import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOInterface {
    
    ArrayList <Estudiante> listaEstudiantes;
    
    
    public void crear () {
        
        listaEstudiantes = new ArrayList<Estudiante> ();
    }
    
    public void adicionar (Estudiante e) {
        
        listaEstudiantes.add (e);
    }
    
    public Estudiante buscar (String correoInst) {
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        }
        return (null);
    }
    
    public void actualizar (String correoInst,Estudiante eNuevo) {
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
               listaEstudiantes.remove(e);
                     
        }
        boolean add = listaEstudiantes.add (eNuevo);
        
    }
    public void eliminar (String correoInst){
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
            listaEstudiantes.remove(e);   
        }       
    }
    public ArrayList<Estudiante> obtenerTodos (){
        
        return (listaEstudiantes);
    }
    
}
