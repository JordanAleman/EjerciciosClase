package Tema9ExcepcionesIO.Ejercicio3SumadorEnterosScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumadorEnterosScanner {
    private Scanner leerFichero;
    private static final String PATH = "src\\Tema9ExcepcionesIO\\Ejercicio3SumadorEnterosScanner\\";

    /* ------------------------------- Constructor ------------------------------ */
    public SumadorEnterosScanner(String nombreFichero) throws FileNotFoundException {
        if (nombreFichero.isBlank()) {
            throw new IllegalArgumentException();
        }

        leerFichero = new Scanner(new File(PATH + nombreFichero));
    }

    /* ------------------------ Sumar enteros del fichero ----------------------- */
    public int sumar() {
        int suma = 0;

        while (leerFichero.hasNext()) {
            try {
                suma += leerFichero.nextInt();
            } catch (InputMismatchException e) {
                leerFichero.next();
            }
        }

        return suma;
    }

}
