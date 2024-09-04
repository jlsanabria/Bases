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

        byte v1 = 10;   // 00000001   -->  11111111
        byte v2 = 11;   // 00001011   -->  11111110
        byte v3 = -8;   // 00001110   -->  11110001

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
        resultado = ~v1; // 00000100  -->  11111011
        System.out.println("Resultado NOT (~): " + resultado);
        // 00001011 --> (Complemento a 1) 11110100 --> (Complemento a 2) 00001100
        resultado = ~v2;
        System.out.println("Resultado v2 NOT (~): " + resultado);
        resultado = ~v3;
        System.out.println("Resultado NOT (~): " + resultado);

        // byte v3 = 14; // 00001110
        // Operador << Desplazamiento a la izquierda
        resultado = v3 << 1; // 00011100
        System.out.println("Resultado (<<) desplazamiento a la izquierda: " + resultado);
        resultado = v3 << 2; // 00111000
        System.out.println("Resultado (<<) desplazamiento a la izquierda: " + resultado);
        resultado = v3 << 4; // 11100000
        System.out.println("Resultado (<<) desplazamiento a la izquierda: " + resultado);

        // Operador >> Desplazamiento a la derecha
        byte v4 = 12; // 00001100 --> 00000110 --> 00000011 --> 00000001
        byte v5 = +16; // 00010000 --> 00001000 --> 00000100 --> 00000010 --> 00000001 --> 00000000
        short v6 = -12; // 11110100 --> (C1) 11111010 --> (C2) 00000101
                        // 00001100 --> 10000110 <> (C2) --> 10000011
        resultado = v4 >> 3;
        System.out.println("Resultado (>>) desplazamiento a la derecha: " + resultado);
        resultado = v5 >> 5;
        System.out.println("Resultado (>>) desplazamiento a la derecha: " + resultado);
        resultado = v6 >> 2;
        System.out.println("Resultado (>>) desplazamiento a la derecha: " + resultado);

        // Operador >>> Desplazamiento a la derecha (sin signo)
        short v7 = 0b11001100; // 11001100 --> 00110011 --> 00001100
        resultado = v7 >>> 4;
        System.out.println("Resultado (>>>) desplazamiento a la derecha sin signo: " + resultado);
        byte v8 = -12;
        byte res = (byte) (v8 >>> 2); // 10001100  --> 01000110 --> 00100011
        System.out.println("Resultado (>>>) desplazamiento a la derecha sin signo: " + res);
    }
}
