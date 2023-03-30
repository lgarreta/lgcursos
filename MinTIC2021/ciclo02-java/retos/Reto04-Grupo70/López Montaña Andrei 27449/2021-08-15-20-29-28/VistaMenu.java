import java.util.InputMismatchException;
import java.util.Scanner; 
public class VistaMenu {
    Scanner lector = new Scanner (System.in); 

    String nombreBuscar;

    public void mostrarMenu(){
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
        System.out.println ("Opcion:");
        int opcion_menu = lector.nextInt ();
        lector.nextLine();
        return (opcion_menu);   
    }
    
    public void mostrarSubMenu(){
        System.out.println ("INSTITUTO LA FLORESTA");
        System.out.println ("Seleccione tarea a realizar:");
        System.out.println ("1. Buscar estudiante por el correo");
        System.out.println ("2. Buscar estudiante por el apellido");
        System.out.println ("3. Buscar estudiantes que pertenecen al programa");
        System.out.println ("4. Buscar cantidad de estudiantes en un programa");
        System.out.println ("5. Buscar estudiante por fecha de nacimiento");
        System.out.println ("6. Buscar estudiante por el numero de celular");
    }

    public Estudiante leerDatos(){
        Estudiante e = new Estudiante ();
        e.nombres = leerNombres();
        e.apellidos = leerApellidos();
        e.fechaNacimiento = leerFechaNacimiento();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal = leerCorreoPersonal();
        e.numeroCelular = leerNumeroCelular();
        e.numeroFijo = leerNumeroFijo();
        e.programaAcademico = leerProgramaAcademico();
        return (e);
    }

    public void mostrarEstudiante (Estudiante e){
        System.out.println("Información del estudiante");
        System.out.println("Nombres: " + e.nombres);
        System.out.println("Apellidos: " + e.apellidos);
        System.out.println("Fecha nacimiento: " + e.fechaNacimiento);
        System.out.println("Correo institucional: " + e.correoInstitucional);
        System.out.println("Correo personal: " + e.correoPersonal);
        System.out.println("Número de teléfono celular: " + e.numeroCelular);
        System.out.println("Número de teléfono fijo: " + e.numeroFijo);
        System.out.println("Programa académico: " + e.programaAcademico + "\n");
    }

    public String leerNombres(){
        System.out.println("Ingresar nombres: ");
        String nombres = lector.nextLine();
        return (nombres);
    }

    public String leerApellidos(){
        System.out.println("Ingresar apellidos: ");
        String apellidos = lector.nextLine();
        return (apellidos);
    }
     
    public String leerFechaNacimiento(){
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = lector.nextLine();
        return (fechaNacimiento);
    }
    
    public String leerCorreoInstitucional(){
        System.out.println("Ingresar correo institucional: ");
        String correoInstitucional = lector.nextLine();
        return (correoInstitucional);
    }
    
    public String leerCorreoPersonal(){
        System.out.println("Ingresar correo personal: ");
        String correoPersonal = lector.nextLine();
        return (correoPersonal);
    }
    
    public long leerNumeroCelular(){
        long numeroCelular;
        try{
        System.out.println("Ingresar número de celular: ");
        numeroCelular = lector.nextLong();
        lector.nextLine();
        return (numeroCelular);
        }catch(InputMismatchException ex){
        lector.nextLine();
        numeroCelular = 0;
        return (numeroCelular);}
    }
    
    public long leerNumeroFijo(){
        try{
        System.out.println("Ingresar número fijo: ");
        long numeroFijo = lector.nextLong();
        lector.nextLine();
        return (numeroFijo);
        }catch(InputMismatchException ex){
        lector.nextLine();
        return (0);}
        }
    
    public String leerProgramaAcademico(){
        System.out.println("Ingresar programa: ");
        String programaAcademico = lector.nextLine();
       return (programaAcademico);
    }
    
    public void buscarCelularEstudiante(String cadena[]){
        for(int i=0; i < cadena.length; i++){
        System.out.println("Nombre: " + cadena[i]);
        i++;
        System.out.println("Programa Academico: " + cadena[i]);}
    }
    
    public void buscarProgrmaEstudiante(String cadena[]){
        for(int i=0; i < cadena.length; i++){
        System.out.println("Nombre: " + cadena[i]);
        i++;
        System.out.println("Apellidos: " + cadena[i]);}
    }
    
    public void buscarCantidadEstudiantes(String programa, int cant){
        System.out.println("La cantidad de estudiantes que están en " + programa + " son: " + cant);
    }
}
