
import java.util.Scanner;

public class UsoFactura {    
    public static void main (String argumentos []) {
        Factura miFactura;
        miFactura = new Factura ();

        Scanner lector;
        lector = new Scanner (System.in);

        while (true){
            miFactura.mostrarMenu();
            int opcion = miFactura.leerOpcion();

            if (opcion == 1){
                System.out.println("Pago de Servicio de Energia ");
                miFactura.leerDatos();
                miFactura.calcularPagoEnergia();
                miFactura.mostrarResultados();
            }else if (opcion==2){
                System.out.println("Pago de Servicio de acueducto ");
                miFactura.leerDatos();
                miFactura.calcularPagoAgua();
                miFactura.mostrarResultados();
            }else if (opcion==3){
                System.out.println("Pago de Servicio de Gas Natural ");
                miFactura.leerDatos();
                miFactura.calcularPagoGas();
                miFactura.mostrarResultados();
            }else if (opcion==4){
                break;
            }
        }
        System.out.println("Hasta pronto");
    }
}
