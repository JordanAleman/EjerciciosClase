package OperacionesAdicionales.StringOperaciones;

public class LimpiarPantalla {
    public static void clean() {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
