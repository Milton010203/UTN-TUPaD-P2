/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Milton
 */

import java.util.ArrayList;
import java.util.List;

class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() { return nombre; }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (" + nacionalidad + ")");
    }
}

class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | ISBN: " + isbn +
                " | Año: " + anioPublicacion +
                " | Autor: " + autor.getNombre());
    }
}

class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros)
            if (l.getIsbn().equals(isbn)) return l;
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public int obtenerCantidadLibros() { return libros.size(); }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros)
            if (l.getAnioPublicacion() == anio) l.mostrarInfo();
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores registrados:");
        for (Libro l : libros) l.getAutor().mostrarInfo();
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Biblioteca UTN");

        Autor a1 = new Autor("A1", "Borges", "Argentina");
        Autor a2 = new Autor("A2", "Cortázar", "Argentina");
        Autor a3 = new Autor("A3", "Asimov", "Estados Unidos");

        biblio.agregarLibro("L1", "Ficciones", 1944, a1);
        biblio.agregarLibro("L2", "Rayuela", 1963, a2);
        biblio.agregarLibro("L3", "Fundación", 1951, a3);
        biblio.agregarLibro("L4", "Fundación II", 1952, a3);
        biblio.agregarLibro("L5", "El Aleph", 1949, a1);

        biblio.listarLibros();
    }
}

