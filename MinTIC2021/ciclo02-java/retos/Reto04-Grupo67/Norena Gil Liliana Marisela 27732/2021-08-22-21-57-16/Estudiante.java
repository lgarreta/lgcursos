import java.io.Serializable;

public class Estudiante implements Serializable {
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
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fechaDeNacimiento = "Sin fecha de nacimiento";
        this.correoInstitucional = "Sin correo institucional";
        this.correoPersonal = "Sin correo personal";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programaAcademico = "Sin programa académico";
    }
    
    public Estudiante (String nombres, String apellidos, String fechaNacimiento, String correoInst, String correoPersonal, long nroCelular, long nroFijo, String progAcademico){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInst;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = nroCelular;
        this.numeroFijo = nroFijo;
        this.programaAcademico = progAcademico;
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }            
}
