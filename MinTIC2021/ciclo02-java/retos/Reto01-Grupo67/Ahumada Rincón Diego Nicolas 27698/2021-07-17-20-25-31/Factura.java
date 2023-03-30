import java.util.Scanner;

public class Factura {

    private static double gasNatural = 5234;
    private static double agua = 9256;
    private static double luz = 6200;
    private static double impuesto;
    private static int estrato;
    private static int consumo;
    private static double costoParcial;
    private static double costoTotal;
    private static double descuentoSobrecosto;
    private static int opcion;
    static Scanner scanner = new Scanner(System.in);

    public static int getOpcion() {
        return opcion;
    }

    public static void mostrarMenu(){
        System.out.println("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público:");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");;
    }

    public static void leerOpcion(){
        System.out.println("Opción:");
        opcion = scanner.nextInt();
    }

    public static void leerDatos () {
        switch (opcion){
            case 1:
                System.out.println("Pago de Servicio de Energia");
                break;
            case 2:
                System.out.println("Pago de Servicio de Acueducto");
                break;
            case 3:
                System.out.println("Pago de Servicio de Gas Natural");
        }
        System.out.println ("Estrato del inmueble:");
        estrato = scanner.nextInt ();
        System.out.println ("Consumo del inmueble:");
        consumo = scanner.nextInt ();
    }

    public void valorFacturaParcial(){
        costoParcial = 0;
        switch (opcion){
            case 1:
                costoParcial = consumo * luz;
                break;
            case 2:
                costoParcial = consumo * agua;
                break;
            case 3:
                costoParcial = consumo * gasNatural;
                break;
        }
    }

    public void calcularDescuentoSobrecosto(){
        if (estrato == 1 || estrato == 2){
            descuentoSobrecosto = costoParcial * 0.50;
        }else if (estrato == 3 || estrato == 4){
            descuentoSobrecosto = costoParcial * 0.10;
        }else if (estrato == 5 || estrato == 6){
            descuentoSobrecosto = costoParcial * 0.25;
        }
    }

    public void calcularImpuesto(){
        impuesto = costoParcial * 0.01;
    }

    public void valorTotal(){
        if (estrato == 1 || estrato == 2 || estrato == 3 || estrato == 4){
            costoTotal = costoParcial - descuentoSobrecosto + impuesto;
        }else if (estrato == 5 || estrato == 6){
            costoTotal = costoParcial + descuentoSobrecosto + impuesto;
        }
    }

    public void mostrarResultados () {

        switch (opcion){
            case 1:
                System.out.println ("El consumo fue: " + consumo);
                System.out.println ("Valor unidad: " + luz);
                System.out.println ("Estrato del inmueble: " + estrato);
                System.out.println ("Costo total: " + costoParcial);
                System.out.println ("Descuento o sobrecosto: " + descuentoSobrecosto);
                System.out.println ("Impuesto por infraestructura: " + impuesto);
                System.out.println ("TOTAL A PAGAR: " + costoTotal + "\n");
                break;
            case 2:
                System.out.println ("El consumo fue: " + consumo);
                System.out.println ("Valor unidad: " + agua);
                System.out.println ("Estrato del inmueble: " + estrato);
                System.out.println ("Costo total: " + costoParcial);
                System.out.println ("Descuento o sobrecosto: " + descuentoSobrecosto);
                System.out.println ("Impuesto por infraestructura: " + impuesto);
                System.out.println ("TOTAL A PAGAR: " + costoTotal + "\n");
                break;
            case 3:
                System.out.println ("El consumo fue: " + consumo);
                System.out.println ("Valor unidad: " + gasNatural);
                System.out.println ("Estrato del inmueble: " + estrato);
                System.out.println ("Costo total: " + costoParcial);
                System.out.println ("Descuento o sobrecosto: " + descuentoSobrecosto);
                System.out.println ("Impuesto por infraestructura: " + impuesto);
                System.out.println ("TOTAL A PAGAR: " + costoTotal + "\n");
                break;
        }
    }
}
