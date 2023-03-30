import java.util.ArrayList;
public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    Estudiante estudiante = new Estudiante();
    // Constructor
    public Controlador () {
        miDAO.crear(); 
        
    }
    // Metodos
    public void iniciar ( ) {
        Controlador nuevos = new Controlador();
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion ();
            switch (opcion){
                case 1: adicionar ();break;
                case 2: buscar (); break;
                case 3: modificar ();break; 
                case 4: eliminar (); break;
                case 5: ver (); break;
                case 6: salir ();break;
                default: break;
            } 
        }
    }
    // Adiciona estudiante al DAO
    public void adicionar (){
        System.out.println ("Ingresar estudiante");
        estudiante = miVista.leerDatos();
        miDAO.adicionar (estudiante);
        System.out.println("Se agregó el estudiante");
    }
	// Solicita correo y lo busca en el DAO e imprimir la informacion
    public void buscar (){
        
        System.out.println ("Buscar estudiante");
        String Correo = miVista.leerCorreoInstitucional ();
        this.estudiante = miDAO.buscar(Correo);
        System.out.println ("Información del estudiante");
        this.estudiante.presentarse();
        
        
    }
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String Correo = miVista.leerCorreoInstitucional ();
        this.estudiante = miDAO.buscar(Correo);
        int ID = miDAO.getID(Correo);
        Estudiante nuevos_Datos = miVista.leerDatosNuevos();
        Estudiante e1 = new Estudiante (
                //Datos anteriores del estudiante
                this.estudiante.nombres,
                this.estudiante.Apellidos,
                this.estudiante.Fecha_de_Nacimiento,
                this.estudiante.correoInstitucional,
                //Datos nuevos del estudiante
                nuevos_Datos.correo_Personal,
                nuevos_Datos.Numero_Celular,
                nuevos_Datos.NumeroFijo,
                nuevos_Datos.Programa_Academico);
        miDAO.actualizar(ID, e1);
        //miDAO.actualizar(Estudiante, nuevo);
        System.out.println ("Se modificó el estudiante");
    }
	// Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
        String Correo = miVista.leerCorreoInstitucional ();
        int ID = miDAO.getID(Correo);
        miDAO.eliminar(ID);
        System.out.println ("Se eliminó el estudiante");
    }
    private void ver () {
        ArrayList <Estudiante> miLista = miDAO.obtenerTodos();
        
        for (int i=0; i < miLista.size (); i++) {
            Estudiante todos = miLista.get (i);
            miVista.mostrarEstudiante (todos);
        }
    }
    private void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }
}
