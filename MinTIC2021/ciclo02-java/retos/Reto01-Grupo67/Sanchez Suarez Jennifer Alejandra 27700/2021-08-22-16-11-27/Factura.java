import java.util.Scanner;
public class Factura {
    
    // ATRIBUTOS
    Scanner lector;
    double valorUndAgua = 9256;
    double valorUndGas = 5234;
    double valorUndEnergia = 6200;
    
    int estrato = 0;
    int consumo = 0;
    double valorUnidad = 0.0;    
    double costoTotal = 0.0;
    double descuentoSobrecosto = 0.0;
    double impuesto = 0.0;
    double ValorPagar = 0.0;
    
    
    // CONSTRUCTOR
    public Factura () {
        lector = new Scanner (System.in);
        valorUndAgua = 9256;
        valorUndGas = 5234;
        valorUndEnergia = 6200;
    }
    // METODOS
    public void leerDatos () {
        System.out.println ("Estrato del inmueble:");
        estrato = lector.nextInt ();

        System.out.println ("Consumo del inmueble:");
        consumo = lector.nextInt ();  
    }
        
        
    public void mostrarResultado () {
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad:  " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total:: " + costoTotal);
        System.out.println ("Descuento o sobrecosto: " + descuentoSobrecosto);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + ValorPagar);
        
    }  
    public void calcularPagoAgua () {
        valorUnidad = valorUndAgua;
        costoTotal = consumo * valorUndAgua;
        calcularDescuentoSobrecosto ();
        calcularImpuesto ();
        calcularValorPagar ();
    }
    public void calcularPagoGas () {
        valorUnidad = valorUndGas;
        costoTotal = consumo * valorUndGas;
        calcularDescuentoSobrecosto ();
        calcularImpuesto ();
        calcularValorPagar ();
    }
    public void calcularPagoEnergia () {
        valorUnidad = valorUndEnergia;
        costoTotal = consumo * valorUndEnergia;
        calcularDescuentoSobrecosto ();
        calcularImpuesto ();
        calcularValorPagar ();
    }    

    public double calcularDescuentoSobrecosto()
    {
        if (estrato == 1 || estrato == 2)
                descuentoSobrecosto = -1*0.5 * costoTotal;
                //costoTotal = costoTotal - descuentoSobrecosto;
            
        if (estrato == 3 || estrato == 4)
                descuentoSobrecosto = -1*0.1 * costoTotal;
                //costoTotal = costoTotal - descuentoSobrecosto;
                
        if (estrato == 5 || estrato == 6)
                descuentoSobrecosto = 0.25 * costoTotal;
        
        return (descuentoSobrecosto);
        
    }    
        
    
    public double calcularImpuesto(){
        impuesto = 0.01 * costoTotal;
        return(impuesto);
    }
    public double calcularValorPagar(){
        ValorPagar = (costoTotal + descuentoSobrecosto + impuesto);
        return(costoTotal);
    }

    public void mostrarMenu () {
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir"); 
       
       
    }

    public int leerOpcion() {
        System.out.println ("Opción:");
        int opcion = lector.nextInt();
        return (opcion);
        
    }
    
    
    public void calcularservicio() {
    }


     }
