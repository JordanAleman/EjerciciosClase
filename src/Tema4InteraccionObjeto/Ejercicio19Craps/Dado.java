package Tema4InteraccionObjeto.Ejercicio19Craps;


public class Dado {
    private int cara;
    
    /* ------------------------------- Constructor ------------------------------ */
    public Dado() {
        this.cara = (int) (Math.random() * 6) + 1;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getCara() {
        return cara;
    }

    /* -------------------------------- TirarDado ------------------------------- */
    public void tirarDado() {
        cara = (int) (Math.random() * 6) + 1;
    }

}
