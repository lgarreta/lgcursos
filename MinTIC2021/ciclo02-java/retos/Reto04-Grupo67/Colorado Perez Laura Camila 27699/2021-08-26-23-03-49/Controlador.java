import java.util.ArrayList;
import java.util.InputMismatchException;

public class Controlador {
    
  
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    
    public Controlador () {
        miDAO.crear ();
    }
    public void iniciar () {
        while (true) {
            try {
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
            }catch (NullPointerException ex) {
                System.out.println ("Error en estudiante!");
            }catch (InputMismatchException ex) {
                System.out.println ("Error en lectura de opción. Termina el programa");
                System.exit (0);
            }    
        }
    }

    public void adicionar () {
        System.out.println ("Ingresar estudiante ");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);                
    }
    public void buscar () {
        System.out.println ("Buscar estudiante");
		String correoInstitucional = miVista.leerCorreoInstitucional ();
		Estudiante e = miDAO.buscar (correoInstitucional);
        System.out.println ("Información del estudiante");
		miVista.mostrarEstudiante (e);
    }
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
		String correoInstitucional = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correoInstitucional);
    }
    public void modificar () {
            System.out.println ("Modificar estudiante");
            String correoInstitucional = miVista.leerCorreoInstitucional ();
            Estudiante nuevo = miDAO.buscar(correoInstitucional);
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