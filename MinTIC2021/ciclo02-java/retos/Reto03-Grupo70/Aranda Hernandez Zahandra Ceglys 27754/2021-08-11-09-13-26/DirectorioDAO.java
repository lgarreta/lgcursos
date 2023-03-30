



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    @Override
    public void crear () {
        try {
            // Inicializa el DAO creando la lista;
            listaEstudiantes = new ArrayList<Estudiante> ();
            // Si existe un archivo recuperarlo y adicionar los estudiantes a la lista
            recuperar ();
        } catch (IOException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
        guardar ();
    }
    
    @Override
    public Estudiante buscar (String correoInst) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoinstituto))
                return (e);
        }
        return (null);
    }
    
    @Override
    public void actualizar (String correoInst, Estudiante nuevo) {
        for (int i=0; i < listaEstudiantes.size (); i++) {
            if (correoInst.equals (this.listaEstudiantes.get(i).correoinstituto))
                listaEstudiantes.set(i, nuevo);
            
        }
        guardar();
    }
    
    @Override
    public void eliminar (String correo){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante s = listaEstudiantes.get(i);
            if (correo.equals (this.listaEstudiantes.get(i).correoinstituto))
                listaEstudiantes.remove(s);
        }
        guardar ();
    }
    @Override
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
    private void recuperar () throws IOException {
        File archivo = new File("datos_estudiantes.dat");
        try {
            FileInputStream fis = new FileInputStream (archivo);                     
            // Creación archivo para escribir flujo de datos binario
            ObjectInputStream ois = new ObjectInputStream (fis);
            
            int N;
            N = (int) ois.readObject();
            int i = 0;
            while (i<N){
                         
                Estudiante persona = (Estudiante) ois.readObject();
                System.out.println (persona);
                listaEstudiantes.add(persona);
                i++;
            }
            
            fis.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DirectorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }     
       
        
    
              
       
        
    
    
    private void guardar () {
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
          
                      
        } 
        catch (FileNotFoundException ex) {
            
        } 
        catch (IOException ex) {
            
        }  
    }   
}
