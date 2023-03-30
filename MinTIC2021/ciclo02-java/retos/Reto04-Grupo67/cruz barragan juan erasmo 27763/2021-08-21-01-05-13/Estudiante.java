

public class Estudiante  {
    // Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;

    // Constructores
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.apellidos = "Apellidos";
        this.fechaNacimiento = "FechaNacimiento";
        this.correoInstitucional = "Sin correo";
        this.correoInstitucional = "CorreoInstitucional";
        this.numeroCelular = 0;
        this.numeroFijo =0;
        this.programaAcademico = "ProgramaAcademico";
    }
    // Constructores
    public Estudiante (String nombres,String apellidos,String fechaNacimiento, String correoInst, String correoPersonal, long nroCelular,  long numeroFijo, String programaAcademico ){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInst;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = nroCelular;
        this.numeroFijo = numeroFijo;
        this.programaAcademico = programaAcademico;

        
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("Nombres: " + nombres + "Apellidos: " + apellidos + "Fecha nacimiento: " + fechaNacimiento + "Correo institucional: " + correoInstitucional +"Correo personal:" + correoPersonal  + "Número de teléfono celular:" + numeroCelular + "Número de teléfono fijo: " + numeroFijo + "Programa académico:"+ programaAcademico);
    }   
           
}