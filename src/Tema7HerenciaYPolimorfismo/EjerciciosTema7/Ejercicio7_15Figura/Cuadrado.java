package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

import java.awt.Color;
import java.awt.Point;

public class Cuadrado extends Figura {
    private double lado;

    /* ------------------------------- Constructor ------------------------------ */
    public Cuadrado(Point centro, Color color, double lado) {
        super(centro, color);
        this.lado = lado;
    }

    /* --------------------------------- Getter --------------------------------- */
    public double getLado() {
        return lado;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return super.toString() +
                "\nLado: " + lado;
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cuadrado))
            return false;

        Cuadrado auxCuadrado = (Cuadrado) obj;

        return getPunto().equals(auxCuadrado.getPunto()) &&
                getColor().equals(auxCuadrado.getColor()) &&
                lado == auxCuadrado.getLado();
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                ("" + lado).hashCode() * 13;
    }

    /* ------------------------ Calcular área y perímetro ----------------------- */
    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
}
