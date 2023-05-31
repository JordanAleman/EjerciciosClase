package Tema10InterfazGrafica.Ejercicio11RistraBotones.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RistraBotonesPanelPrincipal extends JPanel {
    private JButton[] btnRistraButtons;

    /* ------------------------------- Constructor ------------------------------ */
    public RistraBotonesPanelPrincipal() {
        /* -------------------------- Inicializar atributos ------------------------- */
        btnRistraButtons = new JButton[10];

        /* ---------------------------- Estructura panel ---------------------------- */
        setLayout(new GridLayout(1, 10));
        setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));

        /* -------------------- Configurando y añadiendo botones -------------------- */
        for (int i = 0; i < btnRistraButtons.length; i++) {
            btnRistraButtons[i] = new JButton("Botón " + (i + 1));
            btnRistraButtons[i].setBackground(Color.YELLOW);
            btnRistraButtons[i].setPreferredSize(new Dimension(150, 70));


            add(btnRistraButtons[i]);
        }
    }
}
