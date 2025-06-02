import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra;
        boolean esPalindroma;
        
        System.out.print("Ingresa una palabra: ");
        palabra = scanner.nextLine();

        esPalindroma = verificarPalindroma(palabra);

        if (esPalindroma) {
            System.out.println("La palabra \"" + palabra + "\" es palíndroma.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es palíndroma.");
        }

        scanner.close();
    }

    // Método para verificar si una palabra es palíndroma
    public static boolean verificarPalindroma(String palabra) {
        // Convertir la palabra a minúsculas para ignorar mayúsculas/minúsculas
        palabra = palabra.toLowerCase();

        // Invertir la palabra
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        // Comparar la original con la invertida
        return palabra.equals(palabraInvertida);
    }
}

