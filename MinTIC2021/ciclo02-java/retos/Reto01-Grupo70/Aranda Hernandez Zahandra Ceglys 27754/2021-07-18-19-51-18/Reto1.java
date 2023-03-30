import java.util.Scanner;

public class Reto1 {
    public static double factura(double CostoTotal, double estrato){
        double factura = 0;

        if (estrato == 1 || estrato == 2){
            factura = CostoTotal + (CostoTotal * 0.01) - (CostoTotal * 0.5);
        }
        else if (estrato == 3 || estrato == 4){
            factura = CostoTotal + (CostoTotal * 0.01) - (CostoTotal * 0.1);
        }
        else if (estrato == 5 || estrato == 6){
            factura = CostoTotal + (CostoTotal * 0.01) + (CostoTotal * 0.25);
        }
            
        return factura;
    }

    public static double descuento(double CostoTotal, double estrato) {
        double descuento = 0;
        if (estrato == 1 || estrato == 2){
            descuento = CostoTotal * -0.5;
        }
        else if (estrato == 3 || estrato == 4){
            descuento = CostoTotal * -0.1;
        }
        else if (estrato == 5 || estrato == 6){
            descuento = CostoTotal * 0.25;
        }  
        return descuento; 
    }
    public static void main(String[] args) {
      double valor = 0;
      int consumo = 0;
      int estrato = 0;
      double CostoTotal = 0;
      double Impuesto = 0;
      
      Scanner sc = new Scanner(System.in);
      int opcion = 0;
      
      while (opcion !=4){
        
        System.out.println("\nPAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público: ");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        System.out.println("Opción: ");
        
        switch(opcion){
        case 1: 
            System.out.println ("Pago de servicio de Energia");
            System.out.println ("Estrato del inmueble: ");
            estrato = sc.nextInt();
            System.out.println ("Consumo del inmueble: ");
            consumo = sc.nextInt();           
            valor = 6200;
            CostoTotal = consumo * valor;
            Impuesto = CostoTotal * 0.01;
            System.out.println ("El consumo fue: " + consumo);
            System.out.println ("Valor unidad:  " + valor);
            System.out.println ("Estrato del inmueble: " + estrato);
            System.out.println ("Costo total: " + CostoTotal);
            System.out.println ("Descuento o sobrecosto: " + descuento(CostoTotal, estrato));
            System.out.println ("Impuesto por infraestructura: " + Impuesto);
            System.out.println ("TOTAL A PAGAR: " + factura(CostoTotal, estrato));
            break;           
        
        case 2:
            System.out.println ("Pago de servicio de acueducto");
            System.out.println ("Estrato del inmueble: ");
            estrato = sc.nextInt();
            System.out.println ("Consumo del inmueble: ");
            consumo = sc.nextInt();
            valor = 9256;
            CostoTotal = consumo * valor;
            Impuesto = CostoTotal * 0.01;
            System.out.println ("El consumo fue: " + consumo);
            System.out.println ("Valor unidad:  " + valor);
            System.out.println ("Estrato del inmueble: " + estrato);
            System.out.println ("Costo total: " + CostoTotal);
            System.out.println ("Descuento o sobrecosto: " + descuento(CostoTotal, estrato));
            System.out.println ("Impuesto por infraestructura: " + Impuesto);
            System.out.println ("TOTAL A PAGAR: " + factura(CostoTotal, estrato));
            break;       

        case 3:
            System.out.println ("Pago de servicio de Gas natural");
            System.out.println ("Estrato del inmueble: ");
            estrato = sc.nextInt();
            System.out.println ("Consumo del inmueble: ");
            consumo = sc.nextInt();
            valor = 5234;
            CostoTotal = consumo * valor;
            Impuesto = CostoTotal * 0.01;
            System.out.println ("El consumo fue: " + consumo);
            System.out.println ("Valor unidad:  " + valor);
            System.out.println ("Estrato del inmueble: " + estrato);
            System.out.println ("Costo total: " + CostoTotal);
            System.out.println ("Descuento o sobrecosto: " + descuento(CostoTotal, estrato));
            System.out.println ("Impuesto por infraestructura: " + Impuesto);
            System.out.println ("TOTAL A PAGAR: " + factura(CostoTotal, estrato));
            break; 
            
        case 4:
            System.out.println("Hasta pronto");
      }

      
           
      
      
      
      
      

    }

}

    
}
