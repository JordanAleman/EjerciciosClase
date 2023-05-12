package Tema5Arrays.Ejercicio2FrecuenciaDado;

public class MainFrecuenciaDado {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        FrecuenciaDado miFrecuenciaDado = new FrecuenciaDado();

        /* ----------------------- Tirar tantas veces un dado ----------------------- */
        miFrecuenciaDado.tirarDado(100000);

        /* ----------------- Ver la frecuencia de cada cara del dado ---------------- */
        miFrecuenciaDado.escribirFrecuencia();
    }
}
