package Pagina75;
import java.util.Scanner;
import java.util.TreeSet;

public class NumerosOrdenadosTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un TreeSet para almacenar números únicos y ordenados
        TreeSet<Integer> numeros = new TreeSet<>();

        String continuar;

        // Ciclo para leer números hasta que el usuario decida salir
        do {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero); // Agregar número al TreeSet

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
