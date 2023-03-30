import java.util.Scanner;
public class VistaMenu {
    Scanner lector = new Scanner(System.in);
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correoInstitucional;
    private String correoPersonal;
    private long   numeroCelular;
    private long   numeroFijo;
    private String programaAcademico;
    String Estudiante;
    DirectorioDAO miDAO = new DirectorioDAO();

    public void mostrarMenu(){
        System.out.println("");
        System.out.println("INSTITUTO LA FLORESTA");
        System.out.println("Selecione tarea a realizar:");
        System.out.println("1. Ingresar estudiante:");
        System.out.println("2. Buscar estudiante");
        System.out.println("3. Modificar estudiante");
        System.out.println("4. Eliminar estudiante");
        System.out.println("5. Ver ditrectorio de estudiantes");
        System.out.println("6. Salir");
    }

 
public int leerOpcion () {
    System.out.println("Opción:");
    int opcion=lector.nextInt();
    lector.nextLine();
    return(opcion);
}
public Estudiante leerDatos(){
    Estudiante e = new Estudiante ();
    e.nombres = leerNombres();
    e.apellidos= leerApellidos();
    e.fechaNacimiento= leerFechaNacimiento();
    e.correoInstitucional = leerCorreoInstitucional();
    e.correoPersonal= leerCorreoPersonal();
    e.numeroCelular= leerNumeroCelular();
    e.numeroFijo= leerNumeroFijo();
    e.programaAcademico= leerProgramaAcademico();
    
    return (e);
}
public Estudiante leerDatosNuevos (){
    Estudiante e = new Estudiante ();
    e.nombres = leerNombres();
    e.apellidos= leerApellidos();
    e.fechaNacimiento= leerFechaNacimiento();
    e.correoInstitucional = leerCorreoInstitucional();
    e.correoPersonal= leerCorreoPersonal();
    e.numeroCelular= leerNumeroCelular();
    e.numeroFijo= leerNumeroFijo();
    e.programaAcademico= leerProgramaAcademico();
}
public void mostrarEstudiante(Estudiante e) {
    
        System.out.println("Nombres:" + e.nombres);
        System.out.println("Apellido:" + e.apellidos);
        System.out.println("Fecha Nacimiento:" + e.fechaNacimiento);
        System.out.println("Correo institucional:" + e.correoInstitucional);
        System.out.println("Correo Personal:" +e.correoPersonal);
        System.out.println("Numero Celular:"+e.numeroCelular);
        System.out.println("Numero fijo: "+ e.numeroFijo);
        System.out.println("Programa academico:" +e.programaAcademico);
    }
        

public String leerNombres (){
    System.out.println("Ingresar nombres:");
    String nombres = lector.nextLine();
    return (nombres);
}
public String leerApellidos (){
    System.out.println("APELLIDOS:");
    String apellidos = lector.nextLine();
    return (apellidos);
}

public long leerFechaNacimiento() {
    System.out.println("Fecha de nacimiento: ");
    string fechaNacimiento = lector.nextLine();
    return(fechaNacimiento);
    }
public String leerCorreoInstitucional(){
    System.out.println("CORREO INST:");
    String correoInst=lector.nextLine();
    return (correoInst);
}
public long leerNumeroCelular(){
    System.out.println("CELULAR:");
    long nroCelular = lector.nextLong();
    lector.nextLine();
    return (nroCelular);
}

}
