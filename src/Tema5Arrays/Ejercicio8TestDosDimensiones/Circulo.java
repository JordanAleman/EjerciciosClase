package Tema5Arrays.Ejercicio8TestDosDimensiones;

public class Circulo {
    private int x;
    private int y;
    private int diametro;

    private int identificadorCirculo;
    private static int identidicadorCirculosAumento = 1;

    /* ------------------------------- Constructor ------------------------------ */
    public Circulo(int x, int y, int diametro) {
        this.x = x;
        this.y = y;

        if (diametro <= 0)
            diametro = 1;

        this.diametro = diametro;

        identificadorCirculo = identidicadorCirculosAumento++;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getIdentificadorCirculo() {
        return identificadorCirculo;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "Nº" + identificadorCirculo +
                " (" + x + ", " + y + ")" +
                " D = " + diametro;
    }
}
