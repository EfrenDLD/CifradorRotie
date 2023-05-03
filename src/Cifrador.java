public class Cifrador {
    public static String cifrar(String mensaje) {
        String mensajeCifrado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            mensajeCifrado += c;
        }
        return mensajeCifrado;
    }

    public static String descifrar(String mensajeCifrado) {
        return cifrar(mensajeCifrado);
    }
}