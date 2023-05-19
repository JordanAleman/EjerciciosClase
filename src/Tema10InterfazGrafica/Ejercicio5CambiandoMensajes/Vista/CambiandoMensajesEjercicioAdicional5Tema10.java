package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Vista;

import java.awt.*;
import javax.swing.*;

import InterfazGráfica.PanelTextAreaScroll;
import InterfazGráfica.PanelButton;
import InterfazGráfica.PanelCheckBox;
import InterfazGráfica.PanelRadioButton;
import InterfazGráfica.PanelTextFieldLabel;
import Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador.JButtonsMouseListener;
import Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador.JCheckBoxActionListener;
import Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador.JRadioButtonItemListener;
import Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador.JTextFieldKeyListener;

public class CambiandoMensajesEjercicioAdicional5Tema10 {
    public static void main(String[] args) {
        new CambiandoMensajesEjercicioAdicional5Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class CambiandoMensajesEjercicioAdicional5Tema10MarcoInicial extends JFrame {
    /* ------------------------------- Constructor ------------------------------ */
    public CambiandoMensajesEjercicioAdicional5Tema10MarcoInicial() {
        setTitle("Ejercicio adicional 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new CambiandoMensajesEjercicioAdicional5Tema10PanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class CambiandoMensajesEjercicioAdicional5Tema10PanelPrincipal extends JPanel {
    private PanelTextFieldLabel pnlNorte;
    private PanelTextAreaScroll pnlOeste;
    private PanelEsteRadioCheckButtons pnlEste;
    private PanelButton pnlSur;

    /* ------------------------------- Constructor ------------------------------ */
    public CambiandoMensajesEjercicioAdicional5Tema10PanelPrincipal() {
        setLayout(new BorderLayout());

        /* ------------------------------- Panel Norte ------------------------------ */
        pnlNorte = new PanelTextFieldLabel("Introduzca un mensaje",
                26, 2, 0, 2, 10);
        pnlNorte.getTxtCampo().setText("Siguiente mensaje");
        pnlNorte.getTxtCampo().setHorizontalAlignment(JTextField.RIGHT);
        pnlNorte.getTxtCampo().setForeground(new Color(186, 195, 197));

        /* ------------------------------- Panel Oeste ------------------------------ */
        pnlOeste = new PanelTextAreaScroll(10, 30, true);
        pnlOeste.getTxaAreaTexto().setEditable(false);
        pnlOeste.getTxaAreaTexto().setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(169, 179, 189)),
                BorderFactory.createEmptyBorder(2, 5, 0, 5)));

        pnlOeste.getTxaAreaTexto().setMargin(new Insets(2, 50, 0, 5));

        /* ------------------------------- Panel Este ------------------------------- */
        pnlEste = new PanelEsteRadioCheckButtons();
        pnlEste.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

        /* -------------------------------- Panel Sur ------------------------------- */
        String[] nombreBotones = { "Por defecto", "Rojo", "Azul", "Amarillo", "Verde" };
        pnlSur = new PanelButton(nombreBotones);
        pnlSur.getBtnBotonForIndex(1).setBackground(Color.RED);
        pnlSur.getBtnBotonForIndex(1).setForeground(Color.WHITE);

        pnlSur.getBtnBotonForIndex(2).setBackground(Color.BLUE);
        pnlSur.getBtnBotonForIndex(2).setForeground(Color.WHITE);

        pnlSur.getBtnBotonForIndex(3).setBackground(Color.YELLOW);
        pnlSur.getBtnBotonForIndex(4).setBackground(Color.GREEN);

        /* ---------------------------- Controlar eventos --------------------------- */
        /* ------------------------------ Evento norte ------------------------------ */
        pnlNorte.getTxtCampo().addKeyListener(new JTextFieldKeyListener(pnlOeste.getTxaAreaTexto()));

        /* ------------------------------- Evento Sur ------------------------------- */
        for (JButton boton : pnlSur.getBtnBotonLista())
            boton.addMouseListener(new JButtonsMouseListener(pnlOeste.getTxaAreaTexto()));

        /* ------------------------------- Evento Este ------------------------------ */
        for (JCheckBox checkButton : pnlEste.pnlCheckBox.getCbxCheckBoxLista())
            checkButton.addActionListener(new JCheckBoxActionListener(pnlOeste.getTxaAreaTexto()));

        for (JRadioButton radioButton : pnlEste.pnlRadioButton.getJrbRadioButtonsLista())
            radioButton.addItemListener(new JRadioButtonItemListener(pnlOeste.getTxaAreaTexto()));

        // 22YPCr2w

        /* ----------------------------- Añadir paneles ----------------------------- */
        add(pnlNorte, BorderLayout.NORTH);
        add(pnlOeste, BorderLayout.WEST);
        add(pnlEste, BorderLayout.EAST);
        add(pnlSur, BorderLayout.SOUTH);
    }

    /* -------------------- Panel este Radio y Check Buttons -------------------- */
    private class PanelEsteRadioCheckButtons extends JPanel {
        private PanelRadioButton pnlRadioButton;
        private PanelCheckBox pnlCheckBox;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelEsteRadioCheckButtons() {
            setLayout(new BorderLayout());
            /* ----------------------------- Panel CheckBox ----------------------------- */
            String[] etiquetasCheckBoxes = { "Negrita", "Cursiva" };

            pnlCheckBox = new PanelCheckBox(etiquetasCheckBoxes, true);
            pnlCheckBox.setBorder(BorderFactory.createCompoundBorder(
                    pnlCheckBox.getBorder(),
                    BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(177, 191, 220))));

            for (JCheckBox checkBox : pnlCheckBox.getCbxCheckBoxLista())
                checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));

            add(pnlCheckBox, BorderLayout.NORTH);

            /* --------------------------- Panel RadioButtons --------------------------- */
            String[] etiquetasRadioButtons = { "Mayusculas", "Minusculas", "Normal" };

            pnlRadioButton = new PanelRadioButton(etiquetasRadioButtons, true);

            for (JRadioButton radioButton : pnlRadioButton.getJrbRadioButtonsLista())
                radioButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            add(pnlRadioButton, BorderLayout.SOUTH);
        }
    }
}