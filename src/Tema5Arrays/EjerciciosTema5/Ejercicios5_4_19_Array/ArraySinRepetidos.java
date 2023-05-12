
package Tema5Arrays.EjerciciosTema5.Ejercicios5_4_19_Array;

import java.util.Arrays;

public class ArraySinRepetidos {
    /* -------------------------------- Atributos ------------------------------- */
    private int[] elementos;

    private int siguiente;

    /* -------------------------- Atributos constantes -------------------------- */
    private final int MAX = 10;

    /* ------------------------------- Constructor ------------------------------ */
    public ArraySinRepetidos() {
        elementos = new int[MAX];
        siguiente = 0;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int[] getElementos() {
        return elementos;
    }

    public int getSiguiente() {
        return siguiente;
    }

    /* -------------------------------- Functions ------------------------------- */
    public void insertar(int nuevoElemento) {
        if (!estaCompleto() && !existeElemento(nuevoElemento))
            elementos[siguiente++] = nuevoElemento;
    }

    public void insertarOrdenadamente(int nuevoElemento) {
        if (!estaCompleto() && !existeElemento(nuevoElemento)) {
            for (int i = 0; i < siguiente; i++) {
                if (nuevoElemento < elementos[i]) {

                    for (int j = siguiente - 1; j >= i; j--)
                        elementos[j + 1] = elementos[j];

                    elementos[i] = nuevoElemento;
                    siguiente++;
                    return;
                }
            }
            elementos[siguiente++] = nuevoElemento;
        }
    }

    // [2, 10, 50, 0, 0]
    // [2, 5, 10, 50, 0]

    private boolean existeElemento(int comprobarElemento) {
        for (int i = 0; i < siguiente; i++) {
            if (elementos[i] == comprobarElemento)
                return true;
        }

        return false;
    }

    private boolean estaCompleto() {
        return siguiente == MAX;
    }

    /* -------------------------- ObtenerArrayOrdenado -------------------------- */
    public int[] elementosOrdenados() {
        int[] arrayElementosOrdenados = new int[MAX];

        for (int i = 0; i < arrayElementosOrdenados.length; i++)
            arrayElementosOrdenados[i] = elementos[i];

        Arrays.sort(arrayElementosOrdenados);

        return arrayElementosOrdenados;
    }

    /* ---------- EncontrarElementosAproximadosEnElArrayDadoUnElemento ---------- */
    public int buscarAnteriorElementoAproximado(int elementoAEncontrar) {
        int[] arrayElementosOrdenados = elementosOrdenados();
        int anteriorElementoAproximado = arrayElementosOrdenados[0];

        for (int i = 1; i < arrayElementosOrdenados.length; i++) {
            if (elementoAEncontrar < arrayElementosOrdenados[i])
                return anteriorElementoAproximado;

            anteriorElementoAproximado = arrayElementosOrdenados[i];
        }

        return anteriorElementoAproximado;
    }

    public int buscarSuperiorElementoAproximado(int elementoAEncontrar) {
        int[] arrayElementosOrdenados = elementosOrdenados();
        int superiorElementoAproximado = arrayElementosOrdenados[arrayElementosOrdenados.length - 1];

        for (int i = arrayElementosOrdenados.length - 2; i > 0; i--) {
            if (elementoAEncontrar > arrayElementosOrdenados[i])
                return superiorElementoAproximado;

            superiorElementoAproximado = arrayElementosOrdenados[i];
        }

        return superiorElementoAproximado;
    }

    public void encontrarElemento(int elementoAEncontrar) {
        System.out.println("\nVamos a encontrar el valor más aproximado al " + elementoAEncontrar
                + " si no encuentra ya en el array");
        if (existeElemento(elementoAEncontrar))
            System.out.println("El elemento " + elementoAEncontrar + " se encuentra dentro del array");
        else {
            int elementoAnterior = buscarAnteriorElementoAproximado(elementoAEncontrar);
            int elementoPosterior = buscarSuperiorElementoAproximado(elementoAEncontrar);

            if (elementoAEncontrar - elementoAnterior < elementoPosterior - elementoAEncontrar)
                System.out.println("Su valor más aproximado es " + elementoAnterior);

            if (elementoAEncontrar - elementoAnterior > elementoPosterior - elementoAEncontrar)
                System.out.println("Su valor más aproximado es " + elementoPosterior);

            if (elementoAEncontrar - elementoAnterior == elementoPosterior - elementoAEncontrar)
                System.out.println("Sus valores aproximados son " + elementoAnterior + " y " + elementoPosterior);

        }
    }

}
