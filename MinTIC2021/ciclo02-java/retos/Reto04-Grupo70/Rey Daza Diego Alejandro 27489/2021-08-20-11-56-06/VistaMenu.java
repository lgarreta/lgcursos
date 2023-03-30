import java.util.Scanner;
public class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarMenu () {
        System.out.println ("\nINSTITUTO LA FLORESTA");
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
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
public Estudiantes Actualizar () {
        Estudiantes nuevo = new Estudiantes ();
        
	nuevo.correoPersonal = leerCorreoPersonal();
	nuevo.numeroCelular = leerNumeroCelular();
	nuevo.numeroFijo = leerNumeroFijo();
    nuevo.programa = leerPrograma();
      
                
        return (nuevo);
    }
    
 
    
    
    
    
    public Estudiantes leerDatos () {
        Estudiantes e = new Estudiantes ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos();
        e.nacimiento          = leerNacimiento();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programa            = leerPrograma();

        return (e);
    }
    
    public void mostrarEstudiante (Estudiantes e) {
        if(e==null){
         System.out.println("El estudiante no se encuentra registrado en el instituto");       
            }
        else{
        
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos); 
        System.out.println ("Fecha nacimiento: " + e.nacimiento);
        System.out.println ("Correo institucional: " + e.correoInstitucional);
        System.out.println ("Correo personal: " + e.correoPersonal); 
        System.out.println ("Número de teléfono celular: " + e.numeroCelular);
        System.out.println ("Número de teléfono fijo: " + e.numeroFijo);
        System.out.println ("Programa académico: " + e.programa); 
           
    }
        }
    
    public String leerNombres () {
        System.out.println ("Ingresar nombres:");
        String nombres = lector.nextLine ();
        return (nombres);    
    }
    public String leerPrograma () {
        System.out.println ("Ingresar programa:");
        String programa = lector.nextLine ();
        return (programa);    
    }
    public String leerNacimiento () {
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String nacimiento = lector.nextLine ();
        return (nacimiento);    
    }
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal:");    
        String correoPersonal = lector.nextLine ();
        return (correoPersonal);    
    }
    public String leerApellidos () {
        System.out.println ("Ingresar apellidos:");
        String apellidos = lector.nextLine ();
        return (apellidos);    
    } 
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional:");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    public long leerNumeroCelular () {        
        System.out.println ("Ingresar número de celular:");
        long nroCelular = lector.nextLong ();
        lector.nextLine ();
        return (nroCelular);        
    }  
    public long leerNumeroFijo () {        
        System.out.println ("Ingresar número fijo:");
        long nRoFijo = lector.nextLong ();
        lector.nextLine ();
        return (nRoFijo);        
    }        
}


