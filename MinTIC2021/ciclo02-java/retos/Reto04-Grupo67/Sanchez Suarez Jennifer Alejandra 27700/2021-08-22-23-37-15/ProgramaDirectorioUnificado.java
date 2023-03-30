
import java.util.Scanner;
import java.util.ArrayList;

interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void modificar (String correoInst, Estudiante nuevo);
    public void eliminar (String correoInst);
    public ArrayList<Estudiante> obtenerTodos ();
}


class DirectorioDAO implements DirectorioDAOInterface {
    // Atributos
    ArrayList <Estudiante> listaEstudiantes;
    
    // Metodos
    public void crear () {
        // Inicializa el DAO creando la lista;
        listaEstudiantes = new ArrayList<Estudiante> ();
    }
    
    public void adicionar (Estudiante e) {
        // Adiciona el estudiante "e" al DAO, es decir a la lista
        listaEstudiantes.add (e);
    }
    
    public Estudiante buscar (String correoInst) {
        // Busca en el DAO el estudiante que tenga el correo igual a "correoInst"
        //System.out.println ("Información del estudiante");
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
                    
        }
        return (null);
    }
    
    public void modificar (String correoInst, Estudiante nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional)){
                listaEstudiantes.set(i, nuevo);
                               
            }  
        }      
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional)){
                listaEstudiantes.remove(i);
                
            }    
        }
        
    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
        return (listaEstudiantes);
    }
    
}

class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    
    // Constructor
    public Controlador () {
        miDAO.crear ();
    }
    
    // Metodos
    public void iniciar () {
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion ();
            
            switch (opcion) {
                case 1: adicionar (); System.out.println ("Se agregó el estudiante"); break;
                case 2: buscar ();  break;
                case 3: modificar(); break;
                case 4: eliminar (); System.out.println ("Se eliminó el estudiante"); break;
                case 5: ver (); break;
                case 6: salir (); break;
            }  
        }
    }
    // Adiciona estudiante al DAO
    public void adicionar () {
        System.out.println ("Ingresar estudiante");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);                
    }
	// Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
        System.out.println ("Buscar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
        System.out.println ("Información del estudiante");
		Estudiante e = miDAO.buscar (correo);
		miVista.mostrarEstudiante (e);
        
    }
	// Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correo);
    }
	// 1. Solita el correo 
	// 2. Busco el estuddiante en el DAO
	// 3. Pedirle los datos a modificar y modificar el estudiante
	// 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String correoInst = miVista.leerCorreoInstitucional ();
        Estudiante nuevo = miDAO.buscar(correoInst);
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


class VistaMenu {
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
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos ();
        e.fechaNac            = leerFechaNac ();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal ();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo ();
        e.progAcademico       = leerProgAcademico ();
        
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
    public void modificarEstudiante (Estudiante nuevo) {
       
        nuevo.correoPersonal = leerCorreoPersonal();
        nuevo.numeroCelular = leerNumeroCelular();
        nuevo.numeroFijo = leerNumeroFijo();
        nuevo.progAcademico = leerProgAcademico();
       
          
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

class Estudiante {
    // Atributos
    String nombres;
    String apellidos;
    String fechaNac;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String progAcademico;
        
    // Constructor
    public Estudiante () {
        this.nombres             = "Sin nombres";
        this.apellidos           = "Sin apellidos";
        this.fechaNac            = "0000/00/00";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal      = "Sin correo";
        this.numeroCelular       = 0;
        this.numeroFijo          = 0;
        this.progAcademico       = "Sin programa";
    }
    
    public Estudiante (String nombres, String apellidos, String fechaNac, String correoInst, String correoPer, long nroCelular, long nroFijo, String progAca){
        this.nombres                = nombres;
        this.apellidos              = apellidos;
        this.fechaNac               = fechaNac;
        this.correoInstitucional    = correoInst;
        this.correoPersonal         = correoPer;
        this.numeroCelular          = nroCelular;
        this.numeroFijo             = nroFijo;
        this.progAcademico          = progAca;  
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("Ingresar nombres:" + nombres + "Ingresar apellidos:" + apellidos + "Ingresar fecha de nacimiento (YYYY-MM-DD):" + fechaNac + "Ingresar correo institucional:" + correoInstitucional + "Ingresar correo personal:" + correoPersonal + "Ingresar número de celular:" + numeroCelular + "Ingresar número fijo:" + numeroFijo + "Ingresar programa:" + progAcademico);
    }            
}

public class ProgramaDirectorioUnificado {

    public static void main(String[] args) {
       Controlador ctrl = new Controlador ();
		ctrl.iniciar ();
    }
    
}
