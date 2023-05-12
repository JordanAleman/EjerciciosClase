package Tema7HerenciaYPolimorfismo.Ejercicio2Coche;

import OperacionesAdicionales.StringOperaciones.Nombres;

public abstract class Coche {
    private String nombreConductor;
    private String tipoCoche;
    private String colorCoche;
    private Punto posicion;

    /* ------------------------------- Constructor ------------------------------ */
    public Coche(String nombreConductor, String tipoCoche, String colorCoche, Punto posicion) {
        this.nombreConductor = Nombres.capitalizarNombre(nombreConductor);
        this.tipoCoche = Nombres.capitalizarNombre(tipoCoche);
        this.colorCoche = Nombres.capitalizarNombre(colorCoche);
        this.posicion = posicion;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreConductor() {
        return nombreConductor;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public String getColorCoche() {
        return colorCoche;
    }

    public Punto getPosicion() {
        return posicion;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setNombreConductor(String nombreConductor) {
        if (nombreConductor.isBlank())
            return;

        this.nombreConductor = Nombres.capitalizarNombre(nombreConductor);
    }

    public void setTipoCoche(String tipoCoche) {
        if (tipoCoche.isBlank())
            return;

        this.tipoCoche = Nombres.capitalizarNombre(tipoCoche);
    }

    public void setColorCoche(String colorCoche) {
        if (colorCoche.isBlank())
            return;

        this.colorCoche = Nombres.capitalizarNombre(colorCoche);
    }

    public void setPosicion(Punto posicion) {
        if (posicion == null)
            return;

        this.posicion = posicion;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Nombre conductor: " + nombreConductor +
                "\nTipo de coche: " + tipoCoche +
                "\nColor: " + colorCoche +
                "\nPosición: " + posicion;
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Coche otroCoche)) 
            return false;

        return nombreConductor.equalsIgnoreCase(otroCoche.nombreConductor) &&
                tipoCoche.equals(otroCoche.tipoCoche) &&
                colorCoche.equals(otroCoche.colorCoche);
    }

    @Override
    public int hashCode() {
        return nombreConductor.hashCode() * 3 +
                tipoCoche.hashCode() * 5 +
                colorCoche.hashCode() * 7;
    }

    /* -------------------------- Avanzar en el espacio ------------------------- */
    public abstract void avanza();
}
