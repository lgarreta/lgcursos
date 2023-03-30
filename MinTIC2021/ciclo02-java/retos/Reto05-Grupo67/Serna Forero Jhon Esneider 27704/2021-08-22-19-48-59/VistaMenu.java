

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
        e.correoInstitucional = leerCorreoInstitucional();
        e.numeroCelular       = leerNumeroCelular ();
        
        return (e);
    }
    
    public void leerDatosNuevo (Estudiantes nuevo) {
        
        nuevo.nombres             = leerNombres ();
        nuevo.numeroCelular       = leerNumeroCelular ();
    }
    
    
    public void mostrarEstudiante (Estudiantes e) {

            System.out.println ("NOMBRES: " + e.nombres);
            System.out.println ("CORREO INST: " + e.correoInstitucional); 
            System.out.println ("CELULAR: " + e.numeroCelular);     
    }

    
    public String leerNombres () {
        System.out.println ("NOMBRES:");
        String nombres = lector.nextLine ();
        return (nombres);
    }
    public String leerCorreoInstitucional () {
        System.out.println ("CORREO INST:");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    public long leerNumeroCelular () {        
        System.out.println ("CELULAR:");
        long nroCelular = lector.nextLong ();
        lector.nextLine ();
        return (nroCelular);        
    }    
}
