package utilerias;
import java.util.Scanner;

public class QuitarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una cadena con espacios: ");
        String texto = scanner.nextLine();

        String textoSinEspacios = texto.replace(" ", "");

        System.out.println("Texto sin espacios: " + textoSinEspacios);

        scanner.close();
    }
}

