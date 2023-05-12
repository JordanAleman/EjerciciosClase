package Tema6ArraysList.Ejercicio9Tesauro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Tesauro {
    private HashMap<String, HashSet<String>> mapaTesauro;

    /* ------------------------------- Constructor ------------------------------ */
    public Tesauro() {
        mapaTesauro = new HashMap<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public HashMap<String, HashSet<String>> getMapaTesauro() {
        return mapaTesauro;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String mapa = "";
        for (Map.Entry<String, HashSet<String>> itMapa : mapaTesauro.entrySet()) {
            mapa += "\nPalabra: " + itMapa.getKey() +
                    "\nSinónimos: " + itMapa.getValue().toString() + "\n";
        }

        return mapa;
    }

    /* ---------------------------- Añadir sinónimos ---------------------------- */
    public void addSinonimo(String clave, String valor) {
        if (clave == null || valor == null)
            return;

        clave = clave.toLowerCase();
        valor = valor.toLowerCase();

        if (mapaTesauro.containsKey(clave))
            mapaTesauro.get(clave).add(valor);
        else {
            HashSet<String> auxLista = new HashSet<>();
            auxLista.add(valor);
            mapaTesauro.put(clave, auxLista);
        }
    }

    public void addSinonimo(String conjuntoPalabras) {
        if (conjuntoPalabras == null)
            return;

        conjuntoPalabras = conjuntoPalabras.trim().toLowerCase();
        String[] arrayConjuntoPalabras = conjuntoPalabras.split(" ");

        if (arrayConjuntoPalabras.length < 2)
            return;

        for (int i = 1; i < arrayConjuntoPalabras.length; i++)
            addSinonimo(arrayConjuntoPalabras[0], arrayConjuntoPalabras[i]);
    }

    /* ---------------------------- Borrar sinónimos ---------------------------- */
    /**
     * <p>
     * borrarSinónimo() - borra de cada conjunto de sinónimo el sinónimo indicado
     * como parámetro y devuelve el conjunto de claves de las que se ha borrado el
     * sinónimo. Si no se ha borrado ninguno se devuelve un conjunto vacío.
     * </p>
     * <p>
     * 
     * @param palabra Palabra que buscaremos como clave en el mapa
     * @return {@code HashSet<String>} que serán la lista de todos los
     * sinónimos que se han borrado. Si no se borra ninguno, se
     * devolverá una lista vacía
     */
    public HashSet<String> borrarSinonimo(String palabra) {
        if (palabra == null) 
            return new HashSet<>();

        palabra = palabra.toLowerCase();

        HashSet<String> listaConjuntoBorrado = new HashSet<>();
        Iterator<String> iterator = mapaTesauro.keySet().iterator();
        String siguienteClave;

        while (iterator.hasNext()) {
            siguienteClave = iterator.next();

            if (mapaTesauro.get(siguienteClave).contains(palabra)) {
                listaConjuntoBorrado.add(siguienteClave);
                mapaTesauro.get(siguienteClave).remove(palabra);
            }
        }

        return listaConjuntoBorrado;
    }
}
