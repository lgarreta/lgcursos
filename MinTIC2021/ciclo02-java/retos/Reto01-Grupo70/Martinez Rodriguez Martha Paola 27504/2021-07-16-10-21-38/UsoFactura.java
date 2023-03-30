public class UsoFactura {
	public static void main (String argumentos[]) {
		Factura miFactura;
		miFactura = new Factura ();
        


		while (true) {
			miFactura.mostrarMenu ();
			int opcion = miFactura.leerOpcion ();
            int kilovattEnergia = 6200;
            int mcubicoAcueducto = 9256;
            int mcubicoGas = 5234;
			if (opcion == 1) {
 				System.out.println ("Pago de servicio de Energia"); 
 				int estrato = miFactura.leerEstrato ();
                int consumo = miFactura.leerConsumo ();
                double valorUnitario = miFactura.asignarValorUnitario (kilovattEnergia);
                double costoTotal = miFactura.calcularCostoTotal ();
                double descuentoSobrecosto = miFactura.calcularDescuentoSobrecosto ();
                double impuesto = miFactura.calcularImpuesto ();
                double totalPagar = miFactura.totalPagarFactura ();
                miFactura.mostrarResultados ();
                System.out.println ("\n");    
			}else if (opcion == 2) {
                System.out.println ("Pago de servicio de acueducto");
                int estrato = miFactura.leerEstrato ();
                int consumo = miFactura.leerConsumo ();
                double valorUnitario = miFactura.asignarValorUnitario (mcubicoAcueducto);
                double costoTotal = miFactura.calcularCostoTotal ();
                double descuentoSobrecosto = miFactura.calcularDescuentoSobrecosto ();
                double impuesto = miFactura.calcularImpuesto ();
                double totalPagar = miFactura.totalPagarFactura ();
				miFactura.mostrarResultados ();
                System.out.println ("\n");    
			}else if (opcion == 3) {
                System.out.println ("Pago de servicio de gas natural");
                int estrato = miFactura.leerEstrato ();
                int consumo = miFactura.leerConsumo ();
                double valorUnitario = miFactura.asignarValorUnitario (mcubicoGas);
                double costoTotal = miFactura.calcularCostoTotal ();
                double descuentoSobrecosto = miFactura.calcularDescuentoSobrecosto ();
                double impuesto = miFactura.calcularImpuesto ();
                double totalPagar = miFactura.totalPagarFactura ();
                miFactura.mostrarResultados ();
                System.out.println ("\n");    
			}else if (opcion == 4) {
				break;
			}
		}
		System.out.println ("Hasta pronto");
	}
}