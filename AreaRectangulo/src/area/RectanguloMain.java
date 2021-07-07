/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class RectanguloMain {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese la Base = ");
        int base = in.nextInt();
        
        System.out.print("Ingrese la Altura = ");
        int altura = in.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        
        mensajero.Imprimir();
    }
    
}
