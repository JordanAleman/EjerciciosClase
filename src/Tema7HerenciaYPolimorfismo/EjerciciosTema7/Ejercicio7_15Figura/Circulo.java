package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

import java.awt.Color;
import java.awt.Point;

public class Circulo extends Figura {
    private double radio;

    /* ------------------------------- Constructor ------------------------------ */
    public Circulo(Point centro, Color color, double radio) {
        super(centro, color);
        this.radio = radio;
    }

    /* --------------------------------- Getter --------------------------------- */
    public double getRadio() {
        return radio;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return super.toString() +
                "\nRadio: " + radio;
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circulo))
            return false;

        Circulo auxCirculo = (Circulo) obj;

        return getPunto().equals(auxCirculo.getPunto()) &&
                getColor().equals(auxCirculo.getColor()) &&
                radio == auxCirculo.getRadio();
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                ("" + radio).hashCode() * 13;
    }

    /* ------------------------ Calcular área y perímetro ----------------------- */
    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

}
