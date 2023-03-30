import java.util.Scanner;  

public class Factura {
    int opcion;
    int estrato;
    int consumo;
    double costoTotal;
    double descuentoSobrecosto;
    double impuesto;
    double totalPagar;
    double valorUnitarioServicio;
    Scanner lector = new Scanner (System.in);

    public Factura () {
        opcion = 0;
        estrato = 0;
        consumo = 0;
        costoTotal = 0.0;
        descuentoSobrecosto = 0.0;
        impuesto = 0.0;
        totalPagar = 0.0;
        valorUnitarioServicio = 0;
        lector = new Scanner (System.in);
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
        System.out.println ("Opción: ");
        
        opcion = lector.nextInt();

        return (opcion);
    }
    
    public int leerEstrato () {
        System.out.println ("Estrato del inmueble: ");
               
        estrato = lector.nextInt();

        return (estrato);
    }

    public int leerConsumo () {
        System.out.println ("Consumo del inmueble: ");
        
        consumo = lector.nextInt();

        return (consumo);
    }

    public double asignarValorUnitario (double valorUnitario) {

        valorUnitarioServicio = valorUnitario;

        return (valorUnitarioServicio);
    }

    public double calcularCostoTotal () {
        costoTotal = valorUnitarioServicio * consumo;

        return (costoTotal);    
    }

    public double calcularDescuentoSobrecosto () {
        if (estrato==1 || estrato == 2) {
            descuentoSobrecosto = costoTotal * (-0.50);
        } else if (estrato==3 || estrato == 4) {
            descuentoSobrecosto = costoTotal * (-0.10);
        } else {
            descuentoSobrecosto = costoTotal * 0.25;
        }  

        return (descuentoSobrecosto);    
    }

    public double calcularImpuesto () {
        impuesto = 0.01 *  costoTotal;

        return (impuesto);
    }

    public double totalPagarFactura () {
        totalPagar = costoTotal + descuentoSobrecosto + impuesto;
        
        return (totalPagar);
    }
        
    public void mostrarResultados () {
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorUnitarioServicio);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: " + costoTotal);
        System.out.println ("Descuento o sobrecosto: " + descuentoSobrecosto);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + totalPagar);
    }
}