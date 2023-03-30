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
                    case 3: modificar (); break;
                    case 4: eliminar (); break;
                    case 5: ver (); break;
                    case 6: salir (); break;
                }
        }
    }
    
    
    public void adicionar () {
        System.out.println ("Ingresar estudiante");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e); 
        System.out.println ("Se agregó el estudiante");
        System.out.println ();
    }
    
    
    public void buscar () {
            System.out.println ("Buscar estudiante");
            String correo = miVista.leerCorreoInstitucional ();
            Estudiante e = miDAO.buscar (correo);
            if (e==null)
                System.out.println ("Estudiante no encontrado");
            else
                 System.out.println ("Información del estudiante");
                miVista.mostrarEstudiante (e);
             System.out.println ();
    }
    
    // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correo);
                System.out.println ("Se eliminó el estudiante");
                System.out.println ();
    }
    
   
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante e = miDAO.buscar (correo);
        e.correoPersonal = miVista.leerCorreoPersonalNuevo();
        e.numeroCelular = miVista.leerNumeroCelularNuevo();
        e.numeroFijo = miVista.leerNumeroFijoNuevo();
        e.programa = miVista.leerProgramaNuevo();
         
         miDAO.actualizar (correo,e);
        System.out.println ("Se modificó el estudiante");
        System.out.println ();
        
    }
    
    public void ver () {
        System.out.println ("El directorio de los estudiantes");
	ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

	for (int i=0; i < miLista.size (); i++) {
            Estudiante e = miLista.get (i);
            miVista.mostrarEstudiante (e);
            System.out.println ();
	}
    }
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }        
    
    
}
