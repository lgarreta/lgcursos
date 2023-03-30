import java.lang.NullPointerException;
import java.util.ArrayList;

public class Controlador {

    Vista miVista = new Vista();
    DirectorioDAO miDAO = new DirectorioDAO();

    public Controlador() {
        miDAO.crear();

    }

    public void iniciar() {

        while (true) {

            try {
                System.out.println();
                int opcion = miVista.mostrarMenu();
                switch (opcion) {

                    case 1:
                        adicionar();
                        break;
                    case 2:
                        buscarPorCorreo();
                        break;
                    case 3:
                        modificarEstudiante();
                        break;
                    case 4:
                        eliminarEstudiante();
                        break;
                    case 5:
                        System.out.println("El directorio de los estudiantes");
                        mostrarLista();
                        break;
                    case 6:
                        salir();

                    default:
                        System.out.println("Opción invalida");
                }
            } catch (NullPointerException exc) {
                System.out.println("El estudiante no se encuentra registrado en el instituto");
            }
        }

    }

    public void adicionar() {
        Estudiante e = miVista.leerDatos();
        miDAO.adicionar(e);

    }

   

    public void buscarPorCorreo() {
        String correo = miVista.buscarPorCorreoInstitucional();
        Estudiante e = miDAO.buscar(correo);
        miVista.mostrarEstudiante(e);

    }

    
      

    public void modificarEstudiante() {
        String correoInst = miVista.buscarPorCorreoInst2();
        Estudiante nuevo = miDAO.buscar(correoInst);
        miVista.modificar(nuevo);
        miDAO.actualizar(correoInst, nuevo);

    }

    public void eliminarEstudiante() {
        String correo = miVista.eliminar();
        miDAO.eliminar(correo);

    }

    public void mostrarLista() {
        ArrayList<Estudiante> miLista = miDAO.obtenerTodos();
        for (int i = 0; i < miLista.size(); i++) {
            Estudiante nuevo = miLista.get(i);
            miVista.mostrarLista(nuevo);
        }

    }

    public void salir() {
        System.out.println("Hasta pronto");
        System.exit(0);
    }

}
