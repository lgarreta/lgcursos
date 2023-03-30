
import java.util.InputMismatchException;
import java.util.Scanner;

public class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarMenu () {
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar:");
        System.out.println ("1. Ingresar estudiante");
        System.out.println ("2. Buscar estudiante");
        System.out.println ("3. Modificar estudiante");
        System.out.println ("4. Eliminar Estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir");
           
    }
    
    public int leerOpcion () {
        try {  
            System.out.println ("Opción:");
            System.out.println ("");
            int opcion = lector.nextInt ();
            lector.nextLine ();
            return (opcion);
            }catch (InputMismatchException e2) {
                System.out.println ("Opcion no valida");
                lector.nextLine ();
                return (0); 
            }
    }
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos();
        e.fechaNacimiento     = leerFechaNacimiento ();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programaAcademico   = leerProgramaAcademico ();
        
        return (e);
    }
    public void modificarEstudiante (Estudiante nuevo1) {
        nuevo1.correoPersonal = leerCorreoPersonal();
        nuevo1.numeroCelular = leerNumeroCelular();
        nuevo1.numeroFijo = leerNumeroFijo();
        nuevo1.programaAcademico = leerProgramaAcademico();
        

    }
    public void mostrarEstudiante (Estudiante e) {
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos); 
        System.out.println ("Fecha nacimiento: " + e.fechaNacimiento);   
        System.out.println ("Correo institucional: " + e.correoInstitucional);
        System.out.println ("Correo personal: " + e.correoPersonal); 
        System.out.println ("Número de teléfono celular: " + e.numeroCelular); 
        System.out.println ("Número de teléfono fijo: " + e.numeroFijo); 
        System.out.println ("Programa académico: " + e.programaAcademico);
           
    }
    
    public String leerNombres () {
        System.out.println ("Ingresar nombres: ");
        System.out.println ("");
        
        String nombres = lector.nextLine ();
        return (nombres);
    }
    public String leerApellidos () {
        System.out.println ("Ingresar apellidos: ");
        System.out.println ("");
        String apellidos = lector.nextLine ();
        
        return (apellidos);        
    }
    public String leerFechaNacimiento () {        
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        System.out.println ("");
        String fechaNacimiento = lector.nextLine ();
        
        return (fechaNacimiento);        
    }    
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional: ");
        System.out.println ("");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal: ");
        System.out.println ("");
        String correoPersonal = lector.nextLine ();
        
        
        return (correoPersonal);        
    }
    public long leerNumeroCelular () {        
        try {
            
            System.out.println ("Ingresar número de celular: ");
            System.out.println ("");
            long nroCelular = lector.nextLong ();
            lector.nextLine ();
            return (nroCelular);  
        } catch (InputMismatchException cel) {
            System.out.println ("dato invalido");
            lector.nextLine ();
            return (0);
        }      
    }
    public long leerNumeroFijo () {
        try { 
            System.out.println ("Ingresar número fijo: ");
            System.out.println ("");
            long numeroFijo = lector.nextLong ();
            lector.nextLine ();
            return (numeroFijo);
        } catch (InputMismatchException cel) {
            System.out.println ("dato invalido");
            lector.nextLine ();
            return (0);
        }      
    }
    public String leerProgramaAcademico () {
        System.out.println ("Ingresar programa: ");
        System.out.println ("");
        String programaAcademico = lector.nextLine ();
        
        return (programaAcademico);        
    }    
}