import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Servicios servicio = new Servicios();
		int opcion = 0;
		int estrato = 0;
		int consumo = 0;
		
		
		do {		
			
			System.out.println("PAGO DE SERVICIOS PÚBLICOS");
			System.out.println("Seleccione el servicio público:");
			System.out.println("1. Energia");
			System.out.println("2. Acueducto");
			System.out.println("3. Gas Natural");
			System.out.println("4. Salir");
			//System.out.println(".");
			System.out.println("Opción:");
			opcion = sc.nextInt();


			switch(opcion){
				case 1:			
					System.out.println("Pago de Servicio de Energia");
					
					System.out.println("Estrato del inmueble:");
					estrato = sc.nextInt();
					
					System.out.println("Consumo del inmueble:");
					consumo = sc.nextInt();					
					
					servicio.Calcular(opcion, estrato, consumo);
					break;
					
				case 2:
					System.out.println("Pago de Servicio de Acueducto");
					
					System.out.println("Estrato del inmueble:");
					estrato = sc.nextInt();
					
					System.out.println("Consumo del inmueble:");
					consumo = sc.nextInt();	
					
					servicio.Calcular(opcion, estrato, consumo);
					break;
				case 3:
					System.out.println("Pago de Servicio de Gas Natural");
					
					System.out.println("Estrato del inmueble:");
					estrato = sc.nextInt();
					
					System.out.println("Consumo del inmueble:");
					consumo = sc.nextInt();	
					
					servicio.Calcular(opcion, estrato, consumo);
					break;
				case 4:
					System.out.println("Hasta pronto");
					break;
				default:
					System.out.println("Opcion incorrecta");
				
			}
			
		}while(opcion != 4);
		sc.close();

	}

}
