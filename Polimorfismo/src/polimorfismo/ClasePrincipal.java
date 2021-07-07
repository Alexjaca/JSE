
package polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args) {
        OperacionesClasePadre mensajeroSuma = new SumaClaseHija();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        System.out.println("El resultado de la suma es = ");
        mensajeroSuma.MostrarResultado();
        
        OperacionesClasePadre mensajeroResta = new RestaClaseHija();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        System.out.println("El resultado de la Resta es = ");
        mensajeroResta.MostrarResultado();
    }
    
}
