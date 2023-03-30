import java.util.Scanner;

public class RetoFactura {
    
    int opcion;
    int estrato;
    int consumo;
    double costoUnidad;
    double costoTotal;
    double totalApagar;
    double descuentoSobrecosto;
    double impuesto;
    Scanner lector;

    public RetoFactura (){

        opcion = 0;
        estrato = 0;
        consumo = 0;
        costoUnidad = 0;
        costoTotal = 0.0;
        totalApagar = 0.0;
        descuentoSobrecosto = 0.0;
        impuesto = 0.0;
        lector = new Scanner (System.in);

    }

    public int leerOpcion (){

        //System.out.println ("Opción:");
        int opcion = lector.nextInt ();
        return (opcion);
    }
    
    public void verMenu (){

        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
        System.out.println ("Opción:");
    }

    public void leerDatosTeclado (){

        System.out.println ("Estrato del inmueble:");
        estrato = lector.nextInt ();
        System.out.println ("Consumo del inmueble:");
        consumo = lector.nextInt ();

    }
    
    public void calcularCostoTotal (double costoUnidadS){

        costoTotal = consumo * costoUnidadS;
        costoUnidad = costoUnidadS;

    }

    public void calcularDescuento (){

        if (estrato == 1 || estrato == 2){
            descuentoSobrecosto = costoTotal * -0.5;

        }else if (estrato == 3 || estrato == 4){
            descuentoSobrecosto = costoTotal * -0.1;
        
        }else if (estrato == 5 || estrato ==6){
            descuentoSobrecosto = costoTotal * 0.25;
        }
    }

    public void calcularImpuesto (){

        impuesto = costoTotal * 0.01;

    }

    public void calcularTotalApagar (){

        totalApagar = costoTotal + impuesto + descuentoSobrecosto;

    }

    public void mostrarDatosPantalla (){

        System.out.println ("El consumo fue:"+ consumo);
        System.out.println ("Valor unidad:"+ costoUnidad);
        System.out.println ("Estrato del inmueble:"+ estrato);
        System.out.println ("Costo total:"+ costoTotal);
        System.out.println ("Descuento o sobrecosto:"+ descuentoSobrecosto);
        System.out.println ("impuesto por infraestructura:"+ impuesto);
        System.out.println ("TOTAL A PAGAR:"+ totalApagar);

    }
    
}