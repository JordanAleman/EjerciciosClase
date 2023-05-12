package Tema6ArraysList.Ejercicio10JugadorContratoEquipo;

import java.util.HashMap;
import java.util.Map;

public class Equipo {
    private String nombreEquipo;
    private HashMap<String, Contrato> mapaContratos;

    /* ------------------------------- Constructor ------------------------------ */
    public Equipo(String nombreEquipo) {
        if (nombreEquipo == null)
            nombreEquipo = "Sin nombre de equipo";

        this.nombreEquipo = nombreEquipo;
        mapaContratos = new HashMap<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getNumeroJugadores() {
        return mapaContratos.size();
    }

    /**
     * <p>
     * Devuelve el jugador asociado al nombre indicado. SI no hay ninguno devuelve
     * null.
     * </p>
     * 
     * @param nombre Nombre del jugador
     * @return {@code Jugador} con el nombre pasado por parámetro
     */
    public Jugador getJugador(String nombre) {
        if (nombre == null)
            return null;

        if (!mapaContratos.containsKey(nombre))
            return null;

        return mapaContratos.get(nombre).getJugador();
    }

    /**
     * <p>
     * devuelve el jugador de la posición pos. Hay que comprobar que la posición es
     * correcta, si no es así devuelve un jugador null.
     * </p>
     * 
     * @param posicion Posición que "ocupa" el jugador en el mapa
     * @return {@code Jugador} con la posición indicada por parámetro
     */
    public Jugador getJugador(int posicion) {
        if (posicion < 0 || posicion >= mapaContratos.size())
            return null;

        String[] posicionesJugadores = new String[mapaContratos.size()];
        mapaContratos.keySet().toArray(posicionesJugadores);

        return getJugador(posicionesJugadores[posicion]);
    }

    public int getSalario(String nombre) {
        if (nombre == null)
            return -1;

        if (!mapaContratos.containsKey(nombre))
            return -1;

        return mapaContratos.get(nombre).getSalario();
    }

    public Contrato getContratoMasAlto() {
        if (mapaContratos.isEmpty()) {
            System.out.println("No hay contratos");
            return null;
        }

        Contrato contratoMasAlto = null;
        int salarioMasAlto = -1;

        for (Contrato contrato : mapaContratos.values()) {
            if (contrato.getSalario() > salarioMasAlto) {
                salarioMasAlto = contrato.getSalario();
                contratoMasAlto = contrato;
            }
        }

        return contratoMasAlto;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void escribirNombreJugadores() {
        System.out.print("[ ");

        for (String nombre : mapaContratos.keySet())
            System.out.print(nombre + " ");

        System.out.println("]");
    }

    public void escribirNombreYSalariosJugadores() {
        for (Map.Entry<String, Contrato> mapaContratosEntry : mapaContratos.entrySet()) {
            System.out.printf("Nombre: %" + nombreMasLargo() + "s %10s %s%n",
                    mapaContratosEntry.getValue().getJugador().getNombre(),
                    "Salario:",
                    mapaContratosEntry.getValue().getSalario());
        }
    
    }
    public void escribirDatosCompletosJugadores() {
        for (Map.Entry<String, Contrato> mapaContratosEntry : mapaContratos.entrySet()) {
            System.out.printf("Nombre: %" + nombreMasLargo() + "s  Edad: %2d %10s %s%n",
                    mapaContratosEntry.getValue().getJugador().getNombre(),
                    mapaContratosEntry.getValue().getJugador().getEdad(),
                    "Salario:",
                    mapaContratosEntry.getValue().getSalario());
        }
    }

    public void escribirDetallesJugadores(int[] posiciones) {
        if (posiciones == null) {
            System.out.println("Parámetro nulo -_-");
            return;
        }

        for (int i = 0; i < posiciones.length; i++) {
            System.out.printf("Posición '%2d' Jugador: " +
                    ((getJugador(posiciones[i]) == null)
                            ? "Ninguno en esta posición"
                            : "%s")
                    + "%n",
                    posiciones[i], getJugador(posiciones[i]));
        }
    }

    private int nombreMasLargo() {
        int auxNombreMasLargo = 0;

        for (String nombre : mapaContratos.keySet()) {
            if (nombre.length() > auxNombreMasLargo)
                auxNombreMasLargo = nombre.length();
        }

        return auxNombreMasLargo;
    }

    /* ---------------------------- Firmar contratos ---------------------------- */
    public void firmarContrato(Jugador nuevoJugador, int salario) {
        if (nuevoJugador == null)
            return;

        mapaContratos.put(nuevoJugador.getNombre(), new Contrato(nuevoJugador, salario));
    }

    public void firmarContratos(String[] arrayNombres, int[] arrayEdades, int[] arraySalarios) {
        if (arrayNombres == null || arrayEdades == null || arraySalarios == null) {
            System.out.println("Ningún cambio. Al menos un parámetro es null");
            return;
        }

        if (arrayNombres.length != arrayEdades.length || arrayNombres.length != arraySalarios.length) {
            System.out.println("Ningún cambio. Distintos tamaños de arrays en parámetros.");
            return;
        }

        Jugador auxJugador;

        for (int i = 0; i < arrayNombres.length; i++) {
            auxJugador = new Jugador(arrayNombres[i], arrayEdades[i]);
            mapaContratos.put(auxJugador.getNombre(), new Contrato(auxJugador, arraySalarios[i]));
        }
    }

    /* ----------------------------- Borrar jugador ----------------------------- */
    public void borrarJugador(String nombre) {
        if (nombre == null)
            return;

        if (!mapaContratos.containsKey(nombre))
            return;

        mapaContratos.remove(nombre);
    }
}
