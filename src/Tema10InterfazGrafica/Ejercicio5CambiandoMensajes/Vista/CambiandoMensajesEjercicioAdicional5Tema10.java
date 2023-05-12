package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Vista;

import java.awt.*;

import javax.swing.*;

import InterfazGráfica.PanelTextArea;
import InterfazGráfica.MarcoCentrado;
import InterfazGráfica.PanelButton;
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
        MarcoCentrado marcoInicial = new MarcoCentrado(460, 300, "Ejercicio adicional 5");
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
                25, 2, 0, 2, 10);
        pnlNorte.getJtfCampo().setHorizontalAlignment(JTextField.RIGHT);
        pnlNorte.getJtfCampo().setText("Siguiente mensaje");

        /* ------------------------------- Panel Oeste ------------------------------ */
        pnlOeste = new PanelTextArea(10, 28);
        pnlOeste.getJtaAreaTexto().setEditable(false);
        pnlOeste.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(0, 5, 0, 0), // Establecer el margen izquierdo a 5 pixels
                BorderFactory.createLineBorder(new Color(169, 179, 189))));

        /* ------------------------------- Panel Este ------------------------------- */
        pnlEste = new PanelEsteRadioCheckButtons();

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

        /* ------------------------------- Constructor ------------------------------ */
        public PanelEsteRadioCheckButtons() {
            String[] etiquetasButtons = { "Mayusculas", "Minusculas", "Normal" };

            pnlRadioButton = new PanelRadioButton(etiquetasButtons, true);
            add(pnlRadioButton);
        }

        // private class PanelRadioButtons extends JPanel {
        // /* ------------------------------- Constructor ------------------------------
        // */
        // public PanelRadioButtons() {

        // }
        // }
    }
}