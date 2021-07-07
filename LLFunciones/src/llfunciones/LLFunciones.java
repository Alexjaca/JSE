package llfunciones;

public class LLFunciones {

    private int Kilos = 0, TipoRopa = 0, LlenadoCompleto = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LLFunciones(int Kilos, int TipoRopa) {

        this.Kilos = Kilos;
        this.TipoRopa = TipoRopa;
    }

    private void Llenado() {

        if (Kilos <= 12) {
            LlenadoCompleto = 1;
            System.out.println("Llenando....");
            System.out.println("Llenado completo");
        } else {
            System.out.println("La cantidad de kilos es mayor a 12, por favor retire ropa");
        }
    }

    private void Lavando() {
        Llenado();
        if (LlenadoCompleto == 0) {
            if (TipoRopa == 0) {
                System.out.println("Lavado de Ropa Blanca / Lavado Suave");
                System.out.println("Lavado Completo");
                LavadoCompleto = 1;
            } else if (TipoRopa == 1) {
                System.out.println("Lavado de Ropa Color / Lavado Intenso");
                System.out.println("Lavado Completo");
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de lavado seleccionado no es correcto");
                System.out.println("Lavado de Ropa de color / Lavado Intenso");
                LavadoCompleto = 1;
            }

        }
    }

    private void Secando() {
        Lavando();
        if (LavadoCompleto == 1) {
            System.out.println("Secando....");
            SecadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secando();
        if (SecadoCompleto == 1) {
            System.out.println("Tu Ropa esta Lista");

        }
    }

}
