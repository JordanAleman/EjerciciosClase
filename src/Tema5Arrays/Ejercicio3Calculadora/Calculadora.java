package Tema5Arrays.Ejercicio3Calculadora;

public class Calculadora {
    private int[] listaNumeros;
    private int total;

    public final int MAX = 10;

    /* ------------------------------- Constructor ------------------------------ */
    public Calculadora() {
        listaNumeros = new int[MAX];
        total = 0;
    }

    public Calculadora(int[] numeros) {
        listaNumeros = new int[MAX];
        total = 0;

        if (numeros.length <= MAX) {
            // System.arraycopy(numeros, 0, listaNumeros, 0, numeros.length);

            for (int i = 0; i < numeros.length; i++)
                listaNumeros[i] = numeros[i];
            total++;
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getTotal() {
        return total;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void escribirNumero() {
        System.out.println("Posición   Valor");

        for (int i = 0; i < listaNumeros.length; i++)
            System.out.println(i + "          " + listaNumeros[i]);

        System.out.println();
    }

    /* ------------- Comprobar si está completo la lista de números ------------- */
    private boolean estaCompleto() {
        return total == MAX;
    }

    /* ---------------------------- IntroducirNumero ---------------------------- */
    public void introducirNumero(int numero) {
        if (estaCompleto())
            return;

        listaNumeros[total++] = numero;
    }

    /* ------ Contar la cantidad de números mayores de la lista de números ------ */
    /* ---------------------- que uno pasado por parámetro ---------------------- */
    public int contarMayoresQue(int numero) {
        int cont = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > numero)
                cont++;
        }

        return cont;
    }

    /* -- Intercambiar los valores de las posiciones indicadas como parámetros -- */
    public void intercambiar(int numPosicion1, int numPosicion2) {
        if (!posicionCorrecta(numPosicion1, numPosicion2))
            return;

        int aux = listaNumeros[numPosicion2];
        listaNumeros[numPosicion2] = listaNumeros[numPosicion1];
        listaNumeros[numPosicion1] = aux;
    }

    private boolean posicionCorrecta(int numPosicion1, int numPosicion2) {
        if (total < 2)
            return false;

        if (numPosicion1 == numPosicion2)
            return false;

        if (numPosicion1 < 0 || numPosicion2 < 0)
            return false;

        if (numPosicion1 >= total || numPosicion2 >= total)
            return false;

        return true;
    }

    /* ------------------------ Borrar el último elemento ----------------------- */
    public void borrarUltimoElemento() {
        if (hayNumeros())
            listaNumeros[--total] = 0;
    }

    private boolean hayNumeros() {
        return total > 0;
    }

    /* ------- Borrar números pares y desplazar los impares a la izquierda ------ */
    public void borrarPares() {
        if (!hayNumeros()) 
            return;
        
        for (int i = 0; i <= total - 1; i++) {
            if (esPar(i)) {
                if (i == total - 1)
                    borrarUnPar(i--);
                else 
                    borrarUnParYDesplazar(i--);
            }
        }
    }

    private boolean esPar(int posicion) {
        return listaNumeros[posicion] % 2 == 0;
    }

    private void borrarUnPar(int posicion) {
        listaNumeros[posicion] = 0;
        total--;
    }

    private void borrarUnParYDesplazar(int posicion) {
        for (int i = posicion; i < total; i++) 
            listaNumeros[i] = listaNumeros[i + 1];
        total--;
    }
}
