
public class Estudiante {
    // Atributos
	
    String nombres;
    String apellidos;
    String fecha;
    String correoInst;
    String correo;
    long nroCelular;
    long nroFijo;
    String programa;
     
        
    // Constructor
    public Estudiante () {
    	
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fecha               = "Sin fecha";
        this.correoInst = "Sin correo";
        this.correo              = "Sin correo";
        this.nroCelular          = 0;
        this.nroFijo             = 0;
        this.programa             = "Sin programa";
        
    }
    
    public Estudiante (String nombres, String apellidos, String fecha, String correoInst, String correo, long nroCelular, long nroFijo, String programa){
        
    	
    	this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha               = fecha;
        this.correoInst = correoInst;
        this.correo              = correo;
        this.nroCelular          = nroCelular;
        this.nroFijo             = nroFijo;
        this.programa             = programa;
          }
 
    
} 	