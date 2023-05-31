package Tema10InterfazGrafica.Ejercicio10Tablero.Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.ModeloTablero;

public class ActionListenerBotonTablero implements ActionListener {
    private ModeloTablero modeloTablero;
    private JButton[][] tableroBotones;
    private int fila, columna;
    private String nameBoton;

    private boolean flagFinalRecorrido;
    private boolean flagBotonValido; // Comprueba que el botón cambia los colores del tablero.

    // Constantes
    private final String JUGADOR_BLANCAS = "Turno: Jugador 1";
    private final String JUGADOR_NEGRAS = "Turno: Jugador 2";

    private final String BOX_WHITE = "White";
    private final String BOX_BLACK = "Black";

    /* ------------------------------- Constructor ------------------------------ */
    public ActionListenerBotonTablero(ModeloTablero modelo, JButton[][] tableroBotones, int fila, int columna) {
        modeloTablero = modelo;
        this.tableroBotones = tableroBotones;
        this.fila = fila;
        this.columna = columna;

        flagFinalRecorrido = false;
        flagBotonValido = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) (e.getSource());
        nameBoton = boton.getName();

        /* ----------------------------- Columna arriba ----------------------------- */
        // Cambiar colores columna hacia arriba.
        // Comprobar que el botón no está en un extremo
        if (fila > 0) {
            for (int i = fila - 1; i >= 0; i--) {
                if (!flagFinalRecorrido)
                    setCambioColores(i, columna, i, 0);
                else 
                    break;
            }
        }
        flagFinalRecorrido = false;

        /* ------------------------------ Columna abajo ----------------------------- */
        // Cambiar colores columna hacia abajo.
        // Comprobar que el botón no está en un extremo
        if (fila < tableroBotones.length - 1) {
            for (int i = fila + 1; i < tableroBotones.length; i++) {
                if (!flagFinalRecorrido)
                    setCambioColores(i, columna, i, tableroBotones.length - 1);
                else 
                    break;
            }
        }
        flagFinalRecorrido = false;

        /* ----------------------------- Fila izquierda ----------------------------- */
        // Cambiar colores fila hacia la izquierda.
        // Comprobar que el botón no está en un extremo
        if (columna > 0) {
            for (int j = columna - 1; j >= 0; j--) {
                if (!flagFinalRecorrido)
                    setCambioColores(fila, j, j, 0);
                else
                    break;
            }
        }
        flagFinalRecorrido = false; // Siempre a false para poder evaluar los siguientes

        /* ------------------------------ Fila derecha ------------------------------ */
        // Cambiar colores fila hacia la derecha.
        // Comprobar que el botón no está en un extremo
        if (columna < tableroBotones[fila].length - 1) {
            for (int j = columna + 1; j < tableroBotones[fila].length; j++) {
                if (!flagFinalRecorrido)
                    setCambioColores(fila, j, j, tableroBotones[fila].length - 1);
                else
                    break;
            }
        }
        flagFinalRecorrido = false; // Siempre a false para poder evaluar los siguientes

        /* ----------------------------- Cambio jugador ----------------------------- */
        if (flagBotonValido) {
            if (modeloTablero.getJugadorActual().equals(JUGADOR_BLANCAS))
                modeloTablero.setJugadorActual(JUGADOR_NEGRAS, puntuacionTablero(), Color.BLACK, Color.WHITE);
            else
                modeloTablero.setJugadorActual(JUGADOR_BLANCAS, puntuacionTablero(), Color.WHITE, Color.BLACK);

            flagBotonValido = false;
        }

    }

    private void setCambioColores(int filaActual, int columnaActual, int extremo, int cantidadExtremo) {
        switch (nameBoton) {
            case BOX_WHITE -> {
                // Solo en el caso de que sea el turno del jugador de blancas
                if (modeloTablero.getJugadorActual().equals(JUGADOR_BLANCAS)) {
                    if (tableroBotones[filaActual][columnaActual].getName() == BOX_WHITE) {
                        flagFinalRecorrido = true;
                        return;
                    }

                    if (tableroBotones[filaActual][columnaActual].getName() == BOX_BLACK) {
                        modeloTablero.setColorButton(filaActual, columnaActual, Color.WHITE, BOX_WHITE);
                        flagBotonValido = true;
                    }

                    if (!flagBotonValido) {
                        flagFinalRecorrido = true;
                        return;
                    }

                    if (extremo == cantidadExtremo) {
                        flagFinalRecorrido = true;
                        return;
                    }
                }
            }
            case BOX_BLACK -> {
                // Solo en el caso de que sea el turno del jugador de negras
                if (modeloTablero.getJugadorActual().equals(JUGADOR_NEGRAS)) {
                    if (tableroBotones[filaActual][columnaActual].getName() == BOX_BLACK) {
                        flagFinalRecorrido = true;
                        return;
                    }

                    if (tableroBotones[filaActual][columnaActual].getName() == BOX_WHITE) {
                        modeloTablero.setColorButton(filaActual, columnaActual, Color.BLACK, BOX_BLACK);
                        flagBotonValido = true;
                    }

                    if (!flagBotonValido) {
                        flagFinalRecorrido = true;
                        return;
                    }

                    if (extremo == cantidadExtremo) {
                        flagFinalRecorrido = true;
                        return;
                    }
                }
            }
        }
    }

    private String puntuacionTablero() {
        int casillasBlancas = 0;
        int casillasNegras = 0;

        for (int i = 0; i < tableroBotones.length; i++) {
            for (int j = 0; j < tableroBotones[i].length; j++) {
                if (tableroBotones[i][j].getName() == BOX_WHITE) 
                    casillasBlancas++;
                else
                    casillasNegras++;
            }
        }
        return "Blancos: " + casillasBlancas + " - Negros: " + casillasNegras;
    }
}
