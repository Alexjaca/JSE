package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        int MatrizUno[][] = new int[2][3];
        int MatrizDos[][] = new int[3][2];
        int MatrizResultante[][] = new int[2][2];

        // llenado de la matrizUno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizUno[i][j] = (int) (Math.random() * 5);
            }
        }

        // llenado de la matrizDos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                MatrizDos[i][j] = (int) (Math.random() * 5);
            }
        }

        // multiplicacion de matrices
        for (int i = 0; i < 4; i++) {

            if (MatrizResultante[0][0] == 0) {
                int temporal = (MatrizUno[0][0] * MatrizDos[0][0])
                        + (MatrizUno[0][1] * MatrizDos[1][0])
                        + (MatrizUno[0][2] * MatrizDos[2][0]);
                MatrizResultante[0][0] = temporal;
            } else if (MatrizResultante[1][0] == 0) {
                int temporal = (MatrizUno[1][0] * MatrizDos[0][0])
                        + (MatrizUno[1][1] * MatrizDos[1][0])
                        + (MatrizUno[1][2] * MatrizDos[2][0]);
                MatrizResultante[1][0] = temporal;

            } else if (MatrizResultante[0][1] == 0) {
                int temporal = (MatrizUno[0][0] * MatrizDos[0][1])
                        + (MatrizUno[0][1] * MatrizDos[1][1])
                        + (MatrizUno[0][2] * MatrizDos[2][1]);
                MatrizResultante[0][1] = temporal;

            } else if (MatrizResultante[1][1] == 0) {
                int temporal = (MatrizUno[1][0] * MatrizDos[0][1])
                        + (MatrizUno[1][1] * MatrizDos[1][1])
                        + (MatrizUno[1][2] * MatrizDos[2][1]);
                MatrizResultante[1][1] = temporal;
            }

        }

        // imprimiendo matrices
        for (int i = 0; i < 3; i++) {

            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + MatrizUno[i][j] + "]");
                }
                if (i == 1) {
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
            } else {
                System.out.print("                ");
            }

            for (int j = 0; j < 2; j++) {
                System.out.print("[" + MatrizDos[i][j] + "]");
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            
            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + MatrizResultante[i][j] + "]");
                    
                }
                System.out.println("");
                
            }

        }
    }
}
