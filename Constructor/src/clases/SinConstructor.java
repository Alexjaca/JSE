
package clases;

import java.util.Scanner;

public class SinConstructor {
    
    Scanner in = new Scanner(System.in);
    private String nombre = "";
    
    public void IngresarNombre(){
        
        System.out.print("Ingrese su nombre = ");
        nombre = in.nextLine();
    }
    
    public void ImprimirNombre(){
        
        System.out.println("Su Nombre es = " + nombre);
    }
    
    
}
