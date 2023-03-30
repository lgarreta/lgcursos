
public class Factura {

    private int estratoSocioeconomico;
    private double precioServicioPagar;
    private int consumo;
    private double descuento;
    private final double TASA_IMPUESTO;
    public final int VALOR_UNITARIO_AGUA;
    public final int VALOR_UNITARIO_GAS;
    public final int VALOR_UNITARIO_LUZ;

    public Factura(int estrato, int consumo) {
        this.TASA_IMPUESTO = 0.01;
        this.consumo = consumo;
        this.estratoSocioeconomico = estrato;
        this.precioServicioPagar = 0;
        this.descuento = 0;
        this.VALOR_UNITARIO_AGUA = 9256;
        this.VALOR_UNITARIO_GAS = 5234;
        this.VALOR_UNITARIO_LUZ = 6200;
    }

    public int getEstratoSocioeconomico() {
        return estratoSocioeconomico;
    }

    public double getPrecioServicioPagar() {
        return precioServicioPagar;
    }

    public void calcularTotalSinDescuento(int opcion) {
        if (opcion == 1) {
            this.precioServicioPagar = this.VALOR_UNITARIO_LUZ * this.consumo;
        } else if (opcion == 2) {
            this.precioServicioPagar = this.VALOR_UNITARIO_AGUA * this.consumo;
        } else if (opcion == 3) {
            this.precioServicioPagar = this.VALOR_UNITARIO_GAS * this.consumo;
        }
        
        this.calcularDescuentoServicio();
    }

    public void calcularDescuentoServicio() {

        // DESCUENTO POR ESTRATO
        if (this.estratoSocioeconomico == 1 || this.estratoSocioeconomico == 2) {
            this.descuento = this.precioServicioPagar * -0.5;
        } else if (this.estratoSocioeconomico == 3 || this.estratoSocioeconomico == 4) {
            this.descuento = this.precioServicioPagar * -0.1;
        } else if (this.estratoSocioeconomico == 5 || this.estratoSocioeconomico == 6) {
            this.descuento = this.precioServicioPagar * 0.25;
        }
    }

    public double getDescuento() {
        return this.descuento;
    }

    public double calcularImpuesto() {
        double impuesto = 0;
        impuesto = this.precioServicioPagar * TASA_IMPUESTO;
        // IMPUESTO APLICADO A LA FACTURA
        this.precioServicioPagar = this.precioServicioPagar + impuesto;

        this.precioServicioPagar = this.precioServicioPagar + this.descuento;
        return impuesto;
    }

    public int getConsumo() {
        return consumo;
    }
}