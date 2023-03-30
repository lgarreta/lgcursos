public class Estudiantes  {
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
    public Estudiantes () {
        this.nombres = "Sin nombres";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal = "Sin correo";
        this.nacimiento = "Sin fecha";
        this.apellidos = "Sin apellidos";
        this.programa = "Sin programa";
        this.numeroCelular = 0;
        this.numeroFijo=0;
    }
    
    public Estudiantes (String nombres, String apellidos,String fechaNac, String correoInst, String correoPersonal, String programa, long nroCelular, long nRoFijo){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
        this.numeroFijo=nRoFijo;
        this.correoPersonal = correoPersonal;
        this.nacimiento = fechaNac;
        this.programa = programa;
        
    }


    
    
           
}
