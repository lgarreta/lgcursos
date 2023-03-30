public class Estudiante  {
    // Atributos
    String nombres;
    String apellidos;
    String fechaNac;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String progAcademico;
        
    // Constructor
    public Estudiante () {
        this.nombres             = "Sin nombres";
        this.apellidos           = "Sin apellidos";
        this.fechaNac            = "0000/00/00";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal      = "Sin correo";
        this.numeroCelular       = 0;
        this.numeroFijo          = 0;
        this.progAcademico       = "Sin programa";
    }
    
    public Estudiante (String nombres, String apellidos, String fechaNac, String correoInst, String correoPer, long nroCelular, long nroFijo, String progAca){
        this.nombres                = nombres;
        this.apellidos              = apellidos;
        this.fechaNac               = fechaNac;
        this.correoInstitucional    = correoInst;
        this.correoPersonal         = correoPer;
        this.numeroCelular          = nroCelular;
        this.numeroFijo             = nroFijo;
        this.progAcademico          = progAca;  
    }

    public Estudiante(String nombres, String correoInst, long nroCelular) {
        this.nombres                = nombres;
        this.correoInstitucional    = correoInst;
        this.numeroCelular          = nroCelular;
        
    }
    //Constructor del metodo adicionar de vistagrafica
    Estudiante(String nombres, String apellidos, String nacimiento, String correoInst, String correoPers, Long nroFijo, Long nroCelular,String academico) {
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.fechaNac = nacimiento;
       this.correoInstitucional = correoInst;
       this.correoPersonal = correoPers;
       this.numeroCelular = nroCelular;
       this.numeroFijo = nroFijo;
       this.progAcademico = academico;
       
    }

    Estudiante(String nombres, String apellidos, String nacimiento, String correoInst, String correoPers, String nroFijo, String nroCelular, String academico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    // Metodos
    public void presentarse () {
        System.out.println ("Ingresar nombres:" + nombres + "Ingresar apellidos:" + apellidos + "Ingresar fecha de nacimiento (YYYY-MM-DD):" + fechaNac + "Ingresar correo institucional:" + correoInstitucional + "Ingresar correo personal:" + correoPersonal + "Ingresar número de celular:" + numeroCelular + "Ingresar número fijo:" + numeroFijo + "Ingresar programa:" + progAcademico);
    }            
}

