
public class ProgramaDirectorio {

    public static void main(String[] args) {
        try {
            Controlador ctrl = new Controlador ();     
            ctrl.iniciar ();
        } catch (ClassNotFoundException ex) {
            System.out.println ("Archivo no encontrado");
        }
    }    
}