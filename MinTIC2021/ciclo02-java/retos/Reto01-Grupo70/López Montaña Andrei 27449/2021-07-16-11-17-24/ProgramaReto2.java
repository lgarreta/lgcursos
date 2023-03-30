import java.util.Scanner; 

public class ProgramaReto2{
int metroCubicoAgua = 9256;
int metroCubicoGas = 5234;
int kilowatt = 6200;
double valorUnidad=0;
int consumo=0;
int estrato=0;
double valorFactura=0;
double descuentoSobrecosto=0;
double valorImpuesto=0;
double ValorTotalFactura=0;
Scanner lector = new Scanner (System.in);    
    public void mostrarMenu(){
        System.out.println ("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println ("Seleccione el servicio público:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir");    
    }
    
    public int leerOpcion () {
        System.out.println ("Opción:");
        int opcion_menu = lector.nextInt ();
        return (opcion_menu);  
    }
    public double valorUnidad(double unidad){
        if (unidad == 1){
            System.out.println("Pago de Servicio de Energia");
            valorUnidad = kilowatt;
        }
        else if (unidad == 2){
            System.out.println("Pago de Servicio de Acueducto");
            valorUnidad = metroCubicoAgua;
        }
        else if (unidad == 3){
            System.out.println("Pago de Servicio de Gas Natural");
            valorUnidad = metroCubicoGas;
        }
        return(valorUnidad);

    }
    public int leerConsumo(){
        System.out.println("Consumo del inmueble:");
        consumo = lector.nextInt();
        return(consumo);
    }
    public int leerEstrato(){
        System.out.println("Estrato del inmueble:");
        estrato = lector.nextInt();
        return(estrato);
    }

    public double calcularFactura(int consumo,double unidad){
        valorFactura = consumo * unidad;
        return (valorFactura);
    }
    
    public double calcularDescuento(int estrato, double costoFactura){
        descuentoSobrecosto = 0;
        if (estrato == 1 || estrato == 2) {
                descuentoSobrecosto = costoFactura * -0.5;
        }else if (estrato == 3 || estrato == 4){
                descuentoSobrecosto = costoFactura * -0.1;
        }else if (estrato == 5 || estrato == 6){
                descuentoSobrecosto = costoFactura * 0.25;
        }
        return (descuentoSobrecosto);
    }
    public double calcularImpuesto(double valorFactura){
        valorImpuesto = valorFactura * 0.01;
        return(valorImpuesto);
    }
    public double calcularValorTotal(double costo, double valorDesc,double descuento){
    ValorTotalFactura = costo + valorDesc + descuento;
    return (ValorTotalFactura);
    }
    public void mostrarResultados(){
        System.out.println("El consumo fue: " + consumo);
        System.out.println("Valor unidad: " + valorUnidad);
        System.out.println("Estrato del inmueble: " + estrato);
        System.out.println("Costo total: " + valorFactura);    
        System.out.println("Descuento o sobrecosto: " + descuentoSobrecosto); 
        System.out.println("Impuesto por infraestructura: " + valorImpuesto);  
        System.out.println("TOTAL A PAGAR: " + ValorTotalFactura + "\n"); 
    }
  }