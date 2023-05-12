package OperacionesAdicionales.ArrayOperacionesAdicionales;

public class ArrayMatriz {

    /* ------------------------- Ordenar matriz enteros ------------------------- */
    /**
     * Tercer parámetro, el booleano:
     * true = orden ascendente
     * false = orden descendente
     */
    public static void ordenarMatriz(int[][] matriz, boolean orden) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++)
                intercambiarPosicionParaOrdenar(matriz, i, j, orden);
        }
    }

    /**<p>
     * La idea es ir intercambiando las posiciones de la posición que es pasada
     * por parámetro con la posición del número a encontrar, sea un número mayor
     * o menor, según el tercer parámetro, el booleano.
     * </p>
     * <p>
     * Suponiendo orden ascendente, los números del más pequeño al mayor.
     * Evalúa continuamente la posición "carton[fila][columna]" con la siguiente
     * posición de la matriz hasta evaluarla completa. Si encuentra un número
     * más pequeño intercambian posiciones, pero siguiente siendo
     * "carton[fila][columna]" la que se evalúa hasta el final.
     * </p>
     * <p>
     * Inicializo la 'j' fuera del segundo "for" porque la matriz, a medida que se
     * va ordenando ya no será necesario evaluar los valores ordenados. Por tanto,
     * la idea es comenzar a partir del siguiente valor a evaluar.
     * Gracias a esta inicialización, si tenemos la matriz
     * "int carton[][] = new int[3][5]"
     * y queremos evaluar, por ejemplo, a partir del "carton[1][3]", la 'i' se
     * inicializará a 1, pero la 'j' no basta con inicializarla a 3, porque de
     * hacerlo así, cuando pasáramos a la siguiente vuelta de 'i', no podríamos
     * acceder a "carton[2][0]" ya que la 'j' valdría directamente 3 e iríamos
     * directamente a "carton[2][3]".
     * Por esa razón, la primera vez si le digo exactamente la posición donde
     * empezar
     * la 'j', pero para las posteriores vueltas empezará por 0.
     * </p>
     * 
     * @param matriz array bidimensional {@code int} que será ordenada.
     * @param fila {@code int} valor de la fila donde se colocará el próximo
     * valor a ordenar
     * @param columna {@code int} valor de la columna donde se colocará el 
     * próximo valor a ordenar
     * @param orden {@code boolean} indica si será ascendete o descendente
     * @return formato: "[valor1, valor2, ..., valorN]"
     */
    private static void intercambiarPosicionParaOrdenar(int[][] matriz, int fila, int columna, boolean orden) {
        int tempNumMayor = matriz[fila][columna];

        for (int i = fila; i < matriz.length; i++) {
            int j = 0;
            if (i == fila)
                j += columna;

            for (; j < matriz[0].length; j++) {
                if (tipoOrden(tempNumMayor, matriz[i][j]) == orden) {
                    tempNumMayor = matriz[i][j];
                    matriz[i][j] = matriz[fila][columna];
                    matriz[fila][columna] = tempNumMayor;
                }
            }
        }
    }

    private static boolean tipoOrden(int num1, int num2) {
        return num1 > num2;
    }
}
