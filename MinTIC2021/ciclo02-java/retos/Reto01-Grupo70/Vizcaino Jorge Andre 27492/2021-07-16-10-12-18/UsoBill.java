public class UsoBill{

    public static void main(String [] args) {
        Bill factura = new Bill ();
        boolean check= true;
        do{
            factura.showMenu ();
            int selec = factura.leerMenu();
            switch (selec){

                case 1: System.out.println ("Pago de Servicio de Energia");
                        int valorE = 1;
                        int estraElec=factura.leerEstrato();
                        int consuElec=factura.leerConsumo();
                        factura.costoServicios(consuElec, valorE);
                        factura.descuentoServicios(estraElec);
                        factura.impuesto();
                        factura.pagoServicios(estraElec);
                        factura.showPagoServicios(consuElec, estraElec);
                        break;
                
                case 2: System.out.println ("Pago de Servicio de Acueducto");
                        int valorA = 2;
                        int estra=factura.leerEstrato();
                        int consu=factura.leerConsumo();
                        factura.costoServicios(consu, valorA);
                        factura.descuentoServicios(estra);
                        factura.impuesto();
                        factura.pagoServicios(estra);
                        factura.showPagoServicios(consu, estra);
                        break;
        

                case 3: System.out.println ("Pago de servicio de Gas Natural");
                        int valorG = 3;
                        int estraGas=factura.leerEstrato();
                        int consuGas=factura.leerConsumo();
                        factura.costoServicios(consuGas, valorG);
                        factura.descuentoServicios(estraGas);
                        factura.impuesto();
                        factura.pagoServicios(estraGas);
                        factura.showPagoServicios(consuGas, estraGas);
                        break;
                
                case 4: System.out.println("Hasta pronto");
                        check=false;
                        break;

                default: System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }while(check);
        
    }
}