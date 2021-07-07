package polimorfismo;

import java.util.Scanner;

public abstract class OperacionesClasePadre {

    protected int valor1, valor2, resultado;
    Scanner in = new Scanner(System.in);

    public void PedirDatos() {

        System.out.print("Ingrese el Valos 1 = ");
        valor1 = in.nextInt();

        System.out.print("Ingrese el Valor 2 = ");
        valor2 = in.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void MostrarResultado(){
        System.out.println(resultado);
    }
        
  

}
