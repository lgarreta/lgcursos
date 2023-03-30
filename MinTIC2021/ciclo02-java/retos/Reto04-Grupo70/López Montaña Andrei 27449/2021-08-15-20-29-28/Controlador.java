import java.util.ArrayList;
import java.util.InputMismatchException;

public class Controlador {
    VistaMenu miVista = new VistaMenu();
    DirectorioDAO miDAO = new DirectorioDAO();

    public Controlador() {
        miDAO.crear();
    }

    public void ejecutar() {
        int opcion;
        while (true) {
            miVista.mostrarMenu();
            opcion = miVista.leerOpcion();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresar estudiante");
                        adicionarEstudiante();
                        break;
                    case 2:
                        System.out.println("Buscar estudiante");
                        buscarEstudianteMenu();
                        break;
                    case 3:
                        System.out.println("Modificar estudiante");
                        modificarEstudiante();
                        break;
                    case 4:
                        System.out.println("Eliminar estudiante");
                        eliminarEstudiante();
                        break;
                    case 5:
                        System.out.println("El directorio de los estudiantes\n");
                        mostrarDirectorio();
                        break;
                    case 6:
                        System.out.println("Hasta pronto");
                        System.exit(0);
                        break;
                }
            } catch (NullPointerException ex) {
                System.out.println("Error en estudiante!");
				ex.printStackTrace ();
            } catch (InputMismatchException ex) {
                System.out.println("Error en lectura de opción. Termina el programa");
                System.exit(0);
            }
        }
    }

    public void adicionarEstudiante() {
        Estudiante e = miVista.leerDatos();
        miDAO.adicionarEstudiante(e);
        System.out.println("Se agregó el estudiante\n");
    }

    public void buscarEstudianteMenu() {
        int op;
        while (true) {
            miVista.mostrarSubMenu();
            op = miVista.leerOpcion();
                switch (op) {
                    case 1:
                        System.out.println("Buscar estudiante");
                        buscarEstudianteCorreo();
                        break;
                    case 2:
                        System.out.println("Buscar estudiante");
                        buscarEstudianteApellido();
                        break;
                     case 3:
                        System.out.println("Buscar estudiante");
                        buscarEstudiantePrograma();
                        break;
                    case 4:
                        System.out.println("Buscar estudiante");
                        buscarEstudianteCantidadPrograma();
                        break;
                    case 5:
                        System.out.println("Buscar estudiante");
                        buscarEstudianteFecha();
                        break;
                    case 6:
                        System.out.println("Buscar estudiante");
                        buscarEstudianteCelular();
                        break;
                }
        }
    }
                        
    public void buscarEstudianteCorreo() {
        String correo = miVista.leerCorreoInstitucional();
        Estudiante e = miDAO.buscarEstudianteCorreo(correo);
        miVista.mostrarEstudiante(e);
        ejecutar();
    }
    
    public void buscarEstudianteApellido() {
        String apellido = miVista.leerApellidos();
        ArrayList<Estudiante> miLista = miDAO.buscarEstudianteApellido(apellido);
        for (int i = 0; i < miLista.size(); i++) {
            Estudiante e = miLista.get(i);
            miVista.mostrarEstudiante(e);
        }
        ejecutar();
    }
    
    public void buscarEstudiantePrograma(){
        String programa = miVista.leerProgramaAcademico();
        System.out.println("Datos estudiante");
        String cadena[] = miDAO.buscarEstudiantePrograma(programa);
        miVista.buscarProgrmaEstudiante(cadena);
        ejecutar();
    }
    
    public void buscarEstudianteCantidadPrograma(){
        String programa = miVista.leerProgramaAcademico();
        int cant = miDAO.buscarEstudianteCantidadPrograma(programa);
        miVista.buscarCantidadEstudiantes(programa,cant);
        ejecutar();
    }
    
    public void buscarEstudianteFecha() {
        String fecha = miVista.leerFechaNacimiento();
        ArrayList<Estudiante> miLista = miDAO.buscarEstudianteFecha(fecha);
        for (int i = 0; i < miLista.size(); i++) {
            Estudiante e = miLista.get(i);
            miVista.mostrarEstudiante(e);
        }
        ejecutar();
    }    
    
    public void buscarEstudianteCelular(){
        Long celular = miVista.leerNumeroCelular();
        System.out.println("Datos estudiante");
        String cadena[] = miDAO.buscarCelularEstudiante(celular);
        miVista.buscarCelularEstudiante(cadena);
        ejecutar();
}
    
    public void modificarEstudiante() {
        String correo = miVista.leerCorreoInstitucional();
        String nuevoCorreoP = miVista.leerCorreoPersonal();
        long nuevoNumCel = miVista.leerNumeroCelular();
        long nuevoNumFij = miVista.leerNumeroFijo();
        String nuevoProgAca = miVista.leerProgramaAcademico();
        miDAO.modificarEstudiante(correo, nuevoCorreoP, nuevoNumCel, nuevoNumFij, nuevoProgAca);
        System.out.println("Se modificó el estudiante\n");
    }

    public void eliminarEstudiante() {
        String correo = miVista.leerCorreoInstitucional();
        miDAO.eliminarEstudiante(correo);
        System.out.println("Se eliminó el estudiante\n");
    }

    public void mostrarDirectorio() {
        ArrayList<Estudiante> miLista = miDAO.obtenerTodos();
        for (int i = 0; i < miLista.size(); i++) {
            Estudiante e = miLista.get(i);
            miVista.mostrarEstudiante(e);
        }
    }
}