
public class Estudiante {
    // Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;
        
    // Constructor
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fechaNacimiento = "Sin fecha de nacimiento";
        this.correoInstitucional = "Sin correo institucional";
        this.correoPersonal = "Sin correo personal";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programaAcademico = "Sin programa académico";
    }
    
    public Estudiante (String nombres, String apellidos, String fechaNacido, String correoInst, String correoPers, long nroCelular, long nroFijo, String programaAcad){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacido;
        this.correoInstitucional = correoInst;
        this.correoPersonal = correoPers;
        this.numeroCelular = nroCelular;
        this.numeroFijo = nroFijo;
        this.programaAcademico = programaAcad;
    }       
}
