package Tema5Arrays.Ejercicio2FrecuenciaDado;

public class FrecuenciaDado {
    private Dado dado;
    private int[] frecuencia;

    private final int NUM_CARAS = 6;

    /* ------------------------------- Constructor ------------------------------ */
    public FrecuenciaDado() {
        dado = new Dado();
        frecuencia = new int[NUM_CARAS];
    }

    /* -------------------------------- Functions ------------------------------- */
    /* -------------------------------- TirarDado ------------------------------- */
    public void tirarDado(int veces) {
        for (int i = 0; i < veces; i++) {
            dado.tirarDado();
            frecuencia[dado.getCara() - 1]++;
        }
    }

    public void escribirFrecuencia() {
        System.out.println("Cara    Frecuencia");
        for (int i = 0; i < frecuencia.length; i++) 
            System.out.println((i + 1) + "       " + frecuencia[i]);
    }
}
