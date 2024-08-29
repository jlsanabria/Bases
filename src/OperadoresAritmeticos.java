public class OperadoresAritmeticos {
    public static void main(String[] args) {

        /*
        Operador suma +
         */
        int x, y, z; // Declarar variables
        x = 15; // Asignando valor a x
        y = 8; // Asignando valor a y
        z = x + y; // Asignando el resultado de la suma de x + y
        System.out.println("z = " + z); // Imprimiendo el resultado z

        int x1 = 5, y1 = 8, z1, r; // Declaración y asignación de valores
        z1 = x1 + y1; // Asignación del resultado de la suma de x1 + y1
        System.out.println("z1 = " + z1); // Imprimiendo el resultado z1

        // Operador resta -
        r = x - y;
        System.out.println("La resta es: " + r);

        // Operador multiplicación *
        short m1 = 13, m2 = 5, m;
        m = (short) (m1 * m2);
        System.out.println("La multiplicación es: " + m);

        // Operador división / DIV
        double d;
        d = (double) m1 / m2;
        System.out.println("La división es: " + d);

        // Operador resto % MOD
        byte resto = (byte) (m1 % m2);
        System.out.println("El resto es: " + resto);

        /*
        byte < short < int < long
         */
    }
}
