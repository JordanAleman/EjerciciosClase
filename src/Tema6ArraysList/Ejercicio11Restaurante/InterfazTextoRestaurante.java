package Tema6ArraysList.Ejercicio11Restaurante;

import java.util.InputMismatchException;
import java.util.Scanner;

import InterfazTexto.InterfazTextoPrincipal;

public class InterfazTextoRestaurante extends InterfazTextoPrincipal {
    private Scanner miTeclado;
    private Restaurante miRestaurante;

    private final int VISUALIZAR_RESTAURANTE = 1;
    private final int VISUALIZAR_RESERVA = 2;
    private final int REALIZAR_RESERVA = 3;
    private final int ELIMINAR_RESERVAS = 4;
    private final int RESERVAS_PREFABRICADAS = 5;
    private final int SALIR = 6;

    /* ------------------------------- Constructor ------------------------------ */
    public InterfazTextoRestaurante() {
        super();
        miTeclado = new Scanner(System.in);
        miRestaurante = new Restaurante();
    }

    /* ------------------------------ MenúPrincipal ----------------------------- */
    public void iniciarMenu() {
        limpiarPantalla();
        inicioMuestraDatosVerde();
        System.out.println("Restaurante '" + miRestaurante.getNombreRestaurante() + "'");
        finMuestraDatosVerde();

        menuPrincipal();
    }

    private void menuPrincipal() {
        miTeclado = new Scanner(System.in);

        System.out.print("\n   1.- Visualizar restaurante" +
                "\n   2.- Visualizar reservas" +
                "\n   3.- Realizar reserva" +
                "\n   4.- Eliminar todas las reservas" +
                "\n   5.- Reservas prefabricadas" +
                "\n   6.- Salir");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, SALIR))
                menuPrincipal();

            menuPrincipalEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuPrincipal();
        }
    }

    private void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case VISUALIZAR_RESTAURANTE:
                opcionVisualizarRestaurante();

            case VISUALIZAR_RESERVA:
                opcionVisualizarReservas();

            case REALIZAR_RESERVA:
                opcionRealizarReserva();

            case ELIMINAR_RESERVAS:
                opcionEliminarReservas();

            case RESERVAS_PREFABRICADAS:
                opcionReservasPrefabricadas();

            case SALIR:
                salida();
        }
    }

    /* ------------------------------ OpcionesMenú ------------------------------ */
    /**
     * ============================
     ** Visualizar Restaurante (Opción 1)
     * ==============================
     **/
    private void opcionVisualizarRestaurante() {
        limpiarPantalla();

        inicioMuestraDatosVerde();
        System.out.println("Restaurante '" + miRestaurante.getNombreRestaurante() + "'\n");
        miRestaurante.mostrarRestaurante();
        finMuestraDatosVerde();

        menuPrincipal();
    }
    // !---- Fin de Visualizar Restaurante ----

    /**
     * ============================
     ** Visualizar Reservas (Opción 2)
     * ==============================
     **/
    private void opcionVisualizarReservas() {
        limpiarPantalla();

        inicioMuestraDatosAzul();
        System.out.println("Restaurante '" + miRestaurante.getNombreRestaurante() + "'\n");
        miRestaurante.mostrarRestaurante();

        System.out.println("\nListado de reservas:");
        miRestaurante.mostrarReservas();
        finMuestraDatosAzul();

        menuPrincipal();
    }
    // !---- Fin de Visualizar Reservas ----

    /**
     * ============================
     ** Realizar reserva (Opción 3)
     * ==============================
     **/
    private void opcionRealizarReserva() {
        miTeclado = new Scanner(System.in);

        limpiarPantalla();

        inicioMuestraDatosVerde();
        miRestaurante.mostrarRestaurante();
        finMuestraDatosVerde();

        inicioMuestraDatosCyan();
        System.out.println("Vamos a realizar una reserva:");

        String nombreCliente = devolverNombre(miTeclado, "Nombre del cliente quien reserva: ");
        int cantidadComensales = devolverNumero(miTeclado, "Cantidad de comensales: ");

        if (miRestaurante.reservarMesa(nombreCliente, cantidadComensales)) {
            System.out.println("\nSu reserva se ha realizado correctamente. Su tícket: ");
            miRestaurante.mostrarUltimaReservaRealizada();
        } else
            System.out.println("\nSu reserva no ha sido posible." +
                    "\nNo hay mesas disponibles para sus necesidades.");

        finMuestraDatosCyan();
        menuPrincipal();
    }
    // !---- Fin de Realizar Reservas ----

    /**
     * ============================
     ** Eliminar reservas (Opción 4)
     * ==============================
     **/
    private void opcionEliminarReservas() {
        miTeclado = new Scanner(System.in);

        limpiarPantalla();

        // inicioMuestraDatosAzul();
        // System.out.println("Restaurante '" + miRestaurante.getNombreRestaurante() + "'\n");
        // miRestaurante.mostrarRestaurante();

        // System.out.println("\nListado de reservas:");
        // miRestaurante.mostrarReservas();
        // finMuestraDatosAzul();

        inicioMuestraDatosRojo();
        System.out.println("¿Está seguro de querer eliminar todas las reservas?" +
                "\n   1.- Sí" +
                "\n   Otra tecla.- No");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (getOpcion() == 1)
                miRestaurante.eliminarReserva(true);

            System.out.println("\nTodas las reservas han sido eliminadas");

        } catch (InputMismatchException e) {
            System.out.println("\nNo se ha eliminado nada");
        }

        finMuestraDatosRojo();
        menuPrincipal();
    }
    // !---- Fin de Eliminar Reservas ----

    /**
     * ============================
     ** Reservas prefabricadas (Opción 5)
     * ==============================
     **/
    private void opcionReservasPrefabricadas() {
        limpiarPantalla();

        String[] nombres = {
                "Pepito",
                "Juanito",
                "Luisito",
                "Paquito",
                "Evita",
                "Laurita",
                "Albita",
                "Amandita",
                "Jorgito",
                "Jaimito",
                "Bernardita",
                "Clarita",
                "Elsita",
                "Natalita",
                "Cristinita",
                "Helenita"
        };

        int limiteAleatorio = (int) (Math.random() * (nombres.length - 3)) + 3;
        int nombreAleatorio;

        for (int i = 0; i < limiteAleatorio; i++) {
            nombreAleatorio = (int) (Math.random() * nombres.length);
            miRestaurante.reservarMesa(nombres[nombreAleatorio], cantidadComensalesAleatorios());
        }

        inicioMuestraDatosAzul();
        System.out.println("Restaurante '" + miRestaurante.getNombreRestaurante() + "'\n");
        miRestaurante.mostrarRestaurante();

        System.out.println("\nListado de reservas:");
        miRestaurante.mostrarReservas();
        finMuestraDatosAzul();

        menuPrincipal();
    }

    private int cantidadComensalesAleatorios() {
        return (int) (Math.random() * 19) + 2;
    }

    // !---- Fin de Reservas Prefabricadas ----

}
