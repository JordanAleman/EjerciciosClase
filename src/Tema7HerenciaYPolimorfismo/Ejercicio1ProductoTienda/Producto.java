package Tema7HerenciaYPolimorfismo.Ejercicio1ProductoTienda;

import OperacionesAdicionales.StringOperaciones.Nombres;

public class Producto {
    private String identificador;
    private double precioBase;

    /* ------------------------------- Constructor ------------------------------ */
    protected Producto(String identificador, double precioBase) {
        if (identificador == null)
            identificador = "Pendiente categorizar";

        this.identificador = Nombres.capitalizarNombre(identificador);
        this.precioBase = precioBase;
        comprobarPrecioBase();
    }

    private void comprobarPrecioBase() {
        if (precioBase < 0.1)
            precioBase = 0.1;

        if (precioBase > 2000.0)
            precioBase = 2000.0;
    }

    /* --------------------------------- Getter --------------------------------- */
    protected String getIdentificador() {
        return identificador;
    }

    protected double getPrecioBase() {
        return precioBase;
    }

    /* --------------------------------- Setter --------------------------------- */
    protected void setIdentificador(String identificador) {
        if (identificador != null)
            this.identificador = identificador.toLowerCase();
    }

    protected void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        comprobarPrecioBase();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Identificador: " + identificador +
                "\nPrecio Base: " + precioBase;
    }
}
