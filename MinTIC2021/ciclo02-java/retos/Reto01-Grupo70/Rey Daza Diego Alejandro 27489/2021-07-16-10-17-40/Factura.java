
import java.util.Scanner;

public class Factura {    // ATRIBUTOS
    int estrato;
    int consumo;
    double valorUnidad; 
    int opcion;   
    double costoParcial;
    double descuento;
    double impuesto;
    double costoTotal;
    Scanner lector;

    // CONSTRUCTOR
    public Factura () {
        estrato = 0;
        consumo = 0;
        valorUnidad = 0.0;    
        costoParcial = 0.0;
        descuento = 0.0;
        impuesto = 0.0;
        costoTotal = 0.0;

        lector = new Scanner (System.in); }

    public void leerDatos () {
        System.out.println("Estrato del inmueble:");
        estrato = lector.nextInt ();
        System.out.println ("Consumo del inmueble:");
        consumo = lector.nextInt ();  
    }

    
    public int leerOpcion () {
        System.out.println ("Opción: ");
        opcion= lector.nextInt ();
        return opcion;
    }


    public void calcularCosto (double valorUnidadServicio) {
            valorUnidad=valorUnidadServicio;
        if (estrato == 1 || estrato == 2){
            
            costoParcial = consumo *valorUnidadServicio;
            impuesto     = costoParcial * 0.01;
            descuento = (costoParcial*0.5)*-1;
            costoTotal  = costoParcial + impuesto + descuento;}
        
        else if (estrato == 3 || estrato == 4){
            costoParcial = consumo *valorUnidadServicio;
            impuesto     = costoParcial * 0.01;
            descuento = (costoParcial*0.1)*-1;
            costoTotal  = costoParcial + impuesto + descuento;}
        
        else if (estrato == 5 || estrato == 6){
            costoParcial = consumo *valorUnidadServicio;
            impuesto     = costoParcial * 0.01;
            descuento = costoParcial*0.25;
            costoTotal  = costoParcial + impuesto + descuento;}
        }
    public void menu () {
        System.out.println("\nPAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público: " );
        System.out.println("1. Energia");
        System.out.println("2. Acueducto" );
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir"); 
    }

    public void mostrarResultados () {
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad:  " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total:: " + costoParcial);
        System.out.println ("Descuento o sobrecosto: " + descuento);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + costoTotal);
                
    }
}  
      
      
      
      

