public class OperadoresRelacionales {
    public static void main(String[] args) {
        byte x = 6, y = 8, z = 10, w = 8;
        boolean respuesta;
        // Operador <
        respuesta = x < y;
        System.out.println(x + " < " + y + " --> " + respuesta);  // 6 < 8 --> true

        // Operador >
        respuesta = y > z;
        System.out.println(y + " > " + z + " --> " + respuesta); // 8 > 10 --> false

        // Operador <=
        respuesta = y <= w;
        System.out.println(y + " <= " + w + " --> " + respuesta);

        // Operador >=
        respuesta = y >= x;
        System.out.println(y + " >= " + x + " --> " + respuesta);

        // Operador ==
        respuesta = x == y;
        System.out.println(x + " == " + y + " --> " + respuesta);

        // Operador !=
        respuesta = x != z;
        System.out.println(x + " != " + z + " --> " + respuesta);
    }
}
