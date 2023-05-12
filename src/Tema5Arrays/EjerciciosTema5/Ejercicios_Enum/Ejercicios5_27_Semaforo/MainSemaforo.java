package Tema5Arrays.EjerciciosTema5.Ejercicios_Enum.Ejercicios5_27_Semaforo;

public class MainSemaforo {
    public static void main(String[] args) {
        Semaforo miSemaforo = new Semaforo();

        /* ----------------------------- MostrarSemaforo ---------------------------- */
        miSemaforo.printSemaforo();
        System.out.println();

        /* --------------------- CambiarColoresYMostrarSemaforo --------------------- */
        miSemaforo.cambiarEstado();
        miSemaforo.printSemaforo();
        miSemaforo.cambiarEstado();
        miSemaforo.printSemaforo();
        miSemaforo.cambiarEstado();
        miSemaforo.printSemaforo();
    }
}
