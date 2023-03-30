import java.util.Scanner;
public class Factura {
	Scanner lector;
    int valorUnidadGas  = 5234;
    int valorUnidadAgua = 9256;
    int valorUnidadEnergia = 6200;

	int estrato        = 0;
	int consumo        = 0;
	int valorUnidad    = 0;
		
	double costoTotal   = 0.0;
	double descuento    = 0.0;
	double impuesto     = 0.0;
	double valorPagar   = 0.0;

	public Factura () {
		lector = new Scanner (System.in);
		valorUnidadGas  = 5234;
		valorUnidadAgua = 9256;
		valorUnidadEnergia = 6200;
	}

    public double calcularPagoAgua (int consumo, int estrato) {
		valorUnidad = valorUnidadAgua;
        costoTotal = consumo*valorUnidadAgua;
		if (estrato==1 || estrato==2) 
			descuento = 0.5*costoTotal;
		else if (estrato==3 || estrato==4) 
			descuento = 0.1*costoTotal;
		else if (estrato==5 || estrato==6) 
			descuento = 0.25*costoTotal;

		impuesto = 0.01*costoTotal;
		valorPagar = costoTotal - descuento + impuesto;
        return (valorPagar);        
    }

    public double calcularPagoGas (int consumo, int estrato) {
		valorUnidad = valorUnidadGas;
        costoTotal = consumo*valorUnidadGas;
		if (estrato==1 || estrato==2) 
			descuento = 0.5*costoTotal;
		else if (estrato==3 || estrato==4) 
			descuento = 0.1*costoTotal;
		else if (estrato==5 || estrato==6) 
			descuento = 0.25*costoTotal;

		impuesto = 0.01*costoTotal;
		valorPagar = costoTotal - descuento + impuesto;
        return (valorPagar);        
    }

    public double calcularPagoEnergia (int consumo, int estrato) {
		valorUnidad = valorUnidadEnergia;
        costoTotal = consumo*valorUnidadEnergia;
		if (estrato==1 || estrato==2) 
			descuento = 0.5*costoTotal;
		else if (estrato==3 || estrato==4) 
			descuento = 0.1*costoTotal;
		else if (estrato==5 || estrato==6) 
			descuento = 0.25*costoTotal;

		impuesto = 0.01*costoTotal;
		valorPagar = costoTotal - descuento + impuesto;
        return (valorPagar);        
    }           

	int leerConsumo () {
		System.out.println ("Consumo del inmueble: ");
		consumo = lector.nextInt ();
		return (consumo);
	}

	int leerEstrato () {
		System.out.println ("Estrato del inmueble: ");
		estrato = lector.nextInt ();
		return (estrato);
	}

    public void mostrarResultados () {
		System.out.println ("El consumo fue: " + consumo);
		System.out.println ("Valor unidad: " + valorUnidad);
		System.out.println ("Estrato el inmueble: " + estrato);
		System.out.println ("Costo total: " + costoTotal );
		System.out.println ("Descuento o sobrecosto: "+ -1*descuento);
		System.out.println ("Impuesto por infraestructura: " + impuesto);
		System.out.println ("TOTAL A PAGAR: " + valorPagar);
    }


    public void mostrarMenu () {
        System.out.println ("PAGO DE SERVICIOS PUBLICOS");
        System.out.println ("Seleccione el servicio publico:");
        System.out.println ("1. Energia");
        System.out.println ("2. Acueducto");
        System.out.println ("3. Gas Natural");
        System.out.println ("4. Salir ");
    }


    public int leerOpcion () {
        System.out.println  ("Opción:");
        int opcion = lector.nextInt();
        return (opcion);
    }

}
