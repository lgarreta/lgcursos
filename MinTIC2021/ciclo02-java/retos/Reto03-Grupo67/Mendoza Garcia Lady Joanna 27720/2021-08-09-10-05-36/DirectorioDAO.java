import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DirectorioDAO implements DirectorioDAOinterface {

    ArrayList<Estudiante> listaEstudiantes;

    public void crear() {
        listaEstudiantes = new ArrayList<Estudiante>();
        recuperarse();

    }

    public void adicionar(Estudiante e) {
        listaEstudiantes.add(e);
        guardarse();

    }

    public Estudiante buscar(String correoInst) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);

            if (correoInst.equals(e.correoInstitucional))
                return (e);

        }

        return (null);

    }

    public Estudiante eliminar(String correoInst) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);

            if (correoInst.equals(e.correoInstitucional))
                listaEstudiantes.remove(e);
            guardarse();

        }
        return (null);

    }

    public Estudiante actualizar(String correoInst, Estudiante nuevo) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);

            if (correoInst.equals(e.correoInstitucional)){

                listaEstudiantes.set(i, nuevo);
                
                guardarse();
                break;
            }
        }
        return (null);

    }

    public ArrayList<Estudiante> obtenerTodos() {
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

        } catch (FileNotFoundException exc) {
            System.out.println("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println("Error lectura/escritura");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
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
            System.out.println("Inicio. Archivo vacio");
        } catch (IOException ex) {
            System.out.println("Error Entrada/Salida");
        }

    }

}