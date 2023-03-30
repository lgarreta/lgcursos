


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
        //System.out.println ("");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos ();
        e.fechaNacimiento     = leerFechaNacimiento();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programaAcademico   = leerProgramaAcademico();
        
        return (e);
        
    }
    
    public void leerDatosNuevo (Estudiante nuevo) {
        nuevo.correoPersonal = leerCorreoPersonal ();
        nuevo.numeroCelular  = leerNumeroCelular ();
        nuevo.numeroFijo     = leerNumeroFijo();
        nuevo.programaAcademico = leerProgramaAcademico();
    }
    
    public void mostrarEstudiante (Estudiante e) {
        try{
            //System.out.println ("");
            System.out.println ("Nombres: " + e.nombres);
            System.out.println ("Apellidos: " + e.apellidos);
            System.out.println ("Fecha nacimiento: " + e.fechaNacimiento);
            System.out.println ("Correo institucional: " + e.correoInstitucional);
            System.out.println ("Correo personal: " + e.correoPersonal);
            System.out.println ("Número de teléfono celular: " + e.numeroCelular);
            System.out.println ("Número de teléfono fijo: " + e.numeroFijo);
            System.out.println ("Programa académico: " + e.programaAcademico);
            //System.out.println ("");
        }catch (Exception exc) {
            System.out.println ("Error en el estudiante");
        }
        
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
    System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD):");
    String fechaNaci = lector.nextLine ();
    return (fechaNaci);    
    }        
        
        
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional:");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    
    public String leerCorreoPersonal () {
    System.out.println ("Ingresar correo personal:");
    String correoPers = lector.nextLine ();
    return (correoPers);        
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
    public String leerProgramaAcademico () {        
        System.out.println ("Ingresar programa:");
        String progAcade = lector.nextLine ();
        return (progAcade);        
    }     

}