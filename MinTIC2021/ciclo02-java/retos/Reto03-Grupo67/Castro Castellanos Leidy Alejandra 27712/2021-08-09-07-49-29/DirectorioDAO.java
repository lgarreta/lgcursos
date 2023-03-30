
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class DirectorioDAO {
    ArrayList <Estudiante> listaEstudiantes;

    public void crear () throws ClassNotFoundException {
        listaEstudiantes = new ArrayList <> ();
        recuperarse();
    }
    public void adicionar (Estudiante e) {
        listaEstudiantes.add (e);
        guardarse();
        
    }
    public Estudiante buscar (String correoInst) {
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        }        
        return (null);
    }
    public void actualizar (String correoInst, Estudiante nuevo) {
         for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional)) {
                listaEstudiantes.set (i, nuevo);
            }         
        }
        guardarse();
    }
    public void eliminar (String correoInst) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                listaEstudiantes.remove (e);
        }
        guardarse();
    }
    public ArrayList <Estudiante> obtenerTodos () {
        return (listaEstudiantes);
        
    }
    private void guardarse () {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream ("datos_estudiantes.dat");
            try (ObjectOutputStream oos = new ObjectOutputStream (fos)) {
                int N = listaEstudiantes.size ();
                oos.writeObject (N);
                for (int i=0; i<N; i++) {
                    Estudiante e = listaEstudiantes.get(i);
                    oos.writeObject (e);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println ("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }
        
    }
    private void recuperarse () throws ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream ("datos_estudiantes.dat");
        try (ObjectInputStream ois = new ObjectInputStream (fis)) {
                int N = (int)ois.readObject ();
                for (int i=0; i<N; i++) {
                    Estudiante e = (Estudiante) ois.readObject();
                    listaEstudiantes.add(e);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println ("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }   
    }
}