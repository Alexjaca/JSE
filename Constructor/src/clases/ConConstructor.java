package clases;

import java.util.Scanner;
/// hacer llamado con Constructor
public class ConConstructor {

    public ConConstructor() {

        Scanner in = new Scanner(System.in);
        String nombre = "";
        
        System.out.print("Ingrese su nombre = ");
        nombre = in.nextLine();
        
        System.out.println("Su Nombre es = " + nombre);

}

}
