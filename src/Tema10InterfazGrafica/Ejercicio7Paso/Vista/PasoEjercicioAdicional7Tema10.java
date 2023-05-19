package Tema10InterfazGrafica.Ejercicio7Paso.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

import InterfazGráfica.MarcoCentrado;

public class PasoEjercicioAdicional7Tema10 {
    public static void main(String[] args) {
        new PasoEjercicioAdicional7Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class PasoEjercicioAdicional7Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public PasoEjercicioAdicional7Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado("Ejercicio adicional 7");
        marcoInicial.add(new PasoEjercicioAdicional7Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.pack();
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class PasoEjercicioAdicional7Tema10PanelPrincipal extends JPanel {
    private PanelSuperior pnlSuperior;
    private PanelInferior pnlInferior;

    public PasoEjercicioAdicional7Tema10PanelPrincipal() {
        setLayout(new BorderLayout());
        pnlSuperior = new PanelSuperior();
        pnlInferior = new PanelInferior();

        add(pnlSuperior, BorderLayout.NORTH);
        add(pnlInferior, BorderLayout.CENTER);
    }

    /* ----------------------------- Panel Superior ----------------------------- */
    private class PanelSuperior extends JPanel {
        private JButton btnDisminuir, btnAumentar;
        private JLabel lblVerCantidad;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelSuperior() {
            setLayout(new BorderLayout());

            /* ----------------------------- Botón disminuir ---------------------------- */
            btnDisminuir = new JButton("-");
            btnDisminuir.setFont(new Font("Georgia", Font.BOLD, 30));

            /* ----------------------------- Botón aumentar ----------------------------- */
            btnAumentar = new JButton("+");
            btnAumentar.setFont(new Font("Georgia", Font.BOLD, 30));

            /* -------------------------- Etiqueta ver cantidad ------------------------- */
            lblVerCantidad = new JLabel("0");
            lblVerCantidad.setHorizontalAlignment(JLabel.CENTER);
            lblVerCantidad.setBackground(Color.YELLOW);
            lblVerCantidad.setForeground(Color.BLUE);
            lblVerCantidad.setOpaque(true);
            lblVerCantidad.setFont(new Font("Georgia", Font.BOLD, 30));

            lblVerCantidad.setPreferredSize(new Dimension(100, 40));

            /* --------------------------- Añadir componentes --------------------------- */
            add(btnDisminuir, BorderLayout.WEST);
            add(lblVerCantidad, BorderLayout.CENTER);
            add(btnAumentar, BorderLayout.EAST);
        }
    }

    /* ----------------------------- Panel Inferior ----------------------------- */
    private class PanelInferior extends JPanel {
        private PanelJSlider pnlJSlider;
        private PanelJComboBox pnlJComboBox;
        private PanelJSpinner pnlJSpinner;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelInferior() {
            setLayout(new GridLayout(1, 3, -40, 0));
            pnlJSlider = new PanelJSlider();
            pnlJComboBox = new PanelJComboBox();
            pnlJSpinner = new PanelJSpinner();

            /* ----------------------------- Añadir paneles ----------------------------- */
            add(pnlJSlider);
            add(pnlJComboBox);
            add(pnlJSpinner);

        }

        /* ----------------------------- Slider de Paso ----------------------------- */
        private class PanelJSlider extends JPanel {
            private JSlider sldPaso;
            private JLabel lblPaso;

            /* ------------------------------- Constructor ------------------------------ */
            public PanelJSlider() {
                /* ------------------------------ JSlider Paso ------------------------------ */
                sldPaso = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
                sldPaso.setMajorTickSpacing(1);
                // sldPaso.setMinorTickSpacing(1);
                // sldPaso.setPaintTicks(true); // sin esta instruccion no se ven las marcas
                sldPaso.setPaintLabels(true);
                sldPaso.setSnapToTicks(true);

                sldPaso.setPreferredSize(new Dimension(sldPaso.getPreferredSize().width, 40));

                /* ------------------------------ Etiqueta Paso ----------------------------- */
                lblPaso = new JLabel("Paso");
                lblPaso.setFont(new Font("Arial", Font.BOLD, 12));

                /* --------------------------- Añadir componentes --------------------------- */
                add(lblPaso);
                add(sldPaso);
            }

        }

        /* ----------------------- ComboBox de Límite inferior ---------------------- */
        private class PanelJComboBox extends JPanel {
            private JComboBox<String> cmbLimInferior;
            private JLabel lblLimiteInferior;

            private final String[] limiteInferior = { "-100", "-50", "-20", "-10", "0" };

            /* ------------------------------- Constructor ------------------------------ */
            public PanelJComboBox() {
                /* ------------------------ JComboBox Límite inferior ----------------------- */
                cmbLimInferior = new JComboBox<>(limiteInferior);
                cmbLimInferior.setPreferredSize(new Dimension(cmbLimInferior.getPreferredSize().width, 30));

                /* ------------------------ Etiqueta Límite inferior ------------------------ */
                lblLimiteInferior = new JLabel("Límite inferior");
                lblLimiteInferior.setFont(new Font("Arial", Font.BOLD, 12));

                /* --------------------------- Añadir componentes --------------------------- */
                add(lblLimiteInferior);
                add(cmbLimInferior);
            }
        }

        /* ----------------------- Spinner de Límite superior ----------------------- */
        private class PanelJSpinner extends JPanel {
            private JSpinner spnLimSuperior;
            private JLabel lblLimiteSuperior;

            private final String[] limiteInferior = { "100", "50", "20", "10", "0" };

            /* ------------------------------- Constructor ------------------------------ */
            public PanelJSpinner() {
                /* ------------------------ JSpinner Límite superior ------------------------ */
                // spnLimSuperior = new JSpinner(new SpinnerNumberModel(100, 0, 100, 25));
                spnLimSuperior = new JSpinner(new miSpinnerModel());

                JFormattedTextField field = ((JSpinner.DefaultEditor) spnLimSuperior.getEditor()).getTextField();
                field.setEditable(false);

                spnLimSuperior.setPreferredSize(new Dimension(spnLimSuperior.getPreferredSize().width + 20, 30));

                /* ------------------------ Etiqueta Límite superior ------------------------ */
                lblLimiteSuperior = new JLabel("Límite superior");
                lblLimiteSuperior.setFont(new Font("Arial", Font.BOLD, 12));

                /* --------------------------- Añadir componentes --------------------------- */
                add(lblLimiteSuperior);
                add(spnLimSuperior);
            }

            private class miSpinnerModel extends SpinnerListModel {

                public miSpinnerModel() {
                    super(limiteInferior); 
                }
        
                public Object getNextValue() {
                    return super.getPreviousValue();
                }
        
                public Object getPreviousValue() {
                    return super.getNextValue();
                }
            } 
        }
    }
}
