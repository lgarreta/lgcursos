
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estudiantes implements Serializable {

    //Atributos
    //int ID;
    String Nombres;
    String Apellidos;
    String Fecha_de_Nacimiento;
    String correo_Institucional;
    String correo_Personal;
    long Numero_Celular;
    long Numero_Fijo;
    String Programa_Academico;

    // Constructor
    public Estudiantes() {
        //this.ID = 0;
        this.Nombres = "";
        this.Apellidos = "";
        this.Fecha_de_Nacimiento = "";
        this.correo_Institucional = "";
        this.correo_Personal = "";
        this.Numero_Celular = 0;
        this.Numero_Fijo = 0;
        this.Programa_Academico = "";
    }

    public Estudiantes(String nombre, String apellidos, String nacimiento, String mailInst, String mailPers, long nroCel, long nroFijo, String progAcd) {
        //this.ID = ID;
        Nombres = nombre;
        Apellidos = apellidos;
        Fecha_de_Nacimiento = nacimiento;
        correo_Institucional = mailInst;
        correo_Personal = mailPers;
        Numero_Celular = nroCel;
        Numero_Fijo = nroFijo;
        Programa_Academico = progAcd;
    }

    // Metodos
    public void presentarse() {
        //System.out.println("ID: " + ID);
        System.out.println("Nombres: " + Nombres);
        System.out.println("Apellidos: " + Apellidos);
        System.out.println("Fecha nacimiento: " + Fecha_de_Nacimiento);
        System.out.println("Correo institucional: " + correo_Institucional);
        System.out.println("Correo personal: " + correo_Personal);
        System.out.println("Número de teléfono celular: " + Numero_Celular);
        System.out.println("Número de teléfono fijo: " + Numero_Fijo);
        System.out.println("Programa académico " + Programa_Academico);
    }

    
    public void guardarse(PrintWriter pw) {
        //Escribir
        //pw.println (ID);
        pw.println(Nombres);
        pw.println(Apellidos);
        pw.println(Fecha_de_Nacimiento);
        pw.println(correo_Institucional);
        pw.println(correo_Personal);
        pw.println(Numero_Celular);
        pw.println(Numero_Fijo);
        pw.println(Programa_Academico);
    }
    
    
        public void recuperarse(BufferedReader br) {

        try {
            //leer
            this.Nombres = br.readLine();
            this.Apellidos = br.readLine();
            this.Fecha_de_Nacimiento = br.readLine();
            this.correo_Institucional = br.readLine();
            this.correo_Personal = br.readLine();
            //this.Numero_Celular = new long (br.readLine());
            //this.Numero_Fijo = new long (br.readLine());
            this.Programa_Academico = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
