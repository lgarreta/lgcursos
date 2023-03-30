public class UsoFactura {
    public static void main(String[] args) {
        Factura miFactura;

        miFactura = new Factura ();

        while (true){
            miFactura.mostrarMenu();
            int opcion = miFactura.leerOpcion ();
            
            
            
            

        switch (opcion) {
            case 1:
                System.out.println("Pago de Servicio de Energia");
                miFactura.leerDatos(); 
                miFactura.calcularPagoEnergia();
                miFactura.mostrarResultados ();
                break;               
            case 2:
                System.out.println("Pago de Servicio de acueducto");
                miFactura.leerDatos(); 
                miFactura.calcularPagoAgua();
                miFactura.mostrarResultados ();
                break;
            case 3:
                System.out.println("Pago de Servicio de Gas Natural");
                miFactura.leerDatos(); 
                miFactura.calcularPagoGas();
                miFactura.mostrarResultados ();
                break;
            case 4:
                System.out.println("Hasta pronto");
                System.exit(0);
                break;
            default:
            System.out.println("Opción inválida");
        }
    
                     
    }
    
    
           
    }
    
}
