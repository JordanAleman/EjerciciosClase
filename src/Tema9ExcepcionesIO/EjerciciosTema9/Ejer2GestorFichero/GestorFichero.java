package Tema9ExcepcionesIO.EjerciciosTema9.Ejer2GestorFichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorFichero {
    private String nombreFichero;
    private PrintWriter fSalida;

    /* ------------------------------- Constructor ------------------------------ */
    public GestorFichero(String nombreFichero) {
        if (nombreFichero.isBlank())
            throw new IllegalArgumentException("String vacío o nulo");

        this.nombreFichero = nombreFichero;
    }

    /* ------------------------------ Abrir fichero ----------------------------- */
    public void abrirFichero() {
        try {
            fSalida = new PrintWriter(new BufferedWriter(new FileWriter(nombreFichero)));
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero");
        }
    }

    public void abirFicheroAdd() {
        try {
            fSalida = new PrintWriter(new BufferedWriter(new FileWriter(nombreFichero, true)));
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero");
        }
    }

    /* ----------------------------- Cerrar fichero ----------------------------- */
    public void cerrarFichero() {
        try {
            fSalida.close();
        } catch (NullPointerException e) {
            System.out.println("No hay un fichero abierto");
        }
    }

    /* ---------------------- Escribir datos en el fichero ---------------------- */
    public void escribirDatos() {
        try {
            fSalida.println("Tabla del 5 :D");

            for (int i = 1; i <= 1000; i++) 
                fSalida.printf("%4s * 5 = %4s%n", i, i * 5);

            System.out.println("Fichero añadido en la ruta " + nombreFichero);
            System.out.println("Datos añadidos correctamente.");
        } catch (NullPointerException e) {
            System.out.println("No hay fichero abierto");
        }
    }  
}
