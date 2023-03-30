import java.util.Scanner;

public class ServiciosPublicos {

    int estrato ;
    int consumo ;
    double costoTotal;
    double totalFactura;
    double impuestoFutbol;
    double descuentoOsobrecosto;
    
    double valorUnidad; 
    int opcion; 
    double descuento;

    Scanner lector = new Scanner(System.in);

    public ServiciosPublicos(){
        estrato=0;
        consumo=0;
        costoTotal=0.0;
        totalFactura=0.0;
        impuestoFutbol=0.01;
        descuentoOsobrecosto=0.0;
        valorUnidad=0.0;
        
        descuento=0.0;
        }


    public void mostrarMenu(){
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
        }
    public int leerOpcion (){
        System.out.println("Opción:");
        opcion= lector.nextInt();
        return (opcion);
       
        }

    public void leerDatos () {
            System.out.println ("Estrato del inmueble:");
            estrato = lector.nextInt ();
            System.out.println ("Consumo del inmueble:");
            consumo = lector.nextInt ();  
        }

    public void calcularEnergia(int valorUnidadServicio){
        valorUnidad=6200.0;
        costoTotal= consumo * valorUnidadServicio;
        impuestoFutbol= costoTotal *0.01;
            if (estrato==1 || estrato==2){
                descuentoOsobrecosto = costoTotal * -0.50;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            } else if (estrato ==3 || estrato==4){
                descuentoOsobrecosto= costoTotal * -0.10;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            } else if ( estrato==5 || estrato== 6){
                descuentoOsobrecosto= costoTotal *0.25;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            }
        }    

    public void calcularAcueducto(int valorUnidadServicio){
        valorUnidad=9256.0;
        costoTotal= consumo * valorUnidadServicio;
        impuestoFutbol= costoTotal *0.01;
            if (estrato==1 || estrato==2){
                descuentoOsobrecosto = costoTotal * -0.50;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            } else if (estrato ==3 || estrato==4){
                descuentoOsobrecosto= costoTotal * -0.10;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            } else if ( estrato==5 || estrato== 6){
                 descuentoOsobrecosto= costoTotal *0.25;
                 totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            }        
        

        }
    public void calcularGas(int valorUnidadServicio){
        valorUnidad=5234.0;
        costoTotal= consumo * valorUnidadServicio;
        impuestoFutbol= costoTotal *0.01;
            if (estrato==1 || estrato==2){
                descuentoOsobrecosto = costoTotal * -0.50;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            } else if (estrato ==3 || estrato==4){
                descuentoOsobrecosto= costoTotal * -0.10;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
            } else if ( estrato==5 || estrato== 6){
                descuentoOsobrecosto= costoTotal *0.25;
                totalFactura =  costoTotal + impuestoFutbol + descuentoOsobrecosto;
                }        
            
    
            }
        
             
                     
            
        

    
    public void mostrarTotales(){
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorUnidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total: " + costoTotal);
        System.out.println ("Descuento o sobrecosto: " + descuentoOsobrecosto );
        System.out.println ("Impuesto por infraestructura: " + impuestoFutbol);
        System.out.println ("TOTAL A PAGAR:" + totalFactura);

        }
    }


                   



