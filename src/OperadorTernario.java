public class OperadorTernario {
    public static void main(String[] args) {
        byte a = 17, b = 23;
        String resultado = a > b ? "a es el mayor" : "b es el mayor";
        System.out.println("Resultado: " + resultado);

        /**
         * Ejemplo
         * Se requiere actualizar las cuotas de los clientes, en el caso de que su cuota sea mayor a 2500 bs
         * se debe actualizar con el 7.5% y si es menor con el 5%
         *
         * Si la cuota es 2600 --> 2795
         * Si la cuota es 2000 --> 2100
         * Resolver con el operador ternario
         */
        double cuota = 2600;
        double nuevaCuota = cuota + (cuota > 2500 ? cuota * 0.075 : cuota * 0.05);
        System.out.println("Nueva Cuota: " + nuevaCuota);

        /**
         * Ejercicio 1 (Operador ternario)
         *
         * Dada una nota final, determinar si el estudiante esta APROBADO o REPROBADO,
         * considerando que la nota de aprobación es 51
         *
         * (1 punto)
         */
        int nota = 56;
        String estado = nota >= 51 ? "ARPOBADO" : "REPROBADO";
        System.out.println("Nota: " + nota + " --> Estado: " + estado);

        /**
         * Ejemplo 2 (Con el operador ternario)
         * Dados tres números, hallar el menor de ellos
         * Si x = 14, y = 6, z = 9  -->   el menor es 6
         *
         * x > y -> x > z  --> x es el mayor
         * y > z --> y es el mayor
         *
         * Posteriormente mostrar de manera ordenada ascedentemente
         */

        int x = 14, y = 160, z = 39;
        int menor = x < y ? (x < z ? x : z) : (y < z ? y : z);
        int mayor = x >= y ? (x >= z ? x : z) : (y >= z ? y : z);
        int medio = (x + y + z) - (mayor + menor);

        System.out.println("Mayor: " + mayor);
        System.out.println("Salida ordenada: " + menor + "  " + medio + "  " + mayor);

        /**
         * Ejercicio 2 (Operador ternario)
         * Dados cuatro números mostrar el mayor con el menor en una línea
         * y luego mostrar los dos números del medio en otra línea
         *
         * Si p = 14, q = 6, r = 10, s = 21   entonces
         * Output:
         *              21  6
         *              14  10
         *
         * (2 puntos)
         * */
    }
}
