public class UsoFactura {
    public static void main(String[] args) {
        Factura miFactura;
        miFactura = new Factura ();

        while (true) {
            miFactura.imprimirMenu();
            int opcion = miFactura.leerOpcion();
            
            if (opcion == 1) {
                System.out.println("pago de servicio de Energia");
                int estrato = miFactura.leerEstrato();
                int consumo = miFactura.leerConsumo();
                double pagoTotal = miFactura.calculoPagoEnergia(consumo, estrato);
                miFactura.imprimirResultados();
            }

            else if (opcion == 2) {
                System.out.println("pago de servicio de Acueducto");
                int estrato = miFactura.leerEstrato();
                int consumo = miFactura.leerConsumo();
                double pagoTotal = miFactura.calculoPagoAgua(consumo, estrato);
                miFactura.imprimirResultados();
            }
            else if (opcion == 3) {
                System.out.println("pago de servicio de Gas Natural");
                int estrato = miFactura.leerEstrato();
                int consumo = miFactura.leerConsumo();
                double pagoTotal = miFactura.calculoPagoGas(consumo, estrato);
                miFactura.imprimirResultados();

            }    
            else if (opcion == 4) {
                System.out.println("Hasta pronto");
                break;
            }
        
        }
        
    }            
}            
            

        
     

