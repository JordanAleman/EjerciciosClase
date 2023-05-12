package Tema4InteraccionObjeto.Ejercicio4SisUsCont;

import Colores.Colores;

public class Contador {
    private int valor;

    /* ------------------------------- Constructor ------------------------------ */
    public Contador() {
        valor = 0;
    }

    public Contador(int valor) {
        this.valor = valor < 0 ? 0 : valor;
    }

    public Contador(Contador otroContador) {
        this.valor = otroContador.getValor();
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getValor() {
        return valor;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void printContador() {
        System.out.println("Valor actual del contador: " +
                Colores.YELLOW_BOLD_BRIGHT + valor + Colores.RESET + "\n");
    }

    /* -------------------------------- Functions ------------------------------- */
    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        valor--;
    }

    public void reset() {
        valor = 0;
    }
}
