import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOInterface{
    ArrayList<Estudiante> listaEstudiantes;

    public void crear(){
        System.out.println("Creando DAO");
        listaEstudiantes=new ArrayList<Estudiante>();
    }
    public void adicionar (Estudiante e){
        System.out.println("Adicionando");
        listaEstudiantes.add (e);
    }
    public Estudiante buscar (String correoInst){
        System.out.println("Buscando");
        for (int i=0; i< listaEstudiantes.size(); i++){
            Estudiante e= listaEstudiantes.get(i);
            if(correoInst.equals (e.correoInstitucional))
                return (e);
            }
        return (null);
        }
    public void eliminar (String correoInst){
        System.out.println("Eliminando");
        for(int i=0; i<listaEstudiantes.size(); i++){
            Estudiante e=listaEstudiantes.get(i);

            if(correoInst.equals(e.correoInstitucional))
            listaEstudiantes.remove(e);

        }   
    }

    public void actualizar(String correoInst,Estudiante nuevo){
    System.out.println("Actualizando ");
        for(int i=0; i<listaEstudiantes.size(); i++){
            Estudiante e=listaEstudiantes.get(i);

            if(correoInst.equals(e.correoInstitucional))
            listaEstudiantes.set(i, nuevo );
        }
    }
    public  ArrayList <Estudiante> obtenerTodos();
    
}