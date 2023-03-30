



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
            if (correoInst.equals (e.correoinstituto))
                return (e);
        }
        return (null);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        for (int i=0; i < listaEstudiantes.size (); i++) {
            if (correoInst.equals (this.listaEstudiantes.get(i).correoinstituto))
                listaEstudiantes.set(i, nuevo);
        }
    }
    
    public void eliminar (String correo){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante s = listaEstudiantes.get(i);
            if (correo.equals (this.listaEstudiantes.get(i).correoinstituto))
                listaEstudiantes.remove(s);
        }
    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
}
