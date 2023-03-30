
import java.util.Scanner;

public class VistaConsola {
    
    private Scanner entrada;
    
    public VistaConsola(){
        this.entrada = new Scanner(System.in);
    }

    public int mostrarMenu() {
        
        int opcion = 4;

        System.out.println("PAGO DE SERVICIOS PÚBLICOS\n"
                + "Seleccione el servicio público:\n"
                + "1. Energia\n"
                + "2. Acueducto\n"
                + "3. Gas Natural\n"
                + "4. Salir\n"
                + "Opción:");
        opcion = this.entrada.nextInt();

        return opcion;
    }

    public int preguntarEstrato() {
        int opcion = 1;

        System.out.println("Estrato del inmueble:");
        opcion = this.entrada.nextInt();

        return opcion;
    }

    public int preguntarConsumo() {
        int opcion = 1;
        
        System.out.println("Consumo del inmueble:");
        opcion = this.entrada.nextInt();

        return opcion;
    }

    public void mostrarValorPagar(Object[] respuesta) {
        System.out.println("El consumo fue: " + respuesta[0]);
        System.out.println("Valor unidad: " + respuesta[1]);
        System.out.println("Estrato del inmueble: " + respuesta[2]);
        System.out.println("Costo total: " + respuesta[3]);
        System.out.println("Descuento o sobrecosto: " + respuesta[4]);
        System.out.println("Impuesto por infraestructura: " + respuesta[5]);
        System.out.println("TOTAL A PAGAR: " + respuesta[6]+"\n");
    }

}
