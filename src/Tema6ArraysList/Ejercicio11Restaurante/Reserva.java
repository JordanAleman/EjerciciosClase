package Tema6ArraysList.Ejercicio11Restaurante;

public class Reserva {
    private String nombreCliente;
    private int cantidadComensales;
    private Mesa mesaAsignada;

    private String identificador;
    private static int identificadorAumentador = 0;

    /* ------------------------------- Constructor ------------------------------ */
    public Reserva(String nombreCliente, int cantidadComensales, Mesa mesaAsignada) {
        this.nombreCliente = nombreCliente;
        this.cantidadComensales = cantidadComensales;
        this.mesaAsignada = mesaAsignada;

        identificador = ++identificadorAumentador + "";
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCantidadComensales() {
        return cantidadComensales;
    }

    public Mesa getMesaAsignada() {
        return mesaAsignada;
    }

    public String getIdentificador() {
        return identificador;
    }

    /* --------------------------------- Setter --------------------------------- */
    public static void reiniciarIdentificador(boolean seguridad) {
        if (seguridad)
            identificadorAumentador = 0;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Reserva id: " + identificador +
                "\n   Mesa: " + mesaAsignada.getIdentificador() +
                "\n   Cliente quien reservó: " + nombreCliente +
                "\n   Cantidad de comensales: " + cantidadComensales;
    }
}
