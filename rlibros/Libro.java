package rlibros;

public class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    // Constructor
    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getAutor() {
        return autor;
    }

    // Método para mostrar los datos del libro
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Edición: " + edicion);
        System.out.println("Autor: " + autor);
        System.out.println("-------------------------");
    }

    // Sobrescribir equals y hashCode para evitar duplicados en el LinkedHashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return id == libro.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

