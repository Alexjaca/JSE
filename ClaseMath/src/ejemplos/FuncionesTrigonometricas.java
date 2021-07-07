
package ejemplos;

public class FuncionesTrigonometricas {
    
    public static void main (String args[]){
    double resultado;
    double AnguloGrados = 45;
    double AnguloRadianes = Math.toRadians(AnguloGrados);
    
    // seno
        resultado = Math.sin(AnguloRadianes);
        System.out.println("Grados = " + AnguloGrados + ", Radianes = " + AnguloRadianes + ", Seno del Angulo = " + resultado);
        
    // coseno
        resultado = Math.cos(AnguloRadianes);
        System.out.println("Grados = " + AnguloGrados + ", Radianes = " + AnguloRadianes + ", Coseno del Angulo = " + resultado);
       
    //tangente   
        resultado = Math.tan(AnguloRadianes);
        System.out.println("Grados = " + AnguloGrados + ", Radianes = " + AnguloRadianes + ", Tangente del Angulo = " + resultado);
        
        double valor = 0.7070;
        
        // arco coseno
        AnguloRadianes = Math.acos(valor);
        AnguloGrados = Math.toDegrees(AnguloRadianes);
        System.out.println("Valor Inicial = " + valor + " Arco Coseno = " + AnguloGrados);
        
        //arco seno
        AnguloRadianes = Math.asin(valor);
        AnguloGrados = Math.toDegrees(AnguloRadianes);
        System.out.println("Valor Inicial = " + valor + " Arco Seno = " + AnguloGrados);
        
        //arco tangente
        AnguloRadianes = Math.atan(valor);
        AnguloGrados = Math.toDegrees(AnguloRadianes);
        System.out.println("Valor Inicial = " + valor + " Arco Tagente = " + AnguloGrados);
        
        
    }
}
