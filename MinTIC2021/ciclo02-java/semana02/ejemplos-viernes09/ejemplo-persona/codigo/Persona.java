import java.util.Scanner;

public class Persona {
    // Aquí van los ATRIBUTOS, variables
    String nombre;
    int edad;
    String tipoSangre;
    Scanner lector;  // Permite entrada de datos desde el teclado

    // Aquí van los CONSTRUCTURES
    public Persona () {
        nombre     = "Sin nombre";
        edad       = 0;
        tipoSangre = "No registrada";
        lector     = new Scanner (System.in);
    }
    
    public Persona (String nombrePersona, int edadPersona, String sangrePersona) {
        nombre     = nombrePersona;
        edad       = edadPersona;
        tipoSangre = sangrePersona;
        lector     = new Scanner (System.in); 
    }

    // Aqúi van los METODOS, funciones
    public void leerDatos () {
        System.out.println ("NOMBRE: ");
        nombre = lector.nextLine ();
        System.out.println ("SANGRE: ");
        tipoSangre = lector.nextLine (); 
        System.out.println ("EDAD: ");
        edad = lector.nextInt (); 
    }

    public void presentarse () {
        System.out.println ("\n");
        System.out.println ("Mi nombre es: " + nombre);
        System.out.println ("Mi edad es: " + edad);
        System.out.println ("Mi tipo sangre es: " + tipoSangre);
    }

    public int correr (int distancia, int velocidad) {
        int calorias;
        calorias = distancia * velocidad / 100;
        return (calorias);
    }

    public float trabajar (int horas, float costo) {
        float salario;
        salario = horas * costo;
        return (salario);
    }
}