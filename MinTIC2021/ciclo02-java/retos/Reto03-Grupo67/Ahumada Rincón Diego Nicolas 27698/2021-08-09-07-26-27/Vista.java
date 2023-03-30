import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {

    private Directorio directorio;
    private ModeloEstudiante model;
    Scanner scanner = new Scanner(System.in);

    public Vista(ModeloEstudiante model,Directorio directorio) {
        this.model = model;
        this.directorio = directorio;
    }

    public void mostrarMenu(){
        System.out.println("INSTITUTO LA FLORESTA");
        System.out.println("Seleccione tarea a realizar:");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Buscar estudiante");
        System.out.println("3. Modificar estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir");
        System.out.println("Opción:");
    }

    public int leerOpcion(){
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    public ModeloEstudiante leerDatosNuevoEstudiante(){
        ModeloEstudiante e = new ModeloEstudiante();
        System.out.println("Ingresar estudiante");
        e.setNombre(leerNombre());
        e.setApellido(leerApellido());
        e.setFechaNacimiento(leerFechaNacimiento());
        e.setCorreoInstitucional(leerCorreoInstitucional());
        e.setCorreoPersonal(leerCorreoPersonal());
        e.setNumeroCelular(leerNumeroCelular());
        e.setNumeroFijo(leerNumeroFijo());
        e.setProgramaAcademico(leerPrograma());
        System.out.println("Se agregó el estudiante\n");
        return e;
    }

    public String leerNombre(){
        System.out.println("Ingresar nombres:");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public String leerApellido(){
        System.out.println("Ingresar apellidos:");
        String apellido = scanner.nextLine();
        return apellido;
    }

    public String leerFechaNacimiento(){
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String fecha = scanner.nextLine();
        return fecha;
    }

    public String leerCorreoInstitucional(){
        System.out.println("Ingresar correo institucional:");
        String correo = scanner.nextLine();
        return correo;
    }

    public String leerCorreoPersonal(){
        System.out.println("Ingresar correo personal:");
        String correoP = scanner.nextLine();
        return correoP;
    }

    public long leerNumeroCelular(){
        try{
            System.out.println("Ingresar número de celular:");
            long numeroC = scanner.nextLong();
            scanner.nextLine();
            return numeroC;
        }catch (InputMismatchException ex){
            scanner.nextLine();
            return 0;
        }
    }

    public long leerNumeroFijo(){
        try{
            System.out.println("Ingresar número fijo:");
            long numeroF = scanner.nextLong();
            scanner.nextLine();
            return numeroF;
        }catch (InputMismatchException ex){
            scanner.nextLine();
            return 0;
        }

    }

    public String leerPrograma(){
        System.out.println("Ingresar programa:");
        String programa = scanner.nextLine();
        return programa;
    }

    public void leerDatosBuscarEstudiante(){
        System.out.println("Buscar estudiante");
        directorio.buscarEstudiante(leerCorreoInstitucional());
    }

    public void leerDatosModificarEstudiante(){
        System.out.println("Modificar estudiante");
        directorio.modificarEstudiante(leerCorreoInstitucional(),leerCorreoPersonal(),leerNumeroCelular(),leerNumeroFijo(),leerPrograma());
        System.out.println("Se modificó el estudiante\n");
    }

    public void leerDatosEliminarUsuario(){
        System.out.println("Eliminar estudiante");
        directorio.eliminarEstudiante(leerCorreoInstitucional());
    }

    public void mostrarDirectorioEstudiantes(){
        System.out.println("El directorio de los estudiantes\n");
        directorio.mostrarDirectorio();
    }

}
