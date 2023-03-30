
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estudiante {
    // Atributos
    String nombres;
    String correoInstitucional;
    long numeroCelular;
        
    // Constructor
    public Estudiante () {
        this.nombres = "";
        this.correoInstitucional = "";
        this.numeroCelular = 0;
    }
    
    public Estudiante (String nombres, String correoInst, long nroCelular){
        this.nombres = nombres;
        this.correoInstitucional = correoInst;
        this.numeroCelular = nroCelular;
    }
    
    // Metodos
    public void presentarse () {
        System.out.println ("NOMBRES: " + nombres + " CORREO: " + correoInstitucional + " CELULAR" + numeroCelular);
    }
    
    public void guardarse (PrintWriter pw) {
        pw.println  (nombres);
        pw.println (correoInstitucional);
        pw.println (numeroCelular);
    }
    
    public void recuperarse (BufferedReader br) {
        try {
            
            this.nombres = br.readLine ();
            this.correoInstitucional = br.readLine ();
            this.numeroCelular = new Long (br.readLine());
            
        } catch (IOException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
