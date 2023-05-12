package Tema4InteraccionObjeto.Ejercicio22Cuadrado;

public class Cuadrado {
    private int lado;
    private int tamCuadrado;

    private final int NUMASTERISCOS = 3;
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private final char ASPA = 'x';

    /* ------------------------------- Contructor ------------------------------- */
    public Cuadrado(int lado) {
        if (lado < 1)
            lado = 1;
        this.lado = lado;
        tamCuadrado = lado * NUMASTERISCOS;
    }

    public Cuadrado() {
        lado = 1;
        tamCuadrado = lado * NUMASTERISCOS;

    }

    /* --------------------------------- Getters -------------------------------- */
    public int getLado() {
        return lado;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setLado(int lado) {
        if (lado >= 1)
            this.lado = lado;

        tamCuadrado = lado * NUMASTERISCOS;
    }

    /* -------------------------------- Functions ------------------------------- */
    /* -------------------------------- Contorno -------------------------------- */
    public void dibujarContorno() {
        int cont = 0;

        dibujarHorizontalContorno();
        while (cont++ < (tamCuadrado) - 2)
            dibujarVerticalContorno();
        dibujarHorizontalContorno();
    }

    private void dibujarHorizontalContorno() {
        String linea = "";

        int cont = 0;

        while (cont++ < tamCuadrado)
            linea += ASTERISCO + "  ";

        System.out.println(linea);
    }

    private void dibujarVerticalContorno() {
        String linea = "";
        int cont = 0;

        while (cont++ < tamCuadrado) {
            linea += (cont == 1 || cont == tamCuadrado)
                    ? ASTERISCO + "  "
                    : ESPACIO + "  ";
        }

        System.out.println(linea);

    }

    /* ---------------------------------- Aspa ---------------------------------- */
    public void dibujarEnAspa() {
        int row = 0;

        while (++row <= tamCuadrado)
            dibujarLineasAspa(row);
    }

    private void dibujarLineasAspa(int row) {
        String linea = "";
        int col = 0;

        while (++col <= tamCuadrado)
            linea += (col == row || col == (tamCuadrado - row + 1)) ? ASTERISCO + "  " : ESPACIO + "  ";

        System.out.println(linea);
    }

    /* --------------------------------- Bicolor -------------------------------- */
    public void dibujarBiColor() {
        int row = 1;

        while (row <= tamCuadrado) {
            dibujarLineaBicolor(row);
            row++;
        }
    }

    private void dibujarLineaBicolor(int row) {
        String linea = "";

        for (int i = 1; i <= tamCuadrado; i++)
            linea += ((i <= row) ? ASTERISCO + "  " : ASPA + "  ");

        System.out.println(linea);
    }
}
