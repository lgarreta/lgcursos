import java.util.Scanner;

public class Servicios{

    int energia;
    int acueducto;
    int gas;
    double valorUnidad;
    double costo_total;
    double descuentoS;
    double impuesto;
    double total_a_pagar;
    Scanner lector;

        public Servicios(){
            energia = 6200;
            acueducto = 9256;
            gas = 5234;
            valorUnidad = 0.0;
            costo_total = 0.0;
            descuentoS = 0.0;
            impuesto = 0.0;
            total_a_pagar = 0.0;
            lector = new Scanner (System.in);
        }
        
        public void mostrarMenu(){

            System.out.println ("\nPAGO DE SERVICIOS PÚBLICOS \nSeleccione el servicio público: ");
            System.out.println ("1. Energia");
            System.out.println ("2. Acueducto");
            System.out.println ("3. Gas Natural");
            System.out.println ("4. Salir");
        }

        public int leerMenu(){

            System.out.println("Opción: ");
            int seleccionar = lector.nextInt();

            return (seleccionar);
        }

        public int leerEstrato(){

            System.out.println ("Estrato del inmueble: ");
            int Estratoin = lector.nextInt ();

            return (Estratoin);
        }

        public int leerConsumo(){
         
            System.out.println ("Consumo del inmueble: ");
            int Consumoin = lector.nextInt();

            return (Consumoin);
        }

        public void costoTotal(int consumo, int value){

            if (value ==1){
                valorUnidad = energia;
                costo_total = valorUnidad*consumo;
            }
            else if (value == 2){
                valorUnidad = acueducto;
                costo_total = valorUnidad*consumo;
            }
            else if (value == 3){
                valorUnidad = gas;
                costo_total = valorUnidad*consumo;
            }
        }

        public void descuentoServicios (int estrato){

            if (estrato == 1 || estrato == 2){
                descuentoS = costo_total*0.5*-1;
            }
            else if (estrato == 3 || estrato == 4){
                descuentoS = costo_total*0.10*-1;
            }
            else if (estrato == 5 || estrato == 6){
                descuentoS = costo_total*0.25;
            }
        }

        public void impuesto (){

            impuesto = costo_total*0.01;
        }

        public void pagoServicios (int estrato){

            if (estrato == 1 || estrato == 2 || estrato ==3 || estrato == 4){

                total_a_pagar = costo_total + descuentoS + impuesto;
            }
        else if (estrato == 5 || estrato == 6){
            total_a_pagar = costo_total + descuentoS + impuesto;
        }

    }

    public void mostrarPagoServicios (int consumo, int estrato){

     
            System.out.println ("El consumo fue: " + consumo);
            System.out.println ("Valor unidad: " + valorUnidad);
            System.out.println ("Estrato del inmueble: " + estrato);
            System.out.println ("Costo total: " + costo_total);
            System.out.println ("Descuento o sobrecosto: " + descuentoS);
            System.out.println ("Impuesto por infraestructura: " + impuesto);
            System.out.println ("TOTAL A PAGAR: " + total_a_pagar);
   
    }

}
