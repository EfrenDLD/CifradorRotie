public class Ingresar {
    public void ingresarMensaje(){

        System.out.print("Ingrese el mensaje a cifrar/descifrar: ");
        String mensaje = Leer.leerMensaje();

        String mensajeCifrado = Cifrador.cifrar(mensaje);
        String mensajeDescifrado = Cifrador.descifrar(mensajeCifrado);
        System.out.println("Mensaje ingresado: " + mensajeDescifrado);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

    }
}
