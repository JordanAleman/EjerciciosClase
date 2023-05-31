package Tema10InterfazGrafica.Ejercicio14Calculadora.Vista.PanelInferior;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelInferior extends JPanel {
    private JButton[][] btnMatrizButtons; // Matriz de los botones de la calculadora

    /* ------------------------------- Constructor ------------------------------ */
    public PanelInferior() {
        /* -------------------------- Inicializar atributos ------------------------- */
        btnMatrizButtons = new JButton[5][4];

        /* ---------------------------- Estructura panel ---------------------------- */
        setLayout(new GridLayout(5, 4, 1, 1));

        /* -------------------- Configurando y añadiendo botones -------------------- */
        btnMatrizButtons[0][0] = new JButton("BS");
        btnMatrizButtons[0][1] = new JButton("CL");
        btnMatrizButtons[0][2] = new JButton("SQ");
        btnMatrizButtons[0][3] = new JButton("/");
        btnMatrizButtons[1][0] = new JButton("7");
        btnMatrizButtons[1][1] = new JButton("8");
        btnMatrizButtons[1][2] = new JButton("9");
        btnMatrizButtons[1][3] = new JButton("*");
        btnMatrizButtons[2][0] = new JButton("4");
        btnMatrizButtons[2][1] = new JButton("5");
        btnMatrizButtons[2][2] = new JButton("6");
        btnMatrizButtons[2][3] = new JButton("-");
        btnMatrizButtons[3][0] = new JButton("1");
        btnMatrizButtons[3][1] = new JButton("2");
        btnMatrizButtons[3][2] = new JButton("3");
        btnMatrizButtons[3][3] = new JButton("+");
        btnMatrizButtons[4][0] = new JButton("±");
        btnMatrizButtons[4][1] = new JButton("0");
        btnMatrizButtons[4][2] = new JButton(".");
        btnMatrizButtons[4][3] = new JButton("=");

        for (int i = 0; i < btnMatrizButtons.length; i++) {
            for (int j = 0; j < btnMatrizButtons[i].length; j++) {
                btnMatrizButtons[i][j].setBackground(Color.WHITE);
                btnMatrizButtons[i][j].setPreferredSize(new Dimension(80, 55));
                btnMatrizButtons[i][j].setBorder(
                        BorderFactory.createLineBorder(new Color(229, 229, 229), 2, true));

                btnMatrizButtons[i][j].setFont(new Font("Arial", Font.PLAIN, 20));

                add(btnMatrizButtons[i][j]);
            }
        }
    }
}
