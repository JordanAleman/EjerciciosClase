package Tema9ExcepcionesIO.Ejercicio5GestorTeatro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Teatro {
    private boolean[][] teatro;

    public static final int FILAS = 10;
    public static final int ASIENTOS = 10;

    private final String PATH = "src\\Tema9ExcepcionesIO\\Ejercicio5GestorTeatro\\";

    /* ------------------------------- Constructor ------------------------------ */
    public Teatro() {
        inicializar();
    }

    public Teatro(String fichero) throws FileNotFoundException {
        inicializar();
        Scanner leerFichero = new Scanner(new File(PATH + fichero));

        while (leerFichero.hasNext()) {
            String[] aux = leerFichero.nextLine().split(":");
            int fila = Integer.parseInt(aux[0]);
            int asiento = Integer.parseInt(aux[1]);
            teatro[fila][asiento] = false; 
        }
        
        leerFichero.close();;
    }

    public void inicializar() {
        teatro = new boolean[FILAS][ASIENTOS];

        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++)
                teatro[i][j] = true;
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    public boolean[][] getTeatro() {
        return teatro;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setTeatro(int fila, int asiento, boolean disponibilidad) {
        teatro[fila][asiento] = disponibilidad;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        StringBuffer stringTeatro = new StringBuffer("");

        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++)
                stringTeatro.append((teatro[i][j]) ? "__ " : "XX ");
            stringTeatro.append("\n");
        }

        return new String(stringTeatro);
    }

    public void mostrarTeatro() {
        System.out.println("Asientos disponibles en el teatro:\n");
        System.out.println(this);
    }

    /* ------------------------------ LeerVendidos ------------------------------ */
    public void leerVendidos(String fichero) throws IOException {
        Scanner leerFichero = new Scanner(new File(PATH + fichero));

        while (leerFichero.hasNext()) 
            System.out.println(leerFichero.nextLine());
    }

    /* ----------------------------- GuardarVendidos ---------------------------- */
    public void guardarVendidos(String fichero) throws IOException {
        PrintWriter fVendidas = new PrintWriter(new BufferedWriter(new FileWriter(new File(PATH + fichero))));

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < ASIENTOS; j++) {
                if (!teatro[i][j])
                    fVendidas.print(i + ":" + j + "\n");
            }
        }

        fVendidas.close();
    }    

    /* ----------------------------- VenderEntradas ----------------------------- */
    public boolean venderEntradas(int cantidadEntradas) throws IOException {
        if (cantidadEntradas > ASIENTOS || cantidadEntradas < 1)
            return false;

        Posicion asientosLibres = hayPlazasSeguidas(cantidadEntradas);

        if (asientosLibres == null) 
            return false;
        
        actualizarTeatro(asientosLibres, cantidadEntradas);

        return true;
    }

    private Posicion hayPlazasSeguidas(int cantidadEntradas) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < ASIENTOS; j++) {
                if (teatro[i][j] == true) {
                    if ((ASIENTOS - j) >= cantidadEntradas)
                        return new Posicion(i, j);
                    else
                        j = ASIENTOS;
                }
            }
        }

        return null;
    }

    private void actualizarTeatro(Posicion posicionLibre, int cantidadEntradas) throws IOException {
        for (int j = posicionLibre.getAsiento(), cont = 0; cont < cantidadEntradas; j++, cont++) 
            teatro[posicionLibre.getFila()][j] = false;
        
        guardarVendidos("vendidas.txt");
    }
}
