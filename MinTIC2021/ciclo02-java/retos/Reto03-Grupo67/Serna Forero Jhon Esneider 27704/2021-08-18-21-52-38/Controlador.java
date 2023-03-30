
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    
    // Constructor
    public Controlador () {
        //FileReader fr = null;
        //try {
            miDAO.crear ();
            //Se leeran los datos del archivo y se adicionara al DAO
            /**fr = new FileReader("datos_estudiantes.dat");
            BufferedReader bur = new BufferedReader (fr);
            System.out.println("Recuerando datos del archivo");

            while (true) {
                try{
                    Estudiante e = new Estudiante ();
                    e.recuperarse (bur);
                    miDAO.adicionar(e);
                }catch (Exception exc) {
                    exc.printStackTrace();
                    System.out.println("Fin de archivo");
                    break;
                }
            }
            bur.close();
        } catch (FileNotFoundException exc) {
            System.out.println("primera vez archivo no encontrado");
        } catch (IOException exc) {
            System.out.println("Error de Entrada/Salida");
        }
    }
        

        
        /**Estudiante e1 = new Estudiante ("ana", "rojas", "1980-05-01" ,"aa","aaa", 11, 111, "Sociales");
        miDAO.adicionar (e1);
        Estudiante e2 = new Estudiante ("juan","burro", "1980-05-02" ,"bb","bbb", 22, 222, "Sociales");
        miDAO.adicionar (e2);
        Estudiante e3 = new Estudiante ("maria", "coco", "1980-05-3","cc","ccc", 33, 333, "Sociales");
        miDAO.adicionar (e3);
        
        miDAO.adicionar (new Estudiante ("pedro","pinto", "1980-05-4","dd", "ddd",44, 444, "Sociales"));*/
    }
    
    
    // Metodos
    public void iniciar () {
        while (true) {
            try{
                miVista.mostrarMenu ();
                int opcion = miVista.leerOpcion ();

                switch (opcion) {
                    case 1: adicionar (); break;
                    case 2: buscar (); break;
                    case 3: modificar (); break;
                    case 4: eliminar (); break;
                    case 5: ver (); break;
                    case 6: salir (); break;
                }  
        }catch (NullPointerException excp) {
            System.out.println("Error en Estudiante");
        }catch (InputMismatchException excp) {
            System.out.println("Error digitando opcion - Salir ");
            System.exit (0);
        }
    }
}

    // Adiciona estudiante al DAO
    
    public void adicionar () {
        System.out.println ("Ingresar estudiante");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);                
    }
	// Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
        System.out.println ("Buscar estudiante");
	String correo = miVista.leerCorreoInstitucional ();
	Estudiante e = miDAO.buscar (correo);
        System.out.println("Información del estudiante");
	miVista.mostrarEstudiante (e);
    }
	// Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Eliminar estudiante");
	String correo = miVista.leerCorreoInstitucional ();
	miDAO.eliminar (correo);
    }
	// 1. Solita el correo 
	// 2. Busco el estuddiante en el DAO
	// 3. Pedirle los datos a modificar y modificar el estudiante
	// 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar () {
        System.out.println ("Modificar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante nuevo = miDAO.buscar(correo);
        miVista.leerDatosNuevo(nuevo);
        miDAO.modificar (correo, nuevo);
    }
    public void ver () {
        System.out.println ("El directorio de los estudiantes");
		ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

		for (int i=0; i < miLista.size (); i++) {
			Estudiante e = miLista.get (i);
			miVista.mostrarEstudiante (e);
		}
    }
    public void salir () {
        //FileWriter fw = null;
        //try {
            
            //Antes de terminar, escribe todos los estudiantes del DAO a un archivo
            System.out.println ("Hasta pronto");
            System.exit (0);
          
            
            //Aqui vamos a guardar el DAO en un archivo
            /**fw = new FileWriter ("datos_estudiantes.dat");
            PrintWriter pw = new PrintWriter (fw);
            
            ArrayList <Estudiante> miLista = miDAO.obtenerTodos();
            //Recorro la lista
            for (int i=0; i< miLista.size(); i++) {
                //Recupero cada estudiante
                Estudiante e = miLista.get(i);
                //Doy la orden al estudiante de guardarse en el flujo abierto "fw"
                e.guardarse (pw);
            }
            pw.close();
            
            System.exit (0);
            
        }catch (IOException exc) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, exc);
        }finally {
            try{
                fw.close();
            }catch (IOException exc) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
    }
}*/
        
    }
}
     
