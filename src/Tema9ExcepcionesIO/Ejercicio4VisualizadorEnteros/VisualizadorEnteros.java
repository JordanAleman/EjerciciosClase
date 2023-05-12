package Tema9ExcepcionesIO.Ejercicio4VisualizadorEnteros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VisualizadorEnteros {
    private static final String PATH = "src\\Tema9ExcepcionesIO\\Ejercicio4VisualizadorEnteros\\";
    private static Scanner miTeclado;

    public static void mostrarEnteros(String nombreFichero) throws FileNotFoundException {
        Scanner leerFichero = new Scanner(new File(PATH + nombreFichero));
        int saltoLinea = 0;

        while (leerFichero.hasNext()) {
            if (saltoLinea == 10) {
                System.out.println("Pulse enter para continuar");
                miTeclado = new Scanner(System.in);
                miTeclado.nextLine();

                saltoLinea = 0;
            }

            saltoLinea++;

            try {
                System.out.println(leerFichero.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("***");
                leerFichero.next();
            }
        }

    }
}
