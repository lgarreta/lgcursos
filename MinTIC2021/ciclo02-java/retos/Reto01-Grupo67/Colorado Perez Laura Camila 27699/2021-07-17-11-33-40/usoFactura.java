public class usoFactura {
	public static void main (String argumentos[]) {
        factura mifactura;
        mifactura = new factura ();
        
        
        while (true) {
             mifactura.mostrarMenu ();
             int opcion = mifactura.leerOpcion();
             


            if (opcion == 1) {
				System.out.println ("Pago de Servicio de Energia");
				mifactura.leerDatos();
                mifactura.calcularServicioEnergia();
                mifactura.mostrarResultados();	
            }else if (opcion == 2){
                System.out.println ("Pago de Servicio de Acueducto");
				mifactura.leerDatos();
                mifactura.calcularServicioAgua();
                mifactura.mostrarResultados();
            }else if (opcion == 3){
                System.out.println ("Pago de Servicio de Gas Natural");
				mifactura.leerDatos();
                mifactura.calcularServicioGas();
                mifactura.mostrarResultados();
            }else if (opcion == 4) {
                break;
            }

				
        }
        System.out.println ("Hasta Pronto");
    }

}



