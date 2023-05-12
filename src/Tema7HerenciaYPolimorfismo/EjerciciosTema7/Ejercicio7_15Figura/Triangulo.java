package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

import java.awt.Color;
import java.awt.Point;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    /* ------------------------------- Constructor ------------------------------ */
    public Triangulo(Point centro, Color color, double base, double altura) {
        super(centro, color);
        this.base = base;
        this.altura = altura;
    }

    /* --------------------------------- Getter --------------------------------- */
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return super.toString() +
                "\nBase: " + base +
                "\nAltura: " + altura;
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangulo))
            return false;

        Triangulo auxTriangulo = (Triangulo) obj;

        return getPunto().equals(auxTriangulo.getPunto()) &&
                getColor().equals(auxTriangulo.getColor()) &&
                base == auxTriangulo.getBase() &&
                altura == auxTriangulo.getAltura();
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                ("" + base).hashCode() * 13 +
                ("" + altura).hashCode() * 17;
    }

    /* ------------------------ Calcular área y perímetro ----------------------- */
    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return (2 * altura) + base;
    }
}
