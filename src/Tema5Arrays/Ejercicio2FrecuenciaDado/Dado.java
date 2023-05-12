package Tema5Arrays.Ejercicio2FrecuenciaDado;

public class Dado {
    private int cara;

    /* ------------------------------- Constructor ------------------------------ */
    public Dado() {
        cara = (int) (Math.random() * 6) + 1;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getCara() {
        return cara; 
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "" + cara;
    }

    /* -------------------------------- TirarDado ------------------------------- */
    public void tirarDado() {
        cara = (int) (Math.random() * 6) + 1;
    }
}
