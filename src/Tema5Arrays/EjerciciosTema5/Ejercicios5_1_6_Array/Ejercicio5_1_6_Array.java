package Tema5Arrays.EjerciciosTema5.Ejercicios5_1_6_Array;

public class Ejercicio5_1_6_Array {

    /* ----- 5.6 - Calcular la media del array que se recibe como parámetro ----- */
    public static double calcularMedia(double[] notas) {
        double media = 0.0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        return media / notas.length;
    }

    /* ------ 5.7 - Recibir un array de enteros y devolver el valor máximo ------ */
    public static int valorMaximoArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }

        return max;
    }

    /* --------------------- 5.8 - Recibir array de enteros. -------------------- */
    /* -------------- Devolver array con valores pares encontrados -------------- */
    public static int[] paresEncontradosArray(int[] array) {
        int cantidadPares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                cantidadPares++;
        }

        if (cantidadPares == 0)
            return null;

        int[] paresArray = new int[cantidadPares];
        int rellenarPares = 0;

        for (int i = 0; i < array.length && rellenarPares < cantidadPares; i++) {
            if (array[i] % 2 == 0) {
                paresArray[rellenarPares] = array[i];
                rellenarPares++;
            }
        }

        return paresArray;
    }

    /* ------------- 5.9 - Rotar una posición a la derecha el array ------------- */
    public static void rotarDerecha(int[] numeros) {
        int ultimoValor = numeros[0];

        for (int i = 0; i < numeros.length - 1; i++) 
            numeros[i] = numeros[i + 1];

        numeros[numeros.length - 1] = ultimoValor;
    }

    // Ejer.5.10. Diseña el método:
    // public int[ ] generarArray(){...}
    // de la forma siguiente:

    // • define un array local numerosPares
    // • genera nos aleatorios entre 1 y 50 y guarda en el array los que sean pares
    // • devuelve el array cuando esté completo (la constante MAX indica el tamaño
    // máximo del array)
    public static int[] generarArray(int max) {
        int[] paresArray = new int[max];
        int contPosicion = 0;
        int numRandom;

        while (contPosicion < max) {
            numRandom = (int) (Math.random() * 50) + 1;

            if (numRandom % 2 == 0) {
                paresArray[contPosicion] = numRandom;
                contPosicion++;
            }
        }

        return paresArray;
    }

    // 5.11 Completa el método:
    // public int[ ] calcularFrecuencias() {...}
    // que genera 100 nos aleatorios entre 1 y 9 y devuelve la frecuencia de
    // aparición del valor 1, del valor 2, del valor 3, …….
    public static int[] calcularFrecuencias() {
        int[] numerosRandomArray = new int[100];
        int[] frecuenciaArray = new int[9];

        for (int i = 0; i < frecuenciaArray.length; i++) 
            frecuenciaArray[i] = 0;
        
        
        for (int i = 0; i < numerosRandomArray.length; i++) {
            numerosRandomArray[i] = (int) (Math.random() * 9) + 1;
            frecuenciaArray[numerosRandomArray[i] - 1]++;
        }

        return frecuenciaArray;
    }

}
