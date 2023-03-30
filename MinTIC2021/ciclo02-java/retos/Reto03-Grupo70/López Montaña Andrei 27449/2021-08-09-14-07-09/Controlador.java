    
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Controlador {
//ATRIBUTOS
VistaMenu miVista = new VistaMenu();
DirectorioDAO miDAO = new DirectorioDAO ();

public Controlador() {
    miDAO.crear();
} 

//Métodos
public void ejecutar(){
    int opcion;
        while(true){
            miVista.mostrarMenu ();
            opcion = miVista.leerOpcion();
            try {
                
            switch(opcion){
                case 1:
                    System.out.println("Ingresar estudiante");
                    adicionarEstudiante();                    
                    break;
                case 2:
                    System.out.println("Buscar estudiante");
                    buscarEstudiante();
                    break;
                case 3:
                    System.out.println("Modificar estudiante");
                    modificarEstudiante();                       
                    break;
                case 4:
                    System.out.println("Eliminar estudiante");
                    eliminarEstudiante();
                    break;
                case 5:
                    System.out.println("El directorio de los estudiantes\n");
                    mostrarDirectorio();
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
               }
            }catch (NullPointerException ex) {
                System.out.println ("Error en estudiante!");
            }catch (InputMismatchException ex) {
                System.out.println ("Error en lectura de opción. Termina el programa");
                System.exit (0);}
               }
               
       }
    public void adicionarEstudiante(){
        Estudiante e = miVista.leerDatos();
        miDAO.adicionarEstudiante (e);
        System.out.println("Se agregó el estudiante\n");
    }
    public void buscarEstudiante(){
        String correo = miVista.leerCorreoInstitucional();
        System.out.println("Información del estudiante");
        Estudiante e = miDAO.buscarEstudiante(correo);
        miVista.mostrarEstudiante(e);
    }
    public void modificarEstudiante(){
        String correo = miVista.leerCorreoInstitucional();
        Estudiante e = miDAO.buscarEstudiante(correo);
        String nuevoCorreoP = miVista.leerCorreoPersonal();
        long nuevoNumCel = miVista.leerNumeroCelular();
        long nuevoNumFij = miVista.leerNumeroFijo();
        String nuevoProgAca = miVista.leerProgramaAcademico();
        miDAO.modificarEstudiante(correo, nuevoCorreoP,nuevoNumCel,nuevoNumFij, nuevoProgAca);
        System.out.println("Se modificó el estudiante\n");
     }  
    public void eliminarEstudiante(){
        String correo = miVista.leerCorreoInstitucional();
        miDAO.eliminarEstudiante(correo);
        System.out.println("Se eliminó el estudiante\n");
    }
    public void mostrarDirectorio () {
        ArrayList <Estudiante> miLista = miDAO.obtenerTodos();
        for (int i=0; i < miLista.size (); i++) {
            Estudiante e = miLista.get (i);
            miVista.mostrarEstudiante (e);
            }
    }
}        
    