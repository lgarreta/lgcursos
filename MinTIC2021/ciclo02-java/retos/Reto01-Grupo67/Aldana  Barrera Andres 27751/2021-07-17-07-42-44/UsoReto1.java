import java.util.Scanner;

public class UsoReto1 {
    public static void main (String args []) {
        
        Reto1 usuario;
        usuario = new Reto1 ();
        int opcion; 
        opcion=0;
        Scanner lector;
        lector = new Scanner (System.in);

        while (true) {

            usuario.mostrarMenu ();
            
            opcion = usuario.leerValor ();
            

            if (opcion==1) {
                System.out.println ("Pago de Servicio de Energia");
                usuario.leerDatos();
                usuario.calcularCostoEnergia();
                usuario.mostrarResultados();
            }                
            if (opcion==2) {
                System.out.println ("Pago de Servicio de Acueducto");
                usuario.leerDatos();
                usuario.calcularCostoAgua();
                usuario.mostrarResultados();
            }
            if (opcion==3) {
                System.out.println ("Pago de Servicio de Gas Natural");
                usuario.leerDatos();
                usuario.calcularCostoGas();
                usuario.mostrarResultados();
            }
            if (opcion==4) {
                System.out.println ("Hasta pronto");
                break;
            }
        }

            

       
    }
}
    
