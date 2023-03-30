import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
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
        try {
            listaEstudiantes = new ArrayList<Estudiante> ();
        
            recuperarse ();
        } catch (ClassNotFoundException e) {
             
        } catch (IOException e) {
            
        }
    }
    
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
        guardarse ();
    }
    
    public Estudiante buscar (String correoInst) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"
        
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
        
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                  listaEstudiantes.set(i, nuevo);
        }
        System.out.println ("Se modificó el estudiante");
        }
    
    public void eliminar (String correoInst) {
        
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);
            
            if (correoInst.equals (e.correoInstitucional)){
                listaEstudiantes.remove(e);
                System.out.println ("Se eliminó el estudiante");
                System.out.println ("");}
            
        }
     
        guardarse();
    }
    
    public ArrayList<Estudiante> obtenerTodos () {
        // Retorna una lista con todos los estudiantes
        
        return (listaEstudiantes);
    }
   
   
   
   
    private void recuperarse () throws IOException, ClassNotFoundException {
            // Vamos a leer los datos del archivo y adicionarlos al DAO
            try {
                FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
                System.out.println ("");
            
            
                    int N = (int) ois.readObject();
                    for (int i=0; i<N; i++) {
                        Estudiante e = (Estudiante)ois.readObject();
                        listaEstudiantes.add(e);
                    }    
                    ois.close();
                    
                   
                
            }catch (FileNotFoundException ex) {
                System.out.println("Primera vez. Archivo no encontrado.");
            }catch (IOException ex) {
                System.out.println("Error de Entrada/Salida");
            } 
                      

    }   
    
        

        // 1. Crear los flujos de lectura del archivo "Estudiantes-DAO-binario.dat"
        // 2. Recuperar primero el N haciendo casting
        // 3. Un ciclo for hasta N
        // 3.1    Creas una variabel estudiante si construirla
        // 3.2    Recuperas el objeto desde el flujo y lo conviertes a estudiante
        // 3.3    Lo adicionas a la lista y no más
        // 4. Cierras el flujo.
        // Majejas las excepciones.
    
    
    private void guardarse () {
    FileOutputStream fos = null;
        try {
            
            // Creación archivo para escribir flujo de datos binario
            fos = new FileOutputStream ("datos_estudiantes.dat");
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

