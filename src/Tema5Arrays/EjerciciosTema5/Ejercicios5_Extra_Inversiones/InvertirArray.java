package Tema5Arrays.EjerciciosTema5.Ejercicios5_Extra_Inversiones;

public class InvertirArray {
    
    public static int[] nuevoArrayInvertido(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) 
            newArray[i] = array[newArray.length - 1 - i];

        return newArray;
    }

    public static int[] invertirConAuxArray(int[] array) {
        int[] newArrayAux = nuevoArrayInvertido(array);

        for (int i = 0; i < array.length; i++) 
            array[i] = newArrayAux[i];
        
        return array;
    }

    public static int[] invertirSinAuxArray(int[] array) {
        int aux;

        for (int i = 0; i < array.length/2; i++) {
            aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }

        return array;
    }
}
