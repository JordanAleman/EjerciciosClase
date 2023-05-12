package Tema5Arrays.Ejercicio11Pila;

public class Pila {
    private Entero[] pilaElementos;
    private int topPila;

    private final int TAM_PILA = 10;

    /* ------------------------------- Constructor ------------------------------ */
    public Pila() {
        pilaElementos = new Entero[TAM_PILA];
        topPila = 0;
    }

    public Pila(int capacidadPila) {
        pilaElementos = new Entero[capacidadPila];
        topPila = 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    public Entero getCumbre() {
        if (estaVacia()) 
            errorCapacidad("La pila está vacía");

        return pilaElementos[topPila];
    }

    /* ---------------------- Añadir un elemento a la pila ---------------------- */
    public void push(Entero elemento) {
        if (estaLlena()) 
            errorCapacidad("La pila está llena");
        
        pilaElementos[topPila++] = elemento;
    }

    /* ---------------------- Sacar un elemento de la pila ---------------------- */
    public Entero pop(Entero elemento) {
        if (estaVacia()) 
            errorCapacidad("La pila está vacía");
        
        Entero elementoSacado = pilaElementos[topPila];
        pilaElementos[topPila--] = null;

        return elementoSacado;
    }

    /* --------------------------- Evaluar estado pila -------------------------- */
    public boolean estaLlena() {
        return topPila == pilaElementos.length;
    }

    public boolean estaVacia() {
        return topPila == 0;
    }

    /* ----------------------------- Control errores ---------------------------- */
    private void errorCapacidad(String error) {
        System.out.println();
        throw new RuntimeException(error);
    }
}
