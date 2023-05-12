package Tema6ArraysList.Ejercicio1Bola;

import java.util.ArrayList;
import java.util.Iterator;

public class Urna {
    private ArrayList<Bola> listaBolas;

    /* ------------------------------- Constructor ------------------------------ */
    public Urna() {
        listaBolas = new ArrayList<>();
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void mostrarUrna() {
        Iterator<Bola> miIteratorBola = listaBolas.iterator();
        // Bola auxBola;

        while (miIteratorBola.hasNext()) {
            // a1uxBola = miIteratorBola.next();
            System.out.println(miIteratorBola.next());
        }

    }

    /* ------------------------------- Meter bolas ------------------------------ */
    public void meterBola(Bola nuevaBola) {
        listaBolas.add(nuevaBola);
    }

    /* ------------------------------- Sacar bolas ------------------------------ */
    public Bola sacarBola() {
        if (listaBolas.isEmpty())
            System.out.println("La lista está vacía");

        int auxPosicionAleatoria = obtenerPosicionAleatoria(listaBolas.size());
        Bola bolaRemovida = listaBolas.get(auxPosicionAleatoria);
        listaBolas.remove(bolaRemovida);

        return bolaRemovida;
    }

    private int obtenerPosicionAleatoria(int hasta) {
        return (int) (Math.random() * hasta);
    }

    /* --------------------------- Cuantos colores hay -------------------------- */
    public int cuantasBlancas() {
        int cont = 0;

        for (Bola bola : listaBolas) {
            if (bola.esBlanca())
                cont++;
        }

        return cont;
    }

    public int cuantasNegras() {
        return listaBolas.size() - cuantasBlancas();
    }

    /* ------------------------- Borrar bolas por color ------------------------- */
    public void borrarBlancas() {
        Iterator<Bola> miIteratorBola = listaBolas.iterator();
        Bola auxBola;

        while (miIteratorBola.hasNext()) {
            auxBola = miIteratorBola.next();

            if (auxBola.esBlanca()) 
                miIteratorBola.remove();
        }

    }
}
