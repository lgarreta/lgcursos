
import java.io.Serializable;
        
    public class Estudiantes implements Serializable {
    // Atributos
    String nombres;
    String apellidos;
    String fechaDeNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;
        
    // Constructor
    public Estudiantes() {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellido";
        this.fechaDeNacimiento = "Sin fecha";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal = "Sin correo";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programaAcademico = "Sin programa";
    }
    
    public Estudiantes(String nombres, String apellidos, String fechaDeNacimiento, String correoInstitucional, String correoPersonal, long numeroCelular, long numeroFijo, String programaAcademico){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = numeroCelular;
        this.numeroFijo = numeroFijo;
        this.programaAcademico = programaAcademico;
    }
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }
}
