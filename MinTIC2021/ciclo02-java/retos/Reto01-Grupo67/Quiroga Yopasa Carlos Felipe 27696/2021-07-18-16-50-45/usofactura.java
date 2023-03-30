public class usofactura{
    public static void main (String argumentos[]) {
        Factura miFactura ;
        miFactura= new Factura ();

        while (true) {
			miFactura.mostrarMenu ();
			int opcion = miFactura.leerOpcion ();

			if (opcion == 1) {
				System.out.println("Pago de Servicio de Energia");
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				
				double costoTotal = miFactura.calcularPagoEnergia (consumo, estrato);
				miFactura.mostrarResultado (costoTotal, consumo, estrato);
			}else if (opcion == 2) {
				System.out.println("Pago de Servicio de Acueducto");
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				
				double costoTotal = miFactura.calcularPagoAgua (consumo, estrato);
				miFactura.mostrarResultado (costoTotal, consumo, estrato);
			}else if (opcion == 3) {
				System.out.println("Pago de Servicio de Gas Natural");
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				
				double costoTotal = miFactura.calcularPagoGas (consumo, estrato);
				miFactura.mostrarResultado (costoTotal, consumo, estrato);
			}else if (opcion == 4) {
				break;
			}
		}
		System.out.println ("Hasta pronto");
	}
    

}