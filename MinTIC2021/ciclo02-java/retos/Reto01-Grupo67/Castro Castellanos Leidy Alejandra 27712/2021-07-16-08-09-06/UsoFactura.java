public class UsoFactura {
	public static void main (String argumentos[]) {
		Factura miFactura = new Factura ();

		while (true) {
			miFactura.mostrarMenu ();
			System.out.println ("Opción: ");
			int opcion = miFactura.leerOpcion ();
			double valorUnidadEnergia = 6200;
    		double valorUnidadAgua = 9256;
    		double valorUnidadGas = 5234;

			if (opcion == 1) {
				System.out.println ("Pago de Servicio de Energia");
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				double costoTotal = miFactura.calcularServicio (consumo, valorUnidadEnergia);
				double descuentoSobrecosto = miFactura.calcularDescuento (estrato, costoTotal);
				double impuesto = miFactura.calcularImpuesto (costoTotal);
				double totalaPagar = miFactura.calcularTotalaPagar (costoTotal, descuentoSobrecosto, impuesto);
				miFactura.mostrarResultados(); 
			}else if (opcion == 2) {
				System.out.println ("Pago de Servicio de Acueducto");
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				double costoTotal = miFactura.calcularServicio (consumo, valorUnidadAgua);
				double descuentoSobrecosto = miFactura.calcularDescuento (estrato, costoTotal);
				double impuesto = miFactura.calcularImpuesto (costoTotal);
				double totalaPagar = miFactura.calcularTotalaPagar (costoTotal, descuentoSobrecosto, impuesto);
				miFactura.mostrarResultados (); 
			}else if (opcion == 3) {
				System.out.println ("Pago de Servicio de Gas Natural");
				int estrato = miFactura.leerEstrato ();
				int consumo = miFactura.leerConsumo ();
				double costoTotal = miFactura.calcularServicio (consumo, valorUnidadGas);
				double descuentoSobrecosto = miFactura.calcularDescuento (estrato, costoTotal);
				double impuesto = miFactura.calcularImpuesto (costoTotal);
				double totalaPagar = miFactura.calcularTotalaPagar (costoTotal, descuentoSobrecosto, impuesto);
				miFactura.mostrarResultados (); 
			}else if (opcion == 4) {
				break;
			}
		}
		System.out.println ("Hasta pronto");
	}
}
