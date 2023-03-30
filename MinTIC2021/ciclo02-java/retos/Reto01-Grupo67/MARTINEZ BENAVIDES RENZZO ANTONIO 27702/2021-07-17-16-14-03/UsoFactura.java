import java.util.Scanner;

public class UsoFactura{
  public static void main(String args[]){
   
   Factura miFactura; 
   miFactura = new Factura ();
   boolean salir = false;
   do {
      miFactura.mostrarMenu ();
      int opcion = miFactura.leerOpcion ();
      switch(opcion){
        case 1:
            if (opcion == 1)
              System.out.println("Pago de Servicio de Energia");
              miFactura.leerDatos ();
              miFactura.calcularPagoEnergia ();
              miFactura.mostrarResultados ();
              System.out.println ("");
              break;
        case 2:
            if (opcion == 2) 
              System.out.println("Pago de Servicio de Acueducto");
              miFactura.leerDatos ();
              miFactura.calcularPagoAcueducto ();
              miFactura.mostrarResultados ();
              System.out.println ("");
              break;
        case 3:
            if (opcion == 3) 
              System.out.println("Pago de Servicio de Gas Natural");
              miFactura.leerDatos ();
              miFactura.calcularPagoGas ();
              miFactura.mostrarResultados ();
              System.out.println ("");
              break;
        case 4:
            if (opcion == 4) 
              System.out.println("Hasta pronto");
              salir = true;
              break;
      }

     } while (!salir);
  }
}