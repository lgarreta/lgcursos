//package Reto;

import java.util.ArrayList;
//import java.util.List;

public class CControlador {
    
    
    private CVista vista = new CVista();
    private CModelo modelo = new CModelo();
    private int opcion = 0;
    
    
    public void iniciar(){

        modelo.crear();
        do{            
            opcion = vista.menu();            
            switch(opcion){                
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    modificarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    verLista();
                    break;
//                default:
//                    System.out.println("Opcion no valida"); 
                 
            
            }   
        }while(opcion != 6);
        System.out.println("Hasta pronto"); 
    }
    
    private void agregarEstudiante(){
        CEstudiante estudiante = vista.pedirDatos();
        modelo.adicionar(estudiante);    
    }
    
    private void verLista(){    
        ArrayList lista = modelo.obtenerTodos();
        vista.mostrarLista(lista);
    }
    
    private void buscarEstudiante(){
        String correo = vista.vistaBuscarEstu();
        CEstudiante estudiante  = modelo.buscar(correo);
        System.out.println("Información del estudiante");        
        vista.mostrarEstudiante(estudiante);        
    }
    
    private void modificarEstudiante(){
        String correo = vista.vistaModificarEst();
        CEstudiante estudiante = vista.datosModificar();
        modelo.actualizar(correo, estudiante);
    }
    
    private void eliminarEstudiante(){
        String correo = vista.vistaEliminarEst();
        modelo.eliminar(correo);
    }
    
    
}
