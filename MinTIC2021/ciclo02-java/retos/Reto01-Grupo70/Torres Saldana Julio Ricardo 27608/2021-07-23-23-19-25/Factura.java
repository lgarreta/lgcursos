import java.util.Scanner; 
public class Factura {
    Scanner lector;
    int unidadAgua;
    int unidadEnergia;
    double unidadGas;
    int consumo;
    int estrato;
    double pagoTotal;
    double descuento;
    double valorBruto;
    double impuesto;
    double UnidadX;


    public Factura () {
        lector = new Scanner(System.in);
        unidadAgua = 9256;
        unidadEnergia =6200;
        unidadGas = 5234;
        consumo = 0;
        estrato = 0;
        UnidadX = 0;
        
    }
    
    public double calculoPagoAgua (int consumo, int estrato) {
        valorBruto = consumo * unidadAgua;
        UnidadX = unidadAgua;
        
        if (estrato==1 || estrato==2)
            descuento = -0.5 * valorBruto;
        else if (estrato==3 || estrato==4)
            descuento = -0.1 * valorBruto;
        else if (estrato==5 || estrato==6)
            descuento = 0.25 * valorBruto;    

        impuesto = 0.01 * valorBruto;
        pagoTotal = valorBruto + descuento + impuesto;
        return (pagoTotal);
    }

    public double calculoPagoGas (int consumo, int estrato) {
        valorBruto = consumo * unidadGas;
        UnidadX = unidadGas;
        
        
        if (estrato==1 || estrato==2)
            descuento = -0.5 * valorBruto;
        else if (estrato==3 || estrato==4)
            descuento = -0.1 * valorBruto;
        else if (estrato==5 || estrato==6)
            descuento = 0.25 * valorBruto;    

        impuesto = 0.01 * valorBruto;
        pagoTotal = valorBruto + descuento + impuesto;
        return (pagoTotal);
    }

    public double calculoPagoEnergia (int consumo, int estrato) {
        valorBruto = consumo * unidadEnergia;
        UnidadX = unidadEnergia;
        if (estrato==1 || estrato==2)
            descuento = -0.5 * valorBruto;
        else if (estrato==3 || estrato==4)
            descuento = -0.1 * valorBruto;
        else if (estrato==5 || estrato==6)
            descuento = 0.25 * valorBruto;    

        impuesto = 0.01 * valorBruto;
        pagoTotal = valorBruto + descuento + impuesto;
        return (pagoTotal);
    }

    public int leerConsumo () {
        System.out.println("Consumo del inmueble: ");
        consumo = lector.nextInt();
        return (consumo);
    }
    
    public int leerEstrato () {
        System.out.println("Estrato del inmueble: ");
        estrato = lector.nextInt();
        return (estrato);
    }
    
    public void imprimirResultados () {
        System.out.println("El consumo fue: "+ consumo);
        System.out.println("Valor unidad: "+ UnidadX);
        System.out.println("Estrato del inmueble: "+ estrato);
        System.out.println("Costo total : "+ valorBruto);
        System.out.println("Descuento o sobrecosto: "+ descuento);
        System.out.println("impuesto por infraestructura: "+ impuesto);
        System.out.println("TOTAL A PAGAR: " + pagoTotal);
        System.out.println();

    }

    public void imprimirMenu (){
        System.out.println("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");
    }

    public int leerOpcion (){
        System.out.println("Opción: ");
        int opcion = lector.nextInt();
        return (opcion);
    }
}