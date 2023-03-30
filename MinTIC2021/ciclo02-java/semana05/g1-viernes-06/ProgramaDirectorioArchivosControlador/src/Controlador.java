

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lg
 */
public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();

    // Constructor
    public Controlador() throws IOException {
        miDAO.crear();
        BufferedReader br=null;

        try {
            File f = new File("estudiantesDAO.txt");
            if (f.exists() == true) {
                FileReader fr = new FileReader("estudiantesDAO.txt");
                br = new BufferedReader(fr);

                while (true) {
                    Estudiante e = new Estudiante();
                    e.recuperarse(br);
                    miDAO.adicionar(e);
                }
                
            }
        }catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException ex) {
            System.out.println ("Fin de archivo");
        }catch (IOException ex) {
            System.out.println ("Error de formatos.");
        }finally {
            if (br!=null)
                br.close ();
        }
    }
 
    // Metodos
    public void iniciar () {

        
        while (true) {
            try {
                miVista.mostrarMenu ();
                int opcion = miVista.leerOpcion ();
                    
                switch (opcion) {
                        case 1: adicionar (); break;
                        case 2: buscar (); break;
                        case 3: eliminar (); break;
                        case 4: modificar (); break;
                        case 5: ver (); break;
                        case 6: salir (); break;
                }
            }catch (NullPointerException ex) {
                System.out.println ("Error en estudiante!");
            }catch (InputMismatchException ex) {
                System.out.println ("Error en lectura de opción. Termina el programa");
                System.exit (0);
            }
        }
    }
    
    // Adiciona estudiante al DAO
    public void adicionar () {
        System.out.println ("Está adicionando...");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);                
    }
    
    // Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
            System.out.println ("Está buscando...");
            String correo = miVista.leerCorreoInstitucional ();
            Estudiante e = miDAO.buscar (correo);  
            miVista.mostrarEstudiante (e);            
    }
    
    // Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("Está eliminando...");
	String correo = miVista.leerCorreoInstitucional ();
	miDAO.eliminar (correo);
    }
    
    // 1. Solita el correo institucional
    // 2. Busco el estuddiante en el DAO
    // 3. Pedirle los datos a modificar y modificar el estudiante
    // 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar () {
        System.out.println ("Está modificando...");
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante nuevo = miDAO.buscar (correo);
        miVista.leerDatosNuevo (nuevo);
        miDAO.actualizar(correo, nuevo);    
    }
    
    public void ver () {
        System.out.println ("Está viendo directorio...");
	ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

	for (int i=0; i < miLista.size (); i++) {
            Estudiante e = miLista.get (i);
            miVista.mostrarEstudiante (e);
	}
    }
    public void salir() {
        System.out.println("Hasta pronto");

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("estudiantesDAO.txt"));
            ArrayList<Estudiante> listaEstudiantes = miDAO.obtenerTodos();

            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante e = listaEstudiantes.get(i);
                e.guardarse(pw);
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error de Formatos");
        } finally {  
            System.exit(0);
        }
    }       
    
    
}
