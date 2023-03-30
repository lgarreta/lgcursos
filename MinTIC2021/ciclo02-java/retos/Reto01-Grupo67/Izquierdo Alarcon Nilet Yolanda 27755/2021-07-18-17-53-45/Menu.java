import java.util.Scanner;

public class Menu {
    public static void main (String[] args){
        ServicioPublico energia = new ServicioPublico(1);
        ServicioPublico acueducto = new ServicioPublico(2);
        ServicioPublico gas = new ServicioPublico(3);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PAGO DE SERVICIOS PÚBLICOS\nSeleccione el servicio público:\n1. Energia\n2. Acueducto\n3. Gas Natural\n4. Salir");

        while (true){
            int estrato;
            int consumo;

            System.out.println("Opción:");
            int service = sc.nextInt();

            Boolean exit = false;

            switch (service){
                case 1:
                    System.out.println("Pago de Servicio de Energia");
                    System.out.println("Estrato del inmueble:");
                    estrato = sc.nextInt();
                    System.out.println("Consumo del inmueble:");
                    consumo = sc.nextInt();
                    energia.calcularServicio(energia.valorUnidad, consumo, estrato);
                    break;
                case 2:
                    System.out.println("Pago de Servicio de Acueducto");
                    System.out.println("Estrato del inmueble:");
                    estrato = sc.nextInt();
                    System.out.println("Consumo del inmueble:");
                    consumo = sc.nextInt();
                    acueducto.calcularServicio(acueducto.valorUnidad, consumo, estrato);
                    break;
                case 3:
                    System.out.println("Pago de Servicio de Gas Natural");
                    System.out.println("Estrato del inmueble:");
                    estrato = sc.nextInt();
                    System.out.println("Consumo del inmueble:");
                    consumo = sc.nextInt();
                    gas.calcularServicio(gas.valorUnidad, consumo, estrato);
                    break;
                default:   
                    exit = true;
                    System.out.println("Hasta pronto");
                    break;
            }
            if (exit == true){
                break;
            } else{
                System.out.println("PAGO DE SERVICIOS PÚBLICOS\nSeleccione el servicio público:\n 1. Energia\n 2. Acueducto\n 3. Gas Natural\n 4. Salir");
            }
        }
        sc.close();
    }    
}