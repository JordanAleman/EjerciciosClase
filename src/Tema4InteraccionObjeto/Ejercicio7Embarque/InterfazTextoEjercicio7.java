package Tema4InteraccionObjeto.Ejercicio7Embarque;

import java.util.InputMismatchException;
import java.util.Scanner;

import InterfazTexto.InterfazTextoPrincipal;

public class InterfazTextoEjercicio7 extends InterfazTextoPrincipal {
    private Scanner miTeclado;
    private Ferry miFerry;

    private final int ADDPASAJERO = 1;
    private final int BORRARPASAJERO = 2;
    private final int MASJOVENPASAJERO = 3;
    private final int LISTAPASAJERO = 4;
    private final int SALIRMENUFERRY = 5;

    /* ------------------------------- Constructor ------------------------------ */
    public InterfazTextoEjercicio7() {
        super();
        miTeclado = new Scanner(System.in);
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menuPrincipal() {
        limpiarPantalla();
        miTeclado = new Scanner(System.in);

        System.out.print("\nBienvenido a Ferry's Dinamics" +
                "\n1.- Establecer capacidad de pasajeros" +
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
            case 1:
                creacionFerry();

            case 2:
                salida();
        }
    }

    /* ------------------------------ CreaciónFerry ----------------------------- */
    private void creacionFerry() {
        int capacidadPasajeros;
        inicioMuestraDatosAzul();

        while (true) {
            miTeclado = new Scanner(System.in);
            System.out.print("Indicar cuantos pasajeros pueden embarcar (mínimo 3): ");

            try {
                capacidadPasajeros = miTeclado.nextInt();

                if (capacidadPasajeros >= 3)
                    break;

                numeroNoValido();

            } catch (InputMismatchException e) {
                numeroNoValido();
            }

        }

        finMuestraDatosAzul();

        miFerry = new Ferry(capacidadPasajeros);
        menuFerry();
    }

    /* -------------------------------- MenuFerry ------------------------------- */
    private void datosInformativosFerry() {
        destacarTexto("Capacidad de pasajeros: ");
        System.out.println(miFerry.getCantidadAsientos());

        destacarTexto("Número de asientos disponibles: ");
        System.out.println(miFerry.getCantidadAsientos() - miFerry.getNumPasajeros());
    }

    private void mostrarListaPasajeros() {
        if (miFerry.getNumPasajeros() > 0 && miFerry.getNumPasajeros() < 6) {
            inicioMuestraDatosCyan();
            miFerry.printDetallesPasajeros();
            finMuestraDatosCyan();
        }
    }

    private void menuFerry() {
        datosInformativosFerry();

        miTeclado = new Scanner(System.in);

        System.out.print("\n1.- Añadir nuevo pasajero" +
                "\n2.- Borrar pasajero" +
                "\n3.- Conocer al pasajero más joven" +
                "\n4.- Lista de pasajeros" +
                "\n5.- Salir");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 5))
                menuFerry();

            menuFerryEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuFerry();
        }
    }

    private void menuFerryEleccion(int opcion) {
        switch (opcion) {
            case ADDPASAJERO:
                opcionAddPasajero();

            case BORRARPASAJERO:
                opcionBorrarPasajero();

            case MASJOVENPASAJERO:
                opcionMasJoven();

            case LISTAPASAJERO:
                opcionListaPasajeros();

            case SALIRMENUFERRY:
                salida();

        }
    }

    /* ---------------------------- OpcionesMenuFerry --------------------------- */
    private void opcionAddPasajero() {
        miTeclado = new Scanner(System.in);

        limpiarPantalla();
        mostrarListaPasajeros();

        if (miFerry.getNumPasajeros() == miFerry.getCantidadAsientos())
            destacarTextoLN("No quedan asientos libres\n");
        else {
            inicioMuestraDatosVerde();

            String nombrePasajero = devolverNombre(miTeclado, "Nombre del pasajero: ");

            int edad = devolverNumero(miTeclado, "Edad del pasajero ",
                    "(Menor que 0 para no especificar): ");

            finMuestraDatosVerde();

            if (!miFerry.addPasajero(new Pasajero(nombrePasajero, edad)))
                destacarTextoLN("Ese pasajero ya tiene un asiento\n");
        }

        menuFerry();
    }

    private void opcionBorrarPasajero() {
        miTeclado = new Scanner(System.in);

        limpiarPantalla();
        mostrarListaPasajeros();

        inicioMuestraDatosRojo();

        String nombrePasajero = devolverNombre(miTeclado,
                "Nombre del pasajero a borrar: ");

        int edad = devolverNumero(miTeclado, "Edad del pasajero a borrar: ");

        finMuestraDatosRojo();

        if (miFerry.borrarPasajero(new Pasajero(nombrePasajero, edad)))
            mostrarListaPasajeros();
        else
            destacarTextoLN("No se ha borrado ningún pasajero\n");

        menuFerry();

    }

    private void opcionMasJoven() {
        limpiarPantalla();
        mostrarListaPasajeros();

        inicioMuestraDatosCyan();
        destacarTexto("El pasajero más joven es: ");
        System.out.println(((miFerry.getPasajeroMasJoven() != null)
                ? miFerry.getPasajeroMasJoven().printDetalles()
                : "Aún no hay ningún pasajero. "));

        finMuestraDatosCyan();

        menuFerry();
    }

    private void opcionListaPasajeros() {
        limpiarPantalla();

        inicioMuestraDatosCyan();
        miFerry.printDetallesPasajeros();
        finMuestraDatosCyan();

        menuFerry();
    }

}
