
package rlibros;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RegistroLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Libro> libros = new LinkedHashSet<>();

        String continuar;

        // Ciclo para agregar libros
        do {
            System.out.print("Ingresa el ID del libro: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingresa el título: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingresa la edición: ");
            String edicion = scanner.nextLine();

            System.out.print("Ingresa el autor: ");
            String autor = scanner.nextLine();

            // Crear libro y agregarlo al LinkedHashSet
            Libro libro = new Libro(id, titulo, edicion, autor);
            if (!libros.add(libro)) {
                System.out.println(" Libro con ID " + id + " ya registrado.");
            }

            System.out.print("¿Deseas ingresar otro libro? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar libros registrados
        System.out.println("\n Libros registrados:");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }

        scanner.close();
    }
}

