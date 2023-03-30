public class Estudiantes {
    // Atributos
    int id;
    String nombres;
    String correoInstitucional;
    long numeroCelular;
        
    // Constructor
    public Estudiantes () {
        this.id = 0;
        this.nombres = "";
        this.correoInstitucional = "";
        this.numeroCelular = 0;
    }
    
    public Estudiantes (int id, String nombres, String correoInst, long nroCelular){
        this.id = id;
        this.nombres = nombres;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("ID: " + id + " NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }            
}
