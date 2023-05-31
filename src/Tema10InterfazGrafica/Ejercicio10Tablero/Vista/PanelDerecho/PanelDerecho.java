package Tema10InterfazGrafica.Ejercicio10Tablero.Vista.PanelDerecho;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import Tema10InterfazGrafica.Ejercicio10Tablero.Controlador.ActionListenerBotonTablero;
import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.ModeloTablero;
import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.Interfaz.InterfazBotonTablero;

public class PanelDerecho extends JPanel implements InterfazBotonTablero {
    private JButton[][] tableroBotones;

    private final int TAM_TABLERO_X = 8;
    private final int TAM_TABLERO_Y = 8;

    private final String BOX_WHITE = "White";
    private final String BOX_BLACK = "Black";

    /* ------------------------------- Constructor ------------------------------ */
    public PanelDerecho(ModeloTablero modeloTablero) {
        modeloTablero.agregarInterfazBotonTablero(this);

        /* ------------------------- Inicializando atributos ------------------------ */
        tableroBotones = new JButton[TAM_TABLERO_X][TAM_TABLERO_Y];
        Border border = (BorderFactory.createBevelBorder(
                BevelBorder.RAISED,
                Color.BLACK, // highlightOuter
                Color.BLACK, // highlightInner
                Color.WHITE, // shadowOuter
                Color.WHITE // shadowInner
        ));

        /* -------------------------- Estructura del panel -------------------------- */
        setLayout(new GridLayout(8, 8));

        /* --------------------------- Creando componentes -------------------------- */
        for (int i = 0; i < tableroBotones.length; i++) {
            for (int j = 0; j < tableroBotones[i].length; j++) {
                tableroBotones[i][j] = new JButton();
                tableroBotones[i][j].setPreferredSize(new Dimension(100, 100));
                tableroBotones[i][j].setBorder(border);

                if ((i + j) % 2 == 0) {
                    tableroBotones[i][j].setBackground(Color.WHITE);
                    tableroBotones[i][j].setName(BOX_WHITE);
                } else {
                    tableroBotones[i][j].setBackground(Color.BLACK);
                    tableroBotones[i][j].setName(BOX_BLACK);
                }

                tableroBotones[i][j].addActionListener(new ActionListenerBotonTablero(modeloTablero, tableroBotones, i, j));
                add(tableroBotones[i][j]);
            }
        }
    }

    /* ---------------------- Comunicación con la interfaz ---------------------- */
    @Override
    public void setButtonColor(int fila, int columna, Color color, String name) {
        tableroBotones[fila][columna].setBackground(color);
        tableroBotones[fila][columna].setName(name);
    }

}
