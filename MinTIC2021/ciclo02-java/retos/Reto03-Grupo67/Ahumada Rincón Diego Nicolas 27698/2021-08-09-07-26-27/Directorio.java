import java.io.*;
import java.util.ArrayList;

public class Directorio implements DirectorioDAO{

    private ArrayList<ModeloEstudiante> estudiantes;

    public Directorio(){
        estudiantes = new ArrayList<>();
        recuperarse();
    }

    @Override
    public void agregarEstudiante(ModeloEstudiante e) {
        estudiantes.add(e);
        guardarse();
    }

    @Override
    public void buscarEstudiante(String correoI) {
        for (ModeloEstudiante est:estudiantes) {
            if (est.getCorreoInstitucional().equals(correoI)){
                System.out.println("Información del estudiante");
                System.out.println("Nombres: " + est.getNombre());
                System.out.println("Apellidos: " + est.getApellido());
                System.out.println("Fecha nacimiento: " + est.getFechaNacimiento());
                System.out.println("Correo institucional: " + est.getCorreoInstitucional());
                System.out.println("Correo personal: " + est.getCorreoPersonal());
                System.out.println("Número de teléfono celular: " + est.getNumeroCelular());
                System.out.println("Número de teléfono fijo: " + est.getNumeroFijo());
                System.out.println("Programa académico: " + est.getProgramaAcademico() + "\n");
            }
        }
    }

    @Override
    public void modificarEstudiante(String correoI, String correoP, long numeroC, long numeroF, String programa) {
        for (ModeloEstudiante est : estudiantes) {
            if (est.getCorreoInstitucional().equals(correoI)) {
                est.setCorreoPersonal(correoP);
                est.setNumeroCelular(numeroC);
                est.setNumeroFijo(numeroF);
                est.setProgramaAcademico(programa);
            }
        }
        guardarse();
    }

    @Override
    public void eliminarEstudiante(String correoI) {
        for(int i = 0; i < estudiantes.size(); i++){
            ModeloEstudiante e = estudiantes.get(i);
            if (e.getCorreoInstitucional().equals(correoI)){
                estudiantes.remove(e);
                System.out.println("Se eliminó el estudiante\n");
            }
        }
        guardarse();
    }

    @Override
    public void mostrarDirectorio() {
        for (ModeloEstudiante est:estudiantes) {
            System.out.println("Nombres: " + est.getNombre());
            System.out.println("Apellidos: " + est.getApellido());
            System.out.println("Fecha nacimiento: " + est.getFechaNacimiento());
            System.out.println("Correo institucional: " + est.getCorreoInstitucional());
            System.out.println("Correo personal: " + est.getCorreoPersonal());
            System.out.println("Número de teléfono celular: " + est.getNumeroCelular());
            System.out.println("Número de teléfono fijo: " + est.getNumeroFijo());
            System.out.println("Programa académico: " + est.getProgramaAcademico() + "\n");
        }
    }

    @Override
    public void recuperarse(){
        try{
            FileInputStream file = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream object = new ObjectInputStream(file);
            int N = (int) object.readObject();
            for (int i = 0; i < N; i++){
                ModeloEstudiante e = (ModeloEstudiante) object.readObject();
                estudiantes.add(e);
            }
            object.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }catch (ClassNotFoundException ex){
            System.out.println("Error clase");
        }
    }

    @Override
    public void guardarse(){
        try {
            FileOutputStream file = new FileOutputStream ("datos_estudiantes.dat");
            ObjectOutputStream object = new ObjectOutputStream (file);
            int N = estudiantes.size ();
            object.writeObject (N);
            for (int i=0; i<N; i++) {
                ModeloEstudiante e = estudiantes.get(i);
                object.writeObject (e);
            }
            object.close();
        } catch (FileNotFoundException ex) {
            System.out.println ("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println ("Error lectura/escritura");
        }
    }
}
