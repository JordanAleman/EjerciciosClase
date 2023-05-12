package Tema7HerenciaYPolimorfismo.Ejercicio1ProductoTienda;

public class ProductoInventariado extends Producto {
    private int cantidad;
    private int beneficio;

    /* ------------------------------- Constructor ------------------------------ */
    public ProductoInventariado(String identificador, double precioBase, int cantidad, int beneficio) {
        super(identificador, precioBase);

        if (cantidad <= 0)
            cantidad = 1;

        if (beneficio < 0)
            beneficio = 0;

        this.cantidad = cantidad;
        this.beneficio = beneficio;
        comprobarBenificio();
    }

    public ProductoInventariado(String identificador, double precioBase, int beneficio) {
        super(identificador, precioBase);

        if (beneficio < 0)
            beneficio = 0;

        cantidad = 0;
        this.beneficio = beneficio;
        comprobarBenificio();
    }

    public ProductoInventariado(String identificador, double precioBase) {
        super(identificador, precioBase);

        cantidad = 0;
        beneficio = 0;
    }

    private void comprobarBenificio() {
        if (beneficio < 0)
            beneficio = 0;

        if (beneficio > 100)
            beneficio = 100;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getCantidad() {
        return cantidad;
    }

    public int getBeneficio() {
        return beneficio;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setCantidad(int cantidad) {
        if (cantidad >= 0)
            this.cantidad = cantidad;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
        comprobarBenificio();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "\nIdentificador: " + getIdentificador() +
                "\nPrecio base: " + getPrecioBase() +
                "\nCantidad: " + cantidad +
                "\nBeneficio: " + beneficio;
    }

    /* -------------------------- Calcular precio final ------------------------- */
    public double calcularPrecioFinal() {
        return getPrecioBase() + (getPrecioBase() * (beneficio / 100.0));
    }
}
