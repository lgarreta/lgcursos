
import java.util.ArrayList;
import java.util.Scanner;

interface DirectorioDAOInterface {
    public void crear ();
    public void adicionar (Estudiante e);
    public Estudiante buscar (String correoInst);
    public void actualizar (String correoInst, Estudiante nuevo);
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
        System.out.println ("Buscando en el DAO");
        for (int i=0; i < listaEstudiantes.size (); i++) {
            Estudiante e = listaEstudiantes.get (i);
            if (correoInst.equals (e.correoInstitucional))
                return (e);
        }
        return (null);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        // Buscae en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        System.out.println ("Actualizando DAO con nuevo estudiante...");
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
        System.out.println ("Eliminando estudiante del DAO...");
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
        Estudiante e1 = new Estudiante ("ana","aa",11);
        miDAO.adicionar (e1);
        Estudiante e2 = new Estudiante ("maria","bb",22);
        miDAO.adicionar (e2);
        Estudiante e3 = new Estudiante ("juan","cc",33);
        miDAO.adicionar (e3);
        Estudiante e4 = new Estudiante ("pedro","dd",44);
        miDAO.adicionar (e4);
    }
 
    // Metodos
    public void iniciar () {
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion ();
            
                switch (opcion) {
                    case 1: adicionar (); break;
                    case 2: buscar (); break;
                    case 3: eliminar (); break;
                    case 4: modificar (); break;
                    case 5: ver (); break;
                    case 6: salir (); break;
                }
        }
    }
    
    // Adiciona estudiante al DAO
    public void adicionar () {
        System.out.println ("Está adicionando...");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);                
    }
    
    // Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
            System.out.println ("Está buscando...");
            String correo = miVista.leerCorreoInstitucional ();
            Estudiante e = miDAO.buscar (correo);
            if (e==null)
                System.out.println ("Estudiante no encontrado");
            else
                miVista.mostrarEstudiante (e);            
    }
    
    // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Está eliminando...");
		String correo = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correo);
    }
    
    // 1. Solita el correo 
    // 2. Busco el estuddiante en el DAO
    // 3. Pedirle los datos a modificar y modificar el estudiante
    // 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar () {
        System.out.println ("Está modificando...");
    }
    
    public void ver () {
        System.out.println ("Está viendo directorio...");
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

class Estudiante {
    // Atributos
    String nombres;
    String correoInstitucional;
    long numeroCelular;
        
    // Constructor
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.correoInstitucional = "Sin correo";
        this.numeroCelular = 0;
    }
    
    public Estudiante (String nombres, String correoInst, long nroCelular){
        this.nombres = nombres;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }            
}


class VistaMenu {
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
    
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        
        e.nombres             = leerNombres ();
        e.correoInstitucional = leerCorreoInstitucional();
        e.numeroCelular       = leerNumeroCelular ();
        
        return (e);
    }
    
    public void mostrarEstudiante (Estudiante e) {
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


public class ProgramaDirectorioUnico {
    public static void main(String[] args) {
        Controlador ctrl = new Controlador ();
        ctrl.iniciar ();
    }
    
}
