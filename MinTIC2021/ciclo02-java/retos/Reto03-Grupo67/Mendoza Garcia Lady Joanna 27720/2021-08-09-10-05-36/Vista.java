import java.util.InputMismatchException;

import java.util.Scanner;


public class Vista {
    
    Scanner lector= new Scanner(System.in);
    Estudiante e;

    public int mostrarMenu (){
        try{
            System.out.println ("INSTITUTO LA FLORESTA");
            System.out.println ("Seleccione tarea a realizar:");
            System.out.println ("1. Ingresar estudiante");
            System.out.println ("2. Buscar estudiante");
            System.out.println ("3. Modificar estudiante");
            System.out.println ("4. Eliminar Estudiante");
            System.out.println ("5. Ver directorio de estudiantes");
            System.out.println ("6. Salir");  
            
            System.out.println("Opción:");
            int opcion= lector.nextInt();
            lector.nextLine();
            return (opcion);

        }catch (InputMismatchException exc){
            System.out.println("El dato ingresado no es un número");
            lector.nextLine();
            return(0);
            }

    }


    public Estudiante leerDatos(){
        System.out.println();
        System.out.println ("Ingresar estudiante");
        e = new Estudiante();
        e.nombres= leerNombres();
        System.out.println();  
        e.apellidos= leerApellidos();
        System.out.println();
        e.fechaNacimiento=leerNacimiento();
        System.out.println();
        e.correoInstitucional=leerCorreoInstitucional();
        System.out.println();
        e.correoPersonal=leerCorreoPersonal();
        System.out.println();
        e.celular=leerCelular();
        System.out.println();
        e.telFijo=leerFijo();
        System.out.println();
        e.programaAcademico=leerProgramaAcademico();
        System.out.println();
        System.out.println("Se agregó el estudiante");
        System.out.println();
        
    return(e);
    }
       
    public String leerNombres(){
        System.out.println ("Ingresar nombres: ");
        
        String nombres = lector.nextLine ();
        return (nombres);
        }   
    
    public String leerApellidos(){
        System.out.println ("Ingresar apellidos: ");
        String apellidos = lector.nextLine ();
        return (apellidos);

        }

    public String leerNacimiento(){
        System.out.println ("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = lector.nextLine();
        return(fechaNacimiento);

        }
    public String leerCorreoInstitucional(){
        System.out.println ("Ingresar correo institucional: ");
        String correoInstitucional= lector.nextLine();
        return(correoInstitucional);
        }    
    
    public String leerCorreoPersonal(){
        System.out.println ("Ingresar correo personal: ");
        String correoPersonal= lector.nextLine();
        return (correoPersonal);
        }
    
    public Long leerCelular (){
        try{
            System.out.println ("Ingresar número de celular: ");
            Long celular= lector.nextLong();
            lector.nextLine();
            return (celular);
                 
        }catch (InputMismatchException exc){
            System.out.println("El dato ingresado no es un número");
            lector.nextLine();
            return (0l);
            
            }
        }
        
    public Long leerFijo(){
        try{ 
            System.out.println ("Ingresar número fijo: ");
            Long telFijo= lector.nextLong();
            lector.nextLine();
            return (telFijo);
        }catch (InputMismatchException exc){
            System.out.println("El dato ingresado no es un número");
            lector.nextLine();
            return (0l);
            }  
        }  

    public String leerProgramaAcademico(){
        System.out.println ("Ingresar programa: ");
        String programaAcademico=lector.nextLine();
        return(programaAcademico);
        

    }

    
    public String buscarPorCorreoInstitucional(){
        
            System.out.println ("Ingresar correo institucional:");
            System.out.println();
            String correoInstitucional= null;
            correoInstitucional= lector.nextLine();
            System.out.println("Información del estudiante");
       
            return correoInstitucional;   
    }
    
     public String buscarPorCorreoInst2(){
        
        System.out.println ("Ingresar correo institucional:");
        System.out.println();
        String correoInstitucional= null;
        correoInstitucional= lector.nextLine();
        
   
        return correoInstitucional;   
    }
            
    public Estudiante modificar(Estudiante nuevo){
        nuevo.correoPersonal= leerCorreoPersonal();
        System.out.println();
        nuevo.celular= leerCelular();
        System.out.println();
        nuevo.telFijo= leerFijo();
        System.out.println();
        nuevo.programaAcademico=leerProgramaAcademico();
        System.out.println();
        System.out.println ("Se modificó el estudiante:");
        System.out.println();
        return(nuevo);

    }

    public String eliminar(){
        System.out.println();
        System.out.println ("Eliminar estudiante");
        System.out.println ("Ingresar correo institucional:");
        
        String correoInstitucional= lector.nextLine();
        System.out.println();
        System.out.println ("Se eliminó el estudiante:");
        System.out.println();
        return (correoInstitucional);

    }

    public void mostrarEstudiante (Estudiante e) {
            
            System.out.println ("Nombres:" + e.nombres);
            System.out.println ("Apellidos:" + e.apellidos);
            System.out.println ("Fecha nacimiento:" + e.fechaNacimiento); 
            System.out.println ("Correo institucional:" + e.correoInstitucional);
            System.out.println ("Correo personal:" + e.correoPersonal);
            System.out.println ("Número de teléfono celular:" + e.celular);
            System.out.println ("Número de teléfono fijo:" + e.telFijo);
            System.out.println ("Programa académico:" + e.programaAcademico);
            System.out.println();
        
        }
}
            


   
    

