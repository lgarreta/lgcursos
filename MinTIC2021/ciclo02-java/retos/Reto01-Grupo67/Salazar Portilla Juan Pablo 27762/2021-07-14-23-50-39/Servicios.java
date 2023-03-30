import java.util.Scanner;

public class Servicios {
	
	Scanner sc = new Scanner(System.in);
	int estrato = 0;
	int consumo = 0;
	
	double valorTotal = 0;
	int valorLuz = 6200;
	int valorAgua = 9256;
	int valorGas = 5234;
	double valorUnidad = 0;
	double descuento = 0;
	double valorImpuesto = 0;
	double pagoTotal = 0;
	
	
	//---------------------------------------
	
	private void CalcularValorTotal(int opcion) {
		
		if(opcion == 1) {
			valorTotal = consumo * valorLuz;
			valorUnidad = valorLuz;
		}
		else {
			if(opcion == 2) {
				valorTotal = consumo * valorAgua;
				valorUnidad = valorAgua;
			}
			else {
				valorTotal = consumo * valorGas;
				valorUnidad = valorGas;
			}
		}
		
	}
	
	private void CalcularDescuento(int estrato) {
		
		if(estrato == 1 || estrato == 2) {
			descuento = valorTotal * 0.5;
		}
		else {
			if(estrato == 3 || estrato == 4) {
				descuento = valorTotal * 0.1;
			}
			else {
				descuento = valorTotal * 0.25;
			}
		}
	}
	
	private void CalcularpagoTotal() {
		
		if(estrato == 5 || estrato == 6) {
			pagoTotal = (valorTotal + descuento) + valorImpuesto;
			
		}
		else {
			pagoTotal = (valorTotal - descuento) + valorImpuesto;
			descuento -= descuento * 2;  
		}
		
	}
	
	//--------------------------------------
	
	

	public void Calcular(int opcion, int festrato, int fconsumo) {
		
		consumo = fconsumo;
		estrato = festrato;
	
		
		if(opcion == 1) {
			CalcularValorTotal(opcion);
			valorImpuesto = valorTotal * 0.01; 
					
			CalcularDescuento(estrato);				
			
			CalcularpagoTotal();
			
		}
		else {
			if(opcion == 2) {
				CalcularValorTotal(opcion);
				valorImpuesto = valorTotal * 0.01; 
						
				CalcularDescuento(estrato);					
				
				CalcularpagoTotal();
			}
			else {
				CalcularValorTotal(opcion);
				valorImpuesto = valorTotal * 0.01; 
						
				CalcularDescuento(estrato);					
				
				CalcularpagoTotal();
			}
		}
				
		
		System.out.println("El consumo fue: "+ consumo);
		System.out.println("Valor unidad: "+ valorUnidad);
		System.out.println("Estrato del inmueble: "+ estrato);
		System.out.println("Costo total: " + valorTotal);
		System.out.println("Descuento o sobrecosto: "+ descuento);
		System.out.println("Impuesto por infraestructura: "+ valorImpuesto);
		System.out.println("TOTAL A PAGAR: " + pagoTotal);		
		
	}

}
