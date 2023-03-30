public class UsoFactura {
    public static void main (string argumentos[]){
        Factura = miFactura;
        Factura = new Factura ();
        while (true) {
        miFactura.mostrarmenu ();
        int opcion = miFactura.leeropcion();
        
         switch (opcion){
            case 1:
              system.out.println ("pago de servicio de enegia ");
              miFactura.leerdatos ();
              miFactura.calculodeenergia ();
              miFactura.mostrarResultados ();
              system.out.println  ("");
              break;
            
            case 2:
              system.out.println ("pago de servicio de acueducto");
              miFactura.leerdatos ();
              miFactura.calculovaloragua ();
              miFactura.mostrarResultados ();
              system.out.println  ("");
              break;
            
            case 3 :
              system.out.println ("pago de gas natural");
              miFactura.leerdatos ();
              miFactura.calculovalorgas ();
              miFactura.mostrarResultados ();
              system.out.println ("");
              break;
        
            case 4: 
              system.out.println ("Hasta pronto");
              system.exit (0);
              break;
            default:
              system.out.println ("opcion invalida");
        
         }
       
            
        }
    }
}