
public class Factura {

    public static void main (String [] args){

        // objetos creados
        RetoFactura servicioPublico = new RetoFactura();

        //servicioPublico.menu ();  
        while (true){

            servicioPublico.verMenu();
            
            int opcion = servicioPublico.leerOpcion();
            
            switch (opcion) {
    
                case 1: 
                
                System.out.println ("Pago de servicio de Energia");
                servicioPublico.leerDatosTeclado();
                servicioPublico.calcularCostoTotal(6200);
                servicioPublico.calcularDescuento();
                servicioPublico.calcularImpuesto();
                servicioPublico.calcularTotalApagar();
                servicioPublico.mostrarDatosPantalla();
                System.out.println ("");
                break;

                case 2: 
                
                System.out.println ("Pago de servicio de Acueducto");
                servicioPublico.leerDatosTeclado();
                servicioPublico.calcularCostoTotal(9256);
                servicioPublico.calcularDescuento();
                servicioPublico.calcularImpuesto();
                servicioPublico.calcularTotalApagar();
                servicioPublico.mostrarDatosPantalla();
                System.out.println ("");
                break;

                case 3: 

                System.out.println ("Pago de servicio de Gas Natural");
                servicioPublico.leerDatosTeclado();
                servicioPublico.calcularCostoTotal(5234);
                servicioPublico.calcularDescuento();
                servicioPublico.calcularImpuesto();
                servicioPublico.calcularTotalApagar();
                servicioPublico.mostrarDatosPantalla();
                System.out.println ("");
                break;

                case 4: 

                System.out.println ("Hasta pronto");
                System.exit (0);
                
        
                default: 
                System.out.println ("Opción no valida");
                
            }  
                  
        }
        
    }

}

