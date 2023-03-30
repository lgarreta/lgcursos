public class UsoProgramaReto2 {
    public static void main (String args []){
        ProgramaReto2 factura;   
        factura = new ProgramaReto2 ();
        int estratoFactura,consumoFactura;
        double unidad,costo,valorDescuento,impuestoInfraestructura,valorTotal;   
        
    while(true){
        factura.mostrarMenu();
        int opcion = factura.leerOpcion();
        switch(opcion){
            case 1:
                unidad = factura.valorUnidad(opcion);
                estratoFactura = factura.leerEstrato();
                consumoFactura = factura.leerConsumo();
                costo = factura.calcularFactura(consumoFactura,unidad);
                valorDescuento = factura.calcularDescuento(estratoFactura, costo);
                impuestoInfraestructura = factura.calcularImpuesto(costo);
                valorTotal= factura.calcularValorTotal(costo,valorDescuento,impuestoInfraestructura);
                factura.mostrarResultados(); 
                break;
            case 2:
                unidad = factura.valorUnidad(opcion);
                estratoFactura = factura.leerEstrato();
                consumoFactura = factura.leerConsumo();
                costo = factura.calcularFactura(consumoFactura,unidad);
                valorDescuento = factura.calcularDescuento(estratoFactura, costo);
                impuestoInfraestructura = factura.calcularImpuesto(costo);
                valorTotal= factura.calcularValorTotal(costo,valorDescuento,impuestoInfraestructura);
                factura.mostrarResultados();
                break;
            case 3:
                unidad = factura.valorUnidad(opcion);
                estratoFactura = factura.leerEstrato();
                consumoFactura = factura.leerConsumo();
                costo = factura.calcularFactura(consumoFactura,unidad);
                valorDescuento = factura.calcularDescuento(estratoFactura, costo);
                impuestoInfraestructura = factura.calcularImpuesto(costo);
                valorTotal= factura.calcularValorTotal(costo,valorDescuento,impuestoInfraestructura);
                factura.mostrarResultados();   
                break;
            case 4:
                System.out.println("Hasta pronto");
                System.exit(0);
                break;
        }
    }
}
}
