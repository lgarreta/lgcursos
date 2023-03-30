
public class Estudiantes {
    // Atributos
    String nombres, apellido, fecha, correoinstituto, correopersonal, programa; 
    long celular, fijo;
       
       
    // Constructor
    public Estudiantes () {
        this.nombres = " ";
        this.apellido = " ";
        this.fecha = " ";
        this.correoinstituto = " ";
        this.correopersonal = " ";
        this.programa = " ";
        this.celular = 0;
        this.fijo = 0;
    }
    
    public Estudiantes (String nombres, String apellido, String fecha, String correoinstituto, String correopersonal, String programa,long celular, long fijo){
        this.nombres = nombres;
        this.apellido = apellido;
        this.fecha = fecha ;
        this.correoinstituto = correoinstituto;
        this.correopersonal = correopersonal;
        this.programa = programa;
        this.celular = celular;
        this.fijo = fijo;
    }
    
        
}