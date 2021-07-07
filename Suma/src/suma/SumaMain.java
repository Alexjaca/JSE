package suma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("INGRESE VALOR 1 = ");
        int valorUno = in.nextInt();

        System.out.println("INGRESE VALOR 2 = ");
        int valorDos = in.nextInt();

        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();

    }

}
