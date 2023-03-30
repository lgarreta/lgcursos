
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void actualizar (String correoInst, Estudiante nuevo);
    public void eliminar (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}

public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
       listaEstudiantes = new ArrayList<> ();
       recuperarse ();
    }
    
    public void adicionar (Estudiante e) {
        listaEstudiantes.add (e);
        guardarse ();
    }
    
    public Estudiante buscar (String correoInst) {
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        } return (null);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        //System.out.println ("Actualizando DAO con nuevo estudiante");
        for (int i=0; i < listaEstudiantes.size (); i++){
            Estudiante e = listaEstudiantes.get (i);
            
            if (correoInst.equals (e.correoInstitucional))
                listaEstudiantes.set(i,nuevo);
        }
        guardarse();
    }
    
    public void eliminar (String correoInst){
        //System.out.println ("Eliminando estudiante del DAO");
         
         for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            
            if (correoInst.equals (e.correoInstitucional))
               listaEstudiantes.remove(e);
         }
         guardarse();
    }
    
    public ArrayList<Estudiante> obtenerTodos (){
       // System.out.println("Retorna una lista con todos los estudiantes");
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
            // no hace nada pq va a guardar el archivo
        } catch (IOException ex) {
            System.out.println("Error en Entrada/Salida (en guardarse)");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    
    private void guardarse(){

        try {
            FileOutputStream fos = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            int N = listaEstudiantes.size ();
            oos.writeObject (N);

            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante e = listaEstudiantes.get(i);
                oos.writeObject(e);
            }
            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en Entrada/Salida (en guardarse)");
        }
    }
}