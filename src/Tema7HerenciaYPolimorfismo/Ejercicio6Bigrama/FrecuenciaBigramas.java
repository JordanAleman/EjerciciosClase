package Tema7HerenciaYPolimorfismo.Ejercicio6Bigrama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class FrecuenciaBigramas {
    private Map<Bigrama, Integer> mapaFrecuencia;

    /* ------------------------------- Constructor ------------------------------ */
    public FrecuenciaBigramas(String fichero) {
        mapaFrecuencia = new HashMap<>();
        procesarFichero(fichero);
    }

    private void procesarFichero(String fichero) {
        try {
            Scanner sc = new Scanner(new File(fichero)); // palabras.txt
            String primeraPalabra = "";

            if (sc.hasNext())
                primeraPalabra = sc.next();

            while (sc.hasNext()) {
                String segundaPalabra = sc.next();

                Bigrama auxBigrama = new Bigrama(primeraPalabra, segundaPalabra);

                if (mapaFrecuencia.containsKey(auxBigrama))
                    mapaFrecuencia.put(auxBigrama, mapaFrecuencia.get(auxBigrama) + 1);
                else
                    mapaFrecuencia.put(auxBigrama, 1);

                primeraPalabra = segundaPalabra;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String textoMapaFrecuencia = "";
        int contador = 0;

        for (Map.Entry<Bigrama, Integer> iterator : mapaFrecuencia.entrySet()) {
            textoMapaFrecuencia += String.format("Frecuencia: %2d  %s%n", iterator.getValue(), iterator.getKey());
            contador++;
        }

        return textoMapaFrecuencia +
                "\nCantidad bigramas: " + contador;
    }

    /* ---------------------------- Mayor frecuencia ---------------------------- */
    public ArrayList<Bigrama> masFrecuente() {
        int mayorFrecuencia = 0;
        ArrayList<Bigrama> listaMasBigrama = new ArrayList<>();

        Iterator<Bigrama> iterator = mapaFrecuencia.keySet().iterator();

        while (iterator.hasNext()) {
            Bigrama auxBigrama = iterator.next();
            int frecuenciaBigramaActual = mapaFrecuencia.get(auxBigrama);

            if (frecuenciaBigramaActual == mayorFrecuencia) 
                listaMasBigrama.add(auxBigrama);

            if (frecuenciaBigramaActual > mayorFrecuencia) {
                mayorFrecuencia = frecuenciaBigramaActual;
                listaMasBigrama.clear();
                listaMasBigrama.add(auxBigrama);
            }
        }

        return listaMasBigrama;
    }

    public void escribirMasFrecuente() {
        for (Bigrama siguienteBigrama : masFrecuente()) 
            System.out.println(siguienteBigrama);
    }


}
