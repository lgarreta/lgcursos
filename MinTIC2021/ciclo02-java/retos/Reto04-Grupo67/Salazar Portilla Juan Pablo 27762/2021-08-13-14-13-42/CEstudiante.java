//package Reto;

import java.io.Serializable;

public class CEstudiante implements Serializable{
    
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correoInstitucional;
    private String correoPersonal;
    private long   numeroCelular;
    private long   numeroFijo;
    private String programaAcademico;
    
    public CEstudiante(){
    
    }
    
    //------ Nombre ------//
    public String getName(){
        return nombres;
    }    
    public void setName(String fNombre){
        nombres = fNombre;
    }
    
    //------ Apellido ------//
    public String getApellidos(){
        return apellidos;
    }    
    public void setApellidos(String fApellidos){
        apellidos = fApellidos;
    }
    
    //------ Fecha De Nacimiento ------//
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }    
    public void setFechaNacimiento(String fFechaNacimiento){
        fechaNacimiento = fFechaNacimiento;
    }
    
     //------ Correo Institucional ------//
    public String getCorreoInstitucional(){
        return correoInstitucional;
    }    
    public void setCorreoInstitucional(String fCorreoInstitucional){
         correoInstitucional = fCorreoInstitucional;
    }
    
    //------ Correo Personal ------//
    public String getCorreoPersonal(){
        return correoPersonal;
    }    
    public void setCorreoPersonal(String fCorreoPersonal){
         correoPersonal = fCorreoPersonal;
    }
    
     //------ Numero Celular ------//
    public long getNumeroCelular(){
        return numeroCelular;
    }    
    public void setNumeroCelular(long fNumeroCelular){
         numeroCelular = fNumeroCelular;
    }
    
    //------ Numero Fijo ------//
    public long getNumeroFijo(){
        return numeroFijo;
    }    
    public void setNumeroFijo(long fNumeroFijo){
         numeroFijo = fNumeroFijo;
    }
    
     //------ Programa Academico ------//
    public String getProgramaAcademico(){
        return programaAcademico;
    }    
    public void setProgramaAcademico(String fProgramaAcademico){
         programaAcademico = fProgramaAcademico;
    }
}
