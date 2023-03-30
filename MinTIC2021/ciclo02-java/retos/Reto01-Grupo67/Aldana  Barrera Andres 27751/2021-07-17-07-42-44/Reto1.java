import java.util.Scanner;

public class Reto1 {
    // ATRIBUTOS

    int estrato;
    int consumo;
    int UnidadAcueducto;    
    int UnidadEnergia;
    int UnidadGas;
    double valorUnidad;
    double costoParcial;
    double descuento;
    double impuesto;
    double costoTotal;
    
    
    Scanner lector;
    
    // CONSTRUCTOR

    public Reto1 () {
        estrato = 0;
        consumo = 0;
        UnidadAcueducto = 9256; 
        UnidadEnergia=6200;  
        UnidadGas=5234;
        valorUnidad=0; 
        costoParcial = 0.0;
        descuento = 0.0;
        impuesto = 0.0;
        costoTotal = 0.0;
        lector = new Scanner (System.in);
    }
    
    public int leerValor () {
        int valor;
        valor=lector.nextInt ();
        return (valor);
    }
    public void mostrarMenu () {
        
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas natural");
        System.out.println ("4. Salir");
        System.out.println ("Opción:");

    }

    public void leerDatos () {
        System.out.println ("Estrato del inmueble:");
        estrato = leerValor ();
        System.out.println ("Consumo del inmueble:");
        consumo = leerValor ();  
    }

     
    public void calcularCostoEnergia () {
        if (estrato==1 || estrato ==2) {
            costoParcial = consumo * UnidadEnergia;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.5*-1;
            costoTotal   = costoParcial + impuesto + descuento;
        }                
        if (estrato==3 || estrato== 4) {
            costoParcial = consumo * UnidadEnergia;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.1*-1;
            costoTotal   = costoParcial + impuesto + descuento;
        }
        if (estrato==5 || estrato ==6) {
            costoParcial = consumo * UnidadEnergia;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.25;
            costoTotal   = costoParcial + impuesto + descuento;
        }
        valorUnidad=UnidadEnergia;
    }
         
    public void calcularCostoAgua () {
        if (estrato==1 || estrato ==2) {
            costoParcial = consumo * UnidadAcueducto;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.5*-1;
            costoTotal   = costoParcial + impuesto + descuento;
        }                
        if (estrato==3 || estrato== 4) {
            costoParcial = consumo * UnidadAcueducto;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.1*-1;
            costoTotal   = costoParcial + impuesto + descuento;
        }
        if (estrato==5 || estrato ==6) {
            costoParcial = consumo * UnidadAcueducto;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.25;
            costoTotal   = costoParcial + impuesto + descuento;
        }
        valorUnidad=UnidadAcueducto;
    }
    
    public void calcularCostoGas () {
        if (estrato==1 || estrato ==2) {
            costoParcial = consumo * UnidadGas;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.5*-1;
            costoTotal   = costoParcial + impuesto + descuento;
        }                
        if (estrato==3 || estrato== 4) {
            costoParcial = consumo * UnidadGas;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.1*-1;
            costoTotal   = costoParcial + impuesto + descuento;
        }
        if (estrato==5 || estrato ==6) {
            costoParcial = consumo * UnidadGas;
            impuesto     = costoParcial * 0.01;
            descuento    = costoParcial* 0.25;
            costoTotal   = costoParcial + impuesto + descuento;
        }
        valorUnidad=UnidadGas;
    }
    

    public void mostrarResultados () {
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: " + costoParcial);
        System.out.println ("Descuento o sobrecosto: " + descuento);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + costoTotal);
        System.out.println ("");
    }   
}