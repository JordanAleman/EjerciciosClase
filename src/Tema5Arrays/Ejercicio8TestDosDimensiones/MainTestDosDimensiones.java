package Tema5Arrays.Ejercicio8TestDosDimensiones;

public class MainTestDosDimensiones {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ---------------- Crear el test de circulos y visualizarlo ---------------- */
        TestDosDimensiones miTestDosDimensiones = new TestDosDimensiones();
        miTestDosDimensiones.escribirArray();
    }
}
