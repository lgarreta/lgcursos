import java.util.InputMismatchException;
import java.util.Scanner;

public class VistaMenu {
    Scanner lector = new Scanner (System.in);
    
        public void mostrarMenu () {
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Selccione la consulta a realizar: ");
        System.out.println ("1. Ingresar estudiante");
        System.out.println ("2. Consultas");
        System.out.println ("3. Modificar estudiante");
        System.out.println ("4. Eliminar Estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir");
    }
    
    public int leerOpcion () {
        try {
            System.out.println ("Opción:");
            int opcion = lector.nextInt ();
            lector.nextLine ();
            return (opcion);
        }catch (InputMismatchException exc) {
            System.out.println("Error en lectura de opción Estudiante!");
            lector.nextLine ();
            return (0);

        }    
    }
    
    public Estudiantes leerDatos () {
        Estudiantes e = new Estudiantes ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos();
        e.fechaNacimiento     = leerFechaNacimiento();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programa            = leerPrograma ();
        
        return (e);
    }


    public void leerDatosNuevo (Estudiantes nuevo) {
        
        nuevo.nombres             = leerNombres ();
        nuevo.apellidos           = leerApellidos();
        nuevo.fechaNacimiento     = leerFechaNacimiento();
        nuevo.correoInstitucional = leerCorreoInstitucional();
        nuevo.correoPersonal      = leerCorreoPersonal();
        nuevo.numeroCelular       = leerNumeroCelular ();
        nuevo.numeroFijo          = leerNumeroFijo ();
        nuevo.programa            = leerPrograma ();
        
    }
    
    public void mostrarEstudiante (Estudiantes e) {
        System.out.println ("Información del estudiante");
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos);
        System.out.println ("Fecha nacimiento: " + e.fechaNacimiento);
        System.out.println ("Correo institucional: " + e.correoInstitucional);
        System.out.println ("Correo personal: " + e.correoPersonal);
        System.out.println ("Número de teléfono celular: " + e.numeroCelular);
        System.out.println ("Número de teléfono fijo: " + e.numeroFijo);
        System.out.println ("Programa académico: " + e.programa);
    }
    
    

    public String leerNombres () {
        System.out.println ("Ingresar nombres:");
        String nombres = lector.nextLine ();
        return (nombres);
    }
    public String leerApellidos () {
        System.out.println ("Ingresar apellidos:");
        String apellidos = lector.nextLine ();
        return (apellidos);
        
    }

    public String leerFechaNacimiento () {
        System.out.println ("Ingresar fecha nacimiento YYYY-MM-DD:");
        String fechaNacimiento = lector.nextLine();
        return (fechaNacimiento);
    }
    
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional:");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal:");
        String correoPersonal = lector.nextLine ();
        return (correoPersonal);
    }
    public long leerNumeroCelular () {        
        System.out.println ("Ingresar número celular:");
        long nroCelular = lector.nextLong ();
        lector.nextLine ();
        return (nroCelular);        
    }    
    public long leerNumeroFijo () {
        System.out.println ("Ingresar número fijo:");
        long numeroFijo = lector.nextLong ();
        lector.nextLine ();
        return (numeroFijo);
    }
    public String leerPrograma () {
        System.out.println ("Ingresar programa");
        String programa = lector.nextLine ();
        return (programa);
    }
}
