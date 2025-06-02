import java.util.Scanner;

public class PrimeraLetraMayuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar una frase al usuario
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Convertir la frase
        String fraseConvertida = convertirMayusculas(frase);

        // Mostrar el resultado
        System.out.println("Frase con mayúsculas: " + fraseConvertida);

        scanner.close();
    }

    // Método para convertir la primera letra y las letras después de un espacio a mayúscula
    public static String convertirMayusculas(String texto) {
        // Convertir la cadena a un arreglo de caracteres
        char[] caracteres = texto.toCharArray();

        // Verificar si el primer carácter existe y es una letra
        if (caracteres.length > 0 && Character.isLetter(caracteres[0])) {
            caracteres[0] = Character.toUpperCase(caracteres[0]);
        }

        // Recorrer el arreglo desde la posición 1
        for (int i = 1; i < caracteres.length; i++) {
            // Si encuentra un espacio y luego una letra, la convierte a mayúscula
            if (caracteres[i - 1] == ' ' && Character.isLetter(caracteres[i])) {
                caracteres[i] = Character.toUpperCase(caracteres[i]);
            }
        }

        // Retornar la cadena modificada
        return new String(caracteres);
    }
}

