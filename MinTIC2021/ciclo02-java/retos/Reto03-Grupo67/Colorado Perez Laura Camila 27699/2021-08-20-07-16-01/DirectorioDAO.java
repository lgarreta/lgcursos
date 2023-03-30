
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
        listaEstudiantes = new ArrayList<Estudiante> ();
        
        recuperarse();
    }
    
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
        guardarse();
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
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (correoInst.equals(e.correoInstitucional)) {
                    listaEstudiantes.set(i, nuevo);
    
            }
        }
        guardarse();
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (correoInst.equals(e.correoInstitucional)) {
                listaEstudiantes.remove(e);
            }
            
        }
        guardarse();
    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
        
    }

    private void recuperarse() {
        try {
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int N = (int) ois.readObject();

            for (int i = 0; i < N; i++) {
                Estudiante e = (Estudiante) ois.readObject();
                listaEstudiantes.add(e);
            }
            ois.close();
        } catch (FileNotFoundException ex) {
            // System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en entrada/Salida");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

    }
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
