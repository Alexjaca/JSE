package Division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        int valor1, valor2, resultado;

        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Por favor ingresa el Valor 1 =");
            valor1 = in.nextInt();

            System.out.print("Por favor ingresa el Valor 2 =");
            valor2 = in.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Division es igual a = " + resultado);

        } catch (Exception e) {
            System.out.println("------------------------------------------------");
            System.out.println("Error!!!!! " + e);

        } finally {

            System.out.println("Operacion Concluida!!!!!");
            System.out.println("------------------------------------------------");
        }

    }

}
