import java.util.Scanner;

public class Recibos{

int agua;
int gas; 
int luz;
double valor_Unidad;
double costo_Total;
double descuento;
double impuesto;
double total;
Scanner lector;

    public Recibos(){
        agua = 9256;
        gas = 5234;
        luz = 6200;
        valor_Unidad= 0.0;
        costo_Total = 0.0;
        descuento = 0.0;
        impuesto= 0.0;
        total= 0.0;
        lector = new Scanner (System.in);
    }

    public void mostrar_Menu(){

        System.out.println ("\nPAGO DE SERVICIOS PÚBLICOS \nSeleccione el servicio público: ");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
    }

    public int leer_Menu(){

        System.out.println("Opción: ");
        int elegir = lector.nextInt();

        return (elegir);
    }

    public int leer_Estrato(){

        System.out.println("Estrato del inmueble:");
        int numero_Estrato = lector.nextInt();

        return (numero_Estrato);
    }

    public int leer_Consumo(){

        System.out.println("consumo del inmueble:");
        int consumo_Inmueble = lector.nextInt();

        return (consumo_Inmueble);
    }

    public void costo_Servicios(int consumo, int value){

        if (value== 1){
            valor_Unidad= luz;
            costo_Total=valor_Unidad*consumo;
        }
        else if (value ==2){
            valor_Unidad= agua;
            costo_Total=valor_Unidad*consumo;
        }
        else if (value ==3){
            valor_Unidad= gas;
            costo_Total=valor_Unidad*consumo;
        }
    }

    public void descuento_Servicios (int estrato){
        if (estrato ==1 || estrato==2){
            descuento = (-1)*(costo_Total*0.5);
        }
        else if (estrato ==3 || estrato==4){
            descuento = (-1)*(costo_Total*0.10);
        }
        else if (estrato ==5 || estrato==6){
            descuento = costo_Total*0.25;
        }
    }

    public void impuesto(){

        impuesto = costo_Total*0.01;
    }

    public void Pago_Servicios (int estrato){

        if (estrato==1 || estrato==2 || estrato==3 ||estrato==4){

            total= costo_Total + descuento + impuesto;
        }
        else if (estrato ==5 || estrato==6){
            total= costo_Total + descuento + impuesto;
        }
    }

    public void mostrar_PagoServicios( int consumo, int estrato){

       
        System.out.println("El consumo fue: " + consumo);
        System.out.println("valor unidad: " + valor_Unidad);
        System.out.println("Estrato del inmueble: " + estrato);
        System.out.println("Costo total: " + costo_Total);
        System.out.println("Descuento o sobrecosto: " + descuento);
        System.out.println("Impuesto por infraestructura: " + impuesto);
        System.out.println("Total a pagar: " + total);
    }
}