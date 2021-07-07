package hilos;

public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        // Hilo 1
        hilo1.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 1 " + e);
        }
        // hilo 2
        hilo2.start();
        try{
            hilo2.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2 " + e);
        }
        // hilo 3
        hilo3.start();
        try{
            hilo3.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 3 " + e);
        }
        // hilo 4
        hilo4.start();
        try{
            hilo4.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 4 " + e);
        }
        
    }

}