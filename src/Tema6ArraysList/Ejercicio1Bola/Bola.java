package Tema6ArraysList.Ejercicio1Bola;

public class Bola {
    private ColoresBolas bola;

    /* ------------------------------- Constructor ------------------------------ */
    public Bola() {
        bola = ColoresBolas.BLANCO;

        if (((int) (Math.random() * 10000) % 2) == 1) 
            bola = ColoresBolas.NEGRO;    
    }

    /* --------------------------------- Getter --------------------------------- */
    public ColoresBolas getBola() {
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
        return bola == ColoresBolas.BLANCO;
    }

    public boolean esNegra() {
        return bola == ColoresBolas.NEGRO;
    }

}
