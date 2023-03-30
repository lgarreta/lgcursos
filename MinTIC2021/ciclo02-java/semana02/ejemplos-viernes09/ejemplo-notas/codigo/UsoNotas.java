public class UsoNotas {
    public static void main(String args[]) {
        Notas progNotas;
        progNotas = new Notas (); 

        int opcion = 9999;
        
        while (opcion != 0) {
            progNotas.mostrarMenu ();
            opcion = progNotas.leerOpcion ();
            progNotas.ejecutarOpcion (opcion);
        }
    }
    
}
