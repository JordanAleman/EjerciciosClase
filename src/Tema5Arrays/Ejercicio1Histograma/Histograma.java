package Tema5Arrays.Ejercicio1Histograma;

public class Histograma {
    private int[] valores;

    private final char SIMBOLO = '*';
    private static final int MAX = 7;

    /* ------------------------------- Constructor ------------------------------ */
    public Histograma() {
        valores = new int[MAX];
        inicializar();

    }

    private void inicializar() {
        for (int i = 0; i < valores.length; i++)
            valores[i] = generarAleatorio();
    }

    private int generarAleatorio() {
        return (int) (Math.random() * 45) + 5;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void escribirHistograma() {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i]; j++)
                System.out.print(SIMBOLO);

            System.out.println();
        }
    }
}
