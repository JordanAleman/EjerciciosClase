package Tema10InterfazGrafica.Ejercicio14Calculadora.Vista;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio14Calculadora.Vista.PanelInferior.PanelInferior;
import Tema10InterfazGrafica.Ejercicio14Calculadora.Vista.PanelSuperior.PanelSuperior;

public class CalculadoraPanelPrincipal extends JPanel {
    private PanelSuperior panelSuperior;
    private PanelInferior panelInferior;

    /* ------------------------------- Constructor ------------------------------ */
    public CalculadoraPanelPrincipal() {
        /* ---------------------------- Estructura panel ---------------------------- */
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

        /* ----------------------------- Panel superior ----------------------------- */
        panelSuperior = new PanelSuperior();

        /* ----------------------------- Panel inferior ----------------------------- */
        panelInferior = new PanelInferior();

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.SOUTH);
    }   
}
