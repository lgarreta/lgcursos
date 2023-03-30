


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList<Estudiante> listaEstudiantes;
    
    public void  crear () {
        //System.out.println ("Creando DAO...");
        listaEstudiantes = new ArrayList <Estudiante> ();
        recuperarse();
    }
    
    public void adicionar (Estudiante e) {
        System.out.println ("Se agregó el estudiante");  
        listaEstudiantes.add (e);
        guardarse();
    }
    
    // Busca dentr
    public Estudiante buscar (String correoInst) {
        //System.out.println ("Busca al estudiante con el correo y lo retorna");
        //System.out.println ("Información del estudiante");
        
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        }   
        
        return (null);
    }
                    
    public void eliminar (String correoInst) {
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
               
            listaEstudiantes.remove(i);
            System.out.println ("Se eliminó el estudiante");
        }
        guardarse();
    }
        
    public void modificar (String correoInst, Estudiante nuevo) {
        System.out.println ("Se modificó el estudiante");
        guardarse();
        
        //System.out.println ("");
        //for (int i=0; i < listaEstudiantes.size(); i++){
           // Estudiante e = listaEstudiantes.get (i);
            //if (correoInst.equals (e.correoInstitucional))
                //listaEstudiantes.set(i,nuevo);
        //}
    }
    
    
    public ArrayList <Estudiante> obtenerTodos () {
        
        System.out.println ("");
                    return (listaEstudiantes);
    }
    



        private void recuperarse() {
        try{
        
            FileInputStream fis = new FileInputStream ("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream (fis);

            int N = (int)ois.readObject();
            for (int i=0; i<N; i++);{
                Estudiante e =(Estudiante) ois.readObject();
                listaEstudiantes.add(e);
            }
            ois.close();
        }catch (FileNotFoundException exc) {
            System.out.println("Esta en 0 el archivo");
        }catch (IOException exc) {
            System.out.println("Error lectura/escritura  conversion error **");
        }catch (ClassNotFoundException exc){
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE,null, exc);
        }
    }


    

    private void guardarse () {
    FileOutputStream fos = null;
        try{
            fos = new FileOutputStream ("datos_estudiantes.dat");
                ObjectOutputStream oos = new ObjectOutputStream (fos);

                int N = listaEstudiantes.size ();
                oos.writeObject (N);
                for (int i= 0; i<N; i++) {
                    Estudiante e = listaEstudiantes.get (i);
                    oos.writeObject (e);
                 }
                 oos.close();
            }catch (FileNotFoundException exc) {
                System.out.println("Inicio Archivo en 0");
            }catch (IOException exc) {
                System.out.println("Error lectura/escritura");
            }
    }
}

                