public class UsoFactura {
		public static void main (String argumentos[]) {
		Factura miFactura;
		miFactura = new Factura ();

		while (true) {
			miFactura.mostrarMenu ();
			int opcion = miFactura.leerOpcion ();

			if (opcion == 1) {
				System.out.println ("Pago de Servicio de Energia");
				miFactura.leerDatos();
				miFactura.calculoPagoEnergia ();
				miFactura.mostrarResultados();
			}
			else if (opcion == 2) {
				System.out.println ("Pago de Servicio de Acueducto");
				miFactura.leerDatos();
				miFactura.calculoPagoAgua ();
				miFactura.mostrarResultados();
			}else if (opcion == 3) {
				System.out.println ("Pago de Servicio de Gas Natural");
				miFactura.leerDatos();
				miFactura.calculoPagoGas ();
				miFactura.mostrarResultados();
			}else if (opcion == 4) {
				break;
			}
		}
		System.out.println ("Hasta pronto");
	}
}
