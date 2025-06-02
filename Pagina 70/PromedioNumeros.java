import java.util.ArrayList;
import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresa un número (o escribe 'salir' para terminar): ");
            String entrada = scanner.nextLine();

            // Verificar si el usuario desea salir
            if (entrada.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                try {
                    double numero = Double.parseDouble(entrada);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa un valor numérico válido.");
                }
            }
        }

        // Calcular promedio y cantidad de positivos
        double suma = 0;
        int positivos = 0;

        for (double numero : numeros) {
            suma += numero;
            if (numero > 0) {
                positivos++;
            }
        }

        if (numeros.size() > 0) {
            double promedio = suma / numeros.size();
            System.out.println("\nPromedio de los números: " + promedio);
            System.out.println("Cantidad de números positivos: " + positivos);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}
