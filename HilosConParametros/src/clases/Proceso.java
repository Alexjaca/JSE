
package clases;


public class Proceso extends Thread{
    
    int num;
    
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < num; i++) {
            System.out.println(i + " " + this.getName());
        }
        System.out.println("");
    }
    
    public void IngresarParametro(int valor){ 
        this.num = valor;
    }
    
}
