public class Estudiante {
    
    String nombres;
    String apellidos;
    String fecha;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programa;
    
        
    
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fecha = "Sin fecha";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal = "Sin correo";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programa = "Sin programa";
    }
    
    public Estudiante (String nombres, String correoInst, long nroCelular){
        this.nombres = nombres;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
    }
    
   
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }            
}
