/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void eliminar (String correoInst);
    public void actualizar (String correoInst, Estudiante nuevo);
    public ArrayList <Estudiante> obtenerTodos ();    
}
public class DirectorioDAO implements DirectorioDAOInterface {
    
    ArrayList<Estudiante> listaEstudiantes;
    
    public void  crear () {
        listaEstudiantes = new ArrayList <Estudiante> ();
        recuperarse();
    }
    public void adicionar (Estudiante e1) {
        System.out.println ("Se agregó el estudiante");  
        listaEstudiantes.add (e1);
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
    public void eliminar (String correoInst) {
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);

            if (correoInst.equals (e.correoInstitucional))
            listaEstudiantes.remove(e);
            System.out.println ("Se eliminó el estudiante");
        }
        guardarse();
        
    }    
    public void actualizar (String correoInst, Estudiante nuevo) {
        for (int i=0; i < listaEstudiantes.size(); i++){
            Estudiante e = listaEstudiantes.get (i);

            if (correoInst.equals (e.correoInstitucional))
            listaEstudiantes.set(i, nuevo);
            
        }
        guardarse();
    }
    public ArrayList <Estudiante> obtenerTodos () {        
        System.out.println ("El directorio de los estudiantes");        
        return(listaEstudiantes);
    }
    
    private void recuperarse () {
        
        try {
            FileInputStream fis= new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int N = (int) ois.readObject();
            for(int i = 0 ; i < N; i++){
                Estudiante e = (Estudiante)ois.readObject();
                listaEstudiantes.add(e);
            }
            ois.close();
        } catch (FileNotFoundException ex) {
            System.out.println ("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }catch (ClassNotFoundException e1){
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

