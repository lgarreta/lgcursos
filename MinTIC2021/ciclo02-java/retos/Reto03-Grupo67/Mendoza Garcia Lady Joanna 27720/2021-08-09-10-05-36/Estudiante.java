
import java.io.Serializable;


public class Estudiante implements Serializable {
    
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

       
        
    


    public void mostrarLista (){

        System.out.println ("El directorio de los estudiantes");
        System.out.println ("Nombres:" + nombres);
        System.out.println ("Apellidos:" + apellidos);
        System.out.println ("Fecha nacimiento:" + fechaNacimiento); 
        System.out.println ("Correo institucional:" + correoInstitucional);
        System.out.println ("Correo personal:" + correoPersonal);
        System.out.println ("Número de teléfono celular:" + celular);
        System.out.println ("Número de teléfono fijo:" + telFijo);
        System.out.println ("Programa académico:" + programaAcademico);

    }    
        



    }

    
         

    
    

