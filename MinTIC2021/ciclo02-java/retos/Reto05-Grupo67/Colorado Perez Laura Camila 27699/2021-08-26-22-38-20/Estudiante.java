

public class Estudiante  {
    
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long   numeroCelular;
    long   numerofijo;
    String programaAcademico;


    // Constructor
    public Estudiante () {
        this.nombres             = "";
        this.apellidos           = "";
        this.fechaNacimiento     = "";
        this.correoInstitucional = "";
        this.correoPersonal      = "";
        this.numeroCelular       = 0;
        this.numerofijo          = 0;
        this.programaAcademico   = "";
    }
    
    public Estudiante (String nombres, String apellidos, String fechaNacimiento, String correoInstitucional,String correoPersonal, long numeroCelular, long numerofijo, String programaAcademico){
        this.nombres              = nombres;
        this.apellidos            = apellidos;
        this.correoInstitucional  = correoInstitucional;
        this.correoPersonal       = correoPersonal;
        this.numeroCelular        = numeroCelular;
        this.numerofijo           = numerofijo;
        this.programaAcademico    = programaAcademico;
        }
        public void presentarse () {
            System.out.println ("Ingresar nombres:" + nombres + "Ingresar apellidos:" + apellidos + "Ingresar fecha de nacimiento (YYYY-MM-DD):" + fechaNacimiento + "Ingresar correo institucional:" +  correoInstitucional + "Ingresar correo personal:" + correoPersonal + "Ingresar número de celular:" + numeroCelular + "Ingresar número fijo:" + numerofijo + "Ingresar programa:" + programaAcademico);
        } 
 }      