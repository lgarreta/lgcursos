import java.util.ArrayList;
public class Controlador {
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
