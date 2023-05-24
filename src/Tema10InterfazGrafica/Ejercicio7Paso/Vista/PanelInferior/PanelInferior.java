package Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior;

import java.awt.GridLayout;

import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.Modelo;
import Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelJComboBox.PanelJComboBox;
import Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelJSlider.PanelJSlider;
import Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelJSpinner.PanelJSpinner;

/* ----------------------------- Panel Inferior ----------------------------- */
public class PanelInferior extends JPanel {
    private PanelJSlider pnlJSlider;
    private PanelJComboBox pnlJComboBox;
    private PanelJSpinner pnlJSpinner;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelInferior(Modelo modelo) {
        setLayout(new GridLayout(1, 3, 10, 0));
        pnlJSlider = new PanelJSlider(modelo);
        pnlJComboBox = new PanelJComboBox(modelo);
        pnlJSpinner = new PanelJSpinner(modelo);

        /* ----------------------------- Añadir paneles ----------------------------- */
        add(pnlJSlider);
        add(pnlJComboBox);
        add(pnlJSpinner);

    }
}
