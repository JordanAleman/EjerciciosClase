package Tema10InterfazGrafica.Ejercicio12MatrizBotones.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MatrizBotonesPanelPrincipal extends JPanel {
    private JButton[][] btnMatrizButtons;

    /* ------------------------------- Constructor ------------------------------ */
    public MatrizBotonesPanelPrincipal() {
        /* -------------------------- Inicializar atributos ------------------------- */
        btnMatrizButtons = new JButton[10][10];

        /* ---------------------------- Estructura panel ---------------------------- */
        setLayout(new GridLayout(10, 10));
        setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLACK));

        /* -------------------- Configurando y añadiendo botones -------------------- */
        for (int i = 0; i < btnMatrizButtons.length; i++) {
            for (int j = 0; j < btnMatrizButtons[i].length; j++) {
                btnMatrizButtons[i][j] = new JButton("Botón " + (i + 1));
                btnMatrizButtons[i][j].setBackground(Color.YELLOW);
                btnMatrizButtons[i][j].setPreferredSize(new Dimension(150, 50));

                add(btnMatrizButtons[i][j]);
            }
        }
    }

}
