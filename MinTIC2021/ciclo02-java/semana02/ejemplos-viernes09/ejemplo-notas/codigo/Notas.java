import java.util.Scanner;

public class Notas {
    int porcentajeAlgebre;
    int porcentajeBiologia;
    Scanner lector;

    public Notas () {
        porcentajeAlgebre = 70;
        porcentajeBiologia = 30;
        lector = new Scanner (System.in);
    }

    public void mostrarMenu () {
        System.out.println ("---Opciones---");
        System.out.println ("1. Calcular nota final Algebra");
        System.out.println ("2. Calcular nota final Biologia");
        System.out.println ("3. Calcular nota final");
        System.out.println ("0. Salir");
    }

    public int leerOpcion () {
        System.out.println ("Ingrese opcion: ");
        int opcion = lector.nextInt ();
        return (opcion);
    }

    public void ejecutarOpcion (int opcion) {
        System.out.println ("La opcion fué: " + opcion);
    }


    
}
