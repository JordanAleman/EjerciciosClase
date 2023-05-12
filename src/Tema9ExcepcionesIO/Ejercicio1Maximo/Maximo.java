package Tema9ExcepcionesIO.Ejercicio1Maximo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Maximo {
    /**
     * calcula y devuelve el valor máximo de una serie de nos enteros leídos del
     * fichero de texto “numeros.txt” Este método puede lanzar excepciones de tipo
     * IOException y de conversión de formato. Dentro del método no se capturarán
     * sino que se propagan.
     */
    public int maximoSinExcepciones() throws IOException {
        int numeroMayor = 0;

        // try {
        Scanner ficheroNumeros = new Scanner(new File("src\\Tema9ExcepcionesIO\\Ejercicio1Maximo\\numeros.txt"));

        while (ficheroNumeros.hasNextInt()) {
            int siguienteNumero = ficheroNumeros.nextInt();

            if (siguienteNumero > numeroMayor)
                numeroMayor = siguienteNumero;
        }

        // } catch (IOException e) {
        // }

        return numeroMayor;
    }

    /**
     * Captura las posibles excepciones que se puedan generar, que serán del tipo
     * IOException si hay algún error al leer por ejemplo, FileNotFoundException si
     * no se encuentra el fichero al abrirlo, por ej, y de tipo
     * NumberFormatException al hacer conversiones. Todas estas excepciones se
     * capturan en el método emitiendo los mensajes correspondientes.
     */
    public int maximoConExcepciones() {
        int numeroMayor = 0;

        try {
            Scanner ficheroNumeros = new Scanner(new File("src\\Tema9ExcepcionesIO\\Ejercicio1Maximo\\numerdos.txt"));

            while (ficheroNumeros.hasNextInt()) {
                int siguienteNumero = ficheroNumeros.nextInt();

                if (siguienteNumero > numeroMayor)
                    numeroMayor = siguienteNumero;
            }

        } catch (FileNotFoundException exception) {
            System.out.println("No se encuentra el fichero");
            // exception.;

        } catch (InputMismatchException exception) {
            System.out.println("La siguiente línea no es un número");
        }

        return numeroMayor;
    }
}
