package entidades;

import java.util.LinkedList;

public class ListaAlumnosLinkedList {
    public static void main(String[] args) {
        // Crear lista LinkedList de tipo Alumno
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        // Insertar valores
        listaAlumnos.add(new Alumno(1, "Henry Jimenez", "JM1"));
        listaAlumnos.add(new Alumno(2, "Carlos Ramos", "CR2"));
        listaAlumnos.add(new Alumno(3, "Ana López", "AL3"));

        // Mostrar alumnos
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarDatos();
        }
    }
}

