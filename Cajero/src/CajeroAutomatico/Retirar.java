package CajeroAutomatico;

public class Retirar extends Saldo {

    @Override
    public void Transacciones() {
        System.out.print("Cuanto Desea Retirar = ");
        Retiro();

        if (Retiro <= getSaldo()) {

            Transacciones = getSaldo();
            setSaldo(Transacciones - Retiro);
            System.out.println("------------------------------------------------");
            System.out.println("Retiraste la Cantidad de = " + Retiro);
            System.out.println("Su saldo actrual es = " + getSaldo());
            System.out.println("------------------------------------------------");

        } else {
            System.out.println("------------------------------------------------");
            System.out.println("Saldo Insuficiente!!!!!!!!!!");
            System.out.println("------------------------------------------------");
        }
    }

}
