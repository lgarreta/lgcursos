import java.util.Scanner;


public class factura {
    int estrato;
    int consumo;
    double valorunidad;
    double costoParcial;
    double descuento;
    double impuesto;
    double costoTotal;
    Scanner lector;
    

    public factura (){
        estrato       = 0;
        consumo       = 0;
        valorunidad   = 0;
        costoParcial  = 0.0;
        descuento     = 0.0;
        impuesto      = 0.0;
        costoTotal    = 0.0;

        lector = new Scanner (System.in);
    }
    

    public void mostrarMenu () {
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público: ");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
        
    }
    public int leerOpcion () {
        System.out.println ("Opción: ");
        int opcion = lector.nextInt ();
        return (opcion);
    }

    public void leerDatos () {
        System.out.println ("Estrato del inmueble: ");
        estrato = lector.nextInt ();
        System.out.println ("Consumo del inmueble: ");
        consumo = lector.nextInt ();
    }

    
    public void calcularServicioEnergia () {
        valorunidad  = 6200;
        costoParcial = consumo * valorunidad;
        
        if (estrato == 1 || estrato == 2){
            descuento = costoParcial * (-0.50);
        }else if (estrato == 3 || estrato == 4){
            descuento = costoParcial * (-0.10);
        }else   {
            descuento = costoParcial * 0.25 ;   
        }
        impuesto   = costoParcial * 0.01 ;
        costoTotal = costoParcial + impuesto+ descuento;

    }

    public void calcularServicioAgua () {
        valorunidad  = 9256;
        costoParcial = consumo * valorunidad;
        
        if (estrato == 1 || estrato == 2){
            descuento = costoParcial * (-0.50);
        }else if (estrato == 3 || estrato == 4){
            descuento = costoParcial * (-0.10);
        }else   {
            descuento = costoParcial * 0.25 ;   
        }
        impuesto   = costoParcial * 0.01 ;
        costoTotal = costoParcial + impuesto + descuento;
    }

    public void calcularServicioGas ( ) {
        valorunidad  = 5234;
        costoParcial = consumo * valorunidad;
    
        if (estrato == 1 || estrato == 2){
            descuento = costoParcial * (-0.50);
            
        }else if (estrato == 3 || estrato == 4){
            descuento = costoParcial * (-0.10);
        }else   {
            descuento = costoParcial * 0.25 ;   
        }
        impuesto   = costoParcial * 0.01 ;
        costoTotal = costoParcial + impuesto + descuento;
    }
    public void mostrarResultados () {
        System.out.println ("El consumo fue: " + consumo);
        System.out.println ("Valor unidad: " + valorunidad);
        System.out.println ("Estrato del inmueble: " + estrato);
        System.out.println ("Costo total:: " + costoParcial);
        System.out.println ("Descuento o sobrecosto: " + descuento);
        System.out.println ("Impuesto por infraestructura: " + impuesto);
        System.out.println ("TOTAL A PAGAR: " + costoTotal);
        System.out.println (" ");
    }
        
        

    


    }




