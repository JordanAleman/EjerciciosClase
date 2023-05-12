package Tema6ArraysList.Ejercicio7SerieMultiplos;

import java.util.ArrayList;
import java.util.HashMap;

public class SerieMultiplos {
    private HashMap<String, ArrayList<Integer>> mapaValores;

    private final int TOTAL_MULTIPLOS = 10;

    /* ------------------------------- Constructor ------------------------------ */
    public SerieMultiplos() {
        mapaValores = new HashMap<>();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void escribirMap() {
        for (String clave : mapaValores.keySet()) {
            System.out.println("\nClave: " + clave +
                    "\nValor: " + mapaValores.get(clave));
        }
    }

    /* --------------------------- Añadir una entrada --------------------------- */
    /**
     * <p>
     * {@code public void añadirEntrada(int num)} – añade una nueva entrada al map.
     * Las claves son String (si el parámetro num = 5 , la clave será “5”).
     * La colección ArrayList asociada (el valor correspondiente a
     * la clave) se obtiene con ayuda del método generarMultiplos().
     * </p>
     * 
     * @param numero Será clave de un nuevo campo del mapa
     */

    public void addEntrada(int numero) {
        mapaValores.put(numero + "", generarMultiplos(numero));
    }

    /**
     * <h5>Método auxiliar de {@code addEntrada}</h5>
     * 
     * @param numero Se generará una colección del número junto a sus
     *               nueve siguientes múltiplos
     * @return {@code ArrayList<Integer>} lista de múltiplos
     */
    private ArrayList<Integer> generarMultiplos(int numero) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = numero; i <= numero * TOTAL_MULTIPLOS; i += numero)
            listaNumeros.add(i);

        return listaNumeros;
    }

    /* --------------------- Obtener múltiplos de un número --------------------- */
    /**
     * <p>
     * Devuelve los múltiplos del número pasado como parámetro. Será pasado una
     * clave por parámetro y, si existe esa clave, se devolverá su valor, que será
     * una lista de los múltiplos del número que representa dicha clave.
     * </p>
     * 
     * @param numero clave del mapa.
     * @return {@code ArrayList<Integer>} lista de múltiplos. El valor asociado a
     *         la clave pasada como parámetro.
     */
    public ArrayList<Integer> obtenerMultiplosDe(int numero) {
        if (!mapaValores.containsKey(numero + ""))
            System.out.print("No existe la clave en el mapa -> ");

        return mapaValores.get(numero + "");
    }
}
