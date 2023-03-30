import java.util.Scanner;

public class UsoFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Factura factura1 = new Factura();

        while (true){
            factura1.mostrarMenu();
            factura1.leerOpcion();
            if (factura1.getOpcion() == 1){
                factura1.leerDatos();
                factura1.valorFacturaParcial();
                factura1.calcularDescuentoSobrecosto();
                factura1.calcularImpuesto();
                factura1.valorTotal();
                factura1.mostrarResultados();
            }else if (factura1.getOpcion() == 2){
                factura1.leerDatos();
                factura1.valorFacturaParcial();
                factura1.calcularDescuentoSobrecosto();
                factura1.calcularImpuesto();
                factura1.valorTotal();
                factura1.mostrarResultados();
            }else if (factura1.getOpcion() == 3){
                factura1.leerDatos();
                factura1.valorFacturaParcial();
                factura1.calcularDescuentoSobrecosto();
                factura1.calcularImpuesto();
                factura1.valorTotal();
                factura1.mostrarResultados();
            }else if (factura1.getOpcion() == 4){
                System.out.println("Hasta pronto");
                break;
            }else {
                System.out.println("No es una opcion valida, por favor vuelva a intentarlo");
            }
        }

    }

}
