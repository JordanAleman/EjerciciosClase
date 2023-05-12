package Tema5Arrays.EjerciciosTema5.Ejercicio5_5PrimerasPruebasArray;

public class MainGenerarArray {
    public static void main(String[] args) {
        // GenerarArray miGenerarArray = new GenerarArray();

        // System.out.println(miGenerarArray);

        // miGenerarArray.arraySemanaDado("Lunes");
        // // miGenerarArray.arraySemanaDado("Martes");

        // System.out.println(miGenerarArray);

        int[] arrayNumerosAleatorios = GenerarArray.arrayNumerosAleatorios(20);
        System.out.print("[ ");
        for (int i : arrayNumerosAleatorios) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        GenerarArray.devolverDiaSemana(2);

    }
}
