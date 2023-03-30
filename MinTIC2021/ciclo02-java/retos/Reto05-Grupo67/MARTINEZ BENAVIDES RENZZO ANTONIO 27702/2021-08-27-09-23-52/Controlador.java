 import java.util.ArrayList;
import java.util.InputMismatchException;
public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    VistaGrafica vistaGrafica;
    // Constructor
    public Controlador () {
        miDAO.crear ();
        
        vistaGrafica = new VistaGrafica(this);
        vistaGrafica.setVisible(true);
    }
    
    // Metodos
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
    // Adiciona estudiante al DAO
    public void adicionar () {
        System.out.println ("Ingresar estudiante");
        Estudiante e = miVista.leerDatoNuevo ();
        miDAO.adicionar (e);                
    }
     // Adiciona vita grafica estudiante al DAO
    public void adicionar (Estudiante e) {
        System.out.println ("Ingresar estudiante");
        
        miDAO.adicionar (e);
        ArrayList<Estudiante>listaEstudiante=miDAO.obtenerTodos();
        vistaGrafica.mostrarEstudiante(listaEstudiante);
        
    }
	// Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
        System.out.println ("Buscar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
        System.out.println ("");
        System.out.println ("Información del estudiante");
		Estudiante e = miDAO.buscar (correo);
		miVista.mostrarEstudiante (e);
        
    }
    // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correo);
		System.out.println ("");
    }
	// 1. Solita el correo 
	// 2. Busco el estuddiante en el DAO
	// 3. Pedirle los datos a modificar y modificar el estudiante
	// 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String correoInst = miVista.leerCorreoInstitucional ();
        Estudiante nuevo = miDAO.buscar(correoInst);
        System.out.println ("");
        Estudiante estModificar = miVista.modificarEstudiante(nuevo);
        miDAO.actualizar(estModificar);
        System.out.println ("Se modificó el estudiante");

    }
    public void ver () {
        System.out.println ("El directorio de los estudiantes");
        System.out.println ("");
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
