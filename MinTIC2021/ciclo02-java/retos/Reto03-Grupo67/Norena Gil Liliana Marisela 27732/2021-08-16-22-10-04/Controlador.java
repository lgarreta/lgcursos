import java.util.ArrayList;
public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    
    // Constructor
    public Controlador () {
        miDAO.crear ();
        Estudiante e = new Estudiante ();
        miDAO.ingresar (e);
        //Estudiante e1 = new Estudiante ();
        //miDAO.ingresar (e2);
        //Estudiante e3 = new Estudiante ();
        //miDAO.ingresar (e3);
        //Estudiante e4 = new Estudiante ();
        //miDAO.ingresar (e4);
    }
    
    // Metodos
    public void iniciar () {
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion ();
            
                switch (opcion) {
                    case 1: ingresar (); break;
                    case 2: buscar (); break;
                    case 3: modificar (); break;
                    case 4: eliminar (); break;
                    case 5: ver (); break;
                    case 6: salir (); break;
                }
        }
    }
    // Adiciona estudiante al DAO
    public void ingresar () {
        //System.out.println ("Se agregó el estudiante");
        Estudiante e = miVista.leerDatos ();
        miDAO.ingresar (e);
        System.out.println ("Se agregó el estudiante");;                
    }
	// Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
        System.out.println ("Buscar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		Estudiante e = miDAO.buscar (correo);
        if (e==null)
                System.out.println ("Estudiante no encontrado");
            else{
            System.out.println ("Información del estudiante");
            miVista.mostrarEstudiante (e);
            }
    }
	// Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
		String correoInst = miVista.leerCorreoInstitucional ();
        miDAO.eliminar (correoInst);
        System.out.println("Se eliminó el estudiante");

    }
	
    // 1. Solicita el correo 
	// 2. Busca el estuddiante en el DAO
	// 3. Pedirle los datos a modificar y modificar el estudiante
	// 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar (){
        // Busca en el DAO el estudiante que tenga el correo igual al "correoInst" 
        // y lo cambia por el "nuevo" que llega
        System.out.println ("Modificar estudiante");
        String correoInst = miVista.leerCorreoInstitucional ();
        Estudiante e = miDAO.buscar (correoInst);
        e.correoPersonal = miVista.leerCorreoPersonal();
        e.numeroCelular = miVista.leerNumeroCelular();
        e.numeroFijo = miVista.leerNumeroFijo();
        e.programaAcademico = miVista.leerProgramaAcademico();
        
        //String correoPersonal = miVista.leerCorreoPersonal();
        //long nroCelular = miVista.leerNumeroCelular();
        //long nroFijo = miVista.leerNumeroFijo();
        //String programaAcademico = miVista.leerProgramaAcademico();    
        miDAO.modificar(correoInst, e);
    }
    public void ver () {
        System.out.println ("El directorio de los estudiantes");
		ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

		for (int i=1; i < miLista.size (); i++) {
			Estudiante e = miLista.get (i);
			miVista.mostrarEstudiante (e);
		}
    }
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }    
}
