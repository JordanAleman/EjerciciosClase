package Tema4InteraccionObjeto.Ejercicio19Craps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazCrapsEjercicio19 {
    private JuegoCraps miJuego;
    private Scanner miTeclado;
    private int contError;
    private boolean limpiezaMenu;

    private final int TIRAR_DADOS = 1;
    private final int NUMERO_TIRADAS = 2;
    private final int RESULTADO_DADOS = 3;
    private final int SALIR = 4;

    public InterfazCrapsEjercicio19() {
        miJuego = new JuegoCraps();
        miTeclado = new Scanner(System.in);
        contError = 0;
        limpiezaMenu = true;
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menuPrincipal() {
        limpiarPantalla();

        miTeclado = new Scanner(System.in);
        int opcion;

        System.out.print("\n1.- Tirar dados" +
                "\n2.- Ver número de tiradas realizadas" +
                "\n3.- Ver resultado de dados actual" +
                "\n4.- Salir" +

                "\n\nElija opción: ");

        try {
            opcion = miTeclado.nextInt();

            if (opcion < 1 || opcion > 4)
                repetirMenu();

            menuPrincipalEleccion(opcion);

        } catch (InputMismatchException e) {
            repetirMenu();
        }

    }

    /* ------------------------ ControlSeleccionEscogida ------------------------ */
    private void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case TIRAR_DADOS:
                tiradaDados();

            case NUMERO_TIRADAS:
                numeroTiradas();

            case RESULTADO_DADOS:
                resultadoDados();

            case SALIR:
                salida();
        }

    }

    /* ------------------------------- TirarDados ------------------------------- */
    private void tiradaDados() {
        /**
         * Si el resultado de los dados dan como resultado una victoria o una derrota
         * desde la primera tirada entonces el programa preguntará si se quiere volver a
         * jugar y no saltará a la línea de "tiradaPunto()".
         */
        tiradaInicial();
        tiradaPunto();
    }

    private void tiradaInicial() {
        switch (miJuego.getVictoriaIncial()) {
            case -1:
                mensajeDerrota();
                menuVolverAJugar();

            case 1:
                mensajeVctoria();
                menuVolverAJugar();

            default:
                break;
        }
    }

    private void tiradaPunto() {
        int puntoResultado = miJuego.getVictoriaPunto();

        switch (puntoResultado) {
            case -1:
                mensajeDerrota();
                menuVolverAJugar();

            case 0:
                mensajeVctoria();
                menuVolverAJugar();

            default:
                System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                System.out.println("Punto a conseguir: " + miJuego.getResultadoDados());
                System.out.println("Resultado obtenido: " + puntoResultado);
                System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");

                menuVolverATirar();
        }
    }

    private void numeroTiradas() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("Número de tiradas actual: " + miJuego.getNumTiradas());
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");

        menuPrincipal();
    }

    private void resultadoDados() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("Resultado de dados actual: " + miJuego.getResultadoDados());
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");

        menuPrincipal();
    }

    /* ------------------------- MensajesVictoriaDerrota ------------------------ */
    private void mensajeVctoria() {
        System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("Número de tiradas: " + miJuego.getNumTiradas());
        System.out.println("Resultado de dados actual: " + miJuego.getResultadoDados());
        System.out.println("Ha ganado :'D");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
    }

    private void mensajeDerrota() {
        System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("Número de tiradas: " + miJuego.getNumTiradas());
        System.out.println("Resultado de dados actual: " + miJuego.getResultadoDados());
        System.out.println("Ha perdido :'(");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
    }

    /* ---------------------------- MenuVolverAJugar ---------------------------- */
    private void menuVolverAJugar() {
        miTeclado = new Scanner(System.in);
        int opcion;

        System.out.print("\n1.- Volver a jugar" +
                "\n2.- Salir" +

                "\n\nElija opción: ");

        try {
            opcion = miTeclado.nextInt();

            if (opcion < 1 || opcion > 2)
                repetirMenu();

            menuVolverAJugarSeleccion(opcion);

        } catch (InputMismatchException e) {
            repetirMenu();
        }

    }

    private void menuVolverAJugarSeleccion(int opcion) {
        switch (opcion) {
            case 1:
                miJuego.reset();
                limpiezaMenu = true;
                menuPrincipal();

            case 2:
                salida();
                ;
        }
    }

    /* ---------------------------- MenuVolverAJugar ---------------------------- */
    private void menuVolverATirar() {
        miTeclado = new Scanner(System.in);
        int opcion;

        System.out.print("\n1.- Volver a tirar (A por la victoria)" +
                "\n2.- Dejarlo ya y acabar el juego" +

                "\n\nElija opción: ");

        try {
            opcion = miTeclado.nextInt();

            if (opcion < 1 || opcion > 2)
                repetirMenu();

            menuVolverATirarSeleccion(opcion);

        } catch (InputMismatchException e) {
            repetirMenu();
        }

    }

    private void menuVolverATirarSeleccion(int opcion) {
        switch (opcion) {
            case 1:
                limpiezaMenu = true;
                tiradaPunto();

            case 2:
                salida();
        }
    }

    /* ------------------------------- ControlMenu ------------------------------ */
    private void repetirMenu() {
        contError++;
        if (contError >= 5) {
            System.out.println("\nOpciones incorrectas demasiadas veces");
            salida();
        }

        System.out.println("\n<------------------------------>");
        System.out.println("   Escoja una opción correcta");
        System.out.println("<------------------------------>");

        miTeclado = new Scanner(System.in);
        menuPrincipal();
    }

    private void salida() {
        System.out.println("\n<#############################################>");
        System.out.println("     Finalización del programa. Adiós O_O");
        System.out.println("<############################################>\n\n");

        System.exit(0);
    }

    private void limpiarPantalla() {
        if (limpiezaMenu) {
            limpiezaMenu = false;
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
