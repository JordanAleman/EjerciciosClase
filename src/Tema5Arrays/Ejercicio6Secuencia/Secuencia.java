package Tema5Arrays.Ejercicio6Secuencia;

import java.util.Arrays;

public class Secuencia {
    private int[] listaNumeros;

    /* ------------------------------- Constructor ------------------------------ */
    public Secuencia(int cantidadNumeros) {
        if (cantidadNumeros <= 1)
            cantidadNumeros = 2;

        listaNumeros = new int[cantidadNumeros];
        inicializar();
    }

    public Secuencia(int[] listaNumeros) {
        this.listaNumeros = listaNumeros.clone();
    }

    private void inicializar() {
        for (int i = 0; i < listaNumeros.length; i++)
            listaNumeros[i] = generarAleatorio();

        ordenarArray(listaNumeros);
    }

    private int generarAleatorio() {
        return (int) (Math.random() * 20) + 1;
    }

    private static void ordenarArray(int[] listaNumeros) {
        int mayorAux;

        for (int i = 0; i < listaNumeros.length; i++) {
            for (int j = 1 + i; j < listaNumeros.length; j++) {
                if (listaNumeros[i] > listaNumeros[j]) {
                    mayorAux = listaNumeros[j];
                    listaNumeros[j] = listaNumeros[i];
                    listaNumeros[i] = mayorAux;
                }
            }
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    public int[] getListaNumeros() {
        return listaNumeros;
    }

    public int[] getSecuencia() {
        int[] listaNumerosCopia = new int[listaNumeros.length];
        System.arraycopy(listaNumeros, 0, listaNumerosCopia, 0, listaNumeros.length);
        return listaNumerosCopia;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void printSecuencia() {
        System.out.println(Arrays.toString(listaNumeros));
    }

    /* -- Calcular la fusion de la lista pasada por paramentro con listaNumeros - */
    public Secuencia fusionarCon(Secuencia otraSecuencia) {
        int tamListaFusion = listaNumeros.length + otraSecuencia.getSecuencia().length;
        int[] secuenciaFusionada = new int[tamListaFusion];

        System.arraycopy(listaNumeros, 0, secuenciaFusionada, 0, listaNumeros.length);
        System.arraycopy(otraSecuencia.getSecuencia(), 0, secuenciaFusionada, 5,
                otraSecuencia.getSecuencia().length);

        ordenarArray(secuenciaFusionada);

        return new Secuencia(secuenciaFusionada);
    }

    /* - Obtener la intesersección en una nueva lista con los elementos comunes - */
    public static Secuencia interseccion(Secuencia otraSecuencia) {
        return new Secuencia(contarElementosRepetidos(otraSecuencia));
    }

    /**
     * <h3>
     * Cuenta elementos repetidos y devuelve un int[] de los números repetidos
     * </h3>
     * 
     * <p>
     * <blockquote>
     * 
     * <pre>{@code
     * int[] arrayRepetidos = new int[arrayNumeros.length];
     * }</pre>
     * 
     * Será el encargado de almacenar el array con los números repetidos, pero como
     * al principio desconocemos que tamaño debe tener le ponemos el mismo que
     * el de la lista de números que nos paran por parámetro dentro del objeto
     * {@code Secuencia unaSecuencia}
     * </blockquote>
     * </p>
     * <p>
     * Lo primero que se hizo fue ordenar el array de números
     * para facilitar la búsqueda de repetidos.
     * </p>
     * <p>
     * Una vez comprobado que hay dos números que se repiten, lo
     * siguiente es comprobar si no se había repetido ya anteriormente.
     * </p>
     * <p>
     * {@code auxYaRepetido} se encargará de almacenar el último número
     * repetido de la secuencia, y no cambiará hasta que no aparezca un número
     * diferente.
     * Así se consigue que desde que aparezca un número
     * repetido se sumará uno al contador, pero si vuelve a aparecer
     * ese mismo número, se ignora.
     * </p>
     * 
     * @param unaSecuencia Se usará el array de lista de números que tiene
     *                     como atributo
     * @return Un array del tamaño que corresponde con tan solo 
     * los números repetidos
     */

    private static int[] contarElementosRepetidos(Secuencia unaSecuencia) {
        int[] arrayNumeros = unaSecuencia.getSecuencia();
        int[] arrayRepetidos = new int[arrayNumeros.length];
        int contRepetidos = 0;
        int auxYaRepetido = 0;

        ordenarArray(arrayNumeros);

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 1 + i; j < arrayNumeros.length; j++) {
                if (arrayNumeros[i] == arrayNumeros[j]) {
                    if (arrayNumeros[i] != auxYaRepetido) {
                        auxYaRepetido = arrayNumeros[i];
                        arrayRepetidos[contRepetidos] = auxYaRepetido;
                        contRepetidos++;
                    }
                } else {
                    /**
                     * La i tomará este valor para saltarse todos los números repetidos.
                     * Por ejemplo la secuencia: 1, 3, 3, 3, 3, 4, 4, 7, 8, 9, 9, 12
                     * i = 1 -> valor = 3 ______ j = 2 -> valor = 3
                     * i = 1 -> valor = 3 ______ j = 3 -> valor = 3
                     * i = 1 -> valor = 3 ______ j = 4 -> valor = 3
                     * i = 1 -> valor = 3 ______ j = 5 -> valor = 4
                     * 
                     * Para la siguiente vuelta, en lugar de hacer que la i valga 3
                     * de nuevo y se repita todo sin cambios, pongo directamente
                     * la i al valor de j - 1, que acabaría siendo i = 4.
                     * Luego se hará el i++ y por tanto estaría apuntando a
                     * i = 5 -> valor = 4.
                     * 
                     * Por tanto, este i = j - 1 lo hago tan solo para evitar
                     * vueltas innecesarias.
                     */

                    i = j - 1;
                    break;
                }
            }
        }

        int[] listaNumerosRepetidos = new int[contRepetidos];
        System.arraycopy(arrayRepetidos, 0, listaNumerosRepetidos, 0, listaNumerosRepetidos.length);

        return listaNumerosRepetidos;
    }

}
