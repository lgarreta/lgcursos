import java.util.Scanner;

public class Persona {
    // Aquí van los ATRIBUTOS
    String nombre;
    int edad;
    String tipoSangre;        
    Scanner lector;

    // Aquí los METODOS o funciones
    // Metodo constructor
    public Persona () {
        nombre = "Desconocido";
        edad   = 0;
        tipoSangre = "No registrada";

        lector  = new Scanner (System.in);
    }

    public Persona (String nombrePersona, int edadPersona, String tipoSangrePersona) {
        nombre     = nombrePersona;
        edad       =  edadPersona;
        tipoSangre = tipoSangrePersona;

        lector  = new Scanner (System.in);
    }

    public void leerDatos () {
        System.out.println ("NOMBRE: ");
        nombre = lector.nextLine();
        System.out.println ("SANGRE: ");
        tipoSangre = lector.nextLine();
        System.out.println ("EDAD: ");
        edad = lector.nextInt();
    } 

    public void presentarse () {
        System.out.println ("Mi nombre es: " + nombre);
        System.out.println ("Mi edad es: " + edad);
        System.out.println ("Mi tipo de sangre es: " + tipoSangre);
    }

    public float caminar (float distancia, float velocidad) {
        float calorias;
        calorias = (distancia * velocidad) / 100;
        return (calorias);
    } 

    public void saludar (String saludo) {
       System.out.println ("Gracias. Buen día también.");
    }

    public int trabajar (int horas, int costo) {
        int costoTrabajo = horas * costo;
        return (costoTrabajo);
    }
}