package Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelJSpinner;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.Modelo;

/* ----------------------- Spinner de Límite superior ----------------------- */
public class PanelJSpinner extends JPanel {
    private JSpinner spnLimSuperior;
    private JLabel lblLimiteSuperior;

    private final String[] limiteInferior = { "100", "50", "20", "10", "0" };

    /* ------------------------------- Constructor ------------------------------ */
    public PanelJSpinner(Modelo modelo) {

        /* ------------------------ JSpinner Límite superior ------------------------ */
        // spnLimSuperior = new JSpinner(new SpinnerNumberModel(100, 0, 100, 25));
        spnLimSuperior = new JSpinner(new miSpinnerModel());

        JFormattedTextField field = ((JSpinner.DefaultEditor) spnLimSuperior.getEditor()).getTextField();
        field.setEditable(false);

        spnLimSuperior.setPreferredSize(new Dimension(spnLimSuperior.getPreferredSize().width + 20, 30));

        /* ------------------------ Etiqueta Límite superior ------------------------ */
        lblLimiteSuperior = new JLabel("Límite superior");
        lblLimiteSuperior.setFont(new Font("Arial", Font.BOLD, 12));

        /* ----------------------------- Añadir eventos ----------------------------- */
        spnLimSuperior.addChangeListener(e -> modelo.setLimiteSuperior(obtenerNumero()));

        /* --------------------------- Añadir componentes --------------------------- */
        add(lblLimiteSuperior);
        add(spnLimSuperior);
    }

    private int obtenerNumero() {
        String numero = spnLimSuperior.getValue().toString();

        return Integer.parseInt(numero);
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
