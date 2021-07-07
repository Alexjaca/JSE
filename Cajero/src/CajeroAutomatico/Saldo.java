package CajeroAutomatico;

import java.util.Scanner;

public abstract class Saldo {

    protected int Deposito, Retiro, Consulta, Transacciones;
    protected String Nombre;
    private static int Saldo;
    Scanner in = new Scanner(System.in);

    public void IngresarSaldo() {

        int bandera = 0, Seleccion = 0;

        System.out.print("Ingrese Su Nombre = ");
        Nombre = in.nextLine();

        System.out.print("Ingrese el Saldo = ");
        setSaldo(in.nextInt());

        do {

            do {
                System.out.println("Por Favor Seleccione una Opcion");
                System.out.println("-----------------------");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Retirar Saldo");
                System.out.println("3. Depositar Saldo");
                System.out.println("4. Salir del Sistema");
                System.out.println("-----------------------");
                Seleccion = in.nextInt();

                if (Seleccion >= 1 && Seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------");
                    System.out.println("Por Favor Ingrese un Valor Valido");
                    System.out.println("------------------------------------");

                }

            } while (bandera == 0);

            if (Seleccion == 1) {
                Saldo mensajero = new Consultar();
                mensajero.Transacciones();

            } else if (Seleccion == 2) {
                Saldo mensajero = new Retirar();
                mensajero.Transacciones();

            } else if (Seleccion == 3) {
                Saldo mensajero = new Depositar();
                mensajero.Transacciones();

            } else if (Seleccion == 4) {
                System.out.println("------------------------------------------------");
                System.out.println("Gracias!, por usar nuestro Cajero Automatico");
                System.out.println("------------------------------------------------");
                bandera = 2;

            }

        } while (bandera != 2);

    }

    public void Retiro() {
        Retiro = in.nextInt();
    }

    public void Deposito() {
        Deposito = in.nextInt();
    }

    public abstract void Transacciones();

    public static int getSaldo() {
        return Saldo;
    }

    public static void setSaldo(int aSaldo) {
        Saldo = aSaldo;
    }

}
