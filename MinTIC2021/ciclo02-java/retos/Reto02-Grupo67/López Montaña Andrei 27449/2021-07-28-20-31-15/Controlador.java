
import java.util.ArrayList;

public class Controlador {
      
//ATRIBUTOS
VistaMenu miVista = new VistaMenu();
DirectorioDAO miDAO = new DirectorioDAO ();

//Métodos
    public Controlador (){
        miDAO.crear();
        }

    public void ejecutar(){
        int opcion; 
        
        do{
            miVista.mostrarMenu();
            opcion = miVista.leerOpcion();
            switch(opcion){
                case 1:
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
                    System.out.println("El directorio de los estudiantes");
                    mostrarDirectorio();
                    break;
                case 6:
                    System.out.println("Hasta pronto");    
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
     
                }
               }   while(opcion !=6);
               
       }
    public void adicionarEstudiante(){
        Estudiante e = miVista.leerDatos();
        miDAO.adicionarEstudiante (e);
        System.out.println("Se agregó el estudiante\n");
    }
    public void buscarEstudiante(){
        String correo = miVista.leerCorreoInstitucional();
        Estudiante e = miDAO.buscarEstudiante(correo);
        if (e == null)
            System.out.println("Estudiante no encontrado");
        else 
            System.out.println("Información del estudiante");
            miVista.mostrarEstudiante(e);
    }
    public void modificarEstudiante(){
        String correo = miVista.leerCorreoInstitucional();
        Estudiante e = miDAO.buscarEstudiante(correo);
        if (e == null)
            System.out.println("Estudiante no encontrado");
        else {
            String nuevoCorreoP = miVista.leerCorreoPersonal();
            long nuevoNumCel = miVista.leerNumeroCelular();
            long nuevoNumFij = miVista.leerNumeroFijo();
            var nuevoProgAca = miVista.leerProgramaAcademico();
            miDAO.modificarEstudiante(correo,nuevoCorreoP,nuevoNumCel,nuevoNumFij, nuevoProgAca);
            System.out.println("Se modificó el estudiante\n");
        }
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
    

