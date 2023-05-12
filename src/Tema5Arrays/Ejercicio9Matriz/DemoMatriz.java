package Tema5Arrays.Ejercicio9Matriz;

public class DemoMatriz {
    private Matriz miMatriz;
    private Matriz miMatrizAleatorios1;
    private Matriz miMatrizAleatorios2;
    private Matriz miMatrizAleatorios3;

    /* ------------------------------- Constructor ------------------------------ */
    public DemoMatriz() {
        // Forzarían un error por no tener al mismo tamaño 1 en la fila o columna
        // int[][] matrizNumeros = new int[0][3];
        // int[][] matrizNumeros = new int[2][0];

        // Forzaría un error por esta la matriz a null
        // int[][] matrizNumeros = null;

        int[][] matrizNumeros = new int[2][3];

        // Forzaría un error por no tener la misma cantidad de columnas en cada fila
        // matrizNumeros[0] = new int[5];
        matrizNumeros[0][0] = 2;
        matrizNumeros[0][2] = 2;
        matrizNumeros[1][0] = 3;
        matrizNumeros[1][1] = 4;
        matrizNumeros[1][2] = 4;

        miMatriz = new Matriz(matrizNumeros);

        miMatrizAleatorios1 = new Matriz(3, 4);
        miMatrizAleatorios2 = new Matriz(3, 4);
        miMatrizAleatorios3 = new Matriz(4, 7);
    }

    public DemoMatriz(int fila, int columna) {
        int[][] matrizNumeros = new int[2][3];

        matrizNumeros[0][0] = 2;
        matrizNumeros[0][2] = 2;
        matrizNumeros[1][0] = 3;
        matrizNumeros[1][1] = 4;
        matrizNumeros[1][2] = 4;

        miMatriz = new Matriz(matrizNumeros);

        miMatrizAleatorios1 = new Matriz(fila, columna);
        miMatrizAleatorios2 = new Matriz(fila, columna);
        miMatrizAleatorios3 = new Matriz(columna, fila);
    }

    /* -------------- Obtener el valor de una posición de la matriz ------------- */
    public void obtenerValorPosicion(int fila, int columna) {
        System.out.println("El valor de la posición [" + fila + "][" + columna + "] " +
                "de miMatriz es " + miMatriz.getValor(fila, columna) + "\n");
        System.out.println("------------------------------------------------------\n\n");
    }

    /* -- Ver el recorrido de las dos matrices creadas con valores aleatoriosx -- */
    /* ------------------- del 1 al 20 gracias al constructor ------------------- */
    public void verRecorridoArraysAleatorios() {
        System.out.println("1ª Matriz con valores aleatorios del 1 al 20");
        miMatrizAleatorios1.recorrerMatriz();

        System.out.println("\n2ª Matriz con valores aleatorios del 1 al 20");
        miMatrizAleatorios2.recorrerMatriz();

        System.out.println("\n3ª Matriz con valores aleatorios del 1 al 20");
        miMatrizAleatorios3.recorrerMatriz();
    }

    /* ---------------------------- Suma de matrices ---------------------------- */
    public void sumarMatricesAleatorias() {
        System.out.println("\n-------- SUMA ----------");
        miMatrizAleatorios1.recorrerMatriz();

        System.out.println("\t  +");
        miMatrizAleatorios2.recorrerMatriz();

        System.out.println("\t  =");
        Matriz matrizSuma = miMatrizAleatorios1.sumaDeMatrices(miMatrizAleatorios2);
        matrizSuma.recorrerMatriz();
    }

    /* ---------------------------- Resta de matrices --------------------------- */
    public void restaMatricesAleatorias() {
        System.out.println("\n--------- RESTA ---------");
        miMatrizAleatorios1.recorrerMatriz();

        System.out.println("\t    -");
        miMatrizAleatorios2.recorrerMatriz();

        System.out.println("\t    =");
        Matriz matrizResta = miMatrizAleatorios1.restaDeMatrices(miMatrizAleatorios2);
        matrizResta.recorrerMatriz();
    }

    /* -------------------- Multiplicar matriz por un número -------------------- */
    public void multiplicacionPorFactorMatriz(int numero) {
        System.out.println("\n---------------- MULTIPLICACIÓN POR FACTOR -------------");
        Matriz matrizMultiplicacion1 = miMatrizAleatorios1.multiplicarPor(numero);
        miMatrizAleatorios1.recorrerMatriz();
        System.out.println("\t    *\n\t   (" + numero + ")\n\t    = ");
        matrizMultiplicacion1.recorrerMatriz();

        Matriz matrizMultiplicacion2 = miMatrizAleatorios2.multiplicarPor(numero);
        miMatrizAleatorios2.recorrerMatriz();
        System.out.println("\t    *\n\t   (" + numero + ")\n\t    = ");
        matrizMultiplicacion2.recorrerMatriz();
    }

    /* ------------------- Multiplicar matriz por otra matriz ------------------- */
    public void multiplicacionPorOtraMatriz() {
        System.out.println("\n---------------- MULTIPLICACIÓN POR MATRIZ -------------");
        miMatrizAleatorios1.recorrerMatriz();

        System.out.println("\t    *");
        miMatrizAleatorios3.recorrerMatriz();

        System.out.println("\t    =");
        Matriz matrizMultiplicacion = miMatrizAleatorios1.multiplicarPor(miMatrizAleatorios3);
        matrizMultiplicacion.recorrerMatriz();
    }

    /* --------------------------- Matriz transpuesta --------------------------- */
    public void matrizTranspuesta() {
        System.out.println("\n---------------- TRANSPUESTA -------------");
        miMatrizAleatorios1.recorrerMatriz();

        System.out.println("\t    -");
        System.out.println("\t    -");
        System.out.println("\t    -");

        Matriz miMatrizTranspuesta = miMatrizAleatorios1.transpuesta();
        miMatrizTranspuesta.recorrerMatriz();
    }

}
