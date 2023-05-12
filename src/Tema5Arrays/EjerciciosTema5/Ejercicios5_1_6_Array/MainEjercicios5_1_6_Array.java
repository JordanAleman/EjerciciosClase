package Tema5Arrays.EjerciciosTema5.Ejercicios5_1_6_Array;

import java.util.Arrays;

public class MainEjercicios5_1_6_Array {
    public static void main(String[] args) {
        /* ----- 5.6 - Calcular la media del array que se recibe como parámetro ----- */
        double[] mediaNotas = { 5.0, 10.0, 20.0, 15.0, 10.0 };

        System.out.print("\nNotas:\n");
        for (double valor : mediaNotas)
            System.out.print(valor + "  ");

        System.out.println("\nLa nota media es: " + Ejercicio5_1_6_Array.calcularMedia(mediaNotas));

        /* ------ 5.7 - Recibir un array de enteros y devolver el valor máximo ------ */
        int[] arrayNumeros = { 11, 2, 20, 3, 8, 25, 4, 5, 10, 14, 7, 1 };

        System.out.println("\nArray:");
        System.out.println(Arrays.toString(arrayNumeros));

        System.out.println("Valor máximo: " + Ejercicio5_1_6_Array.valorMaximoArray(arrayNumeros) + "\n");

        /* --------------------- 5.8 - Recibir array de enteros. -------------------- */
        /* -------------- Devolver array con valores pares encontrados -------------- */
        int[] arrayNumerosPares = Ejercicio5_1_6_Array.paresEncontradosArray(arrayNumeros);

        System.out.println("\nArray de números pares del array anterior");
        System.out.println(Arrays.toString(arrayNumerosPares) + "\n");

        /* ------------- 5.9 - Rotar una posición a la derecha el array ------------- */
        Ejercicio5_1_6_Array.rotarDerecha(arrayNumerosPares);
        System.out.println("\nRotar una posición a la derecha el array de números pares");
        System.out.println(Arrays.toString(arrayNumerosPares) + "\n");


        /* - 5.10 - Array de nº aleatorios pares entre 1 y 50 hasta un max de veces - */
        int max5_10 = 20;
        int[] arrayNumerosPares5_10 = Ejercicio5_1_6_Array.generarArray(max5_10);

        System.out.println("\nLos pares que han salido aleatoriamente de " + max5_10 + " veces han sido:");
        System.out.println(Arrays.toString(arrayNumerosPares5_10) + "\n");

        /* ----------------------- 5.11 Frecuencia de números ----------------------- */
        int[] arrayFrecuencia = Ejercicio5_1_6_Array.calcularFrecuencias();

        System.out.println("\nEntre 100 números aleatorios, la frecuencia del valor 1, el valor 2... han sido:");

        
        for (int i = 0; i < arrayFrecuencia.length; i++) {
            System.out.println((i + 1) + ": " + arrayFrecuencia[i]);
        }
    }
}
