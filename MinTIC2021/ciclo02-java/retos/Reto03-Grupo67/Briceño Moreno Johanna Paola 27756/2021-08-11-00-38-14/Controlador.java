
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();

    // Constructor
    public Controlador () {
        miDAO.crear ();
         
       /** Estudiante e1 = new Estudiante ("Ana","Velez", "aa",31611,"Diseño");
        miDAO.adicionar (e1);
        Estudiante e2 = new Estudiante ("Maria","Montez","bb",30022, "Artes");
        miDAO.adicionar (e2);**/
        
        //recuperar el archivo
    /*    try {
            FileReader fr = new FileReader("datos_estudiantes.dat");
            BufferedReader br = new BufferedReader(fr);
            
            while (true){
                Estudiante e = new Estudiante ();
                e.recuperarse (br);
                miDAO.adicionar(e);
            } 

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe, es la primera vez,");
        } catch (java.lang.NumberFormatException ex){
            System.out.println("Fin de Archivo");
        }*/
    }
 
    // Metodos
    public void iniciar () throws IOException {
        while (true) {
            miVista.mostrarMenu ();
            int opcion = miVista.leerOpcion ();
            
                switch (opcion) {
                    case 1: adicionar (); break;
                    case 2: buscar (); break;
                    case 3: modificar (); break;
                    case 4: eliminar(); break;
                    case 5: verDirectorio (); break;
                    case 6: salir ();
                        /*System.out.println ("Hasta pronto"); 
                        System.exit (0)*/; break;
                }
        }
    }
    
    public void adicionar () {
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);  
        System.out.println("Se agregó el estudiante");
    }
    
    public void buscar () {
            System.out.println ("Buscar estudiante");
            String correo = miVista.leerCorreoInstitucional ();
            Estudiante e = miDAO.buscar (correo);
            if (e==null)
                System.out.println ("Correo de Estudiante no encontrado");
            else{
                System.out.println("Información del estudiante");
                miVista.mostrarEstudiante (e);   }         
    }
    
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
	miDAO.eliminar (correo);
        System.out.println("Se eliminó el estudiante");
    }
    
    public void modificar () {
        System.out.println ("Modificar estudiante ");
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante nuevo = miDAO.buscar (correo);
        miVista.leerDatosNuevos(nuevo);
        miDAO.actualizar(correo,nuevo);  
        System.out.println("Se modificó el estudiante");
    }
    
    public void verDirectorio () {
        System.out.println ("El directorio de los estudiantes");
	ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

	for (int i=0; i < miLista.size (); i++) {
            Estudiante e = miLista.get (i);
            miVista.mostrarEstudiante (e);
	}
    }   
    
    public void salir()  {
        System.out.println("Hasta pronto");
    /*    try {
            FileWriter fw = new FileWriter("datos_estudiantes.dat");
            PrintWriter pw = new PrintWriter(fw);
            ArrayList<Estudiante> listaEstudiantes = miDAO.obtenerTodos();

            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante e = listaEstudiantes.get(i);
                e.guardarse(pw);
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Erro en entada/Salida");
        }*/
        System.exit(0); 
    }
}


class Estudiante implements Serializable{
    // Atributos
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCelular;
    long   numeroFijo ;
    String programaAcademico ;
        
// ESTUDIANTE
    
    public Estudiante () {
        this.nombres = "Sin nombres";
        this.apellidos = "Sin apellidos";
        this.fechaNacimiento = "Sin fechaNacimiento";
        this.correoInstitucional = "Sin correo";
        this.correoPersonal = "Sin correoPersonal";
        this.numeroCelular = 0;
        this.numeroFijo = 0;
        this.programaAcademico = "Sin programaAcademico";
    }
    
    public Estudiante (String nombres, String apellidos, String correoInst, long numeroCelular, String programaAcademico){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInst;
        this.correoPersonal = correoPersonal;
        this.numeroCelular = numeroCelular;
        this.numeroFijo = numeroFijo;
        this.programaAcademico = programaAcademico;
    }    
    
 /*   public void guardarse (PrintWriter pw){
        pw.println(nombres);
     //   pw.println(apellidos);
     //   pw.println(fechaNacimiento);
        pw.println(correoInstitucional);
     //   pw.println(correoPersonal);
        pw.println(numeroCelular);
        pw.println(numeroFijo);
        pw.println(programaAcademico);
    }
    
    public void recuperarse (BufferedReader br){
        try {
            this.nombres = br.readLine();
        //    this.apellidos = br.readLine();
        //    this.fechaNacimiento = br.readLine();
            this.correoInstitucional = br.readLine();
        //    this.correoPersonal = br.readLine();
            this.numeroCelular = new Long (br.readLine());
         //   this.numeroFijo = new Long (br.readLine());
         //   this.programaAcademico = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } */
    
}

// PESTAÑA VISTAMENU

class VistaMenu {
    // Atributos
    Scanner lector = new Scanner (System.in);
    
    // Metodos
    public void mostrarMenu () {
        System.out.println("");
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
        System.out.println ("Opción:");
        int opcion = lector.nextInt ();
        lector.nextLine ();
        return (opcion);
    }
    
    public Estudiante leerDatos () {
        Estudiante e = new Estudiante ();
        e.nombres             = leerNombres ();
        e.apellidos           = leerApellidos ();
        e.fechaNacimiento     = leerFechaNacimiento ();
        e.correoInstitucional = leerCorreoInstitucional();
        e.correoPersonal      = leerCorreoPersonal ();
        e.numeroCelular       = leerNumeroCelular ();
        e.numeroFijo          = leerNumeroFijo (); 
        e.programaAcademico   = leerProgramaAcademico ();
        return (e);
    }
    
    public void leerDatosNuevos (Estudiante nuevo) {
        
        nuevo.correoPersonal      = leerCorreoPersonal ();
        nuevo.numeroCelular       = leerNumeroCelular ();
        nuevo.numeroFijo          = leerNumeroFijo (); 
        nuevo.programaAcademico   = leerProgramaAcademico ();
    }
    
    public void mostrarEstudiante (Estudiante e) {
        
        System.out.println("Nombres: " + e.nombres);
        System.out.println("Apellidos: " + e.apellidos);
        System.out.println("Fecha nacimiento: " + e.fechaNacimiento);
        System.out.println("Correo institucional: " + e.correoInstitucional );
        System.out.println("Correo personal: " + e.correoPersonal);
        System.out.println("Número de teléfono celular: " + e.numeroCelular);
        System.out.println("Número de teléfono fijo: " + e.numeroFijo);
        System.out.println("Programa académico: " + e.programaAcademico);
              
    }
    
    public String leerNombres () {
        System.out.println("Ingresar estudiante");
        System.out.println("Ingresar nombres:");
        String nombres = lector.nextLine ();
        return (nombres);
    }
    
    public String leerApellidos () {
        System.out.println ("Ingresar apellidos:");
        String apellidos = lector.nextLine ();
        return (apellidos);
    }
    
    public String leerFechaNacimiento (){
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String fechaNacimiento = lector.nextLine ();
        return (fechaNacimiento);
    }
    
    public String leerCorreoInstitucional () {
        System.out.println ("Ingresar correo institucional:");
        String correoInst = lector.nextLine ();
        return (correoInst);        
    }
    
    public String leerCorreoPersonal () {
        System.out.println ("Ingresar correo personal:");
        String correoPersonal = lector.nextLine ();
        return (correoPersonal);
    }
    
    public long leerNumeroCelular () {        
        System.out.println ("Ingresar número de celular:");
        long numeroCelular = lector.nextLong ();
        lector.nextLine ();
        return (numeroCelular);        
    }  
    
    public long leerNumeroFijo () {        
        System.out.println ("Ingresar número fijo:");
        long numeroFijo = lector.nextLong ();
        lector.nextLine ();
        return (numeroFijo);        
    } 
    
    public String leerProgramaAcademico () {
        System.out.println ("Ingresar programa:");
        String programaAcademico = lector.nextLine ();
        return (programaAcademico);
    }
    
   
}

