
package ejemplos;


public class Conversiones {
    
    public static void main(String[] args) {
        
        double grados = 45;
        double radianes = Math.toRadians(grados);
        
        System.out.println("Grados = " + grados + " Es igual a Radianes = " + radianes);
        
        grados = Math.toDegrees(radianes);
        
        System.out.println("Radianes = " + radianes + " Es igual a Grados = " + grados);
    }
}
