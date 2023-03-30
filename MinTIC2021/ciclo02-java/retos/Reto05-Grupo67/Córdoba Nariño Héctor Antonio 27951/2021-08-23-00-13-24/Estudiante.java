public class Estudiantes {
    // Atributos
    String nombres;
    String correoInstitucional;
    long numeroCelular;
        
    // Constructor
    public Estudiantes () {
        this.nombres = "";
        this.correoInstitucional = "";
        this.numeroCelular = 0;
    }
    
    public Estudiantes (String nombres, String correoInst, long nroCelular){
        this.nombres = nombres;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }            
}
