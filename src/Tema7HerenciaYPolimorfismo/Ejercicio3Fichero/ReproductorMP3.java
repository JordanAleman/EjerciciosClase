package Tema7HerenciaYPolimorfismo.Ejercicio3Fichero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReproductorMP3 {
    public List<Fichero> listaFicheros;
    public int capacidad;
    public int tamActual;

    /* ------------------------------- Constructor ------------------------------ */
    public ReproductorMP3(int capacidad) {
        if (capacidad < 10)
            capacidad = 10;

        listaFicheros = new ArrayList<>();
        this.capacidad = capacidad;
        tamActual = 0;

        addFichero(new FicheroMusica("Gratis1", 2, 120));
        addFichero(new FicheroMusica("Gratis2", 4, 180));
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getCapacidad() {
        return capacidad;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void mostrarCanciones() {
        System.out.println("Lista de canciones: \n" +
                "----------------------------------------\n");

        int tamTotal = 0;

        for (Fichero fichero : listaFicheros) {
            if (!(fichero instanceof FicheroMusica unFicheroMusica))
                continue;

            tamTotal += unFicheroMusica.getDuracion();
            unFicheroMusica.display();
        }

        int horas = tamTotal / 3600;
        int minutos = (tamTotal % 3600) / 60;
        int segundos = tamTotal % 60;

        System.out.printf("Duración total: %02d:%02d:%02d%n",
                horas, minutos, segundos);
    }

    public void mostrarImagenes() {
        System.out.println("Lista de imágenes: \n" +
                "----------------------------------------\n");

        for (Fichero fichero : listaFicheros) {
            if (!(fichero instanceof FicheroImagen unFicheroImagen))
                continue;

            unFicheroImagen.display();
            System.out.println();
        }
    }

    /* --------------------------------- Ordenar -------------------------------- */
    public void ordenar() {
        Collections.sort(listaFicheros);
    }

    public void reordenar() {
        Collections.shuffle(listaFicheros);
    }

    /* ----------------------------- Añadir Ficheros ---------------------------- */
    public void addFichero(Fichero nuevoFichero) {
        if (nuevoFichero == null)
            return;

        if ((tamActual + nuevoFichero.getTamanio()) > capacidad) {
            System.out.println("No hay espacio para añadir el fichero " + nuevoFichero.getTitulo());
            return;
        }

        listaFicheros.add(nuevoFichero);
        actualizarTamActual(nuevoFichero.getTamanio());
    }

    /* ------------------------ Actualizar tamaño actual ------------------------ */
    public void actualizarTamActual(int tamExtra) {
        tamActual += tamExtra;
    }

    /* ------------------------ Borrar fichero de imagen ------------------------ */
    public boolean borrarFicheroImagen(String titulo) {
        if (titulo == null || titulo.isBlank() || listaFicheros.isEmpty())
            return false;

        titulo = titulo.toLowerCase();
        boolean flag = false;

        Iterator<Fichero> iterator = listaFicheros.iterator();

        while (iterator.hasNext()) {
            Fichero ficheroActual = iterator.next();

            if (!(ficheroActual instanceof FicheroImagen unFicheroImagen))
                continue;

            if (unFicheroImagen.getTitulo().equals(titulo)) {
                iterator.remove();
                actualizarTamActual(-unFicheroImagen.getTamanio());
                flag = true;
            }

        }

        return flag;
    }

    /* ------------------------ Borrar todos los ficheros ----------------------- */
    public void reset() {
        listaFicheros.clear();
        tamActual = 0;
    }

}
