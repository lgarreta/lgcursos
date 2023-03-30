import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
/**
 *nuevo
 * @author lg
 */
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
            try {
                
                miVista.mostrarMenu ();
                int opcion = miVista.leerOpcion ();
            
                    switch (opcion) {
                        case 1: adicionar (); break;
                        case 2: buscar (); break;
                        case 3: modificar (); break;
                        case 4: eliminar(); break;
                        case 5: ver (); break;
                        case 6: salir (); break;
                    }
            } catch (NullPointerException e1) {
                System.out.println ("Error en estudiante!");
            }catch (InputMismatchException ex) {
                System.out.println ("Error en lectura de opción. Termina el programa");
                System.exit (0);
            } catch (IOException e) {
                
            }
             
        }
    }
    
    // Adiciona estudiante al DAO
    public void adicionar () {
        System.out.println ("Ingresar estudiante ");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);   
        System.out.println ("Se agregó el estudiante ");
        System.out.println ("");             
    }
    
    // Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
        System.out.println ("Buscar estudiante ");
        String correo = miVista.leerCorreoInstitucional ();
        
        Estudiante e2 = miDAO.buscar (correo);
            if (e2==null)
                System.out.println ("Estudiante no encontrado");
            else
                System.out.println ("Información del estudiante");
                miVista.mostrarEstudiante (e2);   
            System.out.println ("");         
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
        String correo = miVista.leerCorreoInstitucional ();
		Estudiante nuevo2 = miDAO.buscar(correo);
        if (nuevo2==null){
                System.out.println ("Estudiante no encontrado");}
        else{
            miVista.modificarEstudiante(nuevo2);
            miDAO.actualizar(correo, nuevo2);}
     
        //miVista.modificarEstudiante(nuevo2);
        
        
        System.out.println ("");

    }
        
       
	
    
    public void ver () throws IOException {
        System.out.println ("El directorio de los estudiantes");
        System.out.println ("");
        ArrayList<Estudiante> miLista;
   
        miLista = miDAO.obtenerTodos();
   

        for (int i=0; i < miLista.size (); i++) {
        Estudiante e = miLista.get (i);
        miVista.mostrarEstudiante (e);
        System.out.println ("");
        }
    } 
        
        
        
        
	
    
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }        

        

        
}
