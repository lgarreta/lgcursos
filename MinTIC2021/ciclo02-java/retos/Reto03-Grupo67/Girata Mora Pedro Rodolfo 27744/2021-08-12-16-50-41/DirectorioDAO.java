
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOInterface {

    // Atributos
    ArrayList<Estudiante> listaEstudiantes;
    public Estudiante e;

    public void crear() {
        listaEstudiantes = new ArrayList<Estudiante>();
        recuperarse();

    }

    public void adicionar(Estudiante e) {
        listaEstudiantes.add(e);
        guardarse();
    }

    public Estudiante buscar(String correoInstitucional) {

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante E = listaEstudiantes.get(i);
            if (correoInstitucional.equals(E.correoInstitucional)) {
                return (E);
            }
        }
        return (e);
    }

    public int getID(String correoInstitucional) {
        int IDestudiante = 0;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante E = listaEstudiantes.get(i);
            IDestudiante = i;
            if (correoInstitucional.equals(E.correoInstitucional)) {
                return (IDestudiante);
            }
        }
        return IDestudiante;
    }

    public void actualizar(int ID, Estudiante e) {
        listaEstudiantes.set(ID, e);
        guardarse();
    }

    public void eliminar(int ID) {
        listaEstudiantes.remove(ID);
        guardarse();
    }

    public ArrayList<Estudiante> obtenerTodos() {

        System.out.println("El directorio de los estudiantes");
        return (listaEstudiantes);
    }

    private void recuperarse() {
        try {
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int N = (int) ois.readObject();

            for (int i = 0; i < N; i++) {
                Estudiante E = (Estudiante) ois.readObject();
                listaEstudiantes.add(E);
            }
            ois.close();
        } catch (FileNotFoundException ex) {
            // System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en entrada/Salida");
        } catch (ClassNotFoundException e1) {
        }

    }

    private void guardarse() {
        try {
            FileOutputStream fos = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            int N = listaEstudiantes.size();
            oos.writeObject(N);

            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante e = listaEstudiantes.get(i);
                oos.writeObject(e);
            }
            oos.close();
        } catch (FileNotFoundException ex) {
            // System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en entrada/Salida");
        }
    }

}
