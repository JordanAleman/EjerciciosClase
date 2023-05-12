package Tema4InteraccionObjeto.Ejercicio19Craps;

public class ParDados {
    private Dado dado1;
    private Dado dado2;

    /* ------------------------------- Constructor ------------------------------ */
    public ParDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    /* ------------------------------- TirarDados ------------------------------- */
    public int tirarDados() {
        dado1.tirarDado();
        dado2.tirarDado();

        return dado1.getCara() + dado2.getCara();
    }
}
