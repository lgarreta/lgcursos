import java.util.Scanner;

public class Factura {
    
    double unidadAgua;
    double unidadGas;
    double unidadEnergia;
    int consumo;
    int estrato;
    double ValorUnitario;
    double costoTotal;
    double Descuento;
    double Impuesto;
    double PagoTotal;
    Scanner lector = new Scanner (System.in);

    //metodo constructor
    public Factura () {
        unidadAgua = 9256.0;
        unidadGas  = 5234.0;
        unidadEnergia = 6200.0;
        consumo = 0;
        estrato = 0;
        ValorUnitario = 0.0;
        costoTotal = 0.0;
        Descuento  = 0.0;
        Impuesto = 0.0;
        PagoTotal = 0.0;
        lector = new Scanner (System.in);
        
    }

    //aqui los metodos o funciones
    public void mostrarMenu (){
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
    }
    public int leerOpcion() {
        System.out.println ("Opción: ");
        int opcion = lector.nextInt ();
        return (opcion);
    }
        
        
   

    
    public double  calcularPagoAgua (int consumo,int estrato) {
        
       
        
        
        if (estrato==1|| estrato==2){
            costoTotal = unidadAgua * consumo;
            Impuesto = costoTotal * 0.01; 
            Descuento = costoTotal* 0.5;
            PagoTotal = costoTotal - Descuento + Impuesto;

        }
        else if (estrato==3 || estrato==4){
            costoTotal =unidadAgua * consumo;
            Impuesto = costoTotal * 0.01; 
            Descuento = costoTotal *0.1;
            PagoTotal = costoTotal - Descuento + Impuesto;
        }
        else if (estrato==5 || estrato==6){
            costoTotal = unidadAgua * consumo; 
            Impuesto = costoTotal * 0.01;
            Descuento = costoTotal * 0.25;
            PagoTotal = costoTotal + Descuento + Impuesto;
            
        }
        ValorUnitario = unidadAgua;
        
        return (PagoTotal);
        
        
    } public double  calcularPagoGas (int consumo,int estrato) {
        
        
        if (estrato==1|| estrato==2){
            costoTotal = unidadGas * consumo; 
            Impuesto = costoTotal * 0.01;
            Descuento = costoTotal* 0.5;
            PagoTotal = costoTotal - Descuento + Impuesto;

        }
        else if (estrato==3 || estrato==4){
            costoTotal =unidadGas * consumo; 
            Impuesto = costoTotal * 0.01; 
            Descuento = costoTotal*0.1;
            PagoTotal = costoTotal - Descuento + Impuesto;
        }
        else if (estrato==5 || estrato==6){
            costoTotal = unidadGas * consumo;
            Impuesto = costoTotal * 0.01; 
            Descuento = costoTotal *  0.25;
            PagoTotal = costoTotal + Descuento + Impuesto;
        }
        ValorUnitario = unidadGas;
        
        return (PagoTotal);
        
        
    } public double  calcularPagoEnergia (int consumo,int estrato) {
      
        
        if (estrato==1|| estrato==2){
            costoTotal = unidadEnergia * consumo;
            Impuesto = costoTotal * 0.01;
            Descuento = costoTotal * 0.5;
            PagoTotal = costoTotal - Descuento + Impuesto;

        }
        else if (estrato==3 || estrato==4){
            costoTotal =unidadEnergia * consumo; 
            Impuesto = costoTotal * 0.01; 
            Descuento = costoTotal *0.1;
            PagoTotal = costoTotal - Descuento + Impuesto;
        }
        else if (estrato==5 || estrato==6){
            costoTotal = unidadEnergia * consumo ;
            Impuesto = costoTotal * 0.01;
            Descuento = costoTotal *0.25;
            PagoTotal = costoTotal + Descuento + Impuesto;
        }
        ValorUnitario =unidadEnergia;
       
        
        return (PagoTotal);
        
        
    }
  
    
    
   
    
    public int leerEstrato (){
        System.out.println ("Estrato del inmueble: ");
        int estrato =lector.nextInt ();
        return (estrato);
        
    }
    public int leerConsumo (){
        System.out.println ("Consumo del inmueble: ");
        int consumo = lector.nextInt ();
        return (consumo);
       
    }
    
        
        
    
    public void mostrarResultado (double PagoTotal, int consumo, int estrato){
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("valor unidad: " + ValorUnitario);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: "+ costoTotal);
        System.out.println ("Descuento o sobrecosto: " + Descuento);
        System.out.println ("Impuesto por infraestructura: "+ Impuesto);
        System.out.println ("TOTAL A PAGAR: " + PagoTotal);
        
    }

    
}