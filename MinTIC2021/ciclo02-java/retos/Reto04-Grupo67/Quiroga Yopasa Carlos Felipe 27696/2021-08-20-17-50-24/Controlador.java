


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
   
    VistaMenu     miVista = new VistaMenu();
    DirectorioDAO miDAO   = new DirectorioDAO();
    
    public Controlador() {
        miDAO.crear();
    }
    public void iniciar() {
        while (true) {
            miVista.mostrarMenu();
            int opcion = miVista.leerOpcion();
            
            switch (opcion) {
                case 1: adicionar (); break;
                case 2: buscar (); break;
                case 3: modificar (); break;
                case 4: eliminar (); break;
                case 5: ver (); break;
                case 6: salir (); break;
            }  
        }
    }


    public void adicionar() {
        System.out.println ("Ingresar estudiante");
        Estudiante e = miVista.leerDatos();
        miDAO.adicionar(e);                
    }
    public void buscar() {
        System.out.println ("Buscar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		Estudiante e = miDAO.buscar (correo);
        System.out.println ("Información del estudiante");
		miVista.mostrarEstudiante (e);
    }
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
		String correoInst = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correoInst);
    }
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String correoInst = miVista.leerCorreoInstitucional ();
        Estudiante nuevo =miDAO.buscar (correoInst);
        miVista.modificarEstudiante(nuevo);
        System.out.println ("Se modificó el estudiante");
    }
    public void ver () {
        System.out.println ("El directorio de los estudiantes");
		ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

		for (int i=0; i < miLista.size (); i++) {
			Estudiante e = miLista.get (i);
			miVista.mostrarEstudiante (e);
		}
    }
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }    
}

class Estudiante implements Serializable{
    String nombres;
    String apellidos; 
    String fechanacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroTelefono;
    String programa;
    /////////////CONSTRUCTOR    
    public Estudiante () {
        this.nombres             = "Sin nombres";
        this.apellidos           = "Sin apellidos";
        this.fechanacimiento     ="Sin fecha";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal      = "Sin correo";
        this.numeroCelular       = 0;
        this.numeroTelefono      = 0;
        this.programa            = "Ningun Programa";
    }
    
    public Estudiante (String nombres, String apellidos, String fechanacimiento, String correoInst, String correoPer, long nroCelular, long nroTelefono, String Programa){
        this.nombres             = nombres;
        this.apellidos           = apellidos;
        this.fechanacimiento     = fechanacimiento;
        this.correoInstitucional = correoInst;
        this.correoPersonal      = correoPer;
        this.numeroCelular       = nroCelular;
        this.numeroTelefono      = nroTelefono;
        this.programa            = Programa; 
    }
    
    ///////////METODOS
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }            
}

class VistaMenu {
    ///////////ATRIBUTOS
    Scanner lector = new Scanner (System.in);
    
    ///////////METODOS
    public void mostrarMenu () {
        System.out.println ("");
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
        e.apellidos           = leerApellidos();
        e.fechanacimiento     = leerFechaNacimiento();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroTelefono      = leerNumeroTelefono ();
        e.programa            = leerPrograma ();
        
        return (e);
    }
    
    public void mostrarEstudiante (Estudiante e) {
        System.out.println ("Nombres: " + e.nombres);
        System.out.println ("Apellidos: " + e.apellidos);
        System.out.println ("Fecha nacimiento: " + e.fechanacimiento);
        System.out.println ("Correo institucional: " + e.correoInstitucional);
        System.out.println ("Correo personal: " + e.correoPersonal); 
        System.out.println ("Número de teléfono celular: " + e.numeroCelular);
        System.out.println ("Número de teléfono fijo: " + e.numeroTelefono);
        System.out.println ("Programa académico: " + e.programa);        
    }
    
    public void modificarEstudiante (Estudiante nuevo){
        nuevo.correoPersonal = leerCorreoPersonal();
        nuevo.numeroCelular  = leerNumeroCelular();
        nuevo.numeroTelefono = leerNumeroTelefono();
        nuevo.programa       = leerPrograma();

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
        String fechanacimiento = lector.nextLine ();
        return (fechanacimiento);
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
    public long leerNumeroTelefono () {        
        System.out.println ("Ingresar número fijo:");
        long nroTelefono = lector.nextLong ();
        lector.nextLine ();
        return (nroTelefono);        
    }  
    public String leerPrograma () {
        System.out.println ("Ingresar programa:");
        String Programa = lector.nextLine ();
        return (Programa);        
    } 
}