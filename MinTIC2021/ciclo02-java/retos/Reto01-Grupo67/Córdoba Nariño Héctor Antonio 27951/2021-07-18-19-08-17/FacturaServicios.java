import java.util.Scanner;

public class FacturaServicios {

    
    static Scanner lector = new Scanner (System.in);
    static boolean salir = false;
    static int estrato;
    static int consumo;
    static double valorUnidad;    
    static double costoParcial;
    static double descuento;
    static double impuesto;
    static double costoTotal;

    static int opcion;
       

    public FacturaServicios (){
        estrato = 0; 
        consumo = 0;
        valorUnidad = 0.0;    
        costoParcial = 0.0;
        descuento = 0.0;
        impuesto = 0.0;
        costoTotal = 0.0;
    }

    public static void main (String args[]){

     while(!salir){
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
        opcion = lector.nextInt();
        System.out.println ("Opción: ");


        switch (opcion){
            case 1: 
                energia (); 
                break;
            case 2: 
                acueducto (); 
                break;
            case 3: 
                gasNatural (); 

                break;    
            case 4: 
                salir = true; 
                System.out.println ("Hasta pronto");
                break;   
            default:
            System.out.println ("Error!, la opción no existe ");
            break;        
        }

     }

        
        
    }
   static void energia() {
       System.out.println ("Pago de Servicio de Energia "); 
       System.out.println ("Estrato del inmueble: ");
       estrato = lector.nextInt ();
       System.out.println ("Consumo del inmueble:");
       consumo = lector.nextInt (); 
       
       if (estrato == 1 || estrato == 2){
            valorUnidad = 6200;
            costoParcial = valorUnidad * consumo;
            descuento = (costoParcial * 0.5)*(-1);
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        }else if (estrato == 3 || estrato == 4){
            valorUnidad = 6200;
            costoParcial = valorUnidad * consumo;
            descuento = (costoParcial * 0.1)*(-1);
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        }else if (estrato == 5 || estrato == 6){
            valorUnidad = 6200;
            costoParcial = valorUnidad * consumo;
            descuento = costoParcial * 0.25;
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        } 
     
           System.out.println ("El consumo fue: " + consumo);
           System.out.println ("Valor unidad: " + valorUnidad);
           System.out.println ("Estrato del inmueble: " + estrato);
           System.out.println ("Costo total: " + costoParcial);
           
           System.out.println ("Descuento o sobrecosto: " + descuento);
           System.out.println ("Impuesto por infraestructura: " + impuesto);
           System.out.println ("TOTAL A PAGAR: " + costoTotal); 
           System.out.println ("");

        }     

    static void acueducto (){
        System.out.println ("Pago de Servicio de acueducto ");
        System.out.println ("Estrato del inmueble: ");
        estrato = lector.nextInt ();
        System.out.println ("Consumo del inmueble:");
        consumo = lector.nextInt ();  
        
        if (estrato == 1 || estrato == 2){
            valorUnidad = 9256;
            costoParcial = valorUnidad * consumo;
            descuento = (costoParcial * 0.5)*(-1);
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        }else if (estrato == 3 || estrato == 4){
            valorUnidad = 9256;
            costoParcial = valorUnidad * consumo;
            descuento = (costoParcial * 0.1)*(-1);
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        }else if (estrato == 5 || estrato == 6){
            valorUnidad = 9256;
            costoParcial = valorUnidad * consumo;
            descuento = costoParcial * 0.25;
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        } 

            System.out.println ("El consumo fue: " + consumo);
            System.out.println ("Valor unidad: " + valorUnidad);
            System.out.println ("Estrato del inmueble: " + estrato);
            System.out.println ("Costo total: " + costoParcial);
            //System.out.println ("");
            System.out.println ("Descuento o sobrecosto: " + descuento);
            System.out.println ("Impuesto por infraestructura: " + impuesto);
            System.out.println ("TOTAL A PAGAR: " + costoTotal); 
            System.out.println ("");     
    
        }
    static void gasNatural (){
        System.out.println ("Pago de Servicio de Gas Natural ");
        System.out.println ("Estrato del inmueble: ");
        estrato = lector.nextInt ();
        System.out.println ("Consumo del inmueble:");
        consumo = lector.nextInt ();  
        
        if (estrato == 1 || estrato == 2){
            valorUnidad = 5234;
            costoParcial = valorUnidad * consumo;
            descuento = (costoParcial * 0.5)*(-1);
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        }else if (estrato == 3 || estrato == 4){
            valorUnidad = 5234;
            costoParcial = valorUnidad * consumo;
            descuento = (costoParcial * 0.1)*(-1);
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        }else if (estrato == 5 || estrato == 6){
            valorUnidad = 5234;
            costoParcial = valorUnidad * consumo;
            descuento = costoParcial * 0.25;
            impuesto = costoParcial * 0.01;
            costoTotal = costoParcial + impuesto + descuento;
        } 

        
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: " + costoParcial);
        //System.out.println ("");
        System.out.println ("Descuento o sobrecosto: " + descuento);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + costoTotal); 
        System.out.println (""); 
                    
        }
    } 
