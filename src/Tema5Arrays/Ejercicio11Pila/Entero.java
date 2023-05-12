package Tema5Arrays.Ejercicio11Pila;

public class Entero {
    private int valor;

    /* ------------------------------- Constructor ------------------------------ */
    public Entero(int valor) {
        this.valor = valor;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getValor() {
        return valor;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return valor + "";
    }
}
