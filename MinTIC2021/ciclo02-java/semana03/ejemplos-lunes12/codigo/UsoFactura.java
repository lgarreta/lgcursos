public class UsoFactura {
	public static void main (String argumentos[]) {
		Factura miFactura;
		miFactura = new Factura ();

		while (true) {
			miFactura.mostrarMenu ();
			int opcion = miFactura.leerOpcion ();

			if (opcion == 1) {
				System.out.println ("Liquidando agua...");
				int consumo = miFactura.leerConsumo ();
				int estrato = miFactura.leerEstrato ();
				double costoTotal = miFactura.calcularPagoAgua (consumo, estrato);
				miFactura.mostrarResultado (costoTotal);
			}else if (opcion == 2) {
				System.out.println ("Liquidando gas...");
				int consumo = miFactura.leerConsumo ();
				int estrato = miFactura.leerEstrato ();
				double costoTotal = miFactura.calcularPagoGas (consumo, estrato);
				miFactura.mostrarResultado (costoTotal);
			}else if (opcion == 3) {
				System.out.println ("Liquidando energia...");
				int consumo = miFactura.leerConsumo ();
				int estrato = miFactura.leerEstrato ();
				double costoTotal = miFactura.calcularPagoEnergia (consumo, estrato);
				miFactura.mostrarResultado (costoTotal);
			}else if (opcion == 4) {
				break;
			}
		}
		System.out.println ("Adios...");
	}
}
