package Tema4InteraccionObjeto.Ejercicio2CirculoPunto;

import OperacionesAdicionales.OperacionesMatematicasAdicionales.Mates;

public class Punto {
    // variables de instancia
    private int x;
    private int y;

    /* ------------------------------- Constructor ------------------------------ */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")\n";
    }

    /* --------------------------------- Methods -------------------------------- */
    public double getDistanciaDesdeOrigen() {
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return Mates.redondeo2Decimales(distancia);
    }

    public double getDistanciaDesdePunto(Punto otrPunto) {
        double ejeX = Math.pow(x - otrPunto.getX(), 2);
        double ejeY = Math.pow(y - otrPunto.getY(), 2);

        double distancia = Math.sqrt(ejeX + ejeY);

        return distancia;
    }
 
}
