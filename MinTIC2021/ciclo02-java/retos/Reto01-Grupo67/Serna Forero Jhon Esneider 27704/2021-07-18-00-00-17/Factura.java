import java.util.Scanner;

public class Factura {
    Scanner lector;
    double valorUnidad_M3Gas= 5234;
    double valorUnidad_M3H2O= 9256;
    double valorUnidad_KWEnergia= 6200;
    
    int estrato= 0;
    int consumo= 0;
    double valorUnidad= 0;
    double costoTotal= 0;
    double descuento= 0;

    double impuesto= 0;
    double valorPagar= 0;

    public Factura () {
        lector= new Scanner (System.in);

    }

    public void leerDatos (){
        System.out.println ("Estrato del inmueble: ");
        estrato= lector.nextInt ();
        System.out.println ("Consumo del inmueble: ");
        consumo= lector.nextInt ();
    }

    public void calculoDescuento () {
        if (estrato==1 || estrato==2)
        descuento= -1*(0.50*costoTotal);
        else if (estrato==3 || estrato==4)
        descuento= -1*(0.10* costoTotal);
        else if (estrato==5 || estrato==6)
        descuento = 0.25*costoTotal;
    }

    public void calculoImpuesto () {
        impuesto = 0.01*costoTotal;
    }
    public void calculoValorPagar () {
        valorPagar = costoTotal+impuesto+descuento;
    }

    public void calculoPagoGas () {
        valorUnidad= valorUnidad_M3Gas;
        costoTotal= valorUnidad*consumo;
        calculoImpuesto();
        calculoDescuento();
        calculoValorPagar();
    }
    public void calculoPagoAgua () {
        valorUnidad= valorUnidad_M3H2O;
        costoTotal= valorUnidad*consumo;
        calculoImpuesto();
        calculoDescuento();
        calculoValorPagar();
    }
    public void calculoPagoEnergia () {
        valorUnidad= valorUnidad_KWEnergia;
        costoTotal= valorUnidad*consumo;
        calculoImpuesto();
        calculoDescuento();
        calculoValorPagar();
    }

    public void mostrarResultados () {
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: " + costoTotal);
        System.out.println ("Descuento o sobrecosto: " + descuento);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + valorPagar);
        System.out.println (" ");
    }

    public void mostrarMenu () {
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
    }

    public int leerOpcion (){
        System.out.println ("Opción:");
        int opcion= lector.nextInt();
        return (opcion);
    }
}
