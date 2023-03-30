/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
public class Estudiante implements Serializable {
    // Atributos
    String nombres;
    String nacimiento;
    String correoInstitucional;
    String correoPersonal;
    String apellidos;
    String programa;
    
    long numeroFijo;
    long numeroCelular;
        
    // Constructor
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal = "Sin correo";
        this.nacimiento = "Sin fecha";
        this.apellidos = "Sin apellidos";
        this.programa = "Sin programa";
        this.numeroCelular = 0;
        this.numeroFijo=0;
    }
    
    public Estudiante (String nombres, String apellidos,String nacimiento, String correoInst, String correoPersonal, String programa, long nroCelular, long nRoFijo){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
        this.numeroFijo=nRoFijo;
        this.correoPersonal = correoPersonal;
        this.nacimiento = nacimiento;
        this.programa = programa;
        
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular +"APELLIDOS" + apellidos);
    }            
}
