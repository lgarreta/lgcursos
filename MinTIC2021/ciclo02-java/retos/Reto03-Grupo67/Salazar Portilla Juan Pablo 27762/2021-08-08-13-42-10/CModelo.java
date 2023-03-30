//package Reto;

//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.List;

public class CModelo implements CInterfaz {
    
    ArrayList <CEstudiante> lista;
    
    public void crear(){
       lista = new ArrayList <CEstudiante> ();
       recuperar();
       
    }
    
    public void adicionar(CEstudiante fEstudiante){
        lista.add(fEstudiante);  
        guardar();
    }
    
    public CEstudiante buscar(String fCorreoInstitucional){
        
        for(int i=0; i < lista.size(); i++){
            //CEstudiante estudiante = lista.get(i);
            String correo = lista.get(i).getCorreoInstitucional();
            if(fCorreoInstitucional.equals(correo)){
            //if(fCorreoInstitucional.equals(estudiante.getCorreoInstitucional())){    
                return lista.get(i);
              //return estudiante;
            }
        }        
        return null;
    }
    
    public ArrayList obtenerTodos(){    
        return lista;
    }
    
    public void eliminar(String fCorreoInstitucional){
        
        for(int i=0; i < lista.size(); i++){
            String correo = lista.get(i).getCorreoInstitucional();
            if(fCorreoInstitucional.equals(correo)){
                lista.remove(i);
                break;
            }
        }    
        guardar();
    }
    
    public void actualizar(String fCorreoInstitucional, CEstudiante fEstudiante){
        
        for(int i=0; i < lista.size(); i++){
            String correo = lista.get(i).getCorreoInstitucional();
            if(fCorreoInstitucional.equals(correo)){
                lista.get(i).setCorreoPersonal(fEstudiante.getCorreoPersonal());
                lista.get(i).setNumeroCelular(fEstudiante.getNumeroCelular());
                lista.get(i).setNumeroFijo(fEstudiante.getNumeroFijo());
                lista.get(i).setProgramaAcademico(fEstudiante.getProgramaAcademico());
                break;
            }
        }   
        guardar();
    }
    
    //Reto 3
    
    private void recuperar(){
        try{
            
        FileInputStream fis = new FileInputStream ("datos_estudiantes.dat");
        ObjectInputStream ois = new ObjectInputStream (fis);
        
        int N = (int) ois.readObject();
        
        for (int i=0; i<N; i++) {
                CEstudiante e = (CEstudiante) ois.readObject();
                lista.add(e);               
            }
            ois.close();
        
        }catch(IOException ex){
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void guardar() {
    FileOutputStream fos = null;
        try {            
            // Creación archivo para escribir flujo de datos binario
            fos = new FileOutputStream ("datos_estudiantes.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            
            int N = lista.size ();
            oos.writeObject (N);
            for (int i=0; i<N; i++) {
                CEstudiante e = lista.get(i);
                oos.writeObject (e);
            }
            oos.close();
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }
        
    }
    
    
}
