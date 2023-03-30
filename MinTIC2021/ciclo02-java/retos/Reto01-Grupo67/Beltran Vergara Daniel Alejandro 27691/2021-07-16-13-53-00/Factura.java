import java.util.Scanner;

public class Factura {
    
    int estrato = 0;
    int consumo = 0;
    
    double valorUnidad;
    double valorParcial;
    double descuento;
    double impuesto;
    double costoTotal;
    int valorUnidadGas = 5234;
    int valorUnidadEnergia = 6200;
    int valorUnidadAgua = 9256;
    int opcion;
    
    Scanner lector;

    public Factura () {
        estrato = 0;
        consumo = 0;
        valorUnidad = 0;
        valorParcial = 0.0;
        descuento = 0.0;
        impuesto = 0.0;
        costoTotal = 0.0;
        lector = new Scanner(System.in);
        
    }
    
    public void leerDatos () {
        System.out.println ("Estrato del inmueble:");
        estrato = lector.nextInt ();
        System.out.println ("Consumo del inmueble" );
        consumo = lector.nextInt ();
    }

    public void mostrarMenu () {
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
    }

    public int leerOpcion () {
        System.out.println ("Opción:");
        opcion = lector.nextInt ();
        return (opcion);
        
    }

    public void calcularCostoEnergia () {
        valorUnidad = valorUnidadEnergia;
        valorParcial = consumo * valorUnidad;
        calculoDescuento ();  
        calculoImpuesto();
        calculoTotal ();
    }

    public void calcularCostoGas () {
        valorUnidad = valorUnidadGas;
        valorParcial = consumo * valorUnidad;
        calculoDescuento ();  
        calculoImpuesto();
        calculoTotal ();
    }

    public void calcularCostoAgua () {
        valorUnidad = valorUnidadAgua;
        valorParcial = consumo * valorUnidad;
        calculoDescuento ();  
        calculoImpuesto();
        calculoTotal ();
    }

    public void calculoDescuento () {
        if (estrato == 1 || estrato == 2) {
            descuento = -0.5*valorParcial;}
        else if (estrato == 3 || estrato == 4) {
            descuento = -0.1*valorParcial;}
        else if (estrato == 5 || estrato == 6) {
            descuento = 0.25*valorParcial;}
    }

    public void calculoTotal () {
        costoTotal = valorParcial + impuesto + descuento;
    }

    public void calculoImpuesto () {
        impuesto = valorParcial*0.01;
    }

    public void mostrarResultados () {
        System.out.println("El consumo fue: "+ consumo);
        System.out.println("Valor unidad: "+ valorUnidad );
        System.out.println("Estrato del inmueble: "+ estrato);
        System.out.println("Costo total: "+ valorParcial );
        System.out.println("Descuento o sobrecosto: "+ descuento);
        System.out.println("Impuesto por infraestructura: "+ impuesto);
        System.out.println("TOTAL A PAGAR: "+ costoTotal);
        System.out.println("");
    }


}


     

