public class FacturaControlador {

    private final VistaConsola vistaConsola;

    public FacturaControlador() {
        this.vistaConsola = new VistaConsola();
        this.calcular();
    }

    private void calcular() {
        Factura factura;
        int estrato;
        int consumo;
        Object[] respuesta;
        int opcion;

        do {
            opcion = this.vistaConsola.mostrarMenu();

            switch (opcion) {
                case 2:
                    System.out.println("Pago de Servicio de Acueducto");
                    estrato = vistaConsola.preguntarEstrato();
                    consumo = vistaConsola.preguntarConsumo();
                    factura = new Factura(estrato, consumo);
                    factura.calcularTotalSinDescuento(opcion);
                    respuesta = new Object[]{consumo, (double) factura.VALOR_UNITARIO_AGUA, estrato, factura.getPrecioServicioPagar(), factura.getDescuento(), factura.calcularImpuesto(), factura.getPrecioServicioPagar()};
                    
                    vistaConsola.mostrarValorPagar(respuesta);
                    break;
                case 3:
                    System.out.println("Pago de Servicio de Gas Natural");
                    estrato = vistaConsola.preguntarEstrato();
                    consumo = vistaConsola.preguntarConsumo();
                    factura = new Factura(estrato, consumo);
                    factura.calcularTotalSinDescuento(opcion);
                    respuesta = new Object[]{consumo, (double) factura.VALOR_UNITARIO_GAS, estrato, factura.getPrecioServicioPagar(), factura.getDescuento(), factura.calcularImpuesto(), factura.getPrecioServicioPagar()};
                    
                    vistaConsola.mostrarValorPagar(respuesta);
                    break;
                case 1:
                    System.out.println("Pago de Servicio de Energia");
                    estrato = vistaConsola.preguntarEstrato();
                    consumo = vistaConsola.preguntarConsumo();
                    factura = new Factura(estrato, consumo);
                    factura.calcularTotalSinDescuento(opcion);
                    respuesta = new Object[]{consumo, (double) factura.VALOR_UNITARIO_LUZ, estrato, factura.getPrecioServicioPagar(), factura.getDescuento(), factura.calcularImpuesto(), factura.getPrecioServicioPagar()};
                    
                    vistaConsola.mostrarValorPagar(respuesta);
                    break;
                default:
                    System.out.println("Hasta pronto");
                    break;
            }
        } while (opcion != 4);
    }
    
    public static void main(String[] args) {
        FacturaControlador facturaControlador = new FacturaControlador();
    }
}
