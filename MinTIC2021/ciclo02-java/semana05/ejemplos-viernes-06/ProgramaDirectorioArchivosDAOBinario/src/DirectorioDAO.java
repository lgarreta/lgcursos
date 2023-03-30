



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante> ();
        
        // Si existe un archivo recuperarlo y adicionar los estudiantes a la lista
        //recuperarse ();
    }
    
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
        guardarse ();
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
        guardarse ();
        
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        System.out.println ("Eliminando estudiante del DAO...");
    
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);    
            
            if (correoInst.equals (e.correoInstitucional)) 
                listaEstudiantes.remove(e);
        }  
        guardarse();
    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
    private void recuperarse () {
        // 1. Crear los flujos de lectura del archivo "Estudiantes-DAO-binario.dat"
        // 2. Recuperar primero el N haciendo casting
        // 3. Un ciclo for hasta N
        // 3.1    Creas una variabel estudiante si construirla
        // 3.2    Recuperas el objeto desde el flujo y lo conviertes a estudiante
        // 3.3    Lo adicionas a la lista y no más
        // 4. Cierras el flujo.
        // Majejas las excepciones.
    }
    
    private void guardarse () {
    FileOutputStream fos = null;
        try {
            
            // Creación archivo para escribir flujo de datos binario
            fos = new FileOutputStream ("Estudiantes-DAO-binario.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            
            int N = listaEstudiantes.size ();
            oos.writeObject (N);
            for (int i=0; i<N; i++) {
                Estudiante e = listaEstudiantes.get(i);
                oos.writeObject (e);
            }
            oos.close();
          
                        
        } catch (FileNotFoundException ex) {
            System.out.println ("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }
        
    }
    
}
