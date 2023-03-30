public class ServicioPublico {

    double valorUnidad;
    
    public ServicioPublico(int service) {
        switch (service) {
            case 1:
                valorUnidad=6200d;
                break;
            case 2:
                valorUnidad=9256d;
                break;
            default:
                valorUnidad=5234.0d;
                break;
        }
    }
    public double calcularSubtotal(double valorUnitario, int consumo){
        return valorUnitario * consumo;
    }
    public double calcularImpuesto(double subtotal){
        return subtotal * 0.01;
    }
    public double calcularDescuento(double subtotal, int estrato){
        double descuento = 0;
        if (estrato == 1 || estrato == 2){
            descuento = subtotal * 0.5;
        } else if(estrato == 3 || estrato == 4){
            descuento = subtotal * 0.1;
        } else if(estrato == 5 || estrato == 6){
            descuento = subtotal * 0.25;
            descuento = -descuento;
        }
        return descuento;
    }
    public void imprimir(int consumo, int estrato, double subtotal, double descuento, double valorUnitario, double impuesto, double total){
        System.out.println("El consumo fue: " + consumo);
        System.out.println("Valor unidad: " + valorUnitario);
        System.out.println("Estrato del inmueble: " + estrato);
        System.out.println("Costo total: " + subtotal);
        System.out.println("Descuento o sobrecosto: " + (-(descuento)));
        System.out.println("Impuesto por infraestructura: " + impuesto);
        System.out.println("TOTAL A PAGAR: " + total + "\n");
    }
    public void calcularServicio(double valorUnitario, int consumo, int estrato){
        double subtotal = calcularSubtotal(valorUnitario, consumo);
        double impuesto = calcularImpuesto(subtotal);
        double descuento = calcularDescuento(subtotal, estrato);
        double total = (subtotal - (descuento)) + impuesto;
        imprimir(consumo, estrato, subtotal, descuento, valorUnitario, impuesto, total);
    }
}