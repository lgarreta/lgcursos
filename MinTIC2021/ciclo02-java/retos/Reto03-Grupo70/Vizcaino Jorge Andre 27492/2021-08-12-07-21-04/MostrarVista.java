
import java.util.Scanner;
import java.util.InputMismatchException;

public class MostrarVista {
    // Atributos
    Scanner lector = new Scanner(System.in);

    // Metodos
    public void mostrarMenu() {
        System.out.println("\nINSTITUTO LA FLORESTA");
        System.out.println("Seleccione tarea a realizar:");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Buscar estudiante");
        System.out.println("3. Modificar estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir");
    }

    public int leerOpcion() {
        boolean check = false;
        int opcion = 0;
        while (!check) {
            try {
                System.out.println("Opción:");
                opcion = lector.nextInt();
                check = true;
            } catch (InputMismatchException ex) {
                System.out.println("Específica: Ingresó un dato no válido..... :(");
                opcion = 0;
            } finally {
                lector.nextLine();
            }

        }
        return opcion;
    }

    public Estudiante leerDatos() {
        Estudiante e = new Estudiante();

        e.nombres = leerNombres();
        e.apellidos = leerApellidos();
        e.fecha = leerFecha();
        e.correoInst = leerCorreoInstitucional();
        e.correo = leerCorreo();
        e.nroCelular = leerNumeroCelular();
        e.nroFijo = leerNumeroFijo();
        e.programa = leerPrograma();
        return (e);
    }

    public void mostrarEstudiante(Estudiante e) {
        System.out.println("Nombres: " + e.nombres);
        System.out.println("Apellidos: " + e.apellidos);
        System.out.println("Fecha nacimiento: " + e.fecha);
        System.out.println("Correo institucional: " + e.correoInst);
        System.out.println("Correo personal: " + e.correo);
        System.out.println("Número de teléfono celular: " + e.nroCelular);
        System.out.println("Número de teléfono fijo: " + e.nroFijo);
        System.out.println("Programa académico: " + e.programa);
    }

    public String leerNombres() {
        System.out.println("Ingresar nombres: ");
        String nombres = lector.nextLine();
        return (nombres);
    }

    public String leerApellidos() {
        System.out.println("Ingresar apellidos: ");
        String apellidos = lector.nextLine();
        return (apellidos);
    }

    public String leerFecha() {
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        String fecha = lector.nextLine();
        return (fecha);
    }

    public String leerCorreoInstitucional() {
        System.out.println("Ingresar correo institucional: ");
        String correoInst = lector.nextLine();
        return (correoInst);
    }

    public String leerCorreo() {
        System.out.println("Ingresar correo personal: ");
        String correo = lector.nextLine();
        return (correo);
    }

    public long leerNumeroCelular() {

        boolean check = false;
        long nroCelular = 0;
        while (!check) {
            try {
                System.out.println("Ingresar número de celular: ");
                nroCelular = lector.nextLong();
                // lector.nextLine ();
                check = true;
            } catch (InputMismatchException ex) {
                System.out.println("Específica: Ingresó un dato no válido... :(");
                nroCelular = 0;
            } finally {
                lector.nextLine();
            }

        }

        return (nroCelular);
    }

    public long leerNumeroFijo() {

        boolean check = false;
        long nroFijo = 0;
        while (!check) {
            try {
                System.out.println("Ingresar número fijo: ");
                nroFijo = lector.nextLong();
                // lector.nextLine ();
                check = true;
            } catch (InputMismatchException ex) {
                System.out.println("Específica: Ingresó un dato no válido... :(");
                nroFijo = 0;
            } finally {
                lector.nextLine();
            }

        }

        return (nroFijo);
    }

    public String leerPrograma() {
        System.out.println("Ingresar programa: ");
        String programa = lector.nextLine();
        return (programa);
    }

}
