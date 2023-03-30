public class UsarServiciosPublicos {
    public static void main (String arg[]){
        ServiciosPublicos miFactura;
        miFactura = new ServiciosPublicos();

        while(true){
            miFactura.mostrarMenu();
            int opcion=miFactura.leerOpcion();
            

            if (opcion==1){
                System.out.println("Pago de servicio de Energia");
                miFactura.leerDatos();
                int valorUnidadServicio=6200;
                miFactura.calcularEnergia(valorUnidadServicio);
            } 

            else if (opcion==2){
                System.out.println("Pago de servicio de Acueducto");
                miFactura.leerDatos();
                int valorUnidadServicio=9256;
                miFactura.calcularAcueducto(valorUnidadServicio);
                
            }
            else if (opcion==3){
                System.out.println("Pago de servicio de Gas natural");
                miFactura.leerDatos();
                int valorUnidadServicio=5234;
                miFactura.calcularGas(valorUnidadServicio);
            }

            else if (opcion==4){
                System.out.println("Hasta pronto");
                break;
            }

            miFactura.mostrarTotales();

        }
                   
                   
        
      

                
        }
    }
    

