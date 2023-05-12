package Tema5Arrays.Ejercicio4TrenesVagones;

public class Tren {
    private Vagon[] vagones;
    private int siguienteVagon;

    private final int MAX_VAGONES = 11;

    /* ------------------------------- Constructor ------------------------------ */
    public Tren() {
        vagones = new Vagon[MAX_VAGONES];
        siguienteVagon = 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getNumeroVagones() {
        return siguienteVagon;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void printListaVagones() {
        if (siguienteVagon == 0)
            System.out.println("El tren no tiene ningún vagón");
        else {
            for (int i = 0; i < siguienteVagon; i++)
                System.out.printf("Vagón %02d - Capacidad %02d %n",
                        vagones[i].getIdentificador(), vagones[i].getCapacidad());
        }
    }

    /* --------------------------- Control tamaño Tren -------------------------- */
    private boolean trenLleno() {
        return siguienteVagon == MAX_VAGONES;
    }

    /* ------------------------- Añadir un Vagón al Tren ------------------------ */
    public void addVagon(Vagon nuevoVagon) {
        if (trenLleno())
            return;

        if (nuevoVagon == null)
            return;

        vagones[siguienteVagon++] = nuevoVagon;
    }

    /* ------ Borrar un Vagón indicando la posición del Vagón por parámetro ----- */
    public Vagon borrarVagon(int posicionVagon) {
        if (!poscionValidaVagon(posicionVagon))
            return null;

        Vagon vagonBorrado = vagones[posicionVagon];
        eliminarVagonYDesplazar(posicionVagon);
        return vagonBorrado;
    }

    private void eliminarVagonYDesplazar(int posicionVagon) {
        if (posicionVagon == siguienteVagon - 1)
            vagones[posicionVagon] = null;
        else {
            for (int i = posicionVagon; i < siguienteVagon - 1; i++)
                vagones[i] = vagones[i + 1];
        }
        siguienteVagon--;
    }

    private boolean poscionValidaVagon(int posicionVagon) {
        return posicionVagon >= 0 && posicionVagon < siguienteVagon;
    }


    /* ---- Ordenar vagones del tren en base a su capacidad, de mayor a menor --- */
    public void ordenarVagones() {
        if (siguienteVagon == 0) 
            return;
        
        Vagon mayorCapacidadAux;

        for (int i = 0; i < siguienteVagon; i++) {
            for (int j = 1 + i; j < siguienteVagon; j++) {
                if (vagones[i].getCapacidad() < vagones[j].getCapacidad()) {
                    mayorCapacidadAux = vagones[j];
                    vagones[j] = vagones[i];
                    vagones[i] = mayorCapacidadAux;
                }
            }
        }
    }

    /* ------------------------------ Emitir ticket ----------------------------- */
    public boolean emitirTicket() {
        ordenarVagones();

        for (int i = 0; i < siguienteVagon; i++) {
            if (vagones[i].reservarSiguienteAsiento()) 
                return true;
        }

        return false;
    }
}
