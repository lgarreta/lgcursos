
import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {

    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    
    // Constructor
    public Controlador () throws ClassNotFoundException {
        miDAO.crear ();
    }
    
    // Metodos
    public void iniciar () throws SQLException {
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion();
            
            switch (opcion) {
                case 1: System.out.println ("Ingresar estudiante");
                        adicionar (); break;
                case 2: System.out.println ("Buscar estudiante");
                        buscar(); break;
                case 3: System.out.println ("Modificar estudiante");
                        actualizar (); break;
                case 4: System.out.println ("Eliminar estudiante");
                        eliminar (); break;
                case 5: ver(); break;
                case 6: salir (); break;
                default : System.out.println ("Opción no válida");
            }  
        }
    }
    public void adicionar () {
        Estudiantes e = miVista.leerDatos ();
        miDAO.adicionar (e);
        System.out.println ("Se agregó el estudiante");                
    }
    public void buscar() {
        String correoInst = miVista.leerCorreoInstitucional();
        Estudiantes e = miDAO.buscar(correoInst);
        miVista.mostrarEstudiante(e);
    }      
    public void eliminar () {
        String correoInst = miVista.leerCorreoInstitucional();
        miDAO.eliminar(correoInst);
        System.out.println("Se eliminó el estudiante");
    }
    public void actualizar () throws SQLException {
        String correoInst = miVista.leerCorreoInstitucional ();
        Estudiantes nuevo = miDAO.buscar (correoInst);
        miVista.modificarEstudiante (nuevo);
        miDAO.modificar(correoInst, nuevo);
        System.out.println ("Se modificó el estudiante");
    }
    public void ver() throws SQLException {
        System.out.println("El directorio de los estudiantes");
        ArrayList<Estudiantes> miLista = (ArrayList<Estudiantes>) miDAO.obtenerTodos();
        for (int i = 0; i < miLista.size(); i++) {
            Estudiantes e = miLista.get(i);
            miVista.mostrarEstudiante(e);
		}
    }
    public void salir () {
        System.out.println ("Hasta pronto");
        System.exit (0);
    }    
}