package Tema6ArraysList.Ejercicio1Bola;

public class Bola {
    private Color bola;

    /* ------------------------------- Constructor ------------------------------ */
    public Bola() {
        bola = Color.BLANCO;

        if (((int) (Math.random() * 10000) % 2) == 1) 
            bola = Color.NEGRO;    
    }

    /* --------------------------------- Getter --------------------------------- */
    public Color getBola() {
        return bola;
    }

    public String getBolaString() {
        return bola + "";
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "Bola de color " + bola;
    }

    /* ----------------------------- Reconocer color ---------------------------- */
    public boolean esBlanca() {
        return bola == Color.BLANCO;
    }

    public boolean esNegra() {
        return bola == Color.NEGRO;
    }

}
