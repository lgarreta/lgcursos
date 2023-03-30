
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

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
    
    public void guardarse (PrintWriter pw) throws IOException {
        pw.println (nombres);
        pw.println (correoInstitucional);
        pw.println (numeroCelular);
    }
    
    public void recuperarse (BufferedReader fr) throws IOException {
        String linea = fr.readLine ();
        if (linea==null) 
            throw new NullPointerException ();
        
        nombres             = linea;
        correoInstitucional = fr.readLine ();
        numeroCelular       = new Long (fr.readLine ());
    }
}
