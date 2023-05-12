package Tema5Arrays.Ejercicio3Calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Calculadora miCalculadora = new Calculadora();

        /* ------------------- Introducir números en miCalculadora ------------------ */
        miCalculadora.introducirNumero(77);
        miCalculadora.introducirNumero(20);
        miCalculadora.introducirNumero(82);
        miCalculadora.introducirNumero(57);
        miCalculadora.introducirNumero(32);
        miCalculadora.introducirNumero(64);
        miCalculadora.introducirNumero(9);
        miCalculadora.introducirNumero(18);

        /* ------------------------- Ver la lista de números ------------------------ */
        miCalculadora.escribirNumero();

        /* ------------- Intercambiar posición de números según posición ------------ */
        // miCalculadora.intercambiar(1, 5);
        miCalculadora.intercambiar(0, 2);
        miCalculadora.escribirNumero();

        /* ------------ Borrar el último elemento de la lista de números ------------ */
        miCalculadora.borrarUltimoElemento();
        miCalculadora.escribirNumero();

        /* ----------- Borrar pares y desplazar los impares si los hubiera ---------- */
        miCalculadora.borrarPares();
        miCalculadora.escribirNumero();
    }
}
