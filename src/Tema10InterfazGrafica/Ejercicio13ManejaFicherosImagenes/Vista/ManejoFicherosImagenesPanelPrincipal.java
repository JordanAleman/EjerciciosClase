package Tema10InterfazGrafica.Ejercicio13ManejaFicherosImagenes.Vista;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManejoFicherosImagenesPanelPrincipal extends JPanel {
    private JLabel lblImagenLabel;

    /* ------------------------------- Constructor ------------------------------ */
    public ManejoFicherosImagenesPanelPrincipal() {
        /* ---------------------------- Estructura panel ---------------------------- */
        setPreferredSize(new Dimension(500, 500));

        /* ----------------------------- lblImagenLabel ----------------------------- */
        lblImagenLabel = new JLabel();

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(lblImagenLabel);
    }
}
