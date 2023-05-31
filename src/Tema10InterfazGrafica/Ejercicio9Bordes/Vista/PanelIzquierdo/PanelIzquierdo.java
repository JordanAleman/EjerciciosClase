package Tema10InterfazGrafica.Ejercicio9Bordes.Vista.PanelIzquierdo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Tema10InterfazGrafica.Ejercicio9Bordes.Controlador.ActionListenerJRadioButton;
import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.ModeloBordes;


public class PanelIzquierdo extends JPanel {
    private ArrayList<JRadioButton> jrbListaBordes;
    private ButtonGroup rdbBordes;

    private JRadioButton[] botonesDeRadio;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelIzquierdo(ModeloBordes modelo) {
        /* -------------------------- Inicializar atributos ------------------------- */
        // String para incializar la lista de JRadioButtons
        botonesDeRadio = new JRadioButton[] {
                new JRadioButton("Borde con Título"),
                new JRadioButton("Borde con Línea"),
                new JRadioButton("Borde con Bisel"),
                new JRadioButton("Borde grabado"),
                new JRadioButton("Bordes diferentes")
        };

        /**
         * Se pasa a ArrayList por si en un futuro se quisiera ampliar que se pueda
         * hacer con más facilidad
         */
        jrbListaBordes = new ArrayList<>(Arrays.asList(botonesDeRadio));
        rdbBordes = new ButtonGroup();

        jrbListaBordes.get(0).setSelected(true);

        /* -------------------------- Estructura del panel -------------------------- */
        setLayout(new GridLayout(5, 1, 0, 5));

        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(
                        new LineBorder(new Color(200, 216, 232), 2),
                        "Botones de radio", TitledBorder.LEFT, TitledBorder.TOP,
                        this.getFont().deriveFont(Font.BOLD), Color.BLACK),
                BorderFactory.createEmptyBorder(5, 0, 5, 0)));

        /* -------------------------- Añadiendo componentes ------------------------- */
        for (JRadioButton jRadioButton : jrbListaBordes) {
            rdbBordes.add(jRadioButton);
            add(jRadioButton);
        }

        /* ---------------------------- Añadiendo eventos --------------------------- */
        for (int i = 0; i < jrbListaBordes.size(); i++) 
            jrbListaBordes.get(i).addActionListener(new ActionListenerJRadioButton(modelo, i));
    }
}
