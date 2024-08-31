public class OperadoresNivelBits {
    public static void main(String[] args) {
        byte varByte = 9;     // 00001001
        short varShort = 12;  // 00000000 00001100
        int varInt = 10;      // 00000000 00000000 00000000 00001010
        long varLong = 15;    // 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001111

        int varBinario = 0b00001101;  // 11110010

        System.out.println("VarByte: " + varByte);
        System.out.println("VarShort: " + varShort);
        System.out.println("VarInt: " + varInt);
        System.out.println("VarLong: " + varLong);
        System.out.println("VarBinario: " + varBinario);

        byte v1 = 3;  // 00000011   -->  11111100
        byte v2 = 5;  // 00000101
        byte v3 = 14; // 00001110   -->  11110001

        // Operador & AND a nivel bits
        int resultado = v1 & v2; // 00000001
        System.out.println("Resultado AND (&): " + resultado);

        // Operador | OR a nivel de bits
        resultado = v1 | v2; // 00000111
        System.out.println("Resultado OR (|): " + resultado);

        // Operador ^ XOR a nivel de bits (distintos = 1, iguales = 0)
        resultado = v2 ^ v3; // 00001011
        System.out.println("Resultado XOR (^): " + resultado);

        // Operador ~ NOT a nivel de bits
        resultado = ~v3; // 11110001
        System.out.println("Resultado NOT (~): " + resultado);
        resultado = ~v1;
        System.out.println("Resultado NOT (~): " + resultado);
        resultado = ~varBinario;
        System.out.println("Resultado NOT (~): " + resultado);

        // byte v3 = 14; // 00001110
        // Operador << Desplazamiento a la izquierda
        resultado = v3 << 1; // 00011100
        System.out.println("Resultado (<<) desplazamiento a la izquierda: " + resultado);
        resultado = v3 << 2; // 00111000
        System.out.println("Resultado (<<) desplazamiento a la izquierda: " + resultado);
        resultado = v3 << 4; // 11100000
        System.out.println("Resultado (<<) desplazamiento a la izquierda: " + resultado);
    }
}
