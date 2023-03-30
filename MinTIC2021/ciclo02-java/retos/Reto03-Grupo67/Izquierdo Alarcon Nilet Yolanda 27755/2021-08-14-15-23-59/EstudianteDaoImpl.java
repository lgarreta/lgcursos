//package dao;

import java.io.*;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import view.EstudianteView;
//import model.Estudiante;

public class EstudianteDaoImpl implements EstudianteInterface{
    EstudianteView vista = new EstudianteView();
    ArrayList <Estudiante> listaEstudiantes = new ArrayList <>();
    
    @Override
    public void crearEstudiante(Estudiante e){
        try {
            listaEstudiantes.add(e);
            overwriteFile(listaEstudiantes);
            vista.msmCreado();
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al agregar: " + ex);
        }
    }
    
    @Override
    public Estudiante consultarEstudiante(String correo){
        Estudiante e = null;
        updateList();
        try {
            for(var i = 0; i < listaEstudiantes.size(); i++){
                e = listaEstudiantes.get(i);
                if(correo.equals(e.getCorreoInst())){
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al consultar: " + ex);
        }
        return e;
    }
    
    @Override
    public void modificarEstudiante(Estudiante datosN, Estudiante e){
        try {
            e.setCorreoPers(datosN.getCorreoPers());
            e.setNumeroCelular(datosN.getNumeroCelular());
            e.setNumeroFijo(datosN.getNumeroFijo());
            e.setPrograma(datosN.getPrograma());
            overwriteFile(listaEstudiantes);
            vista.msmModificado();
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar: " + ex);
        }
    }
    
    @Override
    public void eliminarEstudiante(Estudiante e){
        try {
            listaEstudiantes.remove(e);
            overwriteFile(listaEstudiantes);
            vista.msmEliminado();
        } catch (Exception ex) {
            System.out.println("No se ha podido eliminar el estudiante: " + ex);
        }
    }
    
    @Override
    public ArrayList<Estudiante> Estudiantes(){
        updateList();
        vista.msmListado();
        ArrayList <Estudiante> es = listaEstudiantes;
        return es;
    }
    
//    Métodos de manejo de archivo
//    Sobrescribir archivo
    public void overwriteFile(ArrayList<Estudiante> directorio){
        try {
            FileOutputStream outFichero = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream writeFile = new ObjectOutputStream(outFichero);
            writeFile.writeObject(directorio);
            writeFile.close();
        } catch (Exception ex) {
            System.out.println("No se ha podido escribir el archivo, error: " + ex);
        }
    }
//    Actualización de la lista captando información del archivo
    public void updateList(){
        try {
            FileInputStream inFichero = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream readData = new ObjectInputStream(inFichero);
            listaEstudiantes = (ArrayList<Estudiante>) readData.readObject();
            readData.close();
        } catch (Exception ex) {
            System.out.println("No se ha podido obtener el archivo, error: " + ex);
        }
    }
}