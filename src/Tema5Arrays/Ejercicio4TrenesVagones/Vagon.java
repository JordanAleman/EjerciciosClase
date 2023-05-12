package Tema5Arrays.Ejercicio4TrenesVagones;

public class Vagon {
    private double[] asientos;
    private int asientoActualDisponible;

    
    private int identificador;
    private static int identificadorAumento = 0;

    /* ------------------------------- Constructor ------------------------------ */
    public Vagon(int numeroAsientos) {
        asientos = new double[numeroAsientos];
        identificador = ++identificadorAumento;
        asientoActualDisponible = 0;

        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++)
            asientos[i] = -1;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int getCapacidad() {
        return asientos.length;
    }

    public int getAsientoActualDisponible() {
        return asientoActualDisponible;
    }

    public int getIdentificador() {
        return identificador;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "Vagón " + identificador + " - Capacidad " + getCapacidad();
    }

    public void printDetalles() {
        System.out.println(this);
    }

    public void printTicket(int numeroAsiento) {
        System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■" +
                "\n" + this +
                "\nNº asiento - " + numeroAsiento +
                "\nPrecio: " + asientos[numeroAsiento] +
                "\n■■■■■■■■■■■■■■■■■■■■■■■");
    }

    /* -------------------------------- Functions ------------------------------- */
    public double reembolsarAsiento(int numeroAsiento) {
        if (numeroAsiento > getCapacidad() || numeroAsiento < 0)
            return 0.0;

        if (asientos[numeroAsiento] >= 0) {
            double precioAsiento = asientos[numeroAsiento];
            asientos[numeroAsiento] = -1;
            actualizarAsiento();
            return precioAsiento;
        }

        return 0.0;
    }

    public boolean reservarSiguienteAsiento() {
        if (vagonLleno())
            return false;

        asientos[asientoActualDisponible] = 1.0 + (2.5 * asientoActualDisponible);
        printTicket(asientoActualDisponible);
        actualizarAsiento();
        return true;
    }

    public void actualizarAsiento() {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == -1) {
                asientoActualDisponible = i;
                return;
            }
        }
        asientoActualDisponible = asientos.length;
    }

    public boolean vagonLleno() {
        return asientoActualDisponible == asientos.length;
    }

    /* -------------------------- Calcular precio medio ------------------------- */
    public double getPrecioMedio() {
        double contPrecio = 0;
        double contAsientos = 0;

        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] > -1) {
                contPrecio += asientos[i];
                contAsientos++;
            }
        }

        return contPrecio / contAsientos;
    }
}
