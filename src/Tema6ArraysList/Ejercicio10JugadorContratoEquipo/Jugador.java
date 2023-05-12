package Tema6ArraysList.Ejercicio10JugadorContratoEquipo;

import ClasesPrincipales.Persona;

public class Jugador extends Persona {
    /* ------------------------------- Constructor ------------------------------ */
    public Jugador(String nombre, int edad) {
        super(nombre, edad);

        if (nombre == null) 
            throw new IllegalArgumentException("Nombre nulo");
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return getNombre() + " -> " + getEdad() + " años";
    }
}
