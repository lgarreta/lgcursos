//package Reto;

import java.util.ArrayList;
import java.util.InputMismatchException;
//import java.util.List;
import java.util.Scanner;

public class CVista {
    
    private Scanner lector = new Scanner (System.in);
    CEstudiante estudiante;
    private int opcion = 0;
    
    private String auxString;
    private long auxLong;
    
    public int menu(){
        
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar:");
        System.out.println ("1. Ingresar estudiante");
        System.out.println ("2. Buscar estudiante");
        System.out.println ("3. Modificar estudiante");
        System.out.println ("4. Eliminar Estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir");        
        System.out.println ("Opción:");
        opcion = lector.nextInt();
        lector.nextLine();
        return (opcion);
    }
    
    private String pedirCorreoIns(){        
        System.out.println ("Ingresar correo institucional: ");
        auxString = lector.nextLine();
        return auxString;        
    }
    
    public String vistaModificarEst(){
        System.out.println ("Modificar estudiante");
        String correo = pedirCorreoIns();
        return correo;
    } 
    
    public CEstudiante datosModificar(){
    
        estudiante = new CEstudiante();
        agregarCorreoPersonal();
        agregarNumeroCelular();
        agregarNumeroFijo();
        agregarProgramaAcademico();
        System.out.println ("Se modificó el estudiante");   
        
        return estudiante;
    }
    
    public String vistaBuscarEstu(){
        System.out.println ("Buscar estudiante");
        String correo = pedirCorreoIns();
        return correo;
    }
    
    public String vistaEliminarEst(){
        System.out.println ("Eliminar estudiante");
        String correo = pedirCorreoIns();
        System.out.println ("Se eliminó el estudiante");
        System.out.println("");
        return correo;
    }
    
    public void mostrarLista(ArrayList fLista){
        
        System.out.println ("El directorio de los estudiantes");
        ArrayList <CEstudiante> lista = fLista;        
        for (CEstudiante estudiante : lista){
            
             mostrarEstudiante(estudiante);        
        }   
    }
    
    public void mostrarEstudiante(CEstudiante fEstudiante){
        
        System.out.println("Nombres: " + fEstudiante.getName());
        System.out.println("Apellidos: " + fEstudiante.getApellidos());
        System.out.println("Fecha nacimiento: " + fEstudiante.getFechaNacimiento());
        System.out.println("Correo institucional: " + fEstudiante.getCorreoInstitucional());
        System.out.println("Correo personal: " + fEstudiante.getCorreoPersonal());
        System.out.println("Número de teléfono celular: " + fEstudiante.getNumeroCelular());
        System.out.println("Número de teléfono fijo: " + fEstudiante.getNumeroFijo());
        System.out.println("Programa académico: " + fEstudiante.getProgramaAcademico());
        System.out.println("");
    }
    
    public CEstudiante pedirDatos(){        
           
        estudiante = new CEstudiante();
        System.out.println ("Ingresar estudiante");       
        agregarNombres();
        agregarApellidos();
        agregarFechaNacimiento();
        agregarCorreoInstitucional();
        agregarCorreoPersonal();
        agregarNumeroCelular();
        agregarNumeroFijo();
        agregarProgramaAcademico();                
        System.out.println ("Se agregó el estudiante");
        System.out.println("");

        return estudiante;
    }  
      
    
    private void agregarNombres(){
        
        System.out.println ("Ingresar nombres: ");
        auxString = lector.nextLine();
        estudiante.setName(auxString);
    }
    
    private void agregarApellidos(){
        
        System.out.println ("Ingresar apellidos: ");
        auxString = lector.nextLine();
        estudiante.setApellidos(auxString);
    }
    
    private void agregarFechaNacimiento(){
        
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        auxString = lector.nextLine();
        estudiante.setFechaNacimiento(auxString);
    }
    
    private void agregarCorreoInstitucional(){
        
        System.out.println ("Ingresar correo institucional: ");
        auxString = lector.nextLine();
        estudiante.setCorreoInstitucional(auxString);
    }
    
    private void agregarCorreoPersonal(){
        
        System.out.println ("Ingresar correo personal: ");
        auxString = lector.nextLine();
        estudiante.setCorreoPersonal(auxString);
    }
      
    private void agregarNumeroCelular(){
        try{
        System.out.println ("Ingresar número de celular: ");
        auxLong = lector.nextLong();
        estudiante.setNumeroCelular(auxLong);
        lector.nextLine();
        }catch(InputMismatchException ex){
            estudiante.setNumeroCelular(0);  
            lector.nextLine();
        }
        
    }
    
    private void agregarNumeroFijo(){
        try{
        System.out.println ("Ingresar número fijo: ");
        auxLong = lector.nextLong();
        lector.nextLine();
        estudiante.setNumeroFijo(auxLong);
        }catch(InputMismatchException ex){
            estudiante.setNumeroFijo(0);  
            lector.nextLine();
        }
    }
    
    private void agregarProgramaAcademico(){
        
        System.out.println ("Ingresar programa: ");
        auxString = lector.nextLine();
        estudiante.setProgramaAcademico(auxString);
    }    
        
}
