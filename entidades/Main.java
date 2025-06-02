package entidades;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Insertar valores
        listaAlumnos.add(new Alumno(1, "Henry Jimenez", "JM22001"));
        listaAlumnos.add(new Alumno(2, "Carlos Ramos", "CR22002"));
        listaAlumnos.add(new Alumno(3, "Ana López", "AL22003"));

        // Mostrar alumnos
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarDatos();
        }
    }
}

