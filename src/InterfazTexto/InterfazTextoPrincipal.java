package InterfazTexto;

import java.util.InputMismatchException;
import java.util.Scanner;

import Colores.Colores;

public class InterfazTextoPrincipal {
    private int contError;
    private int opcion;
    private int menuPrimeraVez;

    /* ------------------------------- Constructor ------------------------------ */
    public InterfazTextoPrincipal() {
        contError = 0;
        opcion = 0;
        menuPrimeraVez = 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    protected int getOpcion() {
        return opcion;
    }

    /* --------------------------------- Setter --------------------------------- */
    protected void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /* ------------------------------ MenuPrincipal ----------------------------- */
    protected boolean opcionEscogida(int rangoInicial, int rangoFinal) {
        if (opcion < rangoInicial || opcion > rangoFinal) {
            repetirMenu();
            return false;
        }

        return true;

    }

    /* ------------------------- PeticiónDatosPorTeclado ------------------------ */
    /**
     * <p>
     * Devuelve una String que ha sido solicitada al usuario por teclado.
     * </p>
     * <br>
     * <br>
     *
     * <h3><b>Detalles:</b></h3>
     * <ul>
     * <li><b>Primer argumento:</b>
     * <ul>
     * <li>Pasan un objeto de tipo Scanner que será el encargado de solitar
     * información al usuario por teclado.
     * </li></li>
     * </ul>
     * 
     * <li><b>Segundo argumento:</b>
     * <ul>
     * <li>
     * Espera una String que se encargará de mostar en pantalla un texto antes de
     * solicitar datos al usuario.
     * </li></li>
     * </ul>
     * </ul>
     * 
     * <p>
     * En cuanto el usuario escriba algo por teclado y pulse Enter, el resultado de
     * esos datos serán devueltos como una String.
     * </p>
     * <br>
     * <br>
     * 
     * @param miTeclado - Objeto de tipo Scanner.
     * @param peticion  - String que se mostrará antes de la petición por teclado.
     * 
     * @return Cadena de texto mandada por teclado {@code String}.
     * 
     * @see destacarTexto(String texto);
     */
    protected String devolverNombre(Scanner miTeclado, String peticion) {
        // destacarTexto(peticion);
        // return miTeclado.next();
        Scanner teclado = miTeclado;
        String texto = "";

        while (true) {
            destacarTexto(peticion);

            texto = teclado.nextLine();

            if (texto != "")
                break;

            campoVacio();
        }

        return texto;
    }

    protected int devolverNumero(Scanner miTeclado, String peticion) {
        int numero;
        Scanner teclado = miTeclado;

        while (true) {
            destacarTexto(peticion);

            try {
                numero = teclado.nextInt();
                return numero;

            } catch (InputMismatchException e) {
                numeroNoValido();
                teclado = new Scanner(System.in);
            }

        }
    }

    protected int devolverNumero(Scanner miTeclado, String peticion, String subPeticion) {
        int numero;
        Scanner teclado = miTeclado;

        while (true) {
            destacarTexto(peticion);
            System.out.print(subPeticion);

            try {
                numero = Integer.parseInt(teclado.nextLine());
                return numero;

            } catch (NumberFormatException e) {
                numeroNoValido();
                teclado = new Scanner(System.in);
            }

        }
    }

    /* ------------------------------- ControlMenu ------------------------------ */
    protected void repetirMenu() {
        contError++;
        if (contError >= 8) {
            System.out.println("\nOpciones incorrectas demasiadas veces");
            salida();
        }

        System.out.println("\n<------------------------------>");
        System.out.println(Colores.RED_BOLD + "   Escoja una opción correcta" + Colores.RESET);
        System.out.println("<------------------------------>");

    }

    protected void salida() {
        System.out.println(Colores.BLUE_BOLD +
                "\n<#############################################>" + Colores.RESET);
        System.out.println(Colores.BLUE + "     Finalización del programa. Adiós O_O");
        System.out.println(Colores.BLUE_BOLD +
                "<############################################>\n\n" + Colores.RESET);

        System.exit(0);
    }

    /* ----------------------------- PosiblesErrores ---------------------------- */
    protected void campoVacio() {
        System.out.println(Colores.RED + "\nEste campo no puede estar vacío\n" + Colores.RESET);
    }

    protected void numeroNoValido() {
        System.out.println(Colores.RED + "\nNúmero no válido" + Colores.RESET);
    }

    /* ----------------------------- LimpiarPantalla ---------------------------- */
    protected void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    protected void limpiarPantallaControlado() {
        if (menuPrimeraVez == 0) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            menuPrimeraVez++;
        }
    }

    /* ------------------------------ DestacarTexto ----------------------------- */
    protected void elegirOpcion() {
        System.out.print(Colores.WHITE_BOLD_BRIGHT + "\n\nElija opción: " + Colores.RESET);
    }

    /**
     * <p>
     * Muestra en pantalla el texto mandado por parámetro de forma destacada SIN
     * salto de línea.
     * </p>
     * <p>
     * El modo de destacarlo es en color blanco en "negrita".
     * </p>
     * <br>
     * <br>
     * 
     * @param texto - Objeto de tipo String.
     * 
     */
    protected void destacarTexto(String texto) {
        System.out.print(Colores.WHITE_BOLD_BRIGHT + texto + Colores.RESET);
    }

    /**
     * <p>
     * Muestra en pantalla el texto mandado por parámetro de forma destacada CON
     * salto de línea.
     * </p>
     * <p>
     * El modo de destacarlo es en color blanco en "negrita".
     * </p>
     * <br>
     * <br>
     * 
     * @param texto - Objeto de tipo String.
     * 
     */
    protected void destacarTextoLN(String texto) {
        System.out.println(Colores.WHITE_BOLD_BRIGHT + texto + Colores.RESET);
    }

    /* ---------------------------- DetallesVisuales ---------------------------- */

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque AZUL de separación con un salto de línea al
     * comienzo del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void inicioMuestraDatosAzul() {
        System.out.println(Colores.BLUE_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque VERDE de separación con un salto de línea al
     * comienzo del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void inicioMuestraDatosVerde() {
        System.out.println(Colores.GREEN_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque CYAN de separación con un salto de línea al
     * comienzo del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void inicioMuestraDatosCyan() {
        System.out.println(Colores.CYAN_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque AMARILLO de separación con un salto de línea al
     * comienzo del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void inicioMuestraDatosAmarillo() {
        System.out.println(Colores.YELLOW_BOLD +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque ROJO de separación con un salto de línea al
     * comienzo del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void inicioMuestraDatosRojo() {
        System.out.println(Colores.RED_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque AZUL de separación con un salto de línea al
     * final del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void finMuestraDatosAzul() {
        System.out.println(Colores.BLUE_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque VERDE de separación con un salto de línea al
     * final del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void finMuestraDatosVerde() {
        System.out.println(Colores.GREEN_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque CYAN de separación con un salto de línea al
     * final del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void finMuestraDatosCyan() {
        System.out.println(Colores.CYAN_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque AMARILLO de separación con un salto de línea al
     * final del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void finMuestraDatosAmarillo() {
        System.out.println(Colores.YELLOW_BOLD +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }

    /**
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     * <h2>Detalle visual</h2>
     * <p>
     * Muestra en pantalla un bloque ROJO de separación con un salto de línea al
     * final del bloque.
     * </p>
     * 
     * ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
     */
    protected void finMuestraDatosRojo() {
        System.out.println(Colores.RED_BOLD_BRIGHT +
                "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
                Colores.RESET);
    }
}
