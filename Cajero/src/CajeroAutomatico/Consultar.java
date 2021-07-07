
package CajeroAutomatico;

public class Consultar extends Saldo{
    
    @Override
    public void Transacciones(){
        System.out.println("------------------------------------------------");
        System.out.println("Su saldo es = " + getSaldo());
        System.out.println("------------------------------------------------");
    }
    
}
