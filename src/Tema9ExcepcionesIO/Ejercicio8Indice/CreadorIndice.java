package Tema9ExcepcionesIO.Ejercicio8Indice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreadorIndice {
    private Scanner leerFichero;
    private PrintWriter escribirEnFichero;
    private IndiceDocumento unIndiceDocumento;

    private final String PATH = "src\\Tema9ExcepcionesIO\\Ejercicio8Indice\\";

    /* ------------------------------- Constructor ------------------------------ */
    public CreadorIndice() {
        unIndiceDocumento = new IndiceDocumento();
    }

    /* ----------------------- Listar fichero por pantalla ---------------------- */
    public void leerFichero() throws FileNotFoundException {
        leerFichero = new Scanner(new File(PATH + "texto.txt"));

        while (leerFichero.hasNext()) 
            System.out.println(leerFichero.nextLine());
    }

    public void leerFicheroIndices() throws FileNotFoundException {
        leerFichero = new Scanner(new File(PATH + "indice.txt"));

        while (leerFichero.hasNext()) 
            System.out.println(leerFichero.nextLine());
    }

    /* ------------------------------ Listar Índice ----------------------------- */
    public void listarIndice() throws FileNotFoundException, IOException {
        leerFichero = new Scanner(new File(PATH + "texto.txt"));

        int numeroLinea = 1;
        String[] lineaActual;

        while (leerFichero.hasNext()) {
            lineaActual = leerFichero.nextLine().split("\\s+");

            for (int i = 0; i < lineaActual.length; i++) 
                unIndiceDocumento.addPalabra(lineaActual[i], numeroLinea);
            
            numeroLinea++;
        }

        unIndiceDocumento.listarIndiceDocumento();

        try {
            guardarIndice();
        } catch (IOException e) {
            System.out.println("Problema interno");
        }
    }

    private void guardarIndice() throws IOException {
        escribirEnFichero = new PrintWriter(new BufferedWriter(new FileWriter(new File(PATH + "indice.txt"))));

        for (EntradaIndice iteradoEntradaIndice : unIndiceDocumento.getListaEntradaIndice()) 
            escribirEnFichero.print(iteradoEntradaIndice + "\n");

        escribirEnFichero.close();
    }


}
