import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        String fraseSinUltima;
        System.out.print("Ingresa una frase: ");
        frase = scanner.nextLine();

        fraseSinUltima = eliminarUltimaPalabra(frase);

        System.out.println("Frase sin la última palabra: " + fraseSinUltima);

        scanner.close();
    }

    // Método para eliminar la última palabra de una frase
    public static String eliminarUltimaPalabra(String frase) {
        // Quitar espacios al inicio y al final
        frase = frase.trim();

        // Buscar la última posición de espacio
        int ultimaPosicionEspacio = frase.lastIndexOf(" ");

        // Si no hay espacios, significa que hay solo una palabra
        if (ultimaPosicionEspacio == -1) {
            return ""; // Devuelve cadena vacía si solo hay una palabra
        }

        // Retornar la subcadena desde el inicio hasta antes del último espacio
        return frase.substring(0, ultimaPosicionEspacio);
    }
}
