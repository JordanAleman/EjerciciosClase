package Tema6ArraysList.Ejercicio4Secuencia;

import java.util.ArrayList;
import java.util.Collections;

public class Secuencia {
    private ArrayList<Integer> listaSecuencia;

    /* ------------------------------- Constructor ------------------------------ */
    public Secuencia(ArrayList<Integer> otraListaSecuencia) {
        listaSecuencia = new ArrayList<>();

        listaSecuencia.addAll(otraListaSecuencia);
        Collections.sort(listaSecuencia);
    }

    /* --------------------------------- Getter --------------------------------- */
    public ArrayList<Integer> getSecuencia() {
        return listaSecuencia;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return listaSecuencia.toString();
    }

    /* -------------------- Crear lista de enteros aleatorios ------------------- */
    public static ArrayList<Integer> listaEnterosAleatorios() {
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            listaEnteros.add((int) (Math.random() * 20) + 1);

        return listaEnteros;
    }

    /* --------------------------- Fusionar secuencias -------------------------- */
    /**
     * <p>
     * {@code fusionarCon()} recibe un objeto Secuencia y calcula la fusión de las
     * dos listas, la del objeto actual y la del objeto recibido como parámetro.
     * </p>
     * 
     * @param otraSecuencia un objeto de la clase Secuencia
     * @return Devuelve un nuevo objeto Secuencia con la lista nueva obtenida.
     */
    public Secuencia fusionarCon(Secuencia otraSecuencia) {
        if (otraSecuencia == null)
            throw new IllegalArgumentException("Parámetro nulo");

        ArrayList<Integer> listaSecuenciaFusionada = new ArrayList<>();

        listaSecuenciaFusionada.addAll(listaSecuencia);
        listaSecuenciaFusionada.addAll(otraSecuencia.getSecuencia());

        Collections.sort(listaSecuenciaFusionada);

        return new Secuencia(listaSecuenciaFusionada);
    }

    /* ------------------------- Intersección secuencias ------------------------ */
    /**
     * <p>
     * interseccionCon() recibe un objeto Secuencia y calcula la intersección de las
     * dos listas, la del objeto actual y la del objeto recibido como parámetro.
     * </p>
     * 
     * @param otraSecuencia un objeto de la clase Secuencia
     * @return Devuelve un nuevo objeto Secuencia con la lista nueva obtenida.
     */

    public Secuencia interseccionCon(Secuencia otraSecuencia) {
        if (otraSecuencia == null)
            throw new IllegalArgumentException("Parámetro nulo");

        ArrayList<Integer> listaSecuenciaInterseccion = fusionarCon(otraSecuencia).getSecuencia();

        if (listaSecuenciaInterseccion.size() <= 1)
            return new Secuencia(listaSecuenciaInterseccion);

        listaSecuenciaInterseccion = interseccion(listaSecuenciaInterseccion);

        return new Secuencia(listaSecuenciaInterseccion);
    }

    /**
     * 
     * @param listaInterseccion lista que habrá que buscar los elementos para
     *                          realizar la intersección
     * @return lista con todos los elementos comunes de la lista
     */
    private ArrayList<Integer> interseccion(ArrayList<Integer> listaInterseccion) {
        /**
         * Almacenamos el 'numeroEvaluar' el primer elemento de la lista pasada como
         * parámetro.
         * A partir de este número lo iremos comparando con el elemento que
         * almacenaremos en
         * 'siguienteNumero'. Así podremos ver si son el mismo número o no.
         */
        Integer numeroEvaluar = listaInterseccion.get(0);
        Integer siguienteNumero;
        boolean flagEvaluarRepetido = false;

        for (int i = 1; i < listaInterseccion.size(); i++) {
            siguienteNumero = listaInterseccion.get(i);

            /**
             * En el caso de que sean el mismo número, eliminamos el elemento que se
             * encuentra
             * en la posición 'i' actualemente y decrementamos la 'i'. Lo hacemos porque, al
             * eliminar un elemento, la lista automáticamente reordena sus elementos y
             * sus siguientes elementos pasaría a ocupar la posición anterior.
             * Puesto que queremos evaluar el mismo número con el siguiente hasta encontrar
             * uno que no se repita, es por ello que vamos decrementando la 'i'.
             * 
             * El 'flagEvaluarRepetido' se encarga de comprobar que el número es un elemento
             * común. Si fuera un número que no se repite nunca, esta variable continuará
             * en 'false' para la próxima evaluación.
             */
            if (numeroEvaluar.equals(siguienteNumero)) {
                listaInterseccion.remove(i--);
                flagEvaluarRepetido = true;
            } else {
                /**
                 * Si se mantiene en 'false' es debido a que es un número único, sin repetidos.
                 * En ese caso, hay que eliminar ese número, que es justo el que estaba en una
                 * posición anterior al elemento actual de 'i'. Por eso el '--i'.
                 */
                if (!flagEvaluarRepetido)
                    listaInterseccion.remove(--i);

                numeroEvaluar = siguienteNumero;
                flagEvaluarRepetido = false;
            }
        }

        if (!flagEvaluarRepetido)
            listaInterseccion.remove(listaInterseccion.size() - 1);

        return listaInterseccion;
    }

}
