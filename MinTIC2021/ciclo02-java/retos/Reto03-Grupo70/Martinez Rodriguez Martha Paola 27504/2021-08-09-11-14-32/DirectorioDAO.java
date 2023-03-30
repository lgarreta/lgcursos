
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.lang.ClassCastException;


public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante> ();
        
        // Si existe un archivo recuperarlo y adicionar los estudiantes a la lista
        recuperarse ();
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
    
    public void actualizar (String correoInst, Estudiante estudianteNuevo) {
        // Buscar en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y actualiza el estudiante con la nueva información 
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                listaEstudiantes.set (i, estudianteNuevo);
        }
        guardarse ();
    }
    
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                listaEstudiantes.remove (i);
        }
        guardarse();
    }

    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        
        return (listaEstudiantes);
    }

    private void recuperarse () {
        
        // 1. Crear los flujos de lectura del archivo "datos_estudiantes.dat"
        try {
            FileInputStream fis = new FileInputStream ("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream (fis);
                    
        // 2. Recuperar primero el N haciendo casting
            int N = (int)ois.readObject ();
          
        // 3. Un ciclo for hasta N, Creas una variable estudiante sin construirla
        // Recuperas el objeto desde el flujo y lo conviertes a estudiante
        // Lo adicionas a la lista y cierras el flujo.
            for (int i=0; i<N; i++) {
                Estudiante e_Recuperado = (Estudiante)ois.readObject();
                listaEstudiantes.add(e_Recuperado);
            }
            ois.close();

        }catch (ClassNotFoundException ex) {
            System.out.println ("Error posible fin de Archivo");
        }catch (java.lang.ClassCastException ex) {
            System.out.println ("Error java.lang...");
        }catch (FileNotFoundException ex) {
            System.out.println ("Archivo vacio, no encontrado primera vez");
        }catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
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
