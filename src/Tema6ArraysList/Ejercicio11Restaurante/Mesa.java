package Tema6ArraysList.Ejercicio11Restaurante;

public class Mesa {
    private int capacidad;
    private boolean disponibilidad;

    private String identificador;
    private static int identificadorAumentador = 0;

    private final int CAPACIDAD_MINIMA = 2;
    private final int CAPACIDAD_MAXIMA = 16;

    /* ------------------------------- Constructor ------------------------------ */
    public Mesa() {
        capacidad = (int) (Math.random() * (CAPACIDAD_MAXIMA - CAPACIDAD_MINIMA + 1)) + CAPACIDAD_MINIMA;
        disponibilidad = true;

        identificador = ++identificadorAumentador + "";
    }

    public Mesa(int capacidad) {
        if (capacidad < CAPACIDAD_MINIMA)
            capacidad = CAPACIDAD_MINIMA;

        if (capacidad > CAPACIDAD_MAXIMA)
            capacidad = CAPACIDAD_MAXIMA;

        this.capacidad = capacidad;
        disponibilidad = true;

        identificador = "" + ++identificadorAumentador;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getCapacidad() {
        return capacidad;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public String getIdentificador() {
        return identificador;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void mesaOcupada() {
        disponibilidad = false;
    }

    public void mesaLibre() {
        disponibilidad = true;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String informacionMesa = String.format("Mesa: %2s" +
                " => Capacidad: %2d   Disponibilidad: %s",
                identificador, capacidad, evaluarDisponibilidad());

        return informacionMesa;
    }

    private String evaluarDisponibilidad() {
        if (disponibilidad)
            return "Libre";
        return "Ocupada";
    }

}
