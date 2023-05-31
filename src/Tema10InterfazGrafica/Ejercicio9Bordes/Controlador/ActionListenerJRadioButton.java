package Tema10InterfazGrafica.Ejercicio9Bordes.Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.ModeloBordes;

public class ActionListenerJRadioButton implements ActionListener {
    private ModeloBordes modelo;
    private int posicionListaBordes;

    private boolean flagBevel = true;
    private boolean flagEtched = true;

    /* ------------------------------- Constructor ------------------------------ */
    public ActionListenerJRadioButton(ModeloBordes modelo, int posicionListaBordes) {
        this.modelo = modelo;
        this.posicionListaBordes = posicionListaBordes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (posicionListaBordes) {
            case 0 -> {
                modelo.setTipoBorder(BorderFactory.createTitledBorder(
                        new LineBorder(new Color(206, 144, 159), ((int) (Math.random() * 5) + 1)),
                        "Título", TitledBorder.LEFT, TitledBorder.TOP,
                        new Font("Dialog", Font.BOLD, 12), Color.BLACK));
            }

            case 1 -> {
                modelo.setTipoBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createEmptyBorder(5, 5, 5, 5),
                        BorderFactory.createLineBorder(
                                new Color(102, 217, 239), ((int) (Math.random() * 10) + 5), true)));
            }

            case 2 -> {
                modelo.setTipoBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createBevelBorder(
                                (flagBevel) ? BevelBorder.RAISED : BevelBorder.LOWERED,
                                Color.RED, // highlightOuter
                                Color.BLUE, // highlightInner
                                Color.GREEN, // shadowOuter
                                Color.YELLOW // shadowInner
                        ),
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE),
                                BorderFactory.createBevelBorder(
                                        (flagBevel) ? BevelBorder.RAISED : BevelBorder.LOWERED,
                                        Color.RED, // highlightOuter
                                        Color.BLUE, // highlightInner
                                        Color.GREEN, // shadowOuter
                                        Color.YELLOW // shadowInner
                                ))));

                flagBevel = !flagBevel;
            }

            case 3 -> {
                modelo.setTipoBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createEtchedBorder(
                                (flagEtched) ? EtchedBorder.RAISED : EtchedBorder.LOWERED,
                                Color.BLUE, // highlight
                                Color.YELLOW // shadow
                        ),
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE),
                                BorderFactory.createEtchedBorder(
                                        (flagEtched) ? EtchedBorder.RAISED : EtchedBorder.LOWERED,
                                        Color.BLUE, // highlight
                                        Color.YELLOW // shadow
                                ))));

                flagEtched = !flagEtched;
            }

            default -> {
                modelo.setTipoBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createMatteBorder(5, 5, 10, 10, Color.BLACK),
                                BorderFactory.createEtchedBorder(
                                        (flagEtched) ? EtchedBorder.RAISED : EtchedBorder.LOWERED,
                                        Color.BLUE, // highlight
                                        Color.YELLOW // shadow
                                )),
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createEmptyBorder(5, 5, 5, 5),
                                BorderFactory.createTitledBorder(
                                        new LineBorder(new Color(206, 144, 159), ((int) (Math.random() * 10) + 5)),
                                        "Bordes diferentes", titleBorderX(), titleBorderY(),
                                        new Font("Dialog", Font.BOLD, 12), Color.BLACK))));

                flagEtched = !flagEtched;
            }
        }
    }

    private int titleBorderX() {
        if ((int) (Math.random() * 2) == 0)
            return TitledBorder.LEFT;
        return TitledBorder.RIGHT;
    }

    private int titleBorderY() {
        if ((int) (Math.random() * 2) == 0)
            return TitledBorder.TOP;
        return TitledBorder.BOTTOM;
    }

}
