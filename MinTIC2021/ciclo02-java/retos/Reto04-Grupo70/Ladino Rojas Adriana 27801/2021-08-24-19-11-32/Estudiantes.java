import java.io.Serializable;

public class Estudiantes implements Serializable {
  
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programa;
        
    public Estudiantes () {
    
        this.nombres = "";
        this.apellidos = "";
        this.fechaNacimiento = "";
        this.correoInstitucional = "";
        this.correoPersonal = "";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programa = "";
    }
    
    public Estudiantes (String nombres, String apellidos, String fechaNacimiento, String correoInstitucional, String correoPersonal, long numeroCelular, long numeroFijo, String programa){
     
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = numeroCelular;
        this.numeroFijo = numeroFijo;
        this.programa = programa;
    }
    
 
    public void presentarse () {
        System.out.println ("Nombres: " + nombres + "Apellidos: " + apellidos + "Fecha Nacimiento: " + fechaNacimiento + "Correo institucional: " + correoInstitucional + "Correo personal: "+ correoPersonal + "Número de teléfono celular: " + numeroCelular + "Número de teléfono fijo: " + numeroFijo + "Programa académico: " + programa);
    }            
}