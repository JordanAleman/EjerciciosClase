package Tema4InteraccionObjeto.Ejercicio4SisUsCont;

import java.util.InputMismatchException;
import java.util.Scanner;
import InterfazTexto.InterfazTextoPrincipal;
import Colores.Colores;

public class InterfazTextoEjercicio4 extends InterfazTextoPrincipal {
    private Scanner miTeclado;
    private Sistema miSistema;
    private int controlCancelar; // Se encargará de retrocer un paso cuando convenga

    public InterfazTextoEjercicio4() {
        super();
        miTeclado = new Scanner(System.in);
        controlCancelar = 2;
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menuPrincipal() {
        miTeclado = new Scanner(System.in);

        System.out.print("\n1.- Añadir usuarios al Sistema" +
                "\n2.- Salir");

        if (controlCancelar == 3)
            System.out.println("\n3.- Cancelar (Volver atrás)");

        System.out.print(Colores.WHITE_BOLD_BRIGHT + "\n\nElija opción: " + Colores.RESET);

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, controlCancelar))
                menuPrincipal();

            // Si vuelven a este menú más adelante también contarán con la nueva opción de
            // Cancelar
            controlCancelar = 3;
            menuPrincipalEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuPrincipal();
        }
    }

    public void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case 1:
                addUsuarios();

            case 2:
                salida();

            case 3:
                menuSistema();
        }
    }

    /* ----------------------------- AñadirUsuarios ----------------------------- */
    public void addUsuarios() {
        miTeclado = new Scanner(System.in);
        String[] usuarios = new String[3];

        inicioMuestraDatosAzul();
        System.out.println("Introduzca los nombres de tres usuarios. Cada usuario con un Enter");

        for (int i = 0; i < usuarios.length; i++) {

            // Este bucle while comprueba que los nombres no estén vacíos
            while (true) {
                System.out.print(Colores.WHITE_BOLD_BRIGHT + "Usuario" + (i + 1) + ": " + Colores.RESET);
                usuarios[i] = miTeclado.nextLine();

                if (usuarios[i] != "")
                    break;

                System.out.println(Colores.RED + "\nIntroduzca un nombre válido\n" + Colores.RESET);
            }
        }

        finMuestraDatosAzul();

        miSistema = new Sistema(usuarios[0], usuarios[1], usuarios[2]);
        menuSistema();

    }

    /* ------------------------------- MenuSistema ------------------------------ */
    public void menuSistema() {
        miTeclado = new Scanner(System.in);

        System.out.print("\n1.- Modificar todos los usuarios" +
                "\n2.- Intentar acceso" +
                "\n3.- Ver estadísticas del sistema" +
                "\n4.- Salir" +
                Colores.WHITE_BOLD_BRIGHT + "\n\nElija opción: " + Colores.RESET);

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 4))
                menuSistema();

            menuSistemaEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuSistema();
        }
    }

    public void menuSistemaEleccion(int opcion) {
        switch (opcion) {
            case 1: // Modificar todos los usuarios
                menuPrincipal();

            case 2: // Intentar acceso
                opcionIntentarAcceso();

            case 3: // Ver estadísticas del sistema
                opcionVerEstadisticasSistema();

            case 4: // Salir
                salida();
        }
    }

    /* --------------------------- OpcionesMenuSistema -------------------------- */
    public void opcionIntentarAcceso() {
        miSistema.entrarEnSistema();
        System.out.println("\nCada usuario a intentado realizar un acceso al sistema");
        menuSistema();
    }

    public void opcionVerEstadisticasSistema() {
        miSistema.printEstadisticasSistema();
        menuSistema();
    }
}
