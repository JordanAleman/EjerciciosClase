package Tema4InteraccionObjeto.Ejercicio18Numero;

import Colores.Colores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazTextoEjercicio18 {
    private Numero miNumero;
    private Scanner miTeclado;
    private int contError;

    private final int SOLICITAR_NUMERO = 1;
    private final int FACTORIAL = 2;
    private final int PRIMO = 3;
    private final int CONTAR_CIFRAS = 4;
    private final int CAPICUA = 5;
    private final int DIBUJAR = 6;
    private final int SALIR = 7;

    public InterfazTextoEjercicio18() {
        miNumero = new Numero();
        miTeclado = new Scanner(System.in);
        contError = 0;
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menu() {
        miTeclado = new Scanner(System.in);
        int opcion;

        System.out.print("\n1.- Solicitar número" +
                "\n2.- Factorial" +
                "\n3.- Primo" +
                "\n4.- Contar cifras" +
                "\n5.- Capicúa" +
                "\n6.- Dibujar" +
                "\n7.- Salir" +
                Colores.WHITE_BOLD_BRIGHT + "\n\nElija opción: " + Colores.RESET);

        try {
            opcion = miTeclado.nextInt();
            System.out.println(Colores.RESET);

            if (opcion < 1 || opcion > 7)
                repetirMenu();

            opcionEscogida(opcion);

            

        } catch (InputMismatchException e) {
            repetirMenu();
        }

    }

    /* ------------------------ ControlSeleccionEscogida ------------------------ */
    private void opcionEscogida(int opcion) {
        switch (opcion) {
            case SOLICITAR_NUMERO:
                solicitarNumero();

            case FACTORIAL:
                factorialOpcion();

            case PRIMO:
                primoOpcion();

            case CONTAR_CIFRAS:
                contarCifrasOpcion();

            case CAPICUA:
                capicuaOpcion();

            case DIBUJAR:
                dibujarOpcion();

            case SALIR:
                salida();

        }

    }

    /* ----------------------------- OpcionesDelMenu ---------------------------- */
    private void solicitarNumero() {
        System.out.println(Colores.YELLOW_BOLD_BRIGHT + "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + Colores.RESET);
        System.out.print("  Introduzca un número: ");

        while (true) {
            try {
                miNumero.setNumero(miTeclado.nextInt());
                System.out.println("  Ha introducido el número " + miNumero.getNumero());
                System.out.println(Colores.YELLOW_BOLD_BRIGHT + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" + Colores.RESET);

                menu();
            } catch (InputMismatchException e) {
                System.out.print("  Introduzca un número correcto: ");
                miTeclado = new Scanner(System.in);
            }
        }
    }

    private void factorialOpcion() {
        System.out.println("\n<=================================>");
        System.out.println("      El factorial de " + miNumero.getNumero() +
                " es " + miNumero.factorialWhile());
        System.out.println("<=================================>\n");

        menu();
    }

    private void primoOpcion() {
        System.out.println("\n<=================================>");
        System.out.println("      El número " + miNumero.getNumero() +
                ((miNumero.primo())
                        ? " es primo."
                        : " no es primo."));
        System.out.println("<=================================>\n");

        menu();
    }

    private void contarCifrasOpcion() {
        System.out.println("\n<=================================>");
        int cantidadCifras = miNumero.cantidadCifras();
        System.out.println("    El número " + miNumero.getNumero() +
                " tiene " + cantidadCifras +
                ((cantidadCifras < 2)
                        ? " cifra."
                        : " cifras."));
        System.out.println("<=================================>\n");

        menu();
    }

    private void capicuaOpcion() {
        System.out.println("\n<=================================>");
        System.out.println("    El número " + miNumero.getNumero() +
                ((miNumero.esCapicua())
                        ? " es capicúo."
                        : " no es capicúo."));
        System.out.println("<=================================>\n");

        menu();
    }

    private void dibujarOpcion() {
        System.out.println();
        if (miNumero.getNumero() == 0) {
            System.out.println("\n<==============================================>");
            System.out.println("  No hay modo de pintar un cuadrado de lado 0");
            System.out.println("<==============================================>\n");
        } else
            miNumero.pintarCuadrado();

        menu();
    }

    /* ------------------------------- ControlMenu ------------------------------ */
    private void repetirMenu() {
        contError++;
        if (contError >= 5) {
            System.out.println("\nOpciones incorrectas demasiadas veces");
            salida();
        }

        System.out.println("\n<------------------------------>");
        System.out.println(Colores.RED_BOLD + "   Escoja una opción correcta" + Colores.RESET);
        System.out.println("<------------------------------>");

        miTeclado = new Scanner(System.in);
        menu();
    }

    private void salida() {
        System.out.println(Colores.BLUE_BOLD + "\n<#############################################>");
        System.out.println(Colores.BLUE + "     Finalización del programa. Adiós O_O");
        System.out.println(Colores.BLUE_BOLD +
                "<############################################>\n\n" + Colores.RESET);

        System.exit(0);
    }

}
