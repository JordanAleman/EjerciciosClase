package Tema5Arrays.EjerciciosTema5.Ejercicios5_2_14_Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazDiccionario {
    private Diccionario miDiccionario;
    private Scanner miTeclado;
    private int contError;
    private boolean flag;

    private final int MOSTRAR_DICCIONARIO = 1;
    private final int ADD_PALABRA = 2;
    private final int OBTENER_PALABRA = 3;
    private final int TRADUCIR_CASTELLANO = 4;
    private final int TRADUCIR_INGLES = 5;
    private final int SALIR = 6;

    public InterfazDiccionario() {
        miDiccionario = new Diccionario(2);
        miTeclado = new Scanner(System.in);
        contError = 0;
        flag = false;
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menu() {
        miTeclado = new Scanner(System.in);
        int opcion;

        if (!flag) {
            limpiarPantalla();
            flag = true;
        }

        System.out.print("\n1.- Mostrar diccionario" +
                "\n2.- Añadir una nueva palabra" +
                "\n3.- Obtener una palabra" +
                "\n4.- Traducir al castellano" +
                "\n5.- Traducir al inglés" +
                "\n6.- Salir" +
                "\n\nElija opción: ");

        try {
            opcion = miTeclado.nextInt();

            if (opcion < 1 || opcion > 6)
                repetirMenu();

            menuPrincipalEleccion(opcion);

        } catch (InputMismatchException e) {
            repetirMenu();
        }

    }

    public void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case MOSTRAR_DICCIONARIO:
                mostrarDiccionario();

            case ADD_PALABRA:
                addPalabra();

            case OBTENER_PALABRA:
                obtenerPalabra();

            case TRADUCIR_CASTELLANO:
                traducirCastellano();

            case TRADUCIR_INGLES:
                traducirIngles();

            case SALIR:
                salida();

        }
    }

    /* -------------------------- OpcionesMenuPrincipal ------------------------- */
    public void mostrarDiccionario() {
        limpiarPantalla();
        System.out.println("\nEl contenido del diccionario es el siguiente:");
        System.out.println(miDiccionario);

        menu();
    }

    public void addPalabra() {
        miTeclado = new Scanner(System.in);

        if (miDiccionario.getPos() == miDiccionario.getTamDiccionario()) {
            limpiarPantalla();
            System.out.println(miDiccionario);

            System.out.println("No caben más palabras en el diccionario\n");
            menu();
        }

        String palabraCastellano;
        String palabraIngles;

        System.out.print("\nIntroduzca una palabra en castellano: ");
        while (true) {
            palabraCastellano = miTeclado.nextLine();

            if (palabraCastellano != "")
                break;

            System.out.println("Introduzca una palabra válida");
        }

        System.out.print("Introduzca su traducción: ");
        while (true) {
            palabraIngles = miTeclado.nextLine();

            if (palabraIngles != "")
                break;

            System.out.println("Introduzca una palabra válida");
        }

        miDiccionario.insertarPalabra(new Palabra(palabraCastellano, palabraIngles));

        limpiarPantalla();
        System.out.println(miDiccionario);
        menu();

    }

    public void obtenerPalabra() {
        miTeclado = new Scanner(System.in);
        int posicion;
        System.out.print("\nIntroduzca una posición para obtener su palabra: ");

        while (true) {
            try {
                posicion = miTeclado.nextInt();

                if (posicion >= 0 && posicion < miDiccionario.getTamDiccionario())
                    break;

                System.out.print("Introduzca una posición correcta (Entre 0 y " +
                        miDiccionario.getTamDiccionario() + "): ");

            } catch (InputMismatchException e) {
                System.out.print("Introduzca una posición correcta (Entre 0 y " +
                        miDiccionario.getTamDiccionario() + "): ");
                miTeclado = new Scanner(System.in);
            }
        }

        limpiarPantalla();
        System.out.println(miDiccionario + "\n");

        System.out.println("La palabra con su traducción de la posición " + posicion + " es la siguiente:\n" +
                miDiccionario.obtenerPalabra(posicion) + "\n");
        menu();

    }

    public void traducirCastellano() {
        miTeclado = new Scanner(System.in);
        String palabraIngles;

        System.out.println("\nIntroduzca una palabra en inglés del diccionario para traducirla a castellano: ");

        while (true) {
            palabraIngles = miTeclado.nextLine();

            if (palabraIngles != "")
                break;

            System.out.println("Introduzca una palabra válida");
        }

        limpiarPantalla();

        try {
            Palabra palabraTraducida = miDiccionario.traduccionAlCastellano(palabraIngles);
            System.out.println("La traducción es la siguiente:\n"
                    + palabraTraducida + "\n");

        } catch (NullPointerException e) {
            System.out.println("La palabra " + palabraIngles + " no existe en el diccionario\n");
        }

        menu();

    }

    public void traducirIngles() {
        miTeclado = new Scanner(System.in);
        String pablabraCastellano;

        System.out.println("\nIntroduzca una palabra en castellano del diccionario para traducirla a inglés: ");

        while (true) {
            pablabraCastellano = miTeclado.nextLine();

            if (pablabraCastellano != "")
                break;

            System.out.println("Introduzca una palabra válida");
        }

        limpiarPantalla();

        try {
            Palabra palabraTraducida = miDiccionario.traduccionAlIngles(pablabraCastellano);
            System.out.println("La traducción es la siguiente:\n"
                    + palabraTraducida + "\n");

        } catch (NullPointerException e) {
            System.out.println("La palabra " + pablabraCastellano + " no existe en el diccionario\n");
        }

        menu();
    }

    /* ------------------------------- ControlMenu ------------------------------ */
    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void repetirMenu() {
        contError++;
        if (contError >= 5) {
            System.out.println("\nOpciones incorrectas demasiadas veces");
            salida();
        }

        limpiarPantalla();

        System.out.println("<------------------------------>");
        System.out.println("Escoja una opción correcta");
        System.out.println("<------------------------------>");

        miTeclado = new Scanner(System.in);
        menu();
    }

    private void salida() {
        System.out.println("\n<#############################################>");
        System.out.println("     Finalización del programa. Adiós O_O");
        System.out.println("<############################################>\n\n");

        System.exit(0);
    }

}
