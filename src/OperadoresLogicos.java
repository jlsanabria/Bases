public class OperadoresLogicos {
    public static void main(String[] args) {
        long a = 12, b = 5, c = 7, d = 13;
        float p = 3.1415f, q = 2.81f, r = 9.81f, s = 3.1415f;
        boolean respuesta;

        // Operador & (AND)
        respuesta = (a > b) & (c < b) & (d > a) ;
        System.out.println("(" + a + " > " + b + ") & (" + c + " < " + b + ") & (" + d + " > " + a + ") --> " + respuesta);

        // Operador && (AND)
        respuesta = (c < b) && (a > b) &&  (d > a) ;
        System.out.println("(" + c + " < " + b + ") & (" + a + " > " + b + ") & (" + d + " > " + a + ") --> " + respuesta);

        // Operador |
        respuesta = (p > q) | (p == s) | (r > q) ;
        System.out.println("(" + p + " > " + q + ") | (" + p + " == " + s + ") | (" + r + " > " + q + ") --> " + respuesta);

        // Operador ||
        respuesta = (p > q) || (p == s) || (r > q) ;
        System.out.println("(" + p + " > " + q + ") || (" + p + " == " + s + ") || (" + r + " > " + q + ") --> " + respuesta);

        // && y ||
        respuesta = (a > b) || (c < b) && (d > a) ;
        System.out.println("(" + a + " > " + b + ") || (" + c + " < " + b + ") && (" + d + " > " + a + ") --> " + respuesta);

    }
}
