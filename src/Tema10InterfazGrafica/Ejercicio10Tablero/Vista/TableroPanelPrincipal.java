package Tema10InterfazGrafica.Ejercicio10Tablero.Vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.ModeloTablero;
import Tema10InterfazGrafica.Ejercicio10Tablero.Vista.PanelDerecho.PanelDerecho;
import Tema10InterfazGrafica.Ejercicio10Tablero.Vista.PanelIzquierdo.PanelIzquierdo;

public class TableroPanelPrincipal extends JPanel {
    private PanelIzquierdo panelIzquierdo;
    private PanelDerecho panelDerecho;

    private ModeloTablero modeloTablero;

    /* ------------------------------- Constructor ------------------------------ */
    public TableroPanelPrincipal() {
        /* --------------------------- Inicializar modelo --------------------------- */
        modeloTablero = new ModeloTablero();

        /* -------------------------- Estructura del panel -------------------------- */
        setLayout(new BorderLayout());

        /* ----------------------------- Panel izquierdo ---------------------------- */
        panelIzquierdo = new PanelIzquierdo(modeloTablero);

        /* ------------------------------ Panel derecho ----------------------------- */
        panelDerecho = new PanelDerecho(modeloTablero);

        /* -------------------------- Añadiento componentes ------------------------- */
        add(panelIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.EAST);
    }
}
