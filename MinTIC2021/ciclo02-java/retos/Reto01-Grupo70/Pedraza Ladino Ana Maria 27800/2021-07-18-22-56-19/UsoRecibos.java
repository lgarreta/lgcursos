public class UsoRecibos{

    public static void main(String [] args) {
        Recibos factura = new Recibos ();
        boolean check= true;
        do{
            factura.mostrar_Menu ();
            int elegir = factura.leer_Menu();
            switch (elegir){

                case 1: System.out.println ("Pago de Servicio de Energia");
                        int valor_Luz =1;
                        int estrato_luz=factura.leer_Estrato();
                        int consumo_Luz=factura.leer_Consumo();
                        factura.costo_Servicios(consumo_Luz, valor_Luz);
                        factura.descuento_Servicios(estrato_luz);
                        factura.impuesto();
                        factura.Pago_Servicios(estrato_luz);
                        factura.mostrar_PagoServicios(consumo_Luz, estrato_luz);
                        break;

                case 2: System.out.println ("Pago de Servicio de Acueducto");
                        int valorAcueducto =2;
                        int estrato_Acueducto=factura.leer_Estrato();
                        int consumo_Acueducto=factura.leer_Consumo();
                        factura.costo_Servicios(consumo_Acueducto, valorAcueducto);
                        factura.descuento_Servicios(estrato_Acueducto);
                        factura.impuesto();
                        factura.Pago_Servicios(estrato_Acueducto);
                        factura.mostrar_PagoServicios(consumo_Acueducto, estrato_Acueducto);
                        break;   


                case 3: System.out.println ("Pago de Servicio de Gas Natural");
                        int valorGas =3;
                        int estrato_Gas=factura.leer_Estrato();
                        int consumo_Gas=factura.leer_Consumo();
                        factura.costo_Servicios(consumo_Gas, valorGas);
                        factura.descuento_Servicios (estrato_Gas);
                        factura.impuesto();
                        factura.Pago_Servicios (estrato_Gas);
                        factura.mostrar_PagoServicios (consumo_Gas, estrato_Gas);
                        break; 

                case 4: System.out.println("hasta pronto");
                        check=false;
                        break;

                default: System.out.println("Elija una opcion del menu");     
            }
        }while (check);   
    }
}    
    