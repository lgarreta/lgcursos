import java.util.*;
public class Factura {
    int estrato;
    int consumo;
    double valorUnidadServicio;
    double costoTotal;
    double descuentoSobrecosto;
    double impuesto;
    double totalaPagar;
    Scanner lector;

    public Factura () {
        estrato = 0;
        consumo = 0;
        valorUnidadServicio = 0;
        costoTotal = 0;
        descuentoSobrecosto = 0;
        impuesto = 0;
        totalaPagar = 0;
        lector = new Scanner (System.in);
        
    }

    public int leerEstrato () {
        System.out.print ("Estrato del inmueble: \n");
        estrato = lector.nextInt ();
        return (estrato);
    }
    public int leerConsumo () {
        System.out.print ("Consumo del inmueble: \n");
        consumo = lector.nextInt ();
        return (consumo);

    }
    
    public void mostrarResultados () {
        System.out.print ("El consumo fue: " + consumo +"\n");
        System.out.print ("Valor unidad : " + valorUnidadServicio +"\n");
        System.out.print ("Estrato del inmueble: " + estrato +"\n");
        System.out.print ("Costo total: " + costoTotal +"\n");
        System.out.print ("Descuento o sobrecosto: " + descuentoSobrecosto +"\n");
        System.out.print ("Impuesto por infraestructura: " + impuesto +"\n");
        System.out.print ("TOTAL A PAGAR: " + totalaPagar +"\n");
    }

    public double calcularServicio (double consumo, double valorUnidad) {
        valorUnidadServicio = valorUnidad;
        costoTotal = consumo * valorUnidadServicio;
        return (costoTotal);
    }

    public double calcularTotalaPagar (double costototal, double descuento, double impuesto) {
        totalaPagar = costoTotal + descuentoSobrecosto + impuesto;
        return (totalaPagar);
        
    }
    public int leerOpcion () {
        int opcion = lector.nextInt ();
        return (opcion);

    }
    public void mostrarMenu () {
        System.out.print ("\n");
        System.out.print ( "PAGO DE SERVICIOS PÚBLICOS \n");
        System.out.print ( "Seleccione el servicio público: \n"); 
        System.out.print ( "1.Energia \n");
        System.out.print ( "2.Acueducto \n");
        System.out.print ( "3.Gas Natural\n");
        System.out.print ( "4.Salir \n");

    }
    public double calcularDescuento (int estrato, double costoTotal) {
        if (estrato == 1 || estrato == 2) {
            descuentoSobrecosto = costoTotal * (-0.50);
        } else if (estrato == 3 || estrato == 4) {
            descuentoSobrecosto = costoTotal * (-0.10);
        } else if (estrato == 5 || estrato == 6) {
            descuentoSobrecosto = costoTotal * (0.25);
        } 
        return (descuentoSobrecosto);  
    }
    public double calcularImpuesto (double costoTotal) {
        impuesto = costoTotal * (0.01);
        return (impuesto);
    }
    
 }