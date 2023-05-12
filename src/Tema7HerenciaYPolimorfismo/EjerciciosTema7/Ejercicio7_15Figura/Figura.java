package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

import java.awt.Point;
import java.awt.Color;

public abstract class Figura implements Movible, Comparable<Figura>{
    private Point centro;
    private Color color;

    /* ------------------------------- Constructor ------------------------------ */
    public Figura(Point centro, Color color) {
        this.centro = centro;
        this.color = color;
    }

    /* --------------------------------- Getter --------------------------------- */
    public Point getPunto() {
        return centro;
    }

    public Color getColor() {
        return color;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setPunto(Point centro) {
        this.centro = centro;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        int indice = getClass().toString().lastIndexOf(".") + 1;
        int tamTotal = getClass().toString().length();

        return "Figura: " + getClass().toString().substring(indice, tamTotal) +
                "\nCentro: " + centro +
                "\nColor: " + color;
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public abstract boolean equals(Object obj);

    @Override
    public int hashCode() {
        return centro.hashCode() * 7 +
                color.hashCode() * 11;
    }

    /* ------------------------------- Comparación ------------------------------ */
    @Override
    public int compareTo(Figura obj) {
        if (getArea() < obj.getArea())
            return -1;

        if (getArea() > obj.getArea())
            return 1;

        return 0;
    }

    /* ------------------------ Calcular área y perímetro ----------------------- */
    public abstract double getArea();

    public abstract double getPerimetro();

    /* ------------------------------ Mover figuras ----------------------------- */
    @Override
    public void moverHorizontal(int desplazamiento) {
        centro.move(desplazamiento, 0);
    }

    @Override
    public void moverVertical(int desplazamiento) {
        centro.move(0, desplazamiento);
    }
}
