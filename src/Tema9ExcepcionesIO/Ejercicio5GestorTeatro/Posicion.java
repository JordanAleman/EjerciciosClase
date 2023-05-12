package Tema9ExcepcionesIO.Ejercicio5GestorTeatro;

public class Posicion {
    private int fila;
    private int asiento;

    /* ------------------------------- Constructor ------------------------------ */
    public Posicion(int fila, int asiento) {
        this.fila = fila;
        this.asiento = asiento;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getFila() {
        return fila;
    }

    public int getAsiento() {
        return asiento;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return fila + ":" + asiento;
    }
}
