package utilerias;
import java.util.Scanner;

public class ContadorDePalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Contador de Palabras");
        System.out.println("=====================================");
        System.out.print("Escribe una frase: ");
        String textoIngresado = scanner.nextLine();

        int totalPalabras = contarCantidadDePalabras(textoIngresado);

        System.out.println("La cantidad de palabras es: " + totalPalabras);

        scanner.close();
    }

    public static int contarCantidadDePalabras(String texto) {
        texto = texto.trim();

        if (texto.isEmpty()) {
            return 0;
        }

        String[] listaDePalabras = texto.split("\\s+");

        return listaDePalabras.length;
    }
}
