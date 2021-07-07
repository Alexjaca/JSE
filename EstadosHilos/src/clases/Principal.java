
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso();
        Proceso hilo2 = new Proceso();
        
        hilo1.start();
        
        try {
            hilo1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error con el Hilo 1 " + e);
        }
        
        hilo2.start();
        
        
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error con el Hilo 2 " + e);
        }
        hilo2.stop();
    }
}
