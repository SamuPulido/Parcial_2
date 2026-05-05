package logica;

public class Parcial {

    public int potencia(int b, int e) throws Exception {

        // cuando el exponente es negativo
        if (e < 0) {
            throw new Exception("El exponente no puede ser negativo");
        }

        // cuando es 0^0 (indefinido)
        if (b == 0 && e == 0) {
            throw new Exception("0^0 es indefinido");
        }

        int resultado = 1;

        // multiplicacion repetida
        for (int i = 0; i < e; i++) {

            // verificacion del limite antes de multiplicar
            if (b != 0 && resultado > 2147483647 / b) {
                throw new Exception("el resultado supera el limite de un entero");
            }

            resultado = resultado * b;
        }

        return resultado;
    }
}