package Tema10InterfazGrafica.Ejercicio10Tablero.Modelo;

import java.awt.Color;
import java.util.ArrayList;

import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.Interfaz.InterfazBotonTablero;
import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.Interfaz.InterfazInformacionJugadores;

public class ModeloTablero {
    // Datos Panel Izquierdo
    private String jugadorActual;
    private String puntuacion;
    private Color colorFondoJugador;
    private Color colorLetraJugador;

    // Datos Panel Derecho
    private int filaButton, columnaButton;
    private Color colorBackgroundButton;
    private String nameButton;

    // Interfaces
    private ArrayList<InterfazInformacionJugadores> listaListenerInformacionJugadores;
    private ArrayList<InterfazBotonTablero> listaListenerBotonTablero;

    /* ------------------------------- Constructor ------------------------------ */
    public ModeloTablero() {
        listaListenerInformacionJugadores = new ArrayList<>();
        listaListenerBotonTablero = new ArrayList<>();

        jugadorActual = "Turno: Jugador 1";
        puntuacion = "";
        colorFondoJugador = null;
        colorLetraJugador = null;

        filaButton = 0;
        columnaButton = 0;
        colorBackgroundButton = null;
        nameButton = "";
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getJugadorActual() {
        return jugadorActual;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setJugadorActual(String jugadorActual, String puntuacion, Color colorFondoJugador, Color colorLetraJugador) {
        this.jugadorActual = jugadorActual;
        this.puntuacion = puntuacion;
        this.colorFondoJugador = colorFondoJugador;
        this.colorLetraJugador = colorLetraJugador;
        notificarCambioInformacionJugadores();
    }

    public void setColorButton(int fila, int columna, Color color, String name) {
        filaButton = fila;
        columnaButton = columna;
        colorBackgroundButton = color;
        nameButton = name;
        notificarCambioBotonTablero();
    }

    /* ------------------------- Agregar las interfaces ------------------------- */
    public void agregarInterfazInformacionJugadores(InterfazInformacionJugadores listenerInformacionJugadores) {
        listaListenerInformacionJugadores.add(listenerInformacionJugadores);
    }

    public void agregarInterfazBotonTablero(InterfazBotonTablero listenerBotonTablero) {
        listaListenerBotonTablero.add(listenerBotonTablero);
    }

    /* ---------------------- Comunicación con la interfaz ---------------------- */
    private void notificarCambioInformacionJugadores() {
        for (InterfazInformacionJugadores interfazInformacionJugador : listaListenerInformacionJugadores)
            interfazInformacionJugador.setTurnoJugador(jugadorActual, puntuacion, colorFondoJugador, colorLetraJugador);
    }

    private void notificarCambioBotonTablero() {
        for (InterfazBotonTablero interfazBotonTablero : listaListenerBotonTablero)
            interfazBotonTablero.setButtonColor(filaButton, columnaButton, colorBackgroundButton, nameButton);
    }
}
