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
                        case 1: adicionar (); break;
                        case 2: buscar (); break;
                        case 3: modificar (); break;
                        case 4: eliminar (); break;
                        case 5: ver (); break;
                        case 6: salir (); break;
                    }
            
            }catch (InputMismatchException exc) {
                System.out.println ("Error en lectura de opción. Termina el programa");
                System.exit (0);
            }
        }
    }
    
                
  
    public void adicionar () {
        System.out.println ("Ingresar estudiante");
        Estudiantes e = miVista.leerDatos ();
        miDAO.adicionar (e);                
    }
    
   
    public void buscar () {
        
        try {
            System.out.println ("Consultas");
            String correo = miVista.leerCorreoInstitucional ();
            Estudiantes e = miDAO.buscar (correo);  
            miVista.mostrarEstudiante (e);
        }catch (NullPointerException ex) {
            System.out.println ("Estudiante no está en la BD.");
        }            
    }
   
    public void modificar () {
        try {
            System.out.println ("Modificar estudiante");
            String correo = miVista.leerCorreoInstitucional ();
            Estudiantes nuevo = miDAO.buscar (correo);
            miVista.leerDatosNuevo (nuevo);
            miDAO.actualizar(correo, nuevo);    
        }catch (NullPointerException ex) {
            System.out.println ("Estudiante no encontrado en la BD.");
        }
                
    }     

  // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
        miDAO.eliminar (correo);
                              
    }
                            
    public void ver () {
        System.out.println ("El directorio de los estudiantes");
	    ArrayList <Estudiantes> miLista = miDAO.obtenerTodos();

	    for (int i=0; i < miLista.size (); i++) {
            Estudiantes e = miLista.get (i);
            miVista.mostrarEstudiante (e);
	    }
    }
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }

}  
    


                     