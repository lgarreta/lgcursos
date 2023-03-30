//package Reto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CFichero {
    
    public void leer(){
        
        try {
            
            FileReader entrada = new FileReader("C:\\Users\\Juan\\Documents\\NetBeansProjects\\Reto2Jp\\src\\main\\java\\Reto\\Almacenamiento.txt");
        
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }
    }
    
}
