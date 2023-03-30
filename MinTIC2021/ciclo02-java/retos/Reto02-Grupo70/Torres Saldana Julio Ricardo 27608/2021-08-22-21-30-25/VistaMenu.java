
import java.util.Scanner;

public class VistaMenu {
    
    Scanner lector = new Scanner (System.in);
    
    
    public void mostrarMenu () {
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar:");
        System.out.println ("1. Ingresar estudiante");
        System.out.println ("2. Buscar estudiante");
        System.out.println ("3. Modificar estudiante");
        System.out.println ("4. Eliminar estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir");
    }
    
    public int leerOpcion () {
        System.out.println ("Opción:");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos ();
        e.fecha               = leerFecha ();  
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programa            = leerPrograma ();
        
                       
        return (e);
    }
    
    public void mostrarEstudiante (Estudiante e) {
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos);
        System.out.println ("Fecha de nacimiento: " + e.fecha);
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
    public String leerFecha () {
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String fecha = lector.nextLine ();
        return (fecha);
    }
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional:");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal:");
        String correoPer = lector.nextLine ();
        return (correoPer);        
    }
    public long leerNumeroCelular () {        
        System.out.println ("Ingresar número de celular:");
        long nroCelular = lector.nextLong ();
        lector.nextLine ();
        return (nroCelular);        
    }
    public long leerNumeroFijo () {        
        System.out.println ("Ingresar número fijo:");
        long nroFijo = lector.nextLong ();
        lector.nextLine ();
        return (nroFijo);
    }
    public String leerPrograma () {
        System.out.println ("Ingresar programa:");
        String programa = lector.nextLine ();
        return (programa);        
    }
    public String leerCorreoPersonalNuevo () {
        System.out.println ("Ingresar correo personal:");
        String correoPerNuevo = lector.nextLine ();
        return (correoPerNuevo);        
    }
    public long leerNumeroCelularNuevo () {        
        System.out.println ("Ingresar número de celular:");
        long nroCelularNuevo = lector.nextLong ();
        lector.nextLine ();
        return (nroCelularNuevo);        
    }
    public long leerNumeroFijoNuevo () {        
        System.out.println ("Ingresar número fijo:");
        long nroFijoNuevo = lector.nextLong ();
        lector.nextLine ();
        return (nroFijoNuevo);
    }
    public String leerProgramaNuevo () {
        System.out.println ("Ingresar programa:");
        String programaNuevo = lector.nextLine ();
        return (programaNuevo);        
    }
}
