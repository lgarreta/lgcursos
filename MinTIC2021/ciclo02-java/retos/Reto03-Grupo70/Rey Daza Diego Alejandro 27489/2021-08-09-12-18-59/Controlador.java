/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.InputMismatchException;


public class Controlador {
    // Atributos
    VistaMenu     miVista = new VistaMenu ();
    DirectorioDAO miDAO   = new DirectorioDAO ();
    String n="sin";
    String nn="sin";
    String nnn="sin";
    
    // Constructor
    public Controlador () {
        miDAO.crear ();
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
                case 4: eliminar (); break;
                case 3: modificar (); break;
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
        System.out.println ("\nIngresar estudiante");
        Estudiante e = miVista.leerDatos ();
        miDAO.adicionar (e);
        nn = e.apellidos;
        n  = e.nombres;
        nnn= e.nacimiento;
        System.out.println ("\nSe agregó el estudiante");
    }
	// Solicita correo y lo busca en el DAO e imprimer la informacion
    public void buscar () {
        System.out.println ("\nBuscar estudiante");
		String correo = miVista.leerCorreoInstitucional();
		System.out.println ("Información del estudiante");
		Estudiante e = miDAO.buscar (correo);
		miVista.mostrarEstudiante (e);
    }
	// Solicita el correo y le dice al DAO que lo elimine
    public void eliminar () {
        System.out.println ("\nEliminar estudiante");
		String correo = miVista.leerCorreoInstitucional ();
		miDAO.eliminar (correo);
                System.out.println ("\nSe eliminó el estudiante");
    }
	// 1. Solita el correo 
	// 2. Busco el estuddiante en el DAO
	// 3. Pedirle los datos a modificar y modificar el estudiante
	// 4. Actualiza en el DAO con ese correo y el estudiante modificado
    public void modificar () {
        System.out.println ("\nModificar estudiante");
        String correo = miVista.leerCorreoInstitucional ();
        Estudiante e = miVista.Actualizar (correo,n,nn,nnn);
        miDAO.actualizar(correo,e);
        System.out.println ("\nSe modificó el estudiante");
     
    }
    public void ver () {
        System.out.println ("\nEl directorio de los estudiantes");
		ArrayList <Estudiante> miLista = miDAO.obtenerTodos();

		for (int i=0; i < miLista.size (); i++) {
			Estudiante e = miLista.get (i);
			miVista.mostrarEstudiante (e);
		}
    }
    public void salir () {
        System.out.println ("\nHasta pronto");
        System.exit (0);
    }    
}