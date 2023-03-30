
import java.util.InputMismatchException;
import java.util.Scanner;

public class VistaMenu {

    Scanner lector = new Scanner (System.in);
    long numeroCelular = 0;
    long numeroFijo = 0;
    
    // Metodos
    public void mostrarMenu () {
        System.out.println ("");
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar: ");
        System.out.println ("1. Ingresar estudiante");
        System.out.println ("2. Buscar estudiante");
        System.out.println ("3. Modificar estudiante");
        System.out.println ("4. Eliminar Estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir");
    }  
    public int leerOpcion () {
        System.out.println ("OpciÃ³n:");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    public Estudiantes leerDatos () {
        Estudiantes e = new Estudiantes ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos ();
        e.fechaDeNacimiento   = leerFechaDeNacimiento();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal ();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programaAcademico   = leerProgramaAcademico ();
        return (e);
    }
       public void mostrarEstudiante (Estudiantes e) {
        try{
        System.out.println ("Información del estudiante");
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos);
        System.out.println ("Fecha nacimiento: " + e.fechaDeNacimiento);
        System.out.println ("Correo institucional: " + e.correoInstitucional); 
        System.out.println ("Correo personal: " + e.correoPersonal); 
        System.out.println ("Número de teléfono celular: " + e.numeroCelular); 
        System.out.println ("Número de teléfono fijo: " + e.numeroFijo); 
        System.out.println ("Programa académico: " + e.programaAcademico); 
        } catch (Exception exc) {
            System.out.println ("Error en el estudiante");         
        } 
    }
    public void modificarEstudiante (Estudiantes nuevo){
        nuevo.correoPersonal = leerCorreoPersonal();
        nuevo.numeroCelular = leerNumeroCelular();
        nuevo.numeroFijo = leerNumeroFijo();
        nuevo.programaAcademico = leerProgramaAcademico();
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
    public String leerFechaDeNacimiento () {
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        String fechaDeNacimiento = lector.nextLine ();
        return (fechaDeNacimiento);
    }
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional: ");
        String correoInstitucional = lector.nextLine ();
        return (correoInstitucional);      
    }
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal: ");
        String correoPersonal = lector.nextLine ();
        return (correoPersonal);  
    }
    public long leerNumeroCelular () {        
        System.out.println ("Ingresar nÃºmero de celular: ");
        try {
        long numeroCelular = lector.nextLong ();
        lector.nextLine ();
        return (numeroCelular);
        }catch (InputMismatchException ex) {
            lector.nextLine ();
            return (numeroCelular);
        }  
    }   
    public long leerNumeroFijo () { 
        try {
        System.out.println ("Ingresar nÃºmero fijo: ");
        long numeroFijo = lector.nextLong ();
        lector.nextLine ();
        return (numeroFijo);  
        }catch (InputMismatchException ex) {
            lector.nextLine ();
            return (numeroFijo);  
        } 
    }
    public String leerProgramaAcademico () {
        System.out.println ("Ingresar programa: ");
        String programaAcademico = lector.nextLine ();
        return (programaAcademico); 
    }
}
