import java.util.Scanner;
public class FacturaServicios {
    int estrato;
    int consumo;
    double valorUnidadGas;
    double valorUnidadAgua;
    double valorUnidadEnergia;
    double valorUnidad;
    double valorConsumo;
    double DescuentoSobrecosto;
    double impuestoDanos;
    double totalNeto;
    Scanner lector;
    int opcion;
    int numeroDeOpcion;

    public FacturaServicios ()  {
        
        valorUnidadGas = 5234;
        valorUnidadAgua = 9256;
        valorUnidadEnergia = 6200;
        lector = new Scanner (System.in);
        opcion=0;

    }
    public void listarMenu () {
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público: ");
        System.out.println ("1. Energia ");
        System.out.println ("2. Acueducto ");
        System.out.println ("3. Gas Natural ");
        System.out.println ("4. Salir ");    
    }
    public double calculoEstrato () {

        if (estrato==1 || estrato==2 ) {
            
            DescuentoSobrecosto= valorConsumo*-0.5;    
        }
        else if (estrato==3 || estrato==4 ) {
            
            DescuentoSobrecosto= valorConsumo*-0.1;
        }
        else if (estrato==5 || estrato==6 ) {
            
            DescuentoSobrecosto= valorConsumo*0.25;
        }
        return (DescuentoSobrecosto);
        
    }
    
    public double calculoImpuesto () {
        impuestoDanos = valorConsumo*0.01;
        return (impuestoDanos);
    }
    public double calculoValorTotal () {
        totalNeto = (valorConsumo+impuestoDanos)+DescuentoSobrecosto;
        return (totalNeto);
        }

    public void elegirOpcion () {  
        System.out.println ("Opción: ");
        opcion = lector.nextInt ();
    }
    public int numeroOpcion () {
        numeroDeOpcion= opcion;
        return (numeroDeOpcion); 
    }
    
    public void calculoConsumo () {
        switch (opcion) {
           
            case 1 :
            System.out.println ("Pago de Servicio de Energia");
            System.out.println ("Estrato del inmueble: ");
            estrato = lector.nextInt ();
            System.out.println ("Consumo del inmueble: ");
            consumo = lector.nextInt();
            valorUnidad = valorUnidadEnergia;
            valorConsumo = valorUnidadEnergia*consumo;
        
            break;

            case 2 : 
            System.out.println ("Pago de Servicio de Acueducto");
            System.out.println ("Estrato del inmueble: ");
            estrato = lector.nextInt ();
            System.out.println ("Consumo del inmueble: ");
            consumo = lector.nextInt();
            valorUnidad = valorUnidadAgua; 
            valorConsumo = valorUnidadAgua*consumo;
            
            
            break;

            case 3 :
            System.out.println ("Pago de Servicio de Gas Natural");
            System.out.println ("Estrato del inmueble: ");
            estrato = lector.nextInt ();
            System.out.println ("Consumo del inmueble: ");
            consumo = lector.nextInt(); 
            valorUnidad = valorUnidadGas;
            valorConsumo = valorUnidadGas*consumo;
            
            break;

            case 4 : 
            break;

            default : System.out.println ("error");
    }
    } 
    public void imprimirFactura() {
        System.out.println ("El consumo fue: "+consumo);
        System.out.println ("Valor unidad: "+valorUnidad);
        System.out.println ("Estrato del inmueble: "+estrato);
        System.out.println ("Costo total: "+valorConsumo);
        System.out.println ("Descuento o sobrecosto: "+DescuentoSobrecosto);
        System.out.println ("Impuesto por infraestructura: "+impuestoDanos);
        System.out.println ("TOTAL A PAGAR: "+totalNeto);
        System.out.println ("");
      
    }
    
    public static void main (String argumentos[]) {
        FacturaServicios Servicio;
        Servicio = new FacturaServicios ();
        

        while (true) {
            Servicio.listarMenu();
            Servicio.elegirOpcion ();
            int opcion= Servicio.numeroOpcion ();
    
            if (opcion!=4) {
                
                Servicio.calculoConsumo();
                Servicio.calculoEstrato ();
                Servicio.calculoImpuesto ();
                Servicio.calculoValorTotal ();
                Servicio.imprimirFactura();
              
            }
           
            else if (opcion==4) {
                System.out.println ("Hasta pronto");
                break;
            } 
            
        }          
       
    }
    
}

   