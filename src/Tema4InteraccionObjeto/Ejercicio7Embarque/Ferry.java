package Tema4InteraccionObjeto.Ejercicio7Embarque;

import OperacionesAdicionales.ArrayOperacionesAdicionales.Array;


public class Ferry {
    private Pasajero[] asientos; // Esto es un array de una dimesnsión. También llamado Vector
    private int numPasajeros;

    /* ------------------------------ Constructors ------------------------------ */
    public Ferry() {
        asientos = new Pasajero[3];
        numPasajeros = 0;
    }
    
    public Ferry(int capacidadPasajeros) {
        asientos = new Pasajero[capacidadPasajeros];
        numPasajeros = 0;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getCantidadAsientos() {
        return asientos.length;
    }

    public Pasajero getPasajero(int posicion) {
        return asientos[posicion];
    }

    public Pasajero[] getAsientos() {
        return asientos;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void printDetallesPasajeros() {
        String listaPasajeros = "";

        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) 
                listaPasajeros += asientos[i].printDetalles() + "\n";
        }

        System.out.println((numPasajeros > 0)
                ? "Los pasajeros son: \n" + listaPasajeros
                : "No hay pasajeros.");

    }

    /* ----------------------------- AñadirPasajeros ---------------------------- */
    public boolean addPasajero(Pasajero nuevoPasajero) {
        if (numPasajeros == asientos.length)
            return false;

        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                asientos[i] = nuevoPasajero;
                numPasajeros++;
                return true;
            }

            if (asientos[i].esIgual(nuevoPasajero))
                return false;
        }

        return false;
    }

    public boolean addPasajeroPorNombre(String nombre) {
        return addPasajero(new Pasajero(nombre));
    }

    /* ----------------------------- BorrarPasajeros ---------------------------- */
    public boolean borrarPasajero(Pasajero unPasajero) {
        if (numPasajeros == 0)
            return false;
            
        for (int i = 0; i < numPasajeros; i++) {
            if (asientos[i].esIgual(unPasajero)) {
                Array.eliminarYDesplazar(asientos, i);
                numPasajeros--;
                return true;
            }
        }

        return false;
    }

    /* ------------------------------ PasajeroJoven ----------------------------- */
    public Pasajero getPasajeroMasJoven() {
        int edadMasJoven = 1000;
        Pasajero masJoven = null;

        if (numPasajeros == 0)
            return null;

        if (numPasajeros == 1)
            return asientos[0];

        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                int edadPasajero = asientos[i].getEdad();

                if (edadPasajero >= 0 && edadPasajero < edadMasJoven) {
                    edadMasJoven = edadPasajero;
                    masJoven = asientos[i];
                }
            }
        }

        return masJoven;
    }
}
