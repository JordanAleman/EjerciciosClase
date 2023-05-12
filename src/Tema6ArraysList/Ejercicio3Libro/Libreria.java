package Tema6ArraysList.Ejercicio3Libro;

import java.util.ArrayList;
import java.util.Iterator;

public class Libreria {
    private ArrayList<Libro> listaLibros;
    private String nombreLibreria;

    /* ------------------------------- Constructor ------------------------------ */
    public Libreria(String nombreLibreria) {
        if (nombreLibreria == null)
            nombreLibreria = "Nuestra librería";

        this.nombreLibreria = nombreLibreria;
        listaLibros = new ArrayList<>();
    }

    public Libreria() {
        nombreLibreria = "Nuestra librería";
        listaLibros = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreLibreria() {
        return nombreLibreria;
    }

    public int cantidadLibrosEnLibreria() {
        return listaLibros.size();
    }

    @Override
    public String toString() {
        String listarLibros = "\n-------------------------------\n";

        for (Libro libro : listaLibros)
            listarLibros += libro + "\n\n-------------------------------\n";

        return listarLibros;
    }

    /* ----------------------- Añadir libros a la librería ---------------------- */
    public void addLibrosEnLibreria(Libro nuevoLibro) {
        if (nuevoLibro == null)
            ControlErrores.errorParametros("Libro no puede estar vacío");

        listaLibros.add(nuevoLibro);
    }

    /* ---------------------- Encontrar y devolver un libro --------------------- */
    public Libro localizarLibro(String libroALocalizar) {
        if (listaLibros.isEmpty())
            return null;

        if (libroALocalizar == null)
            return null;

        Iterator<Libro> iteradorListaLibros = listaLibros.iterator();
        Libro siguienteLibro;

        while (iteradorListaLibros.hasNext()) {
            siguienteLibro = iteradorListaLibros.next();

            if (siguienteLibro.getTitulo().equalsIgnoreCase(libroALocalizar)) {
                return siguienteLibro;
            }
        }

        return null;
    }

    /* ------------- Comprobar si hay un libro de un autor concreto ------------- */
    public boolean hayLibroDelAutor(String autor) {
        if (listaLibros.isEmpty())
            return false;

        if (autor == null)
            return false;

        int iteradorListaLibros = 0;

        while (iteradorListaLibros < listaLibros.size()) {
            String siguienteAutor = listaLibros.get(iteradorListaLibros++).getAutor();

            if (siguienteAutor.equalsIgnoreCase(autor))
                return true;
        }

        return false;
    }

    /* ---------------------- Borrar a un determinado autor --------------------- */
    public void borrarLibrosDelAutor(String autor) {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros en la líbrería");
            return;
        }

        if (autor == null)
            ControlErrores.errorParametros("Autor no puede estar vacío");

        int iteradorListaLibros = 0;

        while (iteradorListaLibros < listaLibros.size()) {
            String siguienteAutor = listaLibros.get(iteradorListaLibros).getAutor();

            if (siguienteAutor.equalsIgnoreCase(autor))
                listaLibros.remove(iteradorListaLibros);
            else
                iteradorListaLibros++;
        }
    }

    /* ------------------------ Lista de libros prestados ----------------------- */
    public void listarLibrosPrestados() {
        for (Libro libro : listaLibros) {
            if (libro.getEstado() == EstadoLibro.PRESTADO)
                System.out.println("\n--------------------\n" + libro);
        }
    }

    /* ---------------- Prestar un libro de un determinado título --------------- */
    public void prestarLibro(String titulo) {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros en la líbrería");
            return;
        }

        if (titulo == null) {
            System.out.println("Título no puede estar vacío");
            return;
        }

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.estaPrestado()) {
                    libro.prestar();
                    System.out.println("Libro prestado: " + libro.getTitulo());
                    return;
                } else {
                    System.out.println("Ya está prestado el libro con título: " + libro.getTitulo());
                    return;
                }
            }
        }

        System.out.println("No se encuentra en la librería el libro: " + titulo);
    }

}
