package Tema5Arrays.Ejercicio9Matriz;

public class Matriz {
    private int[][] matrizNumeros;

    private int filas;
    private int columnas;

    /* ------------------------------- Constructor ------------------------------ */
    public Matriz(int filas) {
        if (filas < 1)
            errorParametros("Error en parámetro");

        this.filas = filas;
        columnas = filas;

        matrizNumeros = new int[filas][filas];
        inicializar();
    }

    public Matriz(int filas, int columnas) {
        if (filas < 1 || columnas < 1)
            errorParametros("Error en parámetro");

        this.filas = filas;
        this.columnas = columnas;

        matrizNumeros = new int[filas][columnas];
        inicializar();
    }

    public Matriz(int[][] otraMatrizNumeros) {
        if (!verificarMatrizValida(otraMatrizNumeros))
            errorParametros("Error en parámetro");

        this.filas = otraMatrizNumeros.length;
        this.columnas = otraMatrizNumeros[0].length;
        matrizNumeros = otraMatrizNumeros.clone();

        for (int i = 0; i < otraMatrizNumeros.length; i++)
            matrizNumeros[i] = otraMatrizNumeros[i].clone();
    }

    private void inicializar() {
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++)
                matrizNumeros[i][j] = (int) (Math.random() * 20) + 1;
        }
    }

    private boolean verificarMatrizValida(int[][] matriz) {
        if (matriz == null)
            return false;

        if (matriz.length < 1 || matriz[0].length < 1)
            return false;

        int numColumnasInicial = matriz[0].length;

        for (int i = 1; i < matriz.length; i++) {
            int numColumnasOtraFila = matriz[i].length;

            if (numColumnasInicial != numColumnasOtraFila)
                return false;
        }

        return true;
    }

    /* ----------------------------- ControlErrores ----------------------------- */
    private void errorParametros(String error) {
        System.out.println();
        throw new IllegalArgumentException(error);
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int[][] getMatrizNumeros() {
        return matrizNumeros;
    }

    public int getValor(int fila, int columna) {
        if (!comprobarIndices(fila, columna))
            errorParametros("Parámetros fuera de los límites");

        return matrizNumeros[fila][columna];
    }

    private boolean comprobarIndices(int fila, int columna) {
        if (fila < 0 || fila >= this.filas)
            return false;

        if (columna < 0 || columna >= this.columnas)
            return false;

        return true;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setValor(int valor, int fila, int columna) {
        if (!comprobarIndices(fila, columna))
            errorParametros("Parámetros fuera de los límites");

        matrizNumeros[fila][columna] = valor;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void recorrerMatriz() {
        System.out.println("\n" + this);
    }

    @Override
    public String toString() {
        String stringArray = "";

        stringArray += "    ";
        for (int i = 0; i < matrizNumeros[0].length; i++)
            stringArray += String.format("%4d  ", i);

        stringArray += "\n   ";
        for (int i = 0; i < matrizNumeros[0].length; i++)
            stringArray += "------";

        stringArray += "\n";
        for (int i = 0; i < matrizNumeros.length; i++) {
            stringArray += i + "  |";
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                stringArray += String.format((j == matrizNumeros[i].length - 1)
                        ? "%4d"
                        : "%4d  ", matrizNumeros[i][j]);
            }
            stringArray += "|\n";
        }

        return stringArray;
    }


    /* --------------------------- OperacionesMatrices -------------------------- */
    /* ------- Devolver la suma de la matriz con la recibida por parámetro ------ */
    public Matriz sumaDeMatrices(Matriz otraMatriz) {
        if (!verificarPosibleSumaOResta(otraMatriz))
            errorParametros("Matriz de distintas dimensiones");

        Matriz sumaMatriz = new Matriz(matrizNumeros);

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++)
                sumaMatriz.getMatrizNumeros()[i][j] += otraMatriz.getMatrizNumeros()[i][j];
        }

        return sumaMatriz;
    }

    /* ------ Devolver la resta de la matriz con la recibida por parámetro ------ */
    public Matriz restaDeMatrices(Matriz otraMatriz) {
        if (!verificarPosibleSumaOResta(otraMatriz))
            errorParametros("Matriz de distintas dimensiones");

        Matriz restaMatriz = new Matriz(matrizNumeros);

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++)
                restaMatriz.getMatrizNumeros()[i][j] -= otraMatriz.getMatrizNumeros()[i][j];
        }

        return restaMatriz;
    }

    /* ------ Devolver la multiplicación de la matriz por un número entero ------ */
    public Matriz multiplicarPor(int numero) {
        Matriz multiplicacionMatriz = new Matriz(matrizNumeros);

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++)
                multiplicacionMatriz.getMatrizNumeros()[i][j] *= numero;
        }

        return multiplicacionMatriz;
    }

    /* ------------------ Devolver el producto de dos matrices ------------------ */
    public Matriz multiplicarPor(Matriz otraMatriz) {
        if (!verificarPosibleProducto(otraMatriz))
            errorParametros("Matrices sin dimensiones compatibles");

        // Usaremos esta variable para trabajar directamente con las matrices
        int[][] otraMatrizNumeros = otraMatriz.getMatrizNumeros();

        /**
         * Si tuviéramos una matriz 2x3 y la multiplicamos por una 3x2, veremos que
         * podrá ser multiplicada porque coinciden la cantidad de columnas de la 
         * primera matriz con las filas de la segunda matriz (ambas coinciden en 3).
         * 
         * La matriz resultante tendrá como dimensión las filas de la primera matriz
         * por las columnas de la segunda matriz. En este ejemplo sería un 2x2.
         * 
         * No es conmutativa. Es decir, no es lo mismo
         * (2x3) * (3x2) != (3x2) * (2x3)
         */
        int[][] resultadoMatrizMultiplicacion = new int[matrizNumeros.length][otraMatrizNumeros[0].length];
        int acumuladorSuma;


        /**
         * Tomando como ejemplo
         *                 | 1  6 |
         * | 2  3  5 |  *  | 4  3 |
         * | 1  2  4 |     | 2  5 |
         * 
         * Tendríamos
         * 
         * | 2*1+3*4+5*2    2*6+3*3+5*5 |      =    | 24  46 |
         * | 1*1+2*4+4*2    1*6+2*3+4*5 |           | 17  32 |
         * 
         * Para conseguir esto tenemos que bucle 'i' que recorrerá las filas y el
         * blucle 'j' que recorrerá las columnas. 
         * Se ha anidado un tercer bucle, el 'k' como un auxiliar que permite hacer
         * los cálculos de cada posición, almacenarlos en 'acumuladorSuma' y al
         * acabar el bucle 'k' almacenar ese resultado en la posición que
         * corresponde en resultadoMatrizMultiplicacion[i][j]
         */
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < otraMatrizNumeros[0].length; j++) {

                acumuladorSuma = 0;
                for (int k = 0; k < matrizNumeros[0].length; k++)
                    acumuladorSuma += matrizNumeros[i][k] * otraMatrizNumeros[k][j];

                resultadoMatrizMultiplicacion[i][j] = acumuladorSuma;
            }
        }

        return new Matriz(resultadoMatrizMultiplicacion);
    }

    public Matriz transpuesta() {
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++)
                matrizTranspuesta[i][j] = matrizNumeros[j][i];
        }
        return new Matriz(matrizTranspuesta);
    }

    /* ---------------------- Control operaciones Matrices ---------------------- */
    private boolean verificarPosibleSumaOResta(Matriz otraMatriz) {
        if (otraMatriz == null)
            return false;

        // Si tienen distinto tamaño de filas devolver false
        if (otraMatriz.getMatrizNumeros().length != matrizNumeros.length)
            return false;

        // Si tienen distinto tamaño de columnas devolver false
        if (otraMatriz.getMatrizNumeros()[0].length != matrizNumeros[0].length)
            return false;

        return true;
    }

    private boolean verificarPosibleProducto(Matriz otraMatriz) {
        if (otraMatriz == null)
            return false;

        if (matrizNumeros[0].length != otraMatriz.getMatrizNumeros().length)
            return false;

        return true;
    }

}
