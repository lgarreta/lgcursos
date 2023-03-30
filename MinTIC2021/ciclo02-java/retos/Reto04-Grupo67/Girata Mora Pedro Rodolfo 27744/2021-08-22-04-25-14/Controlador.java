

import java.util.ArrayList;
public class Controlador {

    // Atributos
    VistaMenu miVista = new VistaMenu();
    
    Estudiantes Estudiantes;
    DirectorioDAO miDAO = new DirectorioDAO() {
        public void Controlador () {
            miDAO.crear(); 
            Estudiantes e1 = new Estudiantes(); 
        }
    };
    public void iniciar () {
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
        Estudiantes = miVista.leerDatos();
        miDAO.adicionar (Estudiantes);
        System.out.println("Se agregó el estudiante");
    }
	// Solicita correo y lo busca en el DAO e imprimir la informacion
    public Estudiantes buscar() {
        
            System.out.println ("Buscar estudiante");
            String correo_Institucional = miVista.leerCorreoInstitucional();
            this.Estudiantes = miDAO.buscar(correo_Institucional);
            System.out.println ("Información del estudiante");
            return this.Estudiantes;
    }
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String Correo = miVista.leerCorreoInstitucional ();
        this.Estudiantes = miDAO.buscar(Correo);
        miDAO.adicionar(Estudiantes);
    }
	// Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
        String Correo = miVista.leerCorreoInstitucional ();
        miDAO.eliminar(Correo);
        System.out.println("Se elimino el estudiante");
    }
    private void ver () {
        
        ArrayList <Estudiantes> miLista = miDAO.obtenerTodos();
        
        for (int i=0; i < miLista.size (); i++) {
            Estudiantes todos = miLista.get (i);
            miVista.mostrarEstudiante (todos);
        }
        
    }
    private void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }
    
}
