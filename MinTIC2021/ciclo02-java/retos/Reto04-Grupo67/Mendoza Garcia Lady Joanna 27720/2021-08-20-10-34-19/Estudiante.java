



public class Estudiante  {
    
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    Long celular;
    Long telFijo;
    String programaAcademico;

    public Estudiante() {
    this.nombres= "desconocido";
    this.apellidos="desconocido";
    this.fechaNacimiento="desconocido";
    this.correoInstitucional="desconocido";
    this.correoPersonal= "desconocido";
    this.celular=0l;
    this.telFijo=0l;
    this.programaAcademico="desconocido";

    }

    public Estudiante( String nombre, String apellidos, String fechaNacimiento, String correoInst,String correoPersonal,Long celular, Long telFijo, String ProgramaAcademico){
        this.nombres= nombre;
        this.apellidos= apellidos;
        this.fechaNacimiento= fechaNacimiento;
        this.correoInstitucional=correoInst;
        this.correoPersonal= correoPersonal;
        this.celular= celular;
        this.telFijo= telFijo;
        this.programaAcademico=ProgramaAcademico;
    
        }

     
    }

    
         

    
    

