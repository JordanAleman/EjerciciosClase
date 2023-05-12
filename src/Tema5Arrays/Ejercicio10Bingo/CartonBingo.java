package Tema5Arrays.Ejercicio10Bingo;

public class CartonBingo {
    private int[][] carton;
    private String[][] cartonString;

    private int[] numerosTachados;
    private int siguientePosicionNumerosTachados;

    private boolean esLinea;
    private int filaGanadora;

    private final int FILAS = 3;
    private final int COLUMNAS = 8;

    private final int MAXIMO_NUMERO_POR_COLUMNA = 10;

    private final String VACIO = "████";
    private final String TACHADO = (char) 22 + "" + (char) 22;

    /* ------------------------------- Constructor ------------------------------ */
    public CartonBingo() {
        carton = new int[FILAS][COLUMNAS];
        cartonString = new String[FILAS][COLUMNAS];

        numerosTachados = new int[MAXIMO_NUMERO_POR_COLUMNA * COLUMNAS];
        siguientePosicionNumerosTachados = 0;

        esLinea = false;
        generarNuevoCarton();
    }

    private void generarNuevoCarton() {
        int contMas10 = 0;
        int numAleatorio;
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                do
                    numAleatorio = generarAleatorio() + contMas10;
                while (estaNumero(carton, numAleatorio));

                carton[j][i] = numAleatorio;
                ordenarMatrizPorColumnas(i, j);
            }

            contMas10 += 10;
        }

        transformarACarton();
    }

    private boolean estaNumero(int[][] cartonRellenar, int numeroAleatorio) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (cartonRellenar[i][j] == numeroAleatorio)
                    return true;
            }
        }

        return false;
    }

    private int generarAleatorio() {
        return (int) (Math.random() * MAXIMO_NUMERO_POR_COLUMNA) + 1;
    }

    private void ordenarMatrizPorColumnas(int columna, int limite) {
        int aux;

        for (int i = 0; i < carton.length; i++) {
            for (int j = 1 + i; j <= limite; j++) {
                if (carton[i][columna] > carton[j][columna]) {
                    aux = carton[i][columna];
                    carton[i][columna] = carton[j][columna];
                    carton[j][columna] = aux;
                }
            }
        }
    }

    private void transformarACarton() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                cartonString[i][j] = carton[i][j] + "";
            }
        }

        rellenarEspaciosVacios();
    }

    private void rellenarEspaciosVacios() {
        int posAleatoriaFila;
        int posAleatoriaColumna;

        int ultimos4vacios = 0;

        while (ultimos4vacios != 12) {
            posAleatoriaFila = (int) (Math.random() * FILAS);
            posAleatoriaColumna = (int) (Math.random() * COLUMNAS);

            if (comprobarHasta4VaciosPorLinea(posAleatoriaFila)) {
                if (!cartonString[posAleatoriaFila][posAleatoriaColumna].equals(VACIO)
                        && comprobarSolo2EspaciosVacios(posAleatoriaColumna)) {
                    cartonString[posAleatoriaFila][posAleatoriaColumna] = VACIO;
                    ultimos4vacios++;
                }
            }
        }
    }

    private boolean comprobarHasta4VaciosPorLinea(int fila) {
        int contador = 0;
        for (int i = 0; i < COLUMNAS; i++) {
            if (cartonString[fila][i].equals(VACIO))
                contador++;
        }

        return contador < 4;
    }

    private boolean comprobarSolo2EspaciosVacios(int columna) {
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            if (cartonString[i][columna].equals(VACIO))
                contador++;
        }

        return contador < 2;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int[][] getCarton() {
        return carton;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        String stringArray = "";

        stringArray += "    ";
        for (int i = 0; i < COLUMNAS; i++)
            stringArray += String.format("%4d  ", i);

        stringArray += "\n   ";
        for (int i = 0; i < COLUMNAS; i++)
            stringArray += "------";

        stringArray += "\n";
        for (int i = 0; i < FILAS; i++) {
            stringArray += i + "  |";
            for (int j = 0; j < cartonString[i].length; j++) {
                stringArray += String.format((j == cartonString[i].length - 1)
                        ? "%4s"
                        : "%4s  ", cartonString[i][j]);
            }
            stringArray += "|\n";
        }

        return stringArray;
    }

    /* ------------------------------ Tachar número ----------------------------- */
    public void tacharNumero() {
        int numAleatorio;

        do {
            numAleatorio = (int) (Math.random() * 80) + 1;
        } while (estaNumeroYaEscogido(numerosTachados, numAleatorio));

        numerosTachados[siguientePosicionNumerosTachados++] = numAleatorio;
        System.out.println("Número a tachar el " + numAleatorio);
        tacharNumero(numAleatorio);
    }

    private boolean estaNumeroYaEscogido(int[] numerosTachados, int numeroAleatorio) {
        for (int i = 0; i < numerosTachados.length; i++) {
            if (numerosTachados[i] == numeroAleatorio)
                return true;
        }

        return false;
    }

    private void tacharNumero(int numero) {
        if (numero <= 0 || numero > MAXIMO_NUMERO_POR_COLUMNA * COLUMNAS)
            throw new IllegalArgumentException("Número fuera del bingo");

        /**
         * Puesto que los números en cada columna están ordenados de tal manera que
         * en la columna 0 van del 1 al 10, en la columna 1 del 11 al 20 y así
         * sucesivamente, podemos buscar en qué columna se encuentra directamente
         * el número pasado por parámetro.
         */
        int columnaABuscar = (numero - 1) / MAXIMO_NUMERO_POR_COLUMNA;
        String posibleNumero;

        for (int i = 0; i < FILAS; i++) {
            posibleNumero = cartonString[i][columnaABuscar];

            if (comprobarSiEsNumero(posibleNumero)) {
                if (obtenerNumero(posibleNumero) == numero) {
                    cartonString[i][columnaABuscar] = TACHADO;
                    System.out.println(this);
                }
            }

            if (!esLinea) {
                if (comprobarEsLinea(i)) {
                    esLinea = true;
                    filaGanadora = i;
                    System.out.println("\n¡Tiene línea!\n");
                }
            }

            if (esLinea) {
                if (comprobarBingo(filaGanadora)) {
                    System.out.println("¡Bingo!");
                    System.exit(0);
                }
            }
        }

    }

    private boolean comprobarSiEsNumero(String posibleNumero) {
        return Character.isDigit(posibleNumero.charAt(0));
    }

    private int obtenerNumero(String numero) {
        return Integer.parseInt(numero);
    }

    private boolean comprobarEsLinea(int fila) {
        for (int i = 0; i < COLUMNAS; i++) {
            if (comprobarSiEsNumero(cartonString[fila][i]))
                return false;
        }

        return true;
    }

    private boolean comprobarBingo(int filaGanadora) {
        for (int i = 0; i < FILAS; i++) {
            if (i == filaGanadora)
                continue;

            for (int j = 0; j < COLUMNAS; j++) {
                if (comprobarSiEsNumero(cartonString[i][j]))
                    return false;
            }
        }

        return true;
    }
}
