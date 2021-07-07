package decimales;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class ClasePrincipal {

    public static void main(String[] args) {

        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La Raiz cuadrada de " + numero + " es = " + raiz);

        // Utilizando la Clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La Raiz cuadrada de " + numero + " es = " + df.format(raiz) + " UTILIZANDO DECIMALFORMAT");

        // Utilizando String Format
        System.out.println("La Raiz cuadrada de " + numero + " es = " + String.format("%.2f", raiz) + " UTILIZANDO SRING FORMAT");

        // Utilizando.Math.round
        System.out.println("La Raiz cuadrada de " + numero + " es = " + (double) Math.round(raiz * 100d) / 100 + " UTILIZANDO MATH.ROUND");

        // Utilizando Big Decimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La Raiz cuadrada de " + numero + " es = " + bd.doubleValue() + " UTILIZANDO BIG DECIMAL");

    }
    
}
