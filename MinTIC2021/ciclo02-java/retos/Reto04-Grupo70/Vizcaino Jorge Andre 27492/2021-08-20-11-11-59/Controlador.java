
import java.util.ArrayList;

public class Controlador {
    // Atributos
    MostrarVista    miVista = new MostrarVista  ();
    DirectorioDAOSqlite miDAO   = new DirectorioDAOSqlite ();

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
    
    // Adiciona estudiante a la BD mediante la conexio en el DAO
    public void adicionar () {
        System.out.println ("Ingresar estudiante");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);  
        System.out.println ("Se agregó el estudiante");      
    }
    
    // Muestra un 2nd menu para las diferentes consultas a realizar, obtenidas de la opcion 2 en Menu 1
    public void consultar() {
    	miVista.mostrarMenu2 ();
    	int opcion2 = miVista.leerOpcion ();
    	switch (opcion2) {
        case 1: buscar (); break;
        case 2: buscarLastName (); break;
        case 3: buscarPrograma (); break;
        case 4: buscarContPrograma (); break;
        case 5: buscarBirth (); break;
        case 6: buscarCelular (); break;
    	}
    	
    }
    
    public void buscar () {
    	// Solicita el correo y le dice al DAO que lo busque en la BD
        System.out.println ("Buscar estudiante");
        String correo = miVista.leerCorreoInstitucional();
        Estudiante e= miDAO.buscar (correo);
        if (e == null) {
        System.out.println("Estudiante no encontrado");
        }
        else {
            
        	System.out.println("Información del estudiante");
        	miVista.mostrarEstudiante (e);
         }           
    }
    
    public void buscarLastName () {
    	// Solicita el apellido y le dice al DAO que lo busque en la BD
            System.out.println ("Buscar estudiante");
            String correo = miVista.leerApellidos();
            ArrayList <Estudiante> miLista= miDAO.buscarLastName (correo);
            if (miLista == null) {
            System.out.println("Estudiante no encontrado");
            }
            else {
                
            	System.out.println("Información del estudiante");
            	for (int i=0; i < miLista.size (); i++) {
                    Estudiante e = miLista.get (i);
                    miVista.mostrarEstudiante (e);
            	}
            }           
    }
    
    public void buscarPrograma () {
    	// Solicita el programay le dice al DAO que lo busque en la BD
        System.out.println ("Buscar estudiante");
        String programa = miVista.leerPrograma();
        ArrayList <Estudiante> miLista= miDAO.buscarProg (programa);
        if (miLista == null) {
        System.out.println("Estudiante no encontrado");
        }
        else {
            
        	System.out.println("Información del estudiante");
        	for (int i=0; i < miLista.size (); i++) {
                Estudiante e = miLista.get (i);
                miVista.mostrarNyA (e);
        	}
        }           
    }
    
    public void buscarContPrograma () {
    	// Solicita el programa y le dice al DAO que lo busque en la BD para devolver la cantidad de estudiantes en el programa
        System.out.println ("Buscar estudiante");
        String programa = miVista.leerPrograma();
        int contador= miDAO.buscarContPrograma (programa);
        if (contador == 0) {
        System.out.println("Estudiante no encontrado");
        }
        else {
            
        	System.out.println("Cantidad de estudiantes con el programa "+ programa + " son: " + contador);
        	
        }           
    }
    
    public void buscarBirth () {
    	// Solicita la fecha de nacimiento y le dice al DAO que lo busque en la BD
        System.out.println ("Buscar estudiante");
        String fecha = miVista.leerFecha();
        ArrayList <Estudiante> miLista= miDAO.buscarBirth (fecha);
        if (miLista == null) {
        System.out.println("Estudiante no encontrado");
        }
        else {
            
        	System.out.println("Información del estudiante");
        	for (int i=0; i < miLista.size (); i++) {
                Estudiante e = miLista.get (i);
                miVista.mostrarEstudiante (e);
        	}
        }           
    }
    
public void buscarCelular () {
	// Solicita el celular y le dice al DAO que lo busque en la BD
        System.out.println ("Buscar estudiante");
        long cel = miVista.leerNumeroCelular();
        Estudiante e= miDAO.buscarCel (cel);
        if (e == null) {
        System.out.println("Estudiante no encontrado");
        }
        else {
            
        	System.out.println("Información del estudiante");
        	miVista.mostrarNyP (e);
         }           
    }
    
    
    public void eliminar () {
    	// Solicita el correo y le dice al DAO que lo elimine en la BD
        System.out.println ("Eliminar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correo);
		System.out.println ("Se eliminó el estudiante"); 
    }
    
    // 1. Solita el correo 
    // 2. Busco el estuddiante en el DAO
    // 3. Pedirle los datos a modificar y modificar el estudiante
    // 4. Actualiza en el DAO con ese correo y el estudiante modificado
    
    public void modificar () {
    	// Solicita el correo y le dice al DAO que modifique los datos a solicitar en la BD
        System.out.println ("Modificar estudiante");
        
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante aux = miDAO.buscar(correo);
        miVista.leerDatosNuevo (aux);
        miDAO.actualizar (correo, aux);
        
        System.out.println ("Se modificó el estudiante");
    }
    
    public void ver () {
    	// Muestra todos los estudiantes en una lista adicionada en el DAO, una vez recorrida la BD
        System.out.println ("El directorio de los estudiantes");
	ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

	for (int i=0; i < miLista.size (); i++) {
            Estudiante e = miLista.get (i);
            miVista.mostrarEstudiante (e);
	}
    }
    public void salir () {
    	// Se cierra la conexion con la base de datos, al finalizar todas las operaciones
        System.out.println ("Hasta pronto");
        miDAO.cerrarCon();
        System.exit (0);
    }        
    
    
}