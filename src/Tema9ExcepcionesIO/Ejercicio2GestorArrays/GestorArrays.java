package Tema9ExcepcionesIO.Ejercicio2GestorArrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Excepciones.ArgumentoIncorrectoExcepcion;
import OperacionesAdicionales.StringOperaciones.Conversiones;

public class GestorArrays {
    private int[] arrayNumeros;
    private int tamArray;
    private String nombreFichero;
    private BufferedReader fichero;
    // private PrintWriter ficheroSalida;

    private final String PATH = "src\\Tema9ExcepcionesIO\\Ejercicio2GestorArrays\\";

    /* ------------------------------- Constructor ------------------------------ */
    public GestorArrays(String nombreFichero, int tamArray) throws ArgumentoIncorrectoExcepcion {
        if (nombreFichero.isBlank())
            throw new ArgumentoIncorrectoExcepcion("Nombre del fichero no puede ser vacío ni nulo");
        if (tamArray <= 0)
            throw new ArgumentoIncorrectoExcepcion("Tamaño del array incorrecto");

        // fichero = new BufferedReader(new FileReader(new File(PATH + nombreFichero)));
        this.tamArray = tamArray;
        arrayNumeros = new int[tamArray];

        try {
            cargarArray();
        } catch (IOException e) {
            System.out.println("Error con la carga del fichero o fichero no existe");
        }
    }

    private void cargarArray() throws IOException {
        fichero = new BufferedReader(new FileReader(new File(PATH + nombreFichero)));
        String strLineaActual = "";
        int posArrayNumeros = 0;

        while ((strLineaActual = fichero.readLine()) != null) {
            if (Conversiones.esEntero(strLineaActual)) {
                if (posArrayNumeros < tamArray) 
                    arrayNumeros[posArrayNumeros++] = Integer.parseInt(strLineaActual);
            }
        }

        fichero.close();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return super.toString();
    }

}