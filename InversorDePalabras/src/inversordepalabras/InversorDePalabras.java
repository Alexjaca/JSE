package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una Palabra = ");
        palabra = in.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra --;
        }
        
        System.out.println("La palabra Invertida es = " + palabraInvertida);

    }

}
