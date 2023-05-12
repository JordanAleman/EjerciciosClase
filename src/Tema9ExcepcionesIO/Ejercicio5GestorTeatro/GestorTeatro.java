package Tema9ExcepcionesIO.Ejercicio5GestorTeatro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import InterfazTexto.InterfazTextoPrincipal;

public class GestorTeatro extends InterfazTextoPrincipal {
    private Scanner miTeclado;
    private Teatro miTeatro;

    private static final int VENTA_ENTRADAS = 1;
    private static final int SALIR = 2;

    private static final String NOMBRE_FICHERO = "vendidas.txt";
    private static final int MAX_ENTRADAS = 5;

    /* ------------------------------- Constructor ------------------------------ */
    public GestorTeatro() throws FileNotFoundException {
        super();
        miTeclado = new Scanner(System.in);
        miTeatro = new Teatro(NOMBRE_FICHERO);
    }

    /* ------------------------------ MenúPrincipal ----------------------------- */
    public void venderEntradas() {
        limpiarPantalla();
        iniciarMenu();
    }

    private void iniciarMenu() {

        inicioMuestraDatosVerde();

        System.out.println("Teatro Vivaz");
        System.out.println("Situación actual del teatro: ");
        System.out.println(miTeatro);
        finMuestraDatosVerde();

        destacarTexto("¿Qué es lo que desea?");

        menuPrincipal();
    }

    private void menuPrincipal() {
        miTeclado = new Scanner(System.in);

        System.out.print("\n   1.- Comprar entradas" +
                "\n   2.- Salir");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 2))
                menuPrincipal();

            menuPrincipalEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuPrincipal();
        }
    }

    private void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case VENTA_ENTRADAS:
                opcionVenderEntradas();

            case SALIR:
                salida();
        }
    }

    /* ------------------------------ OpcionesMenú ------------------------------ */
    /**
     * ============================
     ** Vender entradas (Opción 1)
     * ==============================
     **/

    private void opcionVenderEntradas() {
        miTeclado = new Scanner(System.in);

        destacarTexto("¿Cuántas entradas quiere comprar? (Máximo " + MAX_ENTRADAS + "): ");

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, MAX_ENTRADAS)) {
                System.out.println("Mínimo 1 entrada y máximo " + MAX_ENTRADAS);
                opcionVenderEntradas();
            }

            miTeatro.venderEntradas(getOpcion());
            limpiarPantalla();
            System.out.println("Sus entradas han sido compradas correctamente");
            iniciarMenu();

        } catch (InputMismatchException e) {
            repetirMenu();
            opcionVenderEntradas();
        } catch (IOException e) {
            System.out.println("Problema interno. Por favor, vuelva a intentarlo más adelante");
        }
    }
    // !---- Fin de Vender entradas ----
}
