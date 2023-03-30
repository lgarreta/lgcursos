import java.util.Scanner ;
public class Factura {
    Scanner lector;
    double valorUnidadGas = 5234;
    double valorUndadAgua = 9256;
    double valorUnidadEnergia = 62000;

    int estrato = 0;
    int consumo = 0;
    double valorUnidad = 0;

    double costoTotal = 0.0;
    double descuento = 0.0;
    double impuesto = 0.0;
    double valorPagar = 0.0;

    public Factura (){
        lector = new Scanner (System.in);
        valorUnidadGas = 5234;
        valorUndadAgua = 9256;
        valorUnidadEnergia = 6200;
    }

    public void leerDatos () {
        System.out.println ("Estrato del inmueble: ");
        estrato = lector.nextInt ();

        System.out.println ("Consumo del inmueble: ");
        consumo = lector.nextInt ();
    }


    public void calcularDescuento (){
        if (estrato ==1 || estrato ==2)
            descuento = 0.5 * costoTotal * -1;
        else if (estrato ==3 || estrato ==4)
            descuento = 0.1 * costoTotal * -1;
        else if (estrato ==5 || estrato ==6)
            descuento = 0.25 * costoTotal;
    }

    public void calcularImpuesto (){
        impuesto = 0.01 * costoTotal;
    }

    public void calcularValorPagar (){
        valorPagar = costoTotal + descuento + impuesto;
    }

    public void calcularPagoAgua (){
        valorUnidad = valorUndadAgua;
        costoTotal = consumo * valorUnidad;
        calcularDescuento ();
        calcularImpuesto ();
        calcularValorPagar ();
    }

    public void calcularPagoGas (){
        valorUnidad = valorUnidadGas;
        costoTotal = consumo * valorUnidad;
        calcularDescuento ();
        calcularImpuesto ();
        calcularValorPagar ();
    }

    public void calcularPagoEnergia (){
        valorUnidad = valorUnidadEnergia;
        costoTotal = consumo * valorUnidad;
        calcularDescuento ();
        calcularImpuesto ();
        calcularValorPagar ();
    }

    public void mostrarResultados (){
        System.out.println ("EL consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: " + costoTotal);
        System.out.println ("Descuento o sobrecosto: " + descuento);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + valorPagar);
    }


    public void mostrarMenu (){
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
    }

    public int leerOpcion (){
        System.out.println ("Opción:");
        int opcion = lector.nextInt();
        return (opcion);
    }
}