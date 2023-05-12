package Tema5Arrays.Ejercicio9Matriz;

public class MainMatriz {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        DemoMatriz miDemosMatriz = new DemoMatriz();

        /* -------------- Obtener el valor de una posición de la matriz ------------- */
        // miDemosMatriz.obtenerValorPosicion(0, 2);

        /* -- Ver el recorrido de las dos matrices creadas con valores aleatoriosx -- */
        /* ------------------- del 1 al 20 gracias al constructor ------------------- */
        // miDemosMatriz.verRecorridoArraysAleatorios();

        /* ---------------------------- Suma de matrices ---------------------------- */
        // miDemosMatriz.sumarMatricesAleatorias();

        /* ---------------------------- Resta de matrices --------------------------- */
        // miDemosMatriz.restaMatricesAleatorias();

        /* -------------------- Multiplicar matriz por un número -------------------- */
        // miDemosMatriz.multiplicacionPorFactorMatriz(2);

        /* ------------------- Multiplicar matriz por otra matriz ------------------- */
        miDemosMatriz.multiplicacionPorOtraMatriz();

        /* --------------------------- Matriz transpuesta --------------------------- */
        // miDemosMatriz.matrizTranspuesta();
    }
}
