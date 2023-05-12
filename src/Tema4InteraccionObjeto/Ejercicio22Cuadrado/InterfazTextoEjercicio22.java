package Tema4InteraccionObjeto.Ejercicio22Cuadrado;

import java.util.InputMismatchException;
import java.util.Scanner;

import InterfazTexto.InterfazTextoPrincipal;
import Colores.Colores;

public class InterfazTextoEjercicio22 extends InterfazTextoPrincipal {
    private Scanner miTeclado;
    private Cuadrado miCuadrado;
    private int menuPrimeraVez;
    private String color;

    private final int TAM_LADO = 1;
    private final int PINTAR_BICOLOR = 2;
    private final int PINTAR_CONTORNO = 3;
    private final int PINTAR_ASPA = 4;
    private final int PINTAR_TODOS = 5;
    private final int CAMBIAR_COLOR = 6;
    private final int SALIR = 7;

    /* ------------------------------- Constructor ------------------------------ */
    public InterfazTextoEjercicio22() {
        super();
        miTeclado = new Scanner(System.in);
        miCuadrado = new Cuadrado();
        menuPrimeraVez = 1;
        color = Colores.WHITE;
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    public void menuPrincipal() {
        if (menuPrimeraVez == 1) {
            limpiarPantalla();
            menuPrimeraVez++;
        }

        miTeclado = new Scanner(System.in);

        System.out.print(color);
        System.out.print("\n1.- Tamaño lado" +
                "\n2.- Pintar bicolor" +
                "\n3.- Pintar contorno" +
                "\n4.- Pintar aspa" +
                "\n5.- Pintar todos" +
                "\n6.- Elegir Color" +
                "\n7.- Salir");
        System.out.print(Colores.RESET);

        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 7))
                menuPrincipal();

            menuPrincipalEleccion(getOpcion());

        } catch (InputMismatchException e) {
            repetirMenu();
            menuPrincipal();
        }
    }

    private void menuPrincipalEleccion(int opcion) {
        switch (opcion) {
            case TAM_LADO:
                opcionTamLado();

            case PINTAR_BICOLOR:
                opcionPintarBicolor();

            case PINTAR_CONTORNO:
                opcionPintarContorno();

            case PINTAR_ASPA:
                opcionPintarAspa();

            case PINTAR_TODOS:
                opcionPintarTodos();

            case CAMBIAR_COLOR:
                opcionCambiarColor();

            case SALIR:
                salida();
        }
    }

    /* ------------------------------ OpcionesMenu ------------------------------ */
    private void opcionTamLado() {
        miTeclado = new Scanner(System.in);

        inicioMuestraDatosVerde();
        int tamLado = devolverNumero(miTeclado, "Escoja tamaño del lado ",
                "(Mayor que 1 y menor que 10): ");

        finMuestraDatosVerde();

        if (tamLado < 1 || tamLado > 10)
            destacarTextoLN("No ha habido cambios de tamaño. Fuera de dimensiones\n");
        else
            miCuadrado.setLado(tamLado);

        menuPrincipal();
    }

    private void opcionPintarBicolor() {
        limpiarPantalla();

        System.out.println(color);
        miCuadrado.dibujarBiColor();
        System.out.println(Colores.RESET);

        menuPrincipal();
    }

    private void opcionPintarContorno() {
        limpiarPantalla();

        System.out.println(color);
        miCuadrado.dibujarContorno();
        System.out.println(Colores.RESET);

        menuPrincipal();
    }

    private void opcionPintarAspa() {
        limpiarPantalla();
        System.out.println(color);
        miCuadrado.dibujarEnAspa();
        System.out.println(Colores.RESET);

        menuPrincipal();
    }

    private void opcionPintarTodos() {
        limpiarPantalla();

        System.out.println(color);
        miCuadrado.dibujarBiColor();
        System.out.println();

        miCuadrado.dibujarContorno();
        System.out.println();
        
        miCuadrado.dibujarEnAspa();
        System.out.println(Colores.RESET);

        menuPrincipal();
    }

    private void opcionCambiarColor() {
        miTeclado = new Scanner(System.in);
        String[] colores = { Colores.WHITE, Colores.RED, Colores.GREEN,
                Colores.YELLOW, Colores.BLUE, Colores.CYAN, Colores.PURPLE };

        limpiarPantalla();

        destacarTextoLN("Lista de colores: ");
        System.out.print("\n1.- Blanco" +
                colores[1] + "\n2.- Rojo" +
                colores[2] + "\n3.- Verde" +
                colores[3] + "\n4.- Amarillo" +
                colores[4] + "\n5.- Azul" +
                colores[5] + "\n6.- Cyan" +
                colores[6] + "\n7.- Púrpura" +
                Colores.RESET + "\n8.- Cancelar");
        elegirOpcion();

        try {
            setOpcion(miTeclado.nextInt());

            if (!opcionEscogida(1, 8))
                opcionCambiarColor();

            if (getOpcion() == 8)
                menuPrincipal();

            color = colores[getOpcion() - 1];
            menuPrincipal();

        } catch (InputMismatchException e) {
            repetirMenu();
            opcionCambiarColor();
        }
    }
}
