//package controller;

//import model.Estudiante;
//import model.EstudianteModel;
//import view.EstudianteView;
import java.util.ArrayList;

public class EstudianteController {
    EstudianteView vista = new EstudianteView();
    EstudianteModel modelo = new EstudianteModel();
    
    public void iniciar(){
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
                    buscar("", "");
                    break;
                case 6:
                    exit = true;
                    vista.print("Hasta pronto");
                    break;
                default:
                    break;
            }
        }while(!exit);
    }
    
    public void agregar(){
        try{
            Estudiante obj = vista.leerDatos();
            modelo.agregarEstudiante(obj);
        }catch(Exception e){
            vista.print("No se ha podido agregar el estudiante.\nerror: " + e);
        }
    }
    
    public void consultar(){
        try{
            vista.subMenuConsultas();
            int opcion = vista.opcion();
            
            switch(opcion){
                case 1: //por correo
                    vista.print("1. Buscar estudiante por correo electrónico");
                    buscar(vista.leerCorreo(), "cInstitucional");
                    break;
                case 2: //por apellido
                    vista.print("2. Buscar estudiante por apellidos");
                    buscar(vista.leerApellidos(), "apellido");
                    break;
                case 3: //por programa
                    vista.print("3. Buscar por programa");
                    buscar(vista.leerPrograma(), "programa");
                    break;
                case 4: //cantidad por programa
                    vista.print("4. Buscar cantidad de estudiantes por programa");
                    buscar(vista.leerPrograma(), "cuenta");
                    break;
                case 5: //por fecha
                    vista.print("5. Buscar por fecha de nacimiento");
                    buscar(vista.leerFecha(), "fNacimiento");
                    break;
                case 6: //por celular
                    vista.print("6. Buscar por número de celular");
                    buscar(vista.leerNumero(), "celular");
                    break;
                default:
                    break;
            }
        }catch(Exception e){
            vista.print("No se ha podido consultar el estudiante.\nerror: " + e);
        }
    }
    
    public void modificar(){
        try{
            vista.print("Modificar estudiante");
            String correo = vista.leerCorreo();
            boolean exist = modelo.exist(correo);
            if(exist){
                Estudiante datos = vista.leerDatosModificar();
                modelo.modificarEstudiante(datos, correo);                
            } else{
                vista.print("El estudiante no se encuentra registrado en el instituto\n");
            }
        }catch(Exception e){
            vista.print("No se ha podido modificar el estudiante.\nerror: " + e);
        }
    }
    
    public void eliminar(){
        try{
            vista.print("Eliminar estudiante");
            String correo = vista.leerCorreo();
            boolean exist = modelo.exist(correo);
            if(exist){
                modelo.eliminarEstudiante(correo);
            } else{
                vista.print("El estudiante no se encuentra registrado en el instituto\n");
            }
        }catch(Exception e){
            vista.print("No se ha podido modificar el estudiante.\nerror: " + e);
        }
    }
    
    public void buscar(String dato, String campo){
        try{
            ArrayList <Estudiante> estudiantes = modelo.buscarEstudiantes(dato, campo);
            vista.mostrarEstudiantes(estudiantes, campo, dato);
        }catch(Exception e){
            vista.print("No se ha podido listar a los estudiantes.\nerror: " + e);
        }
    }
}
