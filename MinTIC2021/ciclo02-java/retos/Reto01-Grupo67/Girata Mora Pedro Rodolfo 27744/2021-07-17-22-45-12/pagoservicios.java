import java.util.InputMismatchException;
import java.util.Scanner;
public class pagoservicios
{
    
    int estrato;
    int consumo;
    double valorUnidad;
    double descuento;
    double valor_parcial;
    double impuesto;
    double adescuento;
    double valorTotal;
	public static void main(String[] args) {
        pagoservicios pagar =  new pagoservicios();
        pagar.mostrarMenu();
	}
		public void mostrarMenu () {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;
 
        while (!salir) {
            System.out.println ("PAGO DE SERVICIOS PÚBLICOS"    );
            System.out.println ("Seleccione el servicio público");
            System.out.println ("1. Energia"    );
            System.out.println ("2. Acueducto"  );
            System.out.println ("3. Gas Natural");
            System.out.println ("4. Salir"      );
 
            try {
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        valorUnidad = 6200;
                        System.out.println("Opción:");
                        System.out.println("Pago de servicio de Energia");
                        System.out.println("Estrato del inmueble");
                        estrato = sn.nextInt();
                        System.out.println("Consumo del inmueble");
                        consumo = sn.nextInt();
                        valor_parcial = valor_sin_descuento(consumo,valorUnidad);
                        impuesto = valor_parcial*0.01;
                        adescuento = calculo_descuento(estrato,valor_parcial);
                        valorTotal= calcularValor(descuento,valor_parcial,impuesto);
                        mostrarResultados (consumo,valorUnidad,estrato,valor_parcial,descuento,impuesto,valorTotal);
                        break;
                    case 2:
                        valorUnidad = 9256;
                        System.out.println("Opción:");
                        System.out.println("Pago de servicio de acueducto");
                        System.out.println("Estrato del inmueble");
                        estrato = sn.nextInt();
                        System.out.println("Consumo del inmueble");
                        consumo = sn.nextInt();
                        valor_parcial = valor_sin_descuento(consumo,valorUnidad);
                        impuesto = valor_parcial*0.01;
                        adescuento = calculo_descuento(estrato,valor_parcial);
                        valorTotal= calcularValor(descuento,valor_parcial,impuesto);
                        mostrarResultados (consumo,valorUnidad,estrato,valor_parcial,descuento,impuesto,valorTotal);
                        break;
                    case 3:
                        valorUnidad = 5234;
                        System.out.println("Opción:");
                        System.out.println("Pago de Servicio de Gas Natural");
                        System.out.println("Estrato del inmueble");
                        estrato = sn.nextInt();
                        System.out.println("Consumo del inmueble");
                        consumo = sn.nextInt();
                        valor_parcial = valor_sin_descuento(consumo,valorUnidad);
                        impuesto = valor_parcial*0.01;
                        adescuento = calculo_descuento(estrato,valor_parcial);
                        valorTotal= calcularValor(descuento,valor_parcial,impuesto);
                        mostrarResultados (consumo,valorUnidad,estrato,valor_parcial,descuento,impuesto,valorTotal);
                        break;
                    case 4:
                        System.out.println("Opción:");
                        System.out.println("Hasta pronto");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
    public double valor_sin_descuento(int consumo, double valorUnidad){
        double valorFactura = consumo * valorUnidad;
        return valorFactura;
    }
    //Funcion para calcular el valor total para el pago del servicio
    public double calcularValor (double descuento, double valor_parcial,double impuesto){
        double Total = valor_parcial+descuento+impuesto;
        return Total;
    }
    //Funcion para calcular el valor total del descuento del servicio según el estrato
    public double calculo_descuento(int estrato, double valor_parcial){
        if(estrato==1||estrato==2){descuento = valor_parcial*-0.5;}
        if(estrato==3||estrato==4){descuento = valor_parcial*-0.1;}
        if(estrato==5||estrato==6){descuento = valor_parcial*0.25;}
        return descuento;
    }
    public void mostrarResultados (int consumo,double valorUnidad,int estrato,double valor_parcial,double descuento,double impuesto,double valorTotal) {
        System.out.println ("El consumo fue: " + consumo     );
        System.out.println ("Valor unidad: " + valorUnidad );
        System.out.println ("Estrato del inmueble: " + estrato     );
        System.out.println ("Costo total: " + valor_parcial);
        System.out.println ("Descuento o sobrecosto: " + descuento   );
        System.out.println ("Impuesto por infraestructura: " + impuesto    );
        System.out.println ("TOTAL A PAGAR: " + valorTotal  );
        System.out.println ("");
    }
}