

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOInterface {

    ArrayList<Estudiante> listaEstudiantes;

    // Metodos
    public void crear() {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante>();
        recuperarse();
    }

    public void adicionarEstudiante(Estudiante e) {

        listaEstudiantes.add(e);
        guardarse();

    }

    public Estudiante buscarEstudiante(String correo) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (correo.equals(e.correoInstitucional)) {
                return (e);
            }
        }
        return (null);
    }

    public void modificarEstudiante(String correo, String nuevoCorreoP, long nuevoNumCel, long nuevoNumFij, String nuevoProgAca) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        for (Estudiante e : listaEstudiantes) {
            if (e.getCorreoInstitucional().equals(correo)) {
                int posicion = listaEstudiantes.indexOf(e);
                e.setCorreoPersonal(nuevoCorreoP);
                e.setNumeroCelular(nuevoNumCel);
                e.setNumeroFijo(nuevoNumFij);
                e.setProgramaAcademico(nuevoProgAca);
                listaEstudiantes.set(posicion, e);
            }
        }
        guardarse();

    }

    public void eliminarEstudiante(String correo) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (correo.equals(e.correoInstitucional)) {
                listaEstudiantes.remove(e);
            }
        }
        guardarse();

    }

    public ArrayList<Estudiante> obtenerTodos() {
        // Retorna una lista con todos los estudiantes
        
        return (listaEstudiantes);
    }

    public void recuperarse() {
        try {
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois;
            ois = new ObjectInputStream(fis);
            int N = (int) ois.readObject();
            int i = 0;
            while (i < N) {
                Estudiante persona = (Estudiante) ois.readObject();
                listaEstudiantes.add(persona);
                i++;
            }
            fis.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error posible fin de archivo");

        } catch (FileNotFoundException ex) {

            System.out.println("Archivo no encontrado primera vez");
        } catch (IOException ex) {
            

        }
    }

    private void guardarse() {
        FileOutputStream fos = null;
        try {

            // Creación archivo para escribir flujo de datos binario
            fos = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            int N = listaEstudiantes.size();
            oos.writeObject(N);
            for (int i = 0; i < N; i++) {
                Estudiante e = listaEstudiantes.get(i);
                oos.writeObject(e);
            }
            oos.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println("Error lectura/escritura");
        }

    }

}
