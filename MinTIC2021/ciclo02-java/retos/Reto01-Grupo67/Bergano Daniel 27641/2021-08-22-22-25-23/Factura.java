import java.util.scanner;

public class Factura {
    scanner lector;
    double valormetrogas = 5234;
    double valormetroagua = 9256;
    double valorenergia = 6200;

    int estrato = 0;
    int consumo = 0;
    double valorunitario = 0;

    double costototal = 0.0;
    double descuento = 0.0;
    double impuesto = 0.0;
    double valorapagar = 0.0;

    int opcion = 0;

    public void Factura() {
        lector = new scanner(system.in);
        valormetrogas = 5234;
        valormetroagua = 9256;
        valorenergia = 6200;
    }

    public void leerdatos() {
        system.out.println("ingrese estrato");
        estrato = lector.nextint();
        system.out.println("cantidad consumida");
        consumo = lector.nexint();
    }

    public void descuentos() {
        if (estrato == 1 || estrato == 2)
            descuento = costototal * (-0.5);
        else if (estrato == 3 || estrato == 4)
            descuento = costototal * (-0.10);
        else if (estrato == 5 || estrato == 6)
            descuento = costototal * (0.25);
    }

    public void impuesto() {
        impuesto = costototal * (0.01);
    }

    public void valorapagar() {
        valorapagar = costototal + descuento + impuesto;
    }

    public void calculovaloragua() {
        valorunitario = valormetroagua;
        costototal = consumo * valormetroagua;
        descuento();
        impuesto();
        valorapagar();
    }

    public void calculovalorgas() {
        valorunitario = valormetrogas;
        costototal = consumo * valormetrogas;
        descuento();
        impuesto();
        valorapagar();
    }

    public void calculodeenergia() {
        valorunitario = valorenergia;
        costototal = consumo * valorenergia;
        descuento();
        impuesto();
        valorapagar();
    }

    public void imprimirresultados() {
        system.out.println("consumo tota es: " + consumo);
        system.out.println("valor unidad: " + valorunitario);
        system.out.println("estrato de la casa: " + estrato);
        system.out.println("costo total " + costototal);
        system.out.println("descuento o sobrecosto " + descuento);
        system.out.println("descuento por daños" + impuesto);
        system.out.println("total a pagar" + valorapagar);
    }

    public void menu() {
        system.out.println("PAGO DE RECIBOS PÚBLICOS");
        system.out.println("seleccione el servicio público");
        system.out.println("1. Energía");
        system.out.println("2. Acueducto");
        system.out.println("3.  Gas natural");
        system.out.println("4. salir");
    }

    public void opcion() {
        system.out.println("opcion: ");
        int opcion = lector.nextint();
        return;
    }

}
