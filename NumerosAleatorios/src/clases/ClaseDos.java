
package clases;

import java.util.Random;

public class ClaseDos {
    
    public static void main(String[] args) {
        
        int aleatorio = 0;
        Random r = new Random();
        
        aleatorio = (int) (r.nextDouble() * 100);
        System.out.println("Generando Numeros Aleatorios , CLASE RANDOM = " + aleatorio);
    }
    
}
