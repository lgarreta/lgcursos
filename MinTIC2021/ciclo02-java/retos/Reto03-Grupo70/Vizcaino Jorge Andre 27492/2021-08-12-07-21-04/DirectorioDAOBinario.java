
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DirectorioDAOBinario implements DirectorioDAOInterface {
    // Atributos
    ArrayList<Estudiante> listaEstudiantes;

    // Metodos
    public void crear() {
        // Inicializa el DAO creando la lista;
    	
        listaEstudiantes = new ArrayList<Estudiante>();
        recuperarse();
        
    }

    public void adicionar(Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add(e);
        guardarse();
    }

    public Estudiante buscar(String correoInst) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (correoInst.equals(e.correoInst))
                return (e);
        }
        return (null);
    }

    public void actualizar(String correoInstu, String correo, long celular, long tlf, String program) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst"
        // y lo cambia por el "nuevo" que llega
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            
            if (e.correoInst.equals(correoInstu)) {
            	int posicion=  listaEstudiantes.indexOf(e);
                e.setCorreo(correo);
	            e.setCelular(celular);
	            e.setFijo(tlf);
	            e.setPrograma(program);
	            listaEstudiantes.set(posicion,e);
            }
        }
        guardarse();
    }

    public void eliminar(String correoInst) {
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (correoInst.equals(e.correoInst))
                listaEstudiantes.remove(e);
            System.out.println("Se eliminó el estudiante");
        }
        guardarse();
    }

    public ArrayList<Estudiante> obtenerTodos() {
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
        
    }

    private void recuperarse() {
    	
        try {
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int N = (int) ois.readObject();
            int i = 0;
            while (i < N) {
            	
            	Estudiante e= (Estudiante) ois.readObject();
            	listaEstudiantes.add(e);
                i++;

            }
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error posible fin de archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");

        } catch (IOException ex) {
           /* System.out.println("Error de entrada/salida");*/
        }
        // 1. Crear los flujos de lectura del archivo "Estudiantes-DAO-binario.dat"
        // 2. Recuperar primero el N haciendo casting
        // 3. Un ciclo for hasta N
        // 3.1 Creas una variabel estudiante si construirla
        // 3.2 Recuperas el objeto desde el flujo y lo conviertes a estudiante
        // 3.3 Lo adicionas a la lista y no más
        // 4. Cierras el flujo.
        // Majejas las excepciones.
    }

    private void guardarse() {
        FileOutputStream fos = null;
        try {

            // Creaci�n archivo para escribir flujo de datos binario
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
