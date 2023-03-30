
import java.util.ArrayList;
public class Controlador {
   
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    
    // Constructor
    public Controlador () throws ClassNotFoundException {
        miDAO.crear ();
    }
    
    // Metodos
    public void iniciar () {
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion ();
            
           switch (opcion) {
                case 1: System.out.println ("Ingresar estudiante");
                        adicionar (); break;
                case 2: System.out.println ("Buscar estudiante");
                        buscar (); break;
                case 3: System.out.println ("Modificar estudiante");
                        actualizar (); break;
                case 4: System.out.println ("Eliminar estudiante");
                        eliminar (); break;
                case 5: ver (); break;
                case 6: salir (); break;
                default : System.out.println ("Opción no válida");
            }  
        }
    }
    public void adicionar () {
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);
        System.out.println ("Se agregó el estudiante");                
    }
    public void buscar () {
		String correoInst = miVista.leerCorreoInstitucional ();
		Estudiante e = miDAO.buscar (correoInst);
        System.out.println ("Información del estudiante");
		miVista.mostrarEstudiante (e);
    }
    public void eliminar () {
		String correoInst = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correoInst);
        System.out.println ("Se eliminó el estudiante");
    }
    public void actualizar () {
        String correoInst = miVista.leerCorreoInstitucional ();
        Estudiante nuevo = miDAO.buscar (correoInst);
        miVista.modificarEstudiante (nuevo);
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