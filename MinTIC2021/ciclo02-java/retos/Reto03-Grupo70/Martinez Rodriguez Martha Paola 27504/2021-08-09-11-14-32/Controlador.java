

import java.util.ArrayList;
import java.util.InputMismatchException;

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
        boolean noEsNumero = true;
        while (noEsNumero) {
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
            }catch (NullPointerException ex) {
                System.out.println ("Error en estudiante!");
            }catch (InputMismatchException ex) {
                System.out.println ("El dato ingresado no es un número");
                System.out.println ("Opción no válida");
                miVista.lector.nextLine();
            }
        }
    }

    // Adiciona estudiante al DAO
    public void adicionar () {
        System.out.println ("Ingresar estudiante ");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e); 
        System.out.println ("Se agregó el estudiante ");              
    }

    // Solicita correo y lo busca en el DAO e imprime la informacion
    public void buscar () {
        System.out.println ("Buscar estudiante ");
	String correo = miVista.leerCorreoInstitucional ();
	Estudiante e  = miDAO.buscar (correo);
        if (e==null) {
           System.out.println ("El estudiante no se encuentra registrado en el instituto");
        }
        else {
            System.out.println ("Información del estudiante ");
            miVista.mostrarEstudiante (e); }
    }

    // Solicita el correo y le dice al DAO que lo modifique
    public void modificar () {
        System.out.println ("Modificar estudiante ");
	String correoInstitucionalN = miVista.leerCorreoInstitucional ();
                
        Estudiante e = miDAO.buscar (correoInstitucionalN);               
        
        if (e==null){
            System.out.println ("El estudiante no se encuentra registrado en el instituto");
        }
        else {
            String correoPersonal    = miVista.leerCorreoPersonal ();
            long nroCelular          = miVista.leerNumeroCelular ();
            long nroFijo             = miVista.leerNumeroFijo ();
            String programaAcad      = miVista.leerProgramaAcademico ();
            String nombres           = e.nombres;
            String apellidos         = e.apellidos;
            String fechaNacimiento   = e.fechaNacimiento;
            Estudiante eNuevo   = new Estudiante(nombres, apellidos, fechaNacimiento, correoInstitucionalN, correoPersonal, nroCelular, nroFijo, programaAcad);
            miDAO.actualizar (correoInstitucionalN, eNuevo);
            System.out.println ("Se modificó el estudiante "); 
        }
    }

    // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante ");
	String correo = miVista.leerCorreoInstitucional ();
        Estudiante e = miDAO.buscar (correo);               
        
        if (e==null){
            System.out.println ("El estudiante no se encuentra registrado en el instituto");
        }
        else {
        miDAO.eliminar (correo);
        System.out.println ("Se eliminó el estudiante "); }
    }
        
   
    // Solicita al DAO que muestre el directorio completo
    public void ver () {
        System.out.println ("El directorio de los estudiantes ");

	
        ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

	for (int i=0; i < miLista.size (); i++) {
            Estudiante e = miLista.get (i);
            miVista.mostrarEstudiante (e);
        System.out.println ("");
	}
    }

    // Opción para salir
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }    
}