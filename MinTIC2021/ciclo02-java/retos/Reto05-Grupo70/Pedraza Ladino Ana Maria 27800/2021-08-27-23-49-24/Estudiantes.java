public class Estudiantes {
    // Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programa;
        
    // Constructor
    public Estudiantes () {
        this.nombres = "";
        this.correoInstitucional = "";
        this.numeroCelular = 0;
    }
    
    public Estudiantes (String nombres, String apellidos, String fechaNacimiento, String correoInst, String correoPersonal, long nroCelular, long nroFijo, String programaAcademico){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInst;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = nroCelular;
        this.numeroFijo = nroFijo;
        this.programa = programaAcademico;
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + "APELLIDOS: " + apellidos + "FECHA DE NACIMIENTO: " + fechaNacimiento + " CORREO INSTITUCIONAL: " + correoInstitucional + " CORREO PERSONAL: " + correoPersonal + "NUMERO CELULAR: " + numeroCelular+ "NUMERO FIJO: " + numeroFijo + "PROGRAMA ACADEMICO: " + programa );
    }            
}
