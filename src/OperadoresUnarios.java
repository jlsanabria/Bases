public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operador +
        int positivo = +144;

        // Operador -
        int negativo = -667;

        int suma = positivo + negativo;
        int cambio = -suma;
        System.out.println("Suma: " + suma);
        System.out.println("Cambio: " + cambio);

        // Operador ++
        byte v1 = 7, v2 = 6, v3;
        v1++; // v1 = v1 + 1 --> v1 = 8
        ++v2; // v2 = v2 + 1 --> v2 = 7
        v3 = v1++; // v3 = (v1 = v1 + 1) --> v1 = 9, v3 = 8
        System.out.println("Valor v1: " + v1);
        System.out.println("Valor v2: " + v2);
        System.out.println("Valor v3: " + v3);

        // Operador --
        short y1 = 13, y2;
        --y1; // y1 = 12
        y2 = --y1;
        System.out.println("Valor y1: " + y1);
        System.out.println("Valor y2: " + y2);

        /**
         * Ejemplo de operadores unarios con operadores aritméticos
         * a = 3, b = 7
         * c = (++b) * (a++) / (--a)
         * c =  8 * 3 / 3 = 8
         * ¿Cuál es el valor de c?
         *
         * (1 punto)
         */
        int a = 3, b = 7, c;
        c = (++b) * (a++) / (--a);
        System.out.println("Valor c: " + c);

        // Operador !
        boolean seEntiende = false, respuesta;
        respuesta = !seEntiende;
        System.out.println("Valor respuesta: " + respuesta);

    }
}
