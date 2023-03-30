public class usoFactura {
    public static void main (String argumentos[]) {
        Factura miFactura;
        miFactura = new Factura ();

        while (true){
            miFactura.mostrarMenu ();
            int opcion = miFactura.leerOpcion ();
            
            if (opcion == 1){
                    System.out.println ("Pago de Servicio de Energia");
                    miFactura.leerDatos ();
                    miFactura.calcularPagoEnergia ();
                    miFactura.mostrarResultados ();
                    System.out.println ("");
            }else if (opcion == 2){
                    System.out.println ("Pago de Servicio de acueducto");
                    miFactura.leerDatos ();
                    miFactura.calcularPagoAgua ();
                    miFactura.mostrarResultados ();
                    System.out.println ("");
            }else if (opcion == 3){
                    System.out.println ("Pago de Servicio de Gas Natural");
                    miFactura.leerDatos ();
                    miFactura.calcularPagoGas ();
                    miFactura.mostrarResultados ();
                    System.out.println ("");
            }else if (opcion == 4){
                    break;
            }
        }
        System.out.println ("Hasta pronto");
        
    }
}