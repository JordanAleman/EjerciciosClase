package Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelJSlider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.Modelo;

/* ----------------------------- Slider de Paso ----------------------------- */
public class PanelJSlider extends JPanel {
    private JSlider sldPaso;
    private JLabel lblPaso;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelJSlider(Modelo modelo) {
        /* ------------------------------ JSlider Paso ------------------------------ */
        sldPaso = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        sldPaso.setMajorTickSpacing(1);
        // sldPaso.setMinorTickSpacing(1);
        // sldPaso.setPaintTicks(true); // sin esta instruccion no se ven las marcas
        sldPaso.setPaintLabels(true);
        sldPaso.setSnapToTicks(true);

        sldPaso.setPreferredSize(new Dimension(sldPaso.getPreferredSize().width, 40));

        /* ------------------------------ Etiqueta Paso ----------------------------- */
        lblPaso = new JLabel("Paso");
        lblPaso.setFont(new Font("Arial", Font.BOLD, 12));

        /* ----------------------------- Añadir eventos ----------------------------- */
        sldPaso.addChangeListener(e -> modelo.setPaso(sldPaso.getValue()));

        /* --------------------------- Añadir componentes --------------------------- */
        add(lblPaso);
        add(sldPaso);
    }
}
