package Tema6ArraysList.Ejercicio10JugadorContratoEquipo;

import java.util.InputMismatchException;
import java.util.Scanner;

import InterfazTexto.InterfazTextoPrincipal;

public class InterfazTextoEquipo extends InterfazTextoPrincipal {
    private Scanner miTeclado;
    private Equipo miEquipo;

    private final int VISUALIZAR_EQUIPO = 1;
    private final int ADD_JUGADOR = 2;
    private final int BORRAR_JUGADOR = 3;
    private final int MEJOR_PAGADO = 4;
    private final int PREFABRICAR = 5;
    private final int SALIR = 6;

    /* ------------------------------- Constructor ------------------------------ */
    public InterfazTextoEquipo() {
        super();
        miTeclado = new Scanner(System.in);
        miEquipo = new Equipo("Sin nombre");
    }

    public InterfazTextoEquipo(String nombreEquipo) {
        super();

        if (nombreEquipo == null) {
            nombreEquipo = "Sin nombre";
        }
        miTeclado = new Scanner(System.in);
        miEquipo = new Equipo(nombreEquipo);
    }

    /* ------------------------------ MenúPrincipal ----------------------------- */
    public void iniciarMenu() {
        limpiarPantalla();
        System.out.print("\n¡Bienvenidos al sistema!" +
                "\nPosibles acciones: ");
        menuPrincipal();
    }

    private void menuPrincipal() {
        miTeclado = new Scanner(System.in);

        System.out.print("\n   1.- Visualizar equipo" +
                "\n   2.- Añadir jugador" +
                "\n   3.- Borrar jugador" +
                "\n   4.- Ver al jugador mejor pagado" +
                "\n   5.- Añadir varios jugadores ya prefabricados" +
                "\n   6.- Salir");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 6))
                menuPrincipal();

            menuPrincipalEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuPrincipal();
        }
    }

    private void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case VISUALIZAR_EQUIPO:
                opcionVisualizarEquipo();

            case ADD_JUGADOR:
                opcionAddJugador();

            case BORRAR_JUGADOR:
                opcionBorrarJugador();

            case MEJOR_PAGADO:
                opcionVerMejorPagado();

            case PREFABRICAR:
                opcionPrefabricar();

            case SALIR:
                salida();
        }
    }

    /* ------------------------------ OpcionesMenú ------------------------------ */
    /**
     * ============================
     ** Visualizar Equipo (Opción 1)
     * ==============================
     **/
    private void opcionVisualizarEquipo() {
        // miTeclado = new Scanner(System.in);

        limpiarPantalla();
        inicioMuestraDatosAmarillo();

        if (miEquipo.getNumeroJugadores() == 0)
            System.out.println("Aún no se ha contratado a ningún jugador");
        else
            miEquipo.escribirDatosCompletosJugadores();

        finMuestraDatosAmarillo();
        menuPrincipal();
    }
    // !---- Fin de visualizar jugador ----

    /**
     * ============================
     ** Añadir jugador (Opción 2)
     * ==============================
     **/
    private void opcionAddJugador() {
        miTeclado = new Scanner(System.in);

        limpiarPantalla();

        if (miEquipo.getNumeroJugadores() > 0) {
            inicioMuestraDatosAmarillo();
            miEquipo.escribirDatosCompletosJugadores();
            finMuestraDatosAmarillo();
        }

        inicioMuestraDatosVerde();
        System.out.println("Vamos a añadir a un nuevo jugador: ");

        String nombre = devolverNombre(miTeclado, "Nombre del jugador: ");
        int edad = devolverNumero(miTeclado, "Edad del jugador: ");
        int salario = devolverNumero(miTeclado, "Salario del jugador: ");

        Jugador nuevoJugador = new Jugador(nombre, edad);

        if (miEquipo.getJugador(nombre) != null)
            menuJugadorYaEnElEquipo(nuevoJugador, salario);

        miEquipo.firmarContrato(new Jugador(nombre, edad), salario);
        System.out.println("Jugador añadido al equipo");

        finMuestraDatosVerde();
        menuPrincipal();
    }

    private void menuJugadorYaEnElEquipo(Jugador nuevoJugador, int salario) {
        miTeclado = new Scanner(System.in);
        inicioMuestraDatosRojo();
        System.out.println("Jugador: " + miEquipo.getJugador(nuevoJugador.getNombre()) +
                " Salario: " + miEquipo.getSalario(nuevoJugador.getNombre()));
        finMuestraDatosRojo();

        System.out.println("Ya está ese jugador en el equipo." +
                " ¿Quieres reemplazarlo?" +
                "\n   1.- Sí" +
                "\n   2.- No");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 2))
                menuJugadorYaEnElEquipo(nuevoJugador, salario);

            menuJugadorYaEnElEquipoEleccion(getOpcion(), nuevoJugador, salario);

        } catch (InputMismatchException e) {
            repetirMenu();
            menuJugadorYaEnElEquipo(nuevoJugador, salario);
        }
    }

    private void menuJugadorYaEnElEquipoEleccion(int opcion, Jugador nuevoJugador, int salario) {
        switch (opcion) {
            case 1: // Reemplazar jugador
                miEquipo.firmarContrato(nuevoJugador, salario);
                System.out.println("\nEl jugador ha sido reemplazado\n");
                finMuestraDatosVerde();

                menuPrincipal();

            case 2: // No reemplazar jugador
                System.out.println("\nNo se ha reemplazado al jugador\n");
                finMuestraDatosVerde();

                menuPrincipal();
        }
    }
    // !---- Fin de añadir jugador ----

    /**
     * ============================
     ** Borrar jugador (Opción 3)
     * ==============================
     **/
    private void opcionBorrarJugador() {
        miTeclado = new Scanner(System.in);

        limpiarPantalla();

        if (miEquipo.getNumeroJugadores() > 0) {
            inicioMuestraDatosAmarillo();
            miEquipo.escribirDatosCompletosJugadores();
            finMuestraDatosAmarillo();
        }

        inicioMuestraDatosRojo();
        System.out.println("Vamos a borrar a un jugador: ");

        String nombre = devolverNombre(miTeclado, "Nombre del jugador: ");

        if (miEquipo.getJugador(nombre) == null)
            menuJugadorNoExisteParaBorrar();

        limpiarPantalla();
        inicioMuestraDatosAmarillo();

        System.out.println("El jugador " + miEquipo.getJugador(nombre) +
                " ha sido borrado del equipo\n");

        miEquipo.borrarJugador(nombre);
        miEquipo.escribirDatosCompletosJugadores();
        finMuestraDatosAmarillo();

        menuPrincipal();
    }

    private void menuJugadorNoExisteParaBorrar() {
        System.out.println("No existe ningún jugador en el equipo con ese nombre" +
                "\n¿Quiere probar con otro nombre?" +
                "\n   1.- Sí" +
                "\n   Otra tecla.- No");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (getOpcion() == 1)
                opcionBorrarJugador();

            inicioMuestraDatosAmarillo();
            System.out.println("No se ha borrado a ningún jugador");

            // miEquipo.escribirDatosCompletosJugadores();
            finMuestraDatosAmarillo();

            menuPrincipal();

        } catch (InputMismatchException e) {
            inicioMuestraDatosAmarillo();
            System.out.println("No se ha borrado a ningún jugador");

            // miEquipo.escribirDatosCompletosJugadores();
            finMuestraDatosAmarillo();

            menuPrincipal();
        }
    }
    // !---- Fin de borrar jugador ----

    /**
     * ============================
     ** Ver mejor pagado (Opción 4)
     * ==============================
     **/
    private void opcionVerMejorPagado() {
        limpiarPantalla();

        inicioMuestraDatosAmarillo();
        miEquipo.escribirDatosCompletosJugadores();

        System.out.println("\nEl jugador mejor pagado es: \n");
        System.out.println(miEquipo.getContratoMasAlto().getJugador() +
                " Salario: " + miEquipo.getContratoMasAlto().getSalario());
        finMuestraDatosAmarillo();

        menuPrincipal();
    }
    // !---- Fin de ver mejor pagado ----

    /**
     * ============================
     ** Prefabricar (Opción 5)
     * ==============================
     **/
    private void opcionPrefabricar() {
        Jugador unJugador1 = new Jugador("Pepito", 30);
        Jugador unJugador2 = new Jugador("Juanito", 35);
        Jugador unJugador3 = new Jugador("Luisito", 25);

        String[] arrayNombresJugadores = { "Pedrito", "Jorgito", "Paquito",
                "Jaimito", "Margarita", "Adelita", "Bernardita", "Carmencita", "Elsita" };
        int[] arrayEdadesJugadores = { 20, 18, 38, 34, 40, 19, 21, 26, 42 };
        int[] arraySalarioJugadores = { 2000, 1800, 3500, 1900, 20000,
                32000, 5900, 9000, 13500 };

        miEquipo.firmarContrato(unJugador1, 1500);
        miEquipo.firmarContrato(unJugador2, 2500);
        miEquipo.firmarContrato(unJugador3, 3000);

        miEquipo.firmarContratos(arrayNombresJugadores, arrayEdadesJugadores, arraySalarioJugadores);

        limpiarPantalla();

        inicioMuestraDatosAmarillo();
        System.out.println("Varios jugadores añadidos directamente\n");
        miEquipo.escribirDatosCompletosJugadores();

        finMuestraDatosAmarillo();

        menuPrincipal();
    }
    // !---- Fin de prefabricar ----
}
