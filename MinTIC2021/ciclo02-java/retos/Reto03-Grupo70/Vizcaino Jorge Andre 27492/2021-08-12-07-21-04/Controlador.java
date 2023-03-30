
import java.util.ArrayList;

public class Controlador {
    // Atributos
    MostrarVista miVista = new MostrarVista();
    DirectorioDAOBinario miDAO = new DirectorioDAOBinario();

    // Constructor
    public Controlador() {
        miDAO.crear();
    }

    // Metodos
    public void iniciar() {
        while (true) {
            miVista.mostrarMenu();
            int opcion = miVista.leerOpcion();

            switch (opcion) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    ver();
                    break;
                case 6:
                    salir();
                    break;
            }
        }
    }

    // Adiciona estudiante al DAO
    public void adicionar() {
        System.out.println("Ingresar estudiante");
        Estudiante e = miVista.leerDatos();
        miDAO.adicionar(e);
        System.out.println("Se agregó el estudiante");
    }

    // Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar() {

        System.out.println("Buscar estudiante");
        String correo = miVista.leerCorreoInstitucional();
        Estudiante e = miDAO.buscar(correo);
        if (e == null) {
            System.out.println("Estudiante no encontrado");
        }
        else {
            
        	System.out.println("Información del estudiante");
        	miVista.mostrarEstudiante(e);
        }
    }

    // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar() {
        System.out.println("Eliminar estudiante");
        String correo = miVista.leerCorreoInstitucional();
        miDAO.eliminar(correo);
    }

    // 1. Solita el correo
    // 2. Busco el estuddiante en el DAO
    // 3. Pedirle los datos a modificar y modificar el estudiante
    // 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar() {
        System.out.println("Modificar estudiante");
        String correo = miVista.leerCorreoInstitucional();
        String correoper = miVista.leerCorreo();
        long cel = miVista.leerNumeroCelular();
        long fijo = miVista.leerNumeroFijo();
        String programa = miVista.leerPrograma();
        miDAO.actualizar(correo, correoper, cel, fijo, programa);

        System.out.println("Se modificó el estudiante");
    }

    public void ver() {
        System.out.println("El directorio de los estudiantes");
        ArrayList<Estudiante> miLista = miDAO.obtenerTodos();

        for (int i = 0; i < miLista.size(); i++) {
            Estudiante e = miLista.get(i);
            miVista.mostrarEstudiante(e);
        }
    }

    public void salir() {
        System.out.println("Hasta pronto");
        System.exit(0);
    }

}