import java.util.Scanner; // libreria de java  by default

public class Bill{

int agua;
int gas;
int elec;
double valorUnidad;
double costoServ;
double descuentoS;
double impuesto;
double totalPagoServ;
Scanner lector;

    public Bill(){
        agua = 9256;
        gas = 5234;
        elec = 6200;
        valorUnidad= 0.0;
        costoServ = 0.0;
        descuentoS =0.0;
        impuesto= 0.0;
        totalPagoServ= 0.0;
        lector = new Scanner (System.in);
    }

    public void showMenu(){

        System.out.println ("\nPAGO DE SERVICIOS PÚBLICOS \nSeleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");
    }

    public int leerMenu(){

        System.out.println("Opción:");
        int selec = lector.nextInt();

        return (selec);
    }

    public int leerEstrato(){

        System.out.println("Estrato del inmueble:");
        int nivel = lector.nextInt();

        return (nivel);
    }

    public int leerConsumo(){

        System.out.println("Consumo del inmueble:");
        int drain = lector.nextInt();

        return (drain);
    }

    public void costoServicios(int consumo, int value){
        
        if (value == 1){
            valorUnidad= elec;
            costoServ=valorUnidad*consumo;
        }
        else if (value == 2){
            valorUnidad= agua;
            costoServ=valorUnidad*consumo;
        }
        else if (value == 3){
            valorUnidad= gas;
            costoServ=valorUnidad*consumo;
        }
    }

    public void descuentoServicios (int estrato){
     
        if (estrato ==1 || estrato==2){
            descuentoS = -1*(costoServ*0.5);
        }
        else if (estrato ==3 || estrato==4){
            descuentoS = -1*(costoServ*0.10);
        }
        else if (estrato ==5 || estrato==6){
            descuentoS = costoServ*0.25;
        }
    }

    public void impuesto(){
        
        impuesto = costoServ*0.01;
    }
  
    public void pagoServicios (int estrato){
        
        if (estrato ==1 || estrato==2 || estrato ==3 || estrato==4){
            
            totalPagoServ= costoServ + descuentoS + impuesto;
        }
        else if (estrato ==5 || estrato==6){
            totalPagoServ= costoServ + descuentoS + impuesto;
        }
        
    }

    public void showPagoServicios( int consumo, int estrato){
        
        
        System.out.println("El consumo fue: " + consumo);
        System.out.println("Valor unidad: " + valorUnidad);
        System.out.println("Estrato del inmueble: " + estrato);
        System.out.println("Costo total: " + costoServ);
        System.out.println("Descuento o sobrecosto: " + descuentoS);
        System.out.println("Impuesto por infraestructura: " + impuesto);
        System.out.println("Total a pagar: " + totalPagoServ);
    
    }

}   