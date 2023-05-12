package Tema6ArraysList.Ejercicio3Libro;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String fechaPrestamo;

    private EstadoLibro estado;

    /* ------------------------------- Constructor ------------------------------ */
    public Libro(String titulo, String autor, int numPaginas) {
        if (titulo == null)
            titulo = "Desconocido";

        if (autor == null)
            autor = "Anónimo";

        if (numPaginas <= 0)
            numPaginas = 1;

        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        fechaPrestamo = "";
        
        estado = EstadoLibro.NO_PRESTADO;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public boolean estaPrestado() {
        return estado == EstadoLibro.PRESTADO;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void prestar() {
        if (estaPrestado())
            System.out.println("El libro " + titulo + " ya está prestado");
        else {
            estado = EstadoLibro.PRESTADO;
            fechaPrestamo = obtenerFechaPrestamo();
        }
    }

    public void devolver() {
        if (!estaPrestado())
            System.out.println("El libro " + titulo + " ya está devuelto");
        else
            estado = EstadoLibro.NO_PRESTADO;
        fechaPrestamo = "";
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nNº páginas: " + numPaginas +
                "\nEstado: " + (estado + "") +
                ((fechaPrestamo.length() > 0)
                        ? "\nFecha préstamo: " + fechaPrestamo
                        : "");
    }

    /* ------------------------- Obtener fecha préstamo ------------------------- */
    public String obtenerFechaPrestamo() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        return formatoFecha.format(fechaActual.getTime());
    }

}
