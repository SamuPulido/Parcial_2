package presentacion;

import logica.Parcial;

public class Principal_2 {

    public static void main(String[] args) {

        Parcial parcial = new Parcial(); // instancia de la logica

        int b = 100; // base
        int e = 100; // exponente

        try {
            int resultado = parcial.potencia(b, e);
            System.out.println("Resultado: " + resultado);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}