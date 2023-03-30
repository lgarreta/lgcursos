public class UsoServicios{

    public static void main (String [] args){
        Servicios factura = new Servicios ();
        boolean check = true;
        do{
            factura.mostrarMenu ();
            int seleccionar = factura.leerMenu ();
            switch (seleccionar){

                case 1: System.out.println ("Pago de Servicio de Energia");
                        int valorEnergia = 1;
                        int estratoEnergia = factura.leerEstrato();
                        int consumoEnergia = factura.leerConsumo ();
                        factura.costoTotal(consumoEnergia, valorEnergia);
                        factura.descuentoServicios (estratoEnergia);
                        factura.impuesto();
                        factura.pagoServicios (estratoEnergia);
                        factura.mostrarPagoServicios (consumoEnergia, estratoEnergia);
                        break;

                case 2: System.out.println ("Pago de Servicio de Acueducto");
                        int valorAcueducto = 2;
                        int estratoAcueducto = factura.leerEstrato();
                        int consumoAcueducto = factura.leerConsumo ();
                        factura.costoTotal (consumoAcueducto, valorAcueducto);
                        factura.descuentoServicios (estratoAcueducto);
                        factura.impuesto();
                        factura.pagoServicios (estratoAcueducto);
                        factura.mostrarPagoServicios (consumoAcueducto, estratoAcueducto);
                        break; 
                    
                    
                case 3: System.out.println ("Pago de servicio de Gas Natural");
                        int valorGas = 3;
                        int estratoGas = factura.leerEstrato();
                        int consumoGas = factura.leerConsumo ();
                        factura.costoTotal (consumoGas, valorGas);
                        factura.descuentoServicios (estratoGas);
                        factura.impuesto();
                        factura.pagoServicios (estratoGas);
                        factura.mostrarPagoServicios (consumoGas, estratoGas);
                        break;

                case 4: System.out.println ("Hasta Pronto");
                        check = false;
                        break;
                
                default: System.out.println ("Opción no valida, Elija otra opción");
            }
            
        }while (check);
    }
}