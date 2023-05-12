package Tema5Arrays.EjerciciosTema5.Ejercicios5_Extra_Inversiones;

public class MainInversiones {
    public static void main(String[] args) {
        // int[] miArrayNumeros = new int[6];
        int[] miArrayNumeros = {1, 2, 3, 4, 5, 6};

        // for (int i = 0; i < miArrayNumeros.length; i++) 
        //     miArrayNumeros[i] = (int) (Math.random() * 10) + 1;
        
        for (int i : miArrayNumeros) 
            System.out.print(i + " ");
        
        int[] miArrayNumerosInvertido = InvertirArray.invertirSinAuxArray(miArrayNumeros);

        System.out.println();
        for (int i : miArrayNumerosInvertido) 
            System.out.print(i + " ");
    }
}
