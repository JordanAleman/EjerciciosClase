package Tema4InteraccionObjeto.Ejercicio5Fraccion;

public class Fraccion {
    private int numerador;
    private int denominador;

    /* ------------------------------ Constructors ------------------------------ */
    public Fraccion() {
        numerador = 0;
        denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) 
            this.denominador = denominador;
    }

    /* -------------------------------- Functions ------------------------------- */
}
