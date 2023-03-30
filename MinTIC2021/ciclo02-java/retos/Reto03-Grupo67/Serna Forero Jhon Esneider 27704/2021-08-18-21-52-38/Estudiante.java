
import java.io.Serializable;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Estudiante implements Serializable {
    // Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long numeroFijo;
    String programaAcademico;
        
    // Constructor
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fechaNacimiento = "Sin fecha de nacimiento";
        this.correoInstitucional = "Sin correo institucional";
        this.correoPersonal = "Sin correo personal";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programaAcademico = "Sin programa academico";
    }
    
     public Estudiante (String nombres, String apellidos, String fechaNaci, String correoInst, String correoPers,
      long nroCelular,long nroFijo, String progAcade){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNaci;
        this.correoInstitucional = correoInst;
        this.correoPersonal = correoPers;
        this.numeroCelular = nroCelular;
        this.numeroFijo = nroFijo;
        this.programaAcademico = progAcade;
    }

    public void presentarse () {
        
        System.out.println("NOMBRES: " + nombres + "apellidos :" +apellidos+ "Fecha de Ncimiento :" + fechaNacimiento+
                "Correo Institucional :" +correoInstitucional+ "Correo Personal:" +correoPersonal+ "Celu:"+numeroCelular+
                "Fijo"+numeroFijo+ "Programa"+programaAcademico);
    
        
}
}