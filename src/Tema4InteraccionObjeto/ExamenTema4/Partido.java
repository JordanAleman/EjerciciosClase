package Tema4InteraccionObjeto.ExamenTema4;

public class Partido {
    private static int numero = 0;
    private String resultado;

    /* ------------------------------- Constructor ------------------------------ */
    public Partido() {
        numero++;

        if (numero > 15)
            numero = 1;

        resultado = generarResultado();
    }

    public String generarResultado() {
        String resultado = (numero < 10 ? "0" : "") +
                numero + ": ";

        switch ((int) (Math.random() * 3)) {
            case 0:
                resultado += "_X_";
                break;
            case 1:
                resultado += "X__";
                break;
            case 2:
                resultado += "__X";
                break;
        }
        return resultado;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return resultado;
    }
}