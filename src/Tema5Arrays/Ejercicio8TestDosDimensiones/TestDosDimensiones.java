package Tema5Arrays.Ejercicio8TestDosDimensiones;

public class TestDosDimensiones {
    private Circulo[][] circulosEn;

    private final int FILAS = 3;
    private final int COLUMNAS = 5;
    private final int DIAMETRO = 20;

    /* ------------------------------- Constructor ------------------------------ */
    public TestDosDimensiones() {
        circulosEn = new Circulo[FILAS][COLUMNAS];

        rellenarArray();
    }

    private void rellenarArray() {
        for (int i = 0; i < circulosEn.length; i++) {
            for (int j = 0; j < circulosEn[i].length; j++)
                circulosEn[i][j] = new Circulo(i * DIAMETRO, j * DIAMETRO, DIAMETRO);
        }
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void escribirArray() {
        for (int i = 0; i < circulosEn.length; i++) {
            System.out.println("\n\nCírculos en la fila " + (i + 1));
            for (int j = 0; j < circulosEn[i].length; j++) 
                System.out.print(circulosEn[i][j] + "\t");
        }
    }
}
