import java.util.Scanner;

public class ContadorDeVocalA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int cantidadA;
        System.out.print("Ingresa una frase: ");
        frase = scanner.nextLine();

        cantidadA = contarLetraA(frase);

        System.out.println("La cantidad de veces que aparece la letra 'A' es: " + cantidadA);

        scanner.close();
    }

    // Método para contar la cantidad de veces que aparece 'A' o 'a'
    public static int contarLetraA(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'A' || c == 'a') {
                contador++;
            }
        }
        return contador;
    }
}
