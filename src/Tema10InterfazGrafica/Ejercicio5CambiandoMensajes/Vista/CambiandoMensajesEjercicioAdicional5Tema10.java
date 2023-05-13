package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Vista;

import java.awt.*;
import javax.swing.*;

import InterfazGráfica.PanelTextArea;
import InterfazGráfica.MarcoCentrado;
import InterfazGráfica.PanelButton;
import InterfazGráfica.PanelCheckBox;
import InterfazGráfica.PanelRadioButton;
import InterfazGráfica.PanelTextFieldLabel;
import Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador.JTextFieldKeyListener;

public class CambiandoMensajesEjercicioAdicional5Tema10 {
    public static void main(String[] args) {
        new CambiandoMensajesEjercicioAdicional5Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class CambiandoMensajesEjercicioAdicional5Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public CambiandoMensajesEjercicioAdicional5Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 5");
        marcoInicial.add(new CambiandoMensajesEjercicioAdicional5Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class CambiandoMensajesEjercicioAdicional5Tema10PanelPrincipal extends JPanel {
    private PanelTextFieldLabel pnlNorte;
    private PanelTextArea pnlOeste;
    private PanelEsteRadioCheckButtons pnlEste;
    private PanelButton pnlSur;

    /* ------------------------------- Constructor ------------------------------ */
    public CambiandoMensajesEjercicioAdicional5Tema10PanelPrincipal() {
        setLayout(new BorderLayout());

        /* ------------------------------- Panel Norte ------------------------------ */
        pnlNorte = new PanelTextFieldLabel("Introduzca un mensaje",
                26, 2, 0, 2, 10);
        pnlNorte.getJtfCampo().setText("Siguiente mensaje");
        pnlNorte.getJtfCampo().setHorizontalAlignment(JTextField.RIGHT);
        pnlNorte.getJtfCampo().setForeground(new Color(186, 195, 197));

        /* ------------------------------- Panel Oeste ------------------------------ */
        pnlOeste = new PanelTextArea(10, 30, true);
        pnlOeste.getJtaAreaTexto().setEditable(false);
        pnlOeste.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(0, 5, 0, 0),
                BorderFactory.createLineBorder(new Color(169, 179, 189))));

        /* ------------------------------- Panel Este ------------------------------- */
        pnlEste = new PanelEsteRadioCheckButtons();
        pnlEste.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

        /* -------------------------------- Panel Sur ------------------------------- */
        String[] nombreBotones = { "Por defecto", "Rojo", "Azul", "Amarillo", "Verde" };
        pnlSur = new PanelButton(nombreBotones);

        /* ---------------------------- Controlar eventos --------------------------- */
        pnlNorte.getJtfCampo().addKeyListener(new JTextFieldKeyListener(pnlOeste.getJtaAreaTexto()));

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

            add(pnlCheckBox, BorderLayout.NORTH);

            /* --------------------------- Panel RadioButtons --------------------------- */
            String[] etiquetasRadioButtons = { "Mayusculas", "Minusculas", "Normal" };

            pnlRadioButton = new PanelRadioButton(etiquetasRadioButtons, true);
            add(pnlRadioButton, BorderLayout.SOUTH);
        }
    }
}