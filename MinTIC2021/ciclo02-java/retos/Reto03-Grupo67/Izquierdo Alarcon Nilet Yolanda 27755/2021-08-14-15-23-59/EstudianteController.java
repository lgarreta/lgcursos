//package controller;

//import model.Estudiante;
//import model.EstudianteModel;
//import view.EstudianteView;
import java.io.IOException;
import java.util.ArrayList;

public class EstudianteController {
    EstudianteView vista = new EstudianteView();
    EstudianteModel modelo = new EstudianteModel();
    
    public void iniciar() throws IOException{
        var exit = false;
        do{
            vista.menu();
            int opcion = vista.opcion();
            
            switch(opcion){
                case 1:
                    agregar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    mostrarTodo();
                    break;
                default:
                    exit = true;
                    vista.msmBye();
                    break;
            }
        }while(!exit);
    }
    
    public void agregar(){
        try{
            Estudiante obj = vista.leerDatos();
            modelo.agregarEstudiante(obj);
        }catch(Exception e){
            System.out.println("No se ha podido agregar el estudiante.\nerror: " + e);
        }
    }
    
    public void consultar(){
        try{
            vista.msmBuscar();
            String correo = vista.leerCorreo();
            Estudiante estudiante = modelo.buscarEstudiante(correo);
            vista.msmEstudiante();
            vista.mostrarEstudiante(estudiante);
        }catch(Exception e){
            System.out.println("No se ha podido consultar el estudiante.\nerror: " + e);
        }
    }
    
    public void modificar(){
        try{
            vista.msmModificar();
            String correo = vista.leerCorreo();
            Estudiante estudiante = modelo.buscarEstudiante(correo);
            Estudiante datos = vista.leerDatosModificar();
            modelo.modificarEstudiante(datos, estudiante);
        }catch(Exception e){
            System.out.println("No se ha podido modificar el estudiante.\nerror: " + e);
        }
    }
    
    public void eliminar(){
        try{
            vista.msmEliminar();
            String correo = vista.leerCorreo();
            Estudiante estudiante = modelo.buscarEstudiante(correo);
            modelo.eliminarEstudiante(estudiante);
        }catch(Exception e){
            System.out.println("No se ha podido modificar el estudiante.\nerror: " + e);
        }
    }
    
    public void mostrarTodo(){
        try{
            ArrayList <Estudiante> estudiantes = modelo.listarEstudiantes();
            vista.mostrarEstudiantes(estudiantes);
        }catch(Exception e){
            System.out.println("No se ha podido listar a los estudiantes.\nerror: " + e);
        }
    }
}
