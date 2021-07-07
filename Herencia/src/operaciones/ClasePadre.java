/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class ClasePadre {
    
        protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    // este metodo pide valores al usuario
    public void PedirDatos(){
        
        System.out.print("Por favor Ingrese el valor 1 =");
        valor1 = entrada.nextInt();
        
        System.out.print("Por favor Ingrese el valor 2 =");
        valor2 = entrada.nextInt();
    }
    
    // este metodo muestra los resultados
    public void MostrarResultado(){
        
        System.out.println("El resultado es = " + resultado);
    }
    
}
