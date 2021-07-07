
package main;
import operaciones.ClaseHijaResta;
import operaciones.ClaseHijaSuma;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        ClaseHijaSuma mensajeroSuma = new ClaseHijaSuma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sunar();
        System.out.print("El resultado de la Suma es = ");
        mensajeroSuma.MostrarResultado();
        
        ClaseHijaResta mensajeroResta = new ClaseHijaResta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.print("El resultado de la Resta es = ");
        mensajeroResta.MostrarResultado();
        
    }
    
}
