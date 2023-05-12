package Tema9ExcepcionesIO.Ejercicio8Indice;

import java.util.ArrayList;
import java.util.List;

public class IndiceDocumento {
    private List<EntradaIndice> listaEntradaIndice;

    /* ------------------------------- Constructor ------------------------------ */
    public IndiceDocumento() {
        listaEntradaIndice = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public List<EntradaIndice> getListaEntradaIndice() {
        return listaEntradaIndice;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        StringBuffer stringEntradaIndice = new StringBuffer("");

        for (int i = 0; i < listaEntradaIndice.size(); i++) 
            stringEntradaIndice.append(listaEntradaIndice.get(i) + "\n");

        return new String(stringEntradaIndice);
    }

    public void listarIndiceDocumento() {
        System.out.println(this);
    }

    /* ----------------------------- Añadir palabra ----------------------------- */
    /**
     * Una palabra aparece en un nº de línea. Hay que añadir el nº a la entrada de
     * índice de la palabra llamando al método add() de EntradaIndice. Si la palabra
     * no está en el índice del documento se creará una nueva entrada y se añadirá
     * insertándola en el índice de forma que éste esté en todo momento en orden
     * alfabético. Si la palabra ya existe se actualiza la entrada de índice que le
     * corresponde. Dentro de está método se utilizarán los métodos privados
     * estaPalabra() e insertar()
     */

    public void addPalabra(String palabra, int numeroLinea) {
        if (estaPalabra(palabra) == -1)
            insertar(new EntradaIndice(palabra));

        listaEntradaIndice.get(estaPalabra(palabra)).addNumeroLinea(numeroLinea);
    }

    /**
     * Hace una búsqueda dicotómica en el índice del documento para ver si está la
     * palabra que se pasa como parámetro. Si no está se devuelve -1 y si está se
     * devuelve la posición en la que se ha encontrado
     */
    private int estaPalabra(String palabra) {
        int izquierda = 0;
        int derecha = listaEntradaIndice.size() - 1;

        while (izquierda <= derecha) {
            int mitad = (izquierda + derecha) / 2;
            String palabraListaEntrada = listaEntradaIndice.get(mitad).getPalabra();

            if (palabraListaEntrada.equalsIgnoreCase(palabra))
                return mitad;

            if (palabraListaEntrada.compareToIgnoreCase(palabra) < 0)
                izquierda = mitad + 1;
            else
                derecha = mitad - 1;
        }

        return -1;
    }

    /**
     * Se inserta una nueva entrada del índice en el lugar adecuado para que aquel
     * quede ordenado
     */
    private void insertar(EntradaIndice entrada) {
        int i = 0;
        String palabraEntrada = entrada.getPalabra();

        for (; i < listaEntradaIndice.size(); i++) {
            String palabraListaEntrada = listaEntradaIndice.get(i).getPalabra();

            if (palabraEntrada.compareTo(palabraListaEntrada) < 0) 
                break;
        }

        listaEntradaIndice.add(i, entrada);
    }
}
