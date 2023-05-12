package Tema4InteraccionObjeto.Ejercicio18Numero;

public class Numero {
    private int numero;

    /* ------------------------------ Constructors ------------------------------ */
    public Numero() {
        numero = 0;
    }

    public Numero(int numero) {
        this.numero = Math.abs(numero);
    }

    public Numero(Numero num) {
        this.numero = num.getNumero();
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getNumero() {
        return numero;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setNumero(int numero) {
        this.numero = Math.abs(numero);
    }

    /* -------------------------------- Funtions -------------------------------- */
    /* -------------------------------- Factorial ------------------------------- */
    public int factorialWhile() {
        int numeroFactorial = numero == 0 ? 1 : numero;
        int cont = numero;

        while (cont > 1)
            numeroFactorial *= --cont;

        return numeroFactorial;
    }

    public int factorialFor() {
        int numeroFactorial = (numero == 0)
                ? 1
                : numero;

        for (int i = numero - 1; i > 1; i--)
            numeroFactorial *= i;

        return numeroFactorial;
    }

    /* ------------------------------- NumeroPrimo ------------------------------ */
    public boolean primo() {
        int seraPrimo = numero;

        if (seraPrimo == 0 || seraPrimo == 1)
            return false;

        for (int i = 2; i <= numero / 2; i++) {
            if (seraPrimo % i == 0)
                return false;
        }

        return true;
    }

    /* ------------------------- CalcularCantidadCifras ------------------------- */
    public int cantidadCifras() {
        int cifras = 0;

        for (int i = 1; i < numero; i *= 10)
            cifras++;

        return cifras == 0 ? 1 : cifras;
    }

    /* -------------------------------- EsCapicúa ------------------------------- */
    public boolean esCapicua() {
        return ((inverso() == numero) && numero > 10) ? true : false;
    }

    private int inverso() {
        int aux = numero;
        int numRevertido = 0;
        int cifra = 0;

        for (int i = 0; i < cantidadCifras(); i++) {
            cifra = ultimaCifra(aux);
            numRevertido = numRevertido * 10 + cifra;
            aux /= 10;
        }

        return numRevertido;
    }

    private int ultimaCifra(int numero) {
        return numero % 10;
    }

    /* ----------------------------- pintarCuadrado ----------------------------- */
    public void pintarCuadrado() {
        int numAsteriscos = (numero > 20) ? 20 : numero;

        lineasHorizontalesCuadrado(numAsteriscos);
        for (int i = 0; i < numero - 2; i++)
            lineasVerticalesCuadrado(numAsteriscos);
        lineasHorizontalesCuadrado(numAsteriscos);
    }

    private void lineasHorizontalesCuadrado(int numAsteriscos) {
        for (int i = 0; i < numAsteriscos; i++)
            System.out.print("*  ");
        System.out.println();
    }

    private void lineasVerticalesCuadrado(int numAsteriscos) {
        for (int i = 0; i < numAsteriscos; i++) {
            System.out.print(
                    (i == 0 || i == numero - 1)
                            ? "*  "
                            : "   ");
        }

        System.out.println();
    }
}
