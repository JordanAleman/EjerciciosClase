package Tema6ArraysList.Ejercicio8FrecuenciaNumeros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class FrecuenciaNumeros {
        private HashMap<String, Contador> mapaFrecuenciaNumeros;

        private static Scanner miTeclado;

        /**
         * La clase mantiene un map en el que se registran las veces que aparece cada
         * uno de los números de un fichero de texto
         */

        /* ------------------------------- Constructor ------------------------------ */
        public FrecuenciaNumeros() {
                mapaFrecuenciaNumeros = new HashMap<>();
        }

        /**
         *
         * @param el número a añadir
         */
        public void addNumero(int numero) {
                if (mapaFrecuenciaNumeros.containsKey(numero + ""))
                        mapaFrecuenciaNumeros.get(numero + "").incrementar();
                else
                        mapaFrecuenciaNumeros.put(numero + "", new Contador(1));
        }

        /* ---------------------- Lee los números de un fichero --------------------- */
        public void cargarDeFichero() {
                try {
                        miTeclado = new Scanner(new File("src\\Tema6ArraysList\\Ejercicio8FrecuenciaNumeros\\numeros.txt"));
                        while (miTeclado.hasNextInt())
                                addNumero(miTeclado.nextInt());
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        /**
         * 
         * Listar cada número aparecido y su frecuencia
         * Se utiliza Map.Entry
         */
        public void listarFrecuencias() {
                for (Map.Entry<String, Contador> itMapa : mapaFrecuenciaNumeros.entrySet()) {
                        System.out.println("\nClave: " + itMapa.getKey() +
                                        "\nFrecuencia: " + itMapa.getValue().getContador());
                }
        }

        /**
         * 
         * Muestra cuántos números diferentes han aparecido
         * y la relación de todos ellos
         * 
         * Se utiliza la "vista" sobre las claves
         * y un for each
         */
        public void listarNumeros() {

        }

}
