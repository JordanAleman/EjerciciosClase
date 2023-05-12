package Tema6ArraysList.Ejercicio6GenerarConjunto;

import java.util.HashSet;

public class GenerarConjunto {
    private String palabra;
    private HashSet<Character> listaConjunto;

    /* ------------------------------- Constructor ------------------------------ */
    public GenerarConjunto() {
        palabra = "";
        listaConjunto = new HashSet<>();
    }

    public GenerarConjunto(String palabra) {
        if (palabra == null)
            palabra = "";

        this.palabra = palabra.toUpperCase();

        listaConjunto = new HashSet<>();
        listaConjunto = conjunto();
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getPalabra() {
        return palabra;
    }

    public HashSet<Character> getListaConjunto() {
        return listaConjunto;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setPalabra(String palabra) {
        if (palabra == null)
            throw new IllegalArgumentException("Parámetro nulo");

        this.palabra = palabra.toUpperCase();
        
        listaConjunto.clear();
        listaConjunto = conjunto();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Palabra: " + palabra +
                "\nConjunto: " + listaConjunto;
    }

    public void obtenerConjunto() {
        System.out.println(listaConjunto);
    }

    /* --------------------- Generar el conjunto del HashSet -------------------- */
    private HashSet<Character> conjunto() {
        for (int i = 0; i < palabra.length(); i++)
            listaConjunto.add(palabra.charAt(i));

        return listaConjunto;
    }

}
