
package clases;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        int MatrizUno [][] = new int [3][3];
        int MatrizDos [][] = new int [3][3];
        int MatrizResutante [][] = new int [3][3];
        
        // llenado de MatrizUNo y MatrizDos
        for (int i = 0; i < MatrizUno.length; i++) {
            for (int j = 0; j < MatrizUno.length; j++) {
                MatrizUno[i][j] = (int) (Math.random() * 5);  
            }  
        }
        
        for (int i = 0; i < MatrizDos.length; i++) {
            for (int j = 0; j < MatrizDos.length; j++) {
                MatrizDos[i][j] = (int) (Math.random() * 5);  
            }  
        }
        
        // Suma o Resta de Matrices
        for (int i = 0; i < MatrizUno.length; i++) {
            for (int j = 0; j < MatrizDos.length; j++) {
                MatrizResutante[i][j] = MatrizUno[i][j] + MatrizDos[i][j];
                
            }
            
        }
        
        // Imprimiendo matrices
        for (int i = 0; i < MatrizUno.length; i++) {
            
            for (int j = 0; j < MatrizUno.length; j++) {
                System.out.print("[" + MatrizUno [i][j] + "]");
            }
            
            if(i == 1){
                System.out.print("   +  ");
            }else {
                System.out.print("      ");
            }
            
            
            
            for (int j = 0; j < MatrizDos.length; j++) {
                System.out.print("[" + MatrizDos [i][j] + "]");
            }
            
            if(i == 1){
                System.out.print("   =  ");
            }else {
                System.out.print("      ");
            }            

            
            for (int j = 0; j < MatrizResutante.length; j++) {
                System.out.print("[" + MatrizResutante [i][j] + "]");
            }
            
            System.out.println("");
            
        }
        
        
    }
    
}
