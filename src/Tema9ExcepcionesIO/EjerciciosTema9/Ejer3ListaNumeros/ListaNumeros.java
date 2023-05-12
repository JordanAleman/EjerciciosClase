package Tema9ExcepcionesIO.EjerciciosTema9.Ejer3ListaNumeros;

import java.io.FileWriter;
import java.io.IOException;

public class ListaNumeros {
    private int[] arrayNumeros;

    private final String PATH = "src\\Tema9ExcepcionesIO\\EjerciciosTema9\\Ejer3ListaNumeros\\";

    /* ------------------------------- Constructor ------------------------------ */
    public ListaNumeros(int tamArray) throws ArgumentoIncorrectoExcepcion {
        if (tamArray <= 0 || tamArray > 10)
            throw new ArgumentoIncorrectoExcepcion("Tamaño del array incorrecto");

        arrayNumeros = new int[tamArray];
        inicializar();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String stringNumeros = "";

        for (int i : arrayNumeros) 
            stringNumeros += i + " ";
        
        return stringNumeros;
    }

    private void inicializar() {
        for (int i = 0; i < arrayNumeros.length; i++)
            arrayNumeros[i] = (int) (Math.random() * 100) + 1;
    }

    /* --------------------------- Guardar en fichero --------------------------- */
    public void guardarEnFichero() throws IOException {
        try (FileWriter fSalida = new FileWriter(PATH + "numeros.txt", true)) {
            for (int numero : arrayNumeros)
                fSalida.write(numero + "\t");

            fSalida.close();
        }


    }
}
