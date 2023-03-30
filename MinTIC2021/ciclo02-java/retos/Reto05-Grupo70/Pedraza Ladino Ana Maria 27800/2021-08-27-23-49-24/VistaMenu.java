import java.util.InputMismatchException;
import java.util.Scanner;

public class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarMenu () {
        System.out.println ("");
        System.out.println ("----MENU----");
        System.out.println ("1. Adicionar");
        System.out.println ("2. Buscar");
        System.out.println ("3. Eliminar");
        System.out.println ("4. Modificar");
        System.out.println ("5. Ver directorio completo");
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
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos ();
        e.fechaNacimiento     = leerfechaNacimiento ();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.programa            = leerprograma ();
        
        return (e);
    }
    
    public void leerDatosNuevo (Estudiantes nuevo) {
        
        nuevo.nombres             = leerNombres ();
        nuevo.apellidos           = leerApellidos ();
        nuevo.fechaNacimiento     = leerfechaNacimiento ();
        nuevo.correoInstitucional = leerCorreoInstitucional();
        nuevo.correoPersonal      = leerCorreoPersonal();
        nuevo.numeroCelular       = leerNumeroCelular ();
        nuevo.numeroFijo          = leerNumeroFijo ();
        nuevo.programa            = leerprograma ();
        
    }
    
    
    public void mostrarEstudiante (Estudiantes e) {

            System.out.println ("NOMBRES: " + e.nombres);
            System.out.println ("APELLIDOS: " + e.apellidos);
            System.out.println ("FECHA DE NACIMIENTO: " + e.fechaNacimiento);
            System.out.println ("CORREO INST: " + e.correoInstitucional); 
            System.out.println ("CORREO PERSONAL: " + e.correoPersonal); 
            System.out.println ("NUMERO CELULAR: " + e.numeroCelular);
            System.out.println ("NUMERO FIJO: " + e.numeroFijo);
            System.out.println ("PROGRAMA: " + e.programa);
    }

    
    public String leerNombres () {
        System.out.println ("NOMBRES:");
        String nombres = lector.nextLine ();
        return (nombres);
    }
    
    public String leerApellidos () {
        System.out.println ("APELLIDOS:");
        String apellidos = lector.nextLine ();
        return (apellidos);
    }
    public String leerfechaNacimiento () {
        System.out.println ("FECHA DE NACIMIENTO:");
        String fechaNacimiento = lector.nextLine ();
        return (fechaNacimiento);
    }
    public String leerCorreoInstitucional () {
        System.out.println ("CORREO INST:");
        String correoInst = lector.nextLine ();
        return (correoInst);  
    }
    
    public String leerCorreoPersonal () {
        System.out.println ("CORREO PERSONAL:");
        String correoPersonal = lector.nextLine ();
        return (correoPersonal);  
    }
    public long leerNumeroCelular () {        
        System.out.println ("NUMERO CELULAR:");
        long nroCelular = lector.nextLong ();
        lector.nextLine ();
        return (nroCelular);        
    }   
    public long leerNumeroFijo () {        
        System.out.println ("NUMERO CELULAR:");
        long nroPersonal = lector.nextLong ();
        lector.nextLine ();
        return (nroPersonal);        
    }  
    public String leerprograma () {
        System.out.println ("PROGRAMA ACADEMICO:");
        String programa = lector.nextLine ();
        return (programa); 
    }
}
