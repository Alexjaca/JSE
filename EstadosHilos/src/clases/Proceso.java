package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Proceso extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + getName());
            
            try {
                Proceso.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error en el Proceso Principal " + e);
            }
        }

    }

}
