public class UsoFactura {
	public static void main (String argumentos[]) {
		Factura miFactura;
		miFactura = new Factura ();

		while (true) {
			miFactura.mostrarMenu ();
			int opcion = miFactura.leerOpcion ();

			if (opcion == 1) {
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				double costoTotal = miFactura.calcularPagoEnergia (consumo, estrato);
				miFactura.mostrarResultados ();
			}else if (opcion == 2) {
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				double costoTotal = miFactura.calcularPagoAgua (consumo, estrato);
				miFactura.mostrarResultados ();
			}else if (opcion == 3) {
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				double costoTotal = miFactura.calcularPagoGas (consumo, estrato);
				miFactura.mostrarResultados ();
			}else if (opcion == 4) {
				break;
			}
		}
	}
}
