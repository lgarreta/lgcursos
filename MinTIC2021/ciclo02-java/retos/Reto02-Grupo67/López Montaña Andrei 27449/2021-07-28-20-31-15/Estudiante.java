
public class Estudiante {
    //Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;

    //Constructor
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

    public Estudiante (String nombres, String apellidos, String fechaNacimiento, String correoInstitucional, String correoPersonal, long numeroCelular, long numeroFijo, String programaAcademico){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = numeroCelular;
        this.numeroFijo = numeroFijo;
        this.programaAcademico = programaAcademico;
    }

    public void presentarse () {
        System.out.println("Información del estudiante");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha nacimiento: " + fechaNacimiento);
        System.out.println("Correo institucional: " + correoInstitucional);
        System.out.println("Correo personal: " + correoPersonal);
        System.out.println("Número de teléfono celular: " + numeroCelular);
        System.out.println("Número de teléfono fijo: " + numeroFijo);
        System.out.println("Programa académico: " + programaAcademico + "\n");
    }
public String getNombres(){
        return (nombres);
    }
    public void setNombres(String nuevoNombre){
        this.nombres = nuevoNombre;
    }
    
    public String getApellidos(){
        return (apellidos);
    }
    public void setApellidos(String nuevoApellido){
        this.apellidos = nuevoApellido;
    }
    
    public String getFechaNacimiento(){
        return (fechaNacimiento);
    }
    public void setFechaNacimiento(String nuevaFecha){
        this.fechaNacimiento = nuevaFecha;
    }
    
    public String getCorreoInstitucional(){
        return (correoInstitucional);
    }
    public void setCorreoInstitucional(String nuevoCorreoI){
        this.correoInstitucional = nuevoCorreoI;
    }
    
    public String getCorreoPersonal(){
        return (correoPersonal);
    }
    public void setCorreoPersonal(String nuevoCorreoP){
        this.correoPersonal = nuevoCorreoP;
    }
    
    public long getNumeroCelular(){
        return (numeroCelular);
    }
    public void setNumeroCelular(Long nuevoCelular){
        this.numeroCelular = nuevoCelular;
    }
    
    public long getNumeroFijo(){
        return (numeroFijo);
    }
    public void setNumeroFijo(Long nuevoFijo){
        this.numeroFijo = nuevoFijo;
    }
    
    public String getProgramaAcademico(){
        return (programaAcademico);
    }
    public void setProgramaAcademico(String nuevoPrograma){
        this.programaAcademico = nuevoPrograma;
    }
}
