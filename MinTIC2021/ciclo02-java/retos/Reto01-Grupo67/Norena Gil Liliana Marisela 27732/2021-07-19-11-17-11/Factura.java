import java.util.Scanner;

public class Factura {
    double valorUnidad;
    //int valorUnidadGas;
    //int valorUnidadEnergia;
    Scanner lector;
    int consumo;
    int estrato;
    double costoParcial;
    double dctoSobrecosto;
    double impuesto;
    double totalFactura;

    public Factura (){
        
        consumo = 0;
        estrato = 0;
        valorUnidad = 0.0;
        costoParcial = 0.0;
        dctoSobrecosto = 0.0;
        impuesto = 0.0;
        totalFactura = 0.0;
        lector = new Scanner (System.in);
    }

    public void leerDatos(){
        System.out.println("Estrato del inmueble:");
        estrato = lector.nextInt();
        System.out.println("Consumo del inmueble:");
        consumo = lector.nextInt();
    }
    

    public void calcularPagoAgua (){
        valorUnidad = 9256;
        costoParcial = consumo * valorUnidad;
        impuesto = costoParcial * 0.01;
        
        if (estrato==1 || estrato==2){
            dctoSobrecosto = -(costoParcial*0.5);
        }
        else if (estrato==3 || estrato==4){
            dctoSobrecosto = -(costoParcial*0.1);
        }
        else if (estrato==5 || estrato==6){
            dctoSobrecosto = costoParcial*0.25;
        }
        totalFactura = costoParcial + impuesto + dctoSobrecosto;

    }

    public void calcularPagoGas (){
        valorUnidad = 5234;
        costoParcial = consumo * valorUnidad;
        impuesto = costoParcial * 0.01;
        
        if (estrato==1 || estrato==2){
            dctoSobrecosto = -(costoParcial*0.5);
        }
        else if (estrato==3 || estrato==4){
            dctoSobrecosto = -(costoParcial*0.1);
        }
        else if (estrato==5 || estrato==6){
            dctoSobrecosto = costoParcial*0.25;
        }
        totalFactura = costoParcial + impuesto + dctoSobrecosto;

    }

    public void calcularPagoEnergia (){
        valorUnidad = 6200;
        costoParcial = consumo * valorUnidad;
        impuesto = costoParcial * 0.01;
        
        if (estrato==1 || estrato==2){
            dctoSobrecosto = -(costoParcial*0.5);
        }
        else if (estrato==3 || estrato==4){
            dctoSobrecosto = -(costoParcial*0.1);
        }
        else if (estrato==5 || estrato==6){
            dctoSobrecosto = costoParcial*0.25;
        }
        totalFactura = costoParcial + impuesto + dctoSobrecosto;

    }
    
    int leerEstrato(){
        System.out.println("Estrato del inmueble:");
        return lector.nextInt();
    }

    int leerConsumo(){
        System.out.println("Consumo del inmueble:");
        return lector.nextInt();
    
    }

    public void mostrarResultados(){
        System.out.println("El consumo fue: " +consumo);
        System.out.println("Valor unidad: " +valorUnidad);
        System.out.println("Estrato del inmueble: " +estrato);
        System.out.println("Costo total: " +costoParcial);
        System.out.println("Descuento o sobrecosto: " +dctoSobrecosto);
        System.out.println("Impuesto por infraestructura: " +impuesto);
        System.out.println("TOTAL A PAGAR: " +totalFactura);
        System.out.println();


    }

    public void mostrarMenu(){
        System.out.println("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público:");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");
    }

    public int leerOpcion(){
    System.out.println("Opción: ");
    return lector.nextInt();
    }

    


}
