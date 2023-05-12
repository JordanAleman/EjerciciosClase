package Tema6ArraysList.Ejercicio6GenerarConjunto;

import java.util.ArrayList;

public class ListaNombres {
    private ArrayList<String> listaNombres;

    /* ------------------------------- Constructor ------------------------------ */
    public ListaNombres() {
        listaNombres = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public ArrayList<String> getListaNombres() {
        return listaNombres;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return listaNombres.toString();
    }

    /* ------------------------ Añadir nombres a la lista ----------------------- */
    public void addNombre(String nombre) {
        listaNombres.add(buscarPosicionListaNombre(nombre), nombre.toUpperCase());
    }

    public int buscarPosicionListaNombre(String nombre) {
        if (listaNombres.contains(nombre))
            return listaNombres.indexOf(nombre);

        for (int i = 0; i < listaNombres.size(); i++) {
            if (listaNombres.get(i).compareToIgnoreCase(nombre) > 0)
                return i;
        }

        return listaNombres.size();
    }

    /* --------------------- Obtener conjunto de un posición -------------------- */
    /**
     * <p>
     * El método public String obtenerConjuntoDe(int pos, GeneradorConjunto gn)
     * obtiene el conjunto de caracteres del nombre que está en una determinada
     * posición de la colección. El método recibe un objeto GeneradorConjunto que
     * efectuará esta tarea. Si los parámetros recibidos son incorrectos, la
     * posición no es correcta o el generador es null, se lanza una excepción.
     * </p>
     * 
     * @param posicion   Obtener el conjunto de la posición indicada
     * @param unConjunto Objeto de GenerarConjunto que trae los métodos necesarios
     * 
     * @return Una {@code String} que representará el conjunto de caracteres del
     *         nombre incluido en la posicion de la lista
     */
    public String obtenerConjuntoDe(int posicion, GenerarConjunto unConjunto) {
        if (posicion < 0 || posicion >= listaNombres.size())
            throw new IllegalArgumentException("Parámetro tipo int fuera de rango");

        if (unConjunto == null)
            throw new IllegalArgumentException("Parámetro GenerarConjunto es nulo");

        unConjunto.setPalabra(listaNombres.get(posicion));

        return unConjunto.getListaConjunto().toString();
    }
}
