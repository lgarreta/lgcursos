public class UsoFactura {
    public static void main (String argumentos[]) {
        FactServic miFactura;
        miFactura = new  FactServic ();

        while (true) {
            miFactura.mostrarMenu ();
            int opcion = miFactura.leerOpcion();
            if(opcion==1){
               System.out.println("Pago de Servicio de Energia ");  
               miFactura.leerDatos();
               miFactura.calcularPagoEnergia();
               miFactura.mostrarResultado();
               System.out.println("");
            }
               else if(opcion==2){
               System.out.println("Pago de Servicio de Acueducto ");  
               miFactura.leerDatos();
               miFactura.calcularPagoAgua();
               miFactura.mostrarResultado();
               System.out.println("");
            } else if(opcion==3){
               System.out.println("Pago de Servicio de Gas Natural ");  
               miFactura.leerDatos();
               miFactura.calcularPagoGas();
               miFactura.mostrarResultado();
               System.out.println("");
            }else if(opcion==4){
                break;
            }
        }
        System.out.println("Hasta pronto:");


    }
}