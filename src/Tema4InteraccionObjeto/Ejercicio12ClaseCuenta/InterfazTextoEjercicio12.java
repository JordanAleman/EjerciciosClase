package Tema4InteraccionObjeto.Ejercicio12ClaseCuenta;

import InterfazTexto.InterfazTextoPrincipal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazTextoEjercicio12 extends InterfazTextoPrincipal {
    private final int INGRESO = 1;
    private final int REINTEGRO = 2;
    private final int CONSULTA = 3;
    private final int IMPRIMIR = 4;
    private final int SALIR = 5;

    private Cuenta miCuenta;
    private Scanner miTeclado;

    /* ------------------------------- Constructor ------------------------------ */
    public InterfazTextoEjercicio12() {
        super();
        miTeclado = new Scanner(System.in);
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menuPrincipal() {
        limpiarPantalla();
        miTeclado = new Scanner(System.in);

        System.out.print("\n1.- Acceder a cuenta" +
                "\n2.- Salir");
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
            case 1: // Acceder a cuenta
                accesoACuenta();
            case 2: // Salir
                salida();

        }
    }

    /* ------------------------------ AccesoACuenta ----------------------------- */
    private void accesoACuenta() {
        limpiarPantalla();
        miTeclado = new Scanner(System.in);
        String[] nCuenta = new String[2];

        inicioMuestraDatosAzul();
        System.out.println("Introduzca su número de cuenta: ");

        for (int i = 0; i < nCuenta.length; i++) {

            // Este bucle while comprueba que los valores de la String no estén vacío
            while (true) {
                destacarTexto(((i == 0) ? "Número de cuenta: " : "Titular: "));
                nCuenta[i] = miTeclado.nextLine();

                if (nCuenta[i] != "")
                    break;

                campoVacio();
            }
        }

        finMuestraDatosAzul();

        miCuenta = new Cuenta(nCuenta[0], nCuenta[1]);
        menuCuenta();
    }

    /* ------------------------------- MenuCuenta ------------------------------- */
    private void menuCuenta() {
        miTeclado = new Scanner(System.in);

        System.out.print("\n1.- Ingreso" +
                "\n2.- Reintegro" +
                "\n3.- Consulta" +
                "\n4.- Imprimir datos cuenta" +
                "\n5.- Salir");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 5))
                menuCuenta();

            menuCuentaEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuCuenta();
        }
    }

    private void menuCuentaEleccion(int opcion) {
        switch (opcion) {
            case INGRESO:
                opcionRealizarIngreso();

            case REINTEGRO:
                opcionRealizarReintegro();

            case CONSULTA:
                opcionConsulta();

            case IMPRIMIR:
                opcionImprimir();

            case SALIR:
                salida();
        }
    }

    /* --------------------------- OpcionesMenuCuenta --------------------------- */
    private void opcionRealizarIngreso() {
        limpiarPantalla();
        miTeclado = new Scanner(System.in);

        inicioMuestraDatosVerde();
        destacarTexto("Cantidad a ingresar: ");

        try {
            miCuenta.ingreso(miTeclado.nextDouble());
        } catch (InputMismatchException e) {
            numeroNoValido();
        }

        finMuestraDatosVerde();
        menuCuenta();
    }

    private void opcionRealizarReintegro() {
        limpiarPantalla();
        miTeclado = new Scanner(System.in);

        inicioMuestraDatosVerde();
        destacarTexto("Cantidad a reintegrar: ");

        try {
            miCuenta.reintegro(miTeclado.nextDouble());
        } catch (InputMismatchException e) {
            numeroNoValido();
        }

        finMuestraDatosVerde();
        menuCuenta();
    }

    private void opcionConsulta() {
        limpiarPantalla();
        inicioMuestraDatosCyan();
        miCuenta.consultarSaldo();
        finMuestraDatosCyan();
        menuCuenta();
    }

    private void opcionImprimir() {
        limpiarPantalla();
        inicioMuestraDatosCyan();
        System.out.println(miCuenta);
        finMuestraDatosCyan();
        menuCuenta();
    }
}
