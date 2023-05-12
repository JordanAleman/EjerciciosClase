package Tema4InteraccionObjeto.Ejercicio2CirculoPunto;

public class Circulo {
    private double radio;
    private Punto centro;

    private final double PI = Math.PI;

    /* ------------------------------ Constructors ------------------------------ */
    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo(double radio) {
        this.radio = radio;
        centro = new Punto(0, 0);
    }

    /* --------------------------------- Getters -------------------------------- */
    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setRadio(int nuevoRadio) {
        radio = nuevoRadio;
    }

    public void setCentroX(int x) {
        centro.setX(x);
    }

    public void setCentroY(int y) {
        centro.setY(y);
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public String toString() {
        return "Radio: " + getRadio() +
                "\nCentro: \n" + getCentro();
    }

    public void printCirculo() {
        System.out.println(this);
    }

    /* -------------------------------- Functions ------------------------------- */
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    

}
