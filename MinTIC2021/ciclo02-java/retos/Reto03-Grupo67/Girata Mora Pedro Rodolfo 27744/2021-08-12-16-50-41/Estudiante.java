
import java.io.PrintWriter;
import java.io.Serializable;

public class Estudiante implements Serializable {

    //Atributos
    String nombres;
    String Apellidos;
    String Fecha_de_Nacimiento;
    String correoInstitucional;
    String correo_Personal;
    long Numero_Celular;
    long NumeroFijo;
    String Programa_Academico;

    // Constructor
    public Estudiante() {
        this.nombres = "";
        this.Apellidos = "";
        this.Fecha_de_Nacimiento = "";
        this.correoInstitucional = "";
        this.correo_Personal = "";
        this.Numero_Celular = 0;
        this.NumeroFijo = 0;
        this.Programa_Academico = "";
    }

    public Estudiante(String nombre, String apellidos, String nacimiento, String mailInst, String mailPers, long nroCel, long nroFijo, String progAcd) {
        nombres = nombre;
        Apellidos = apellidos;
        Fecha_de_Nacimiento = nacimiento;
        correoInstitucional = mailInst;
        correo_Personal = mailPers;
        Numero_Celular = nroCel;
        NumeroFijo = nroFijo;
        Programa_Academico = progAcd;
    }

    // Metodos
    public void presentarse() {
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + Apellidos);
        System.out.println("Fecha nacimiento: " + Fecha_de_Nacimiento);
        System.out.println("Correo institucional: " + correoInstitucional);
        System.out.println("Correo personal: " + correo_Personal);
        System.out.println("Número de teléfono celular: " + Numero_Celular);
        System.out.println("Número de teléfono fijo: " + NumeroFijo);
        System.out.println("Programa académico " + Programa_Academico);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    //public void recuperarse(BufferedReader br) {
        //try {
            //leer
            //this.nombres = br.readLine();
            //this.Apellidos = br.readLine();
            //this.Fecha_de_Nacimiento = br.readLine();
            //this.correoInstitucional = br.readLine();
            //this.correo_Personal = br.readLine(); MS
            //this.Numero_Celular = new long (br.readLine());
            //this.NumeroFijo = new long (br.readLine());
            //this.Programa_Academico = br.readLine();
        //} catch (IOException ex) {
            //Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        //}
    //}
    
    public void guardarse(PrintWriter pw) {
        //Escribir
        pw.println(nombres);
        pw.println(Apellidos);
        pw.println(Fecha_de_Nacimiento);
        pw.println(correoInstitucional);
        pw.println(correo_Personal);
        pw.println(Numero_Celular);
        pw.println(NumeroFijo);
        pw.println(Programa_Academico);
    }
}
