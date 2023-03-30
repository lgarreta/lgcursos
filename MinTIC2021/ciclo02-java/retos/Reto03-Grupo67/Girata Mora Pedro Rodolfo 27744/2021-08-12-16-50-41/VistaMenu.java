import java.util.InputMismatchException;
import java.util.Scanner;
public class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    private String Ingresar_nombres;
    private String Apellidos;
    private long   Fecha_de_Nacimiento;
    private String correoInstitucional;
    private String correo_Personal;
    private long   Numero_Celular;
    private long   NumeroFijo;
    private String programaAcademico;  
    String Estudiante;
    DirectorioDAO miDAO   = new DirectorioDAO ();
    // Metodos
    public void mostrarMenu () {
        System.out.println ("");
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar:");
        System.out.println ("1. Ingresar estudiante");
        System.out.println ("2. Buscar estudiante");
        System.out.println ("3. Modificar estudiante");
        System.out.println ("4. Eliminar Estudiante");
        System.out.println ("5. Ver directorio de estudiantes");
        System.out.println ("6. Salir"); 
    }
    public int leerOpcion () {
       try{
           System.out.println ("Opción:");
           int opcion = lector.nextInt ();
           lector.nextLine ();
           return (opcion);
      }catch (InputMismatchException exc){
           System.out.println("Digite una opción válida!");
           lector.nextLine ();
           return (0);
       }
    }
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        e.nombres = leerNombres ();
        e.Apellidos = leerApellidos ();
        e.Fecha_de_Nacimiento = leerFecha_de_Nacimiento ();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correo_Personal = leerCorreoPersonal();
        e.Numero_Celular = leerNumeroCelular ();
        e.NumeroFijo = leerNumeroFijo ();
        e.Programa_Academico = leerProgramaAcademico ();
        return (e);
    }
        public Estudiante leerDatosNuevos () {
        Estudiante e = new Estudiante ();
        //e.correoInstitucional = leerCorreoInstitucional();
        e.correo_Personal = leerCorreoPersonal();
        e.Numero_Celular = leerNumeroCelular ();
        e.NumeroFijo = leerNumeroFijo ();
        e.Programa_Academico = leerProgramaAcademico();
        return (e);
    }
    public  void mostrarEstudiante (Estudiante e) {
        try{
            System.out.println ("Nombres: " + e.nombres);
            System.out.println ("Apellidos: " + e.Apellidos);
            System.out.println ("Fecha nacimiento: " + e.Fecha_de_Nacimiento);
            System.out.println ("Correo institucional: " + e.correoInstitucional);
            System.out.println ("Correo personal: " + e.correo_Personal);
            System.out.println ("Número de teléfono celular: " + e.Numero_Celular);
            System.out.println ("Número de teléfono fijo: " + e.NumeroFijo);
            System.out.println ("Programa académico: " + e.Programa_Academico);     
        }
        catch (Exception exc) {
            System.out.println ("Error en el estudiante");
        }  
    }
    public  String leerNombres () {
        System.out.println ("Ingresar nombres: ");
        String leerNombres = lector.nextLine();
        return (leerNombres);
    }
    public String leerApellidos() {
        System.out.println("Ingresar apellidos: ");
        String leerApellidos = lector.nextLine();
        return (leerApellidos);
    }
    public  String leerFecha_de_Nacimiento () {        
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        String leerFecha_de_Nacimiento = lector.nextLine ();
        return (leerFecha_de_Nacimiento);        
    }
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional: ");
        String leerCorreoInstitucional = lector.nextLine ();
        return (leerCorreoInstitucional);        
    }
    public String leerCorreoPersonal() {
        System.out.println ("Ingresar correo personal: ");
        String leerCorreoPersonal = lector.nextLine ();
        return (leerCorreoPersonal); 
    }
    public  long   leerNumeroCelular () {        
        System.out.println("Ingresar número de celular: ");
        long leerNumero_Celular = lector.nextLong ();
        return (leerNumero_Celular);        
    }    
    public long   leerNumeroFijo() {
        System.out.println ("Ingresar número fijo: ");
        long leerNumeroFijo =  lector.nextLong();
        return (leerNumeroFijo);
    }
    public String leerProgramaAcademico() {
        System.out.println ("Ingresar programa: ");
        lector.nextLine();
        String leerProgramaAcademico = lector.nextLine();
        return (leerProgramaAcademico);
    }
}
