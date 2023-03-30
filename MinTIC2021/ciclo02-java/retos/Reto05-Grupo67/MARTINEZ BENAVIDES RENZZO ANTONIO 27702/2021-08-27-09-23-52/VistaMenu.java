import java.util.Scanner;
public class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarMenu () {
        System.out.println ("");
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
        System.out.println ("Opción:");
        System.out.println ("");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
    public Estudiante leerDatoNuevo () {
        Estudiante e = new Estudiante ();
        e.nombres             = leerNombres ();
        System.out.println ("");
        e.apellidos           = leerApellidos ();
        System.out.println ("");
        e.fechaNac            = leerFechaNac ();
        System.out.println ("");
        e.correoInstitucional = leerCorreoInstitucional();
        System.out.println ("");
        e.correoPersonal      = leerCorreoPersonal ();
        System.out.println ("");
        e.numeroCelular       = leerNumeroCelular ();
        System.out.println ("");
        e.numeroFijo          = leerNumeroFijo ();
        System.out.println ("");
        e.progAcademico       = leerProgAcademico ();
        System.out.println ("");
        return (e);
    }
     public void mostrarEstudiante (Estudiante e) {
        try {
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos);
        System.out.println ("Fecha nacimiento: " + e.fechaNac);
        System.out.println ("Correo institucional: " + e.correoInstitucional); 
        System.out.println ("Correo personal: " + e.correoPersonal);
        System.out.println ("Número de teléfono celular: " + e.numeroCelular);   
        System.out.println ("Número de teléfono fijo: " + e.numeroFijo);  
        System.out.println ("Programa académico: " + e.progAcademico); 
        } catch (Exception exc) {
            System.out.println ("Correo Estudiante No existe ");
        }
          
    }
    public Estudiante modificarEstudiante (Estudiante nuevo) {
       
        nuevo.correoPersonal = leerCorreoPersonal();
        System.out.println ("");
        nuevo.numeroCelular = leerNumeroCelular();
        System.out.println ("");
        nuevo.numeroFijo = leerNumeroFijo();
        System.out.println ("");
        nuevo.progAcademico = leerProgAcademico();
        System.out.println ("");
        
        return nuevo;
          
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
    public String leerFechaNac () {
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String fechaNac = lector.nextLine ();
        return (fechaNac);
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
    public String leerProgAcademico () {
        System.out.println ("Ingresar programa:");
        String progAca = lector.nextLine ();
        return (progAca);        
    }
        
}
