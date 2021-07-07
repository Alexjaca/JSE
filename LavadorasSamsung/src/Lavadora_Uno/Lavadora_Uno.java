
package Lavadora_Uno;
import Libreria.LLFunciones;
import java.util.Scanner;


public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color? ");
        System.out.println("Presiona 1 si es ropa blanca / Presiona 2 si es ropa de color");
        int TipoRopa = in.nextInt();
        
        System.out.println("Cuantos kilos de ropa vas a lavar");
        int Kilos = in.nextInt();
        
        LLFunciones mensajero = new LLFunciones(Kilos, TipoRopa);
        mensajero.setTipoRopa(2);
        System.out.println("El tipo de Ropa es = " + mensajero.getTipoRopa());
        mensajero.CicloFinalizado();
    }
    
}
