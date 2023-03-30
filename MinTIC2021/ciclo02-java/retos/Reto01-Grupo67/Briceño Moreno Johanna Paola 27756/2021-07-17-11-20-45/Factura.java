import java.util.Scanner;
public class Factura {

    public static void main(String[] args) {
       
        usoFactura miFactura = new usoFactura();
        Scanner opcionUsuario;
       
        boolean salida = true;
        while(salida){
            miFactura.mostrarMenu();
            int opcion = miFactura.insertarNumero();
            
            /**if(opcion == 1){
                System.out.println("Pago de Servicio de Energia ");
                miFactura.leerDatos();
                miFactura.calcularEnergia();
                miFactura.setmostrarResultados();
            }
            else if(opcion == 2){
                System.out.println("Pago de Servicio de acueducto ");
                miFactura.leerDatos();
                miFactura.calcularAcueducto();
                miFactura.setmostrarResultados();
            }
            else if(opcion == 3){
                System.out.println("Pago de Servicio de Gas Natural ");
                miFactura.leerDatos();
                miFactura.calcularGas();
                miFactura.setmostrarResultados();
            }
            else if(opcion == 4){
                break;
            } **/
            
        switch (opcion){
            case 1: 
                System.out.println("Pago de Servicio de Energia ");
                miFactura.leerDatos();
                miFactura.calcularEnergia();
                miFactura.setmostrarResultados();
                break;
            case 2:
                System.out.println("Pago de Servicio de acueducto ");
                miFactura.leerDatos();
                miFactura.calcularAcueducto();
                miFactura.setmostrarResultados();
                break;
            case 3:
                System.out.println("Pago de Servicio de Gas Natural ");
                miFactura.leerDatos();
                miFactura.calcularGas();
                miFactura.setmostrarResultados();
                break;
            case 4:
                salida = false;
                break;
            default:
                System.out.println("Solo números entre 1 y 4");
        }   
                     
        }
        
        System.out.println("Hasta pronto");
    }
} 

       
  
        