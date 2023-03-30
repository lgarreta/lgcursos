/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alejo
 */
public class UsoFactura {
    public static void main (String argumentos[]) {
		int opcion=0;
                Factura miFactura;
		miFactura = new Factura();
                while (opcion!=4) {
                    miFactura.menu ();
                    opcion = miFactura.leerOpcion();
                    switch(opcion){
        case 1: 
            System.out.println("Pago de Servicio de Energia");
            miFactura.leerDatos ();
            double valorEnergia=6200;
            miFactura.calcularCosto (valorEnergia);
            miFactura.mostrarResultados ();
            break;

        case 2:
            System.out.println("Pago de Servicio de Acueducto");
            miFactura.leerDatos ();
            int valorAgua=9256;
            miFactura.calcularCosto (valorAgua);
            miFactura.mostrarResultados ();
            break;

        case 3:
            System.out.println("Pago de Servicio de Gas Natural");
            miFactura.leerDatos ();
            int valorGas=5234;
            miFactura.calcularCosto (valorGas);
            miFactura.mostrarResultados ();
            break;
        case 4:
            System.out.println("Hasta pronto");
      }

                    
                    
                    
                    
                    
     }
}
}