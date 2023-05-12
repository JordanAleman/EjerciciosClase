package Tema9ExcepcionesIO.Ejercicio6ComandoType;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ComandoType {
    private static Scanner leerFichero;

    // private final static String PATH = "src\\Tema9ExcepcionesIO\\Ejercicio6ComandoType\\";

    public static void mostrarFichero(File fichero) throws IOException {
        leerFichero = new Scanner(fichero);
        int contador = 1;

        while (leerFichero.hasNext()) 
            System.out.println(contador++ + ": " + leerFichero.nextLine());
    }
}
