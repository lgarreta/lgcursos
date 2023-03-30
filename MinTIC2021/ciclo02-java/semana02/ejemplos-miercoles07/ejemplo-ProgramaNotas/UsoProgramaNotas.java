public class UsoProgramaNotas {
    public static void main (String argumentos []) {
        // Usar la clase ProgramaNotas:
        // Definir, construir, usar un metodo
        ProgramaNotas progNotas;          // Definicion de un objeto
        progNotas = new ProgramaNotas (); // Creacion del objeto

        progNotas.mostrarMenu ();         // Llamado a un método
        int opcion = progNotas.leerOpcion();
        
        System.out.println ("Ingresó la opcion " + opcion);

    }    
}
