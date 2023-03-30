import java.util.Scanner;

public class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarMenu () {
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar:");
        System.out.println ("1. Ingresar Estudiante");
        System.out.println ("2. Buscar Estudiante");
        System.out.println ("3. Modificar Estudiante");
        System.out.println ("4. Eliminar Estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir");
    }
    
    public int leerOpcion () {
        System.out.println ("Opción:");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
    public Estudiantes leerDatos () {
        Estudiantes e = new Estudiantes ();
        
        e.nombres = leerNombres();
        e.apellido = leerApellidos();
        e.fecha = leerFecha();
        e.correoinstituto = leerCorreoInstitucional();
        e.correopersonal = leerCorreoPersonal();
        e.celular = leerNumeroCelular();
        e.fijo = leerNumeroFijo();
        e.programa = leerPrograma();

        return (e);
    }
    
    public Estudiantes actualizarDatos () {
        Estudiantes nuevo = new Estudiantes ();
        
        nuevo.nombres = leerNombres();
        nuevo.celular = leerNumeroCelular();
        nuevo.apellido = leerApellidos();
                
        return (nuevo);
    }
    
    public void mostrarEstudiante (Estudiantes e) {
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellido); 
        System.out.println ("Fecha nacimiento: " + e.fecha);
        System.out.println ("Correo institucional: " + e.correoinstituto);
        System.out.println ("Correo personal:" + e.correopersonal); 
        System.out.println ("Número de teléfono celular: " + e.celular);
        System.out.println ("Número de teléfono fijo: " + e.fijo);
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
        System.out.println ("Ingresar fecha de nacimiento(YYYY-MM-DD):");
        String fecha = lector.nextLine ();
        return (fecha);
    }
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional:");
        String correoinstituto = lector.nextLine ();
        return (correoinstituto);        
    }
    
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal:");
        String correopersonal = lector.nextLine ();
        return (correopersonal);
    }
    public long leerNumeroCelular () {        
        System.out.println ("Ingresar número de celular:");
        long celular = lector.nextLong ();
        lector.nextLine ();
        return (celular);        
    }    
    public long leerNumeroFijo () {        
        System.out.println ("Ingresar número fijo:");
        long fijo = lector.nextLong ();
        lector.nextLine ();
        return (fijo);        
    }    

    public String leerPrograma () {
        System.out.println ("Ingresar programa:");
        String programa = lector.nextLine ();
        return (programa);
    }
    
    
    }
