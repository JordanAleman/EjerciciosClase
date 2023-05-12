package Tema6ArraysList.Ejercicio8FrecuenciaNumeros;

public class Contador {
    private int valor;

    /* ------------------------------- Constructor ------------------------------ */
    public Contador() {
        valor = 0;
    }

    public Contador(int valor) {
        if (valor >= 0)
            this.valor = valor;
        else
            valor = 0;
    }

    public Contador(Contador otroContador) {
        valor = otroContador.getContador();
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getContador() {
        return valor;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor > 0)
            valor--;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public String toString() {
        return "Valor " + valor;
    }

}
