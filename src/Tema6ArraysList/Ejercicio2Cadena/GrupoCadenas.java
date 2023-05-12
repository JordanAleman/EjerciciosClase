package Tema6ArraysList.Ejercicio2Cadena;

import java.util.ArrayList;
import java.util.Iterator;

public class GrupoCadenas {
    private ArrayList<Cadena> listaCadenas;

    /* ------------------------------- Constructor ------------------------------ */
    public GrupoCadenas() {
        listaCadenas = new ArrayList<>();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void listarGrupo() {
        Iterator<Cadena> iteradorListaCadenas = listaCadenas.iterator();
        Cadena auxCadena;

        while (iteradorListaCadenas.hasNext()) {
            auxCadena = iteradorListaCadenas.next();
            System.out.println("Cadena: " + auxCadena + "\nSuma cifras: " +
                    auxCadena.sumarDigitos() + "\n");
        }
    }

    public void listarGrupoCifrado() {
        for (Cadena cadena : listaCadenas) {
            System.out.println("Cadena: " + cadena);
            System.out.println("Cadena cifrada: " + cadena.cifrar() + "\n");
        }
    }

    /* ------------------------------ Añadir cadena ----------------------------- */
    public void addCadena(String nuevaCadena) {
        listaCadenas.add(new Cadena(nuevaCadena));
    }

    /* ---------------- Borrar los que tienen más de tres vocales --------------- */
    public ArrayList<Cadena> borrarTresMasVocales() {
        Iterator<Cadena> iteradorListaCadenas = listaCadenas.iterator();
        Cadena auxCadena;
        ArrayList<Cadena> listasCon3oMasVocales = new ArrayList<>();

        while (iteradorListaCadenas.hasNext()) {
            auxCadena = iteradorListaCadenas.next();
            if (auxCadena.contarVocales() >= 3) {
                listasCon3oMasVocales.add(auxCadena);
                iteradorListaCadenas.remove();
            }
        }

        return listasCon3oMasVocales;
    }
}
