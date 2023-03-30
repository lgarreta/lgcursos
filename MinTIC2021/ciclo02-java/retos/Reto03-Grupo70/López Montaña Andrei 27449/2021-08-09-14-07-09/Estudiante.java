

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estudiante implements Serializable {

    //Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;

    public Estudiante (){
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fechaNacimiento = " Sin fecha de nacimiento";
        this.correoInstitucional = "Sin correo institucional";
        this.correoPersonal = "Sin correo personal";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programaAcademico = "Sin programa academico";
     } 

    //Constructor
    


    public void presentarse () {
        System.out.println("Información del estudiante");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha nacimiento: " + fechaNacimiento);
        System.out.println("Correo institucional: " + correoInstitucional);
        System.out.println("Correo personal: " + correoPersonal);
        System.out.println("Número de teléfono celular: " + numeroCelular);
        System.out.println("Número de teléfono fijo: " + numeroFijo);
        System.out.println("Programa académico: " + programaAcademico+ "\n");
    }

    public String getCorreoInstitucional(){
        return (correoInstitucional);
    }
   
    public void setCorreoPersonal(String nuevoCorreoP){
        this.correoPersonal = nuevoCorreoP;
    }
    
    public void setNumeroCelular(Long nuevoCelular){
        this.numeroCelular = nuevoCelular;
    }
    
    public void setNumeroFijo(Long nuevoFijo){
        this.numeroFijo = nuevoFijo;
    }
    
    public void setProgramaAcademico(String nuevoPrograma){
        this.programaAcademico = nuevoPrograma;
    }
}
        
    
 

