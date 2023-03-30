import java.util.Scanner;

public class usoFactura {
    
        //ATRIBUTOS
        Scanner opcionUsuario = new Scanner(System.in) ;
        int consumo = 0;
        int estrato = 0;
        double valorUnidad = 0;
        
        int valorUnidadEnergia = 6200;
        int valorUnidadAcueducto = 9256;
        int valorUnidadGas = 5234;
       
        double costoTotal = 0;
        double descuento = 0;
        double impuesto = 0;
        double valorTotal = 0;
        double valorPagar = 0; //  adicional

       /** public double usoFactura(){
            opcionUsuario = new Scanner (System.in);
            valorUnidadEnergia = 6200;
            valorUnidadAcueducto = 9256;
            valorUnidadGas = 5234; 
            valorTotal = valorUnidadEnergia * consumo;
            return valorTotal;
        } **/
        
        public void mostrarMenu() {       
            System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
            System.out.println ("Seleccione el servicio público:");
            System.out.println ("1. Energia");
            System.out.println ("2. Acueducto ");
            System.out.println ("3. Gas Natural");
            System.out.println ("4. Salir");  
            //System.out.println ("");
        }
    
        public int insertarNumero(){
            System.out.println("Opción:");
            int opcion  = opcionUsuario.nextInt();
            return (opcion);
        }
        
       
    
    
    
        public void leerDatos (){
            System.out.println("Estrato del inmueble: ");
            estrato = opcionUsuario.nextInt ();

            System.out.println("Consumo del inmueble: ");
            consumo = opcionUsuario.nextInt ();
        }
    
        public void calcularDescuento (){
            if (estrato == 1 || estrato == 2)
                descuento = -0.5*costoTotal;
            else if (estrato == 3 || estrato == 4)
                descuento = -0.1*costoTotal;
            else if (estrato == 5 || estrato == 6)
                descuento = 0.25 * costoTotal;
        }
    
        public void calcularImpuesto (){
            impuesto = 0.01 * costoTotal;        
        }
        
        public void calcularValorPagar() {
            valorPagar = costoTotal + impuesto + descuento;
        }
        
        public void calcularAcueducto (){
            valorUnidad = valorUnidadAcueducto;
            costoTotal = consumo*valorUnidad;
            calcularDescuento();
            calcularImpuesto();
            calcularValorPagar();
        }
    
        public void calcularEnergia (){
            valorUnidad = valorUnidadEnergia;
            costoTotal = consumo*valorUnidad;
            calcularDescuento();
            calcularImpuesto();
            calcularValorPagar();
        }
    
        public void calcularGas (){
            valorUnidad = valorUnidadGas;
            costoTotal = consumo*valorUnidad;
            calcularDescuento();
            calcularImpuesto();
            calcularValorPagar();
        }
        
        public void setmostrarResultados () {
            System.out.println ("El consumo fue: " + consumo);
            System.out.println ("Valor unidad: " + valorUnidad);
            System.out.println ("Estrato del inmueble: " + estrato);
            System.out.println ("Costo total: " + costoTotal);
            System.out.println ("Descuento o sobrecosto: " + descuento);
            System.out.println ("Impuesto por infraestructura: " + impuesto);
            System.out.println ("TOTAL A PAGAR: " + valorPagar);
            System.out.println ("");  
          
        }
        
       


        
}

    

    
        
       

   

        
    

    
 
    
    
    
    
    
   
    
  
    

