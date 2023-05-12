package Tema5Arrays.EjerciciosTema5.Ejercicios5_2_14_Array;

public class Palabra {
    private String castellano;
    private String ingles;

    /* ------------------------------- Constructor ------------------------------ */
    public Palabra(String castellano, String ingles) {
        this.castellano = castellano;
        this.ingles = ingles;
    }

    /* --------------------------------- Getters -------------------------------- */
    public String getCastellano() {
        return castellano;
    }

    public String getIngles() {
        return ingles;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setCastellano(String castellano) {
        this.castellano = castellano;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return palabraBienFormada(castellano) + " - " + palabraBienFormada(ingles);
    }

    private String palabraBienFormada(String palabra) {
        return palabra.substring(0, 1).toUpperCase() +
        palabra.substring(1, palabra.length()).toLowerCase();
    }

}
 