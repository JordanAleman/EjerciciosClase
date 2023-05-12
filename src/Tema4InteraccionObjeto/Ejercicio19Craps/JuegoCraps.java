package Tema4InteraccionObjeto.Ejercicio19Craps;

public class JuegoCraps {
    private ParDados dados;
    private int numTiradas;
    private int resultadoDados;

    /* ------------------------------- Constructor ------------------------------ */
    public JuegoCraps() {
        dados = new ParDados();
        // victoria = false;
        numTiradas = 0;
        resultadoDados = 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    public ParDados getDados() {
        return dados;
    }

    public int getNumTiradas() {
        return numTiradas;
    }

    public int getResultadoDados() {
        return numTiradas;
    }

    /* ----------------------------- ObtenerVictoria ---------------------------- */
    public int getVictoriaIncial() {
        if (numTiradas > 0)
            return 0;

        resultadoDados = dados.tirarDados();

        if (resultadoDados == 7 || resultadoDados == 11)
            return 1;

        if (resultadoDados == 2 || resultadoDados == 3 || resultadoDados == 12)
            return -1;

        numTiradas++;
        return 0;
    }

    public int getVictoriaPunto() {
        numTiradas++;
        int nuevaTirada = dados.tirarDados();

        if (nuevaTirada == 7)
            return -1;

        if (resultadoDados == nuevaTirada) 
            return 0;
        
        return nuevaTirada;
    }

    /* -------------------------------- Resetear -------------------------------- */

    public void reset() {
        numTiradas = 0;
    }
}
