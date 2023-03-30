import java.util.Scanner;
public class VistaMenu {
    
    Scanner lector = new Scanner (System.in);
   
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
        System.out.println ("Opción :");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }

    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        
        e.nombres             = leerNombres ();
        System.out.println ("");
        e.apellidos           = leerApellidos ();
        System.out.println ("");
        e.fechaNacimiento     = leerFechaNacimiento();
        System.out.println ("");
        e.correoInstitucional = leerCorreoInstitucional();
        System.out.println ("");
        e.correoPersonal      = leerCorreoPersonal();
        System.out.println ("");
        e.numeroCelular       = leerCelular ();
        System.out.println ("");
        e.numerofijo          = leerNumerofijo ();
        System.out.println ("");
        e.programaAcademico   = leerProgramaAcademico();
        System.out.println ("");

        return (e);
    }
    public void modificarEstudiante (Estudiante nuevo) {
        nuevo.correoPersonal = leerCorreoPersonal();
        System.out.println ("");
        nuevo.numeroCelular = leerCelular();
        System.out.println ("");
        nuevo.numerofijo = leerNumerofijo();
        System.out.println ("");
        nuevo.programaAcademico = leerProgramaAcademico();
        System.out.println ("");
        
          
    }

    public String leerNombres () {
        System.out.println ("Ingresar nombres: ");
        String nombres = lector.nextLine ();
        return (nombres);
    }

    public String leerApellidos () {
        System.out.println ("Ingresar apellidos: ");
        String apellidos = lector.nextLine ();
        return (apellidos);
    }
    public String leerFechaNacimiento () {
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = lector.nextLine ();
        return (fechaNacimiento);
    }
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional: ");
        String correoInstitucional = lector.nextLine ();
        return (correoInstitucional);        
    }
    public String leerCorreoPersonal () {        
        System.out.println ("Ingresar correo personal: ");
        String correoPersonal = lector.nextLine();
        return (correoPersonal);        
    }    
    public long leerCelular () {
        System.out.println ("Ingresar número de celular: ");
        long numeroCelular = lector.nextLong ();
        lector.nextLine ();
        return (numeroCelular);
    }
    public long leerNumerofijo () {
        System.out.println ("Ingresar número fijo: ");
        long numeroFijo = lector.nextLong ();
        lector.nextLine ();
        return (numeroFijo);
    }
    public String leerProgramaAcademico () {
        System.out.println ("Ingresar programa: ");
        String programaAcademico = lector.nextLine ();
        return (programaAcademico);
    }

    public void mostrarEstudiante(Estudiante e) {
        try {
            System.out.println ("Nombres: " + e.nombres);
            System.out.println ("Apellidos: " + e.apellidos);
            System.out.println ("Fecha nacimiento: " + e.fechaNacimiento);
            System.out.println ("Correo institucional: " + e.correoInstitucional); 
            System.out.println ("Correo personal: " + e.correoPersonal);
            System.out.println ("Número de teléfono celular: " + e.numeroCelular);   
            System.out.println ("Número de teléfono fijo: " + e.numerofijo);  
            System.out.println ("Programa académico: " + e.programaAcademico); 
            } catch (Exception exc) {
                System.out.println ("Correo Estudiante No existe ");
            }

    }



}

