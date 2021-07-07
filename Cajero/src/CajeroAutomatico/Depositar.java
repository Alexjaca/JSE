package CajeroAutomatico;

public class Depositar extends Saldo {

    @Override
    public void Transacciones() {
        System.out.print("Cuanto Deseas Depositar = ");
        Deposito();

        Transacciones = getSaldo();
        setSaldo(Transacciones + Deposito);
        System.out.println("------------------------------------------------");
        System.out.println("Depositaste la Cantidad de = " + Deposito);
        System.out.println("Su saldo actrual es = " + getSaldo());
        System.out.println("------------------------------------------------");

    }

}
