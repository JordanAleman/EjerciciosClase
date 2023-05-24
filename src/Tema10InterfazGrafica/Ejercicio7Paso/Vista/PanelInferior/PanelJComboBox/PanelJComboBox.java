package Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelJComboBox;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.Modelo;

/* ----------------------- ComboBox de Límite inferior ---------------------- */
public class PanelJComboBox extends JPanel {
    private JComboBox<String> cmbLimInferior;
    private JLabel lblLimiteInferior;

    private final String[] limiteInferior = { "-100", "-50", "-20", "-10", "0" };

    /* ------------------------------- Constructor ------------------------------ */
    public PanelJComboBox(Modelo modelo) {
        /* ------------------------ JComboBox Límite inferior ----------------------- */
        cmbLimInferior = new JComboBox<>(limiteInferior);
        cmbLimInferior.setPreferredSize(new Dimension(cmbLimInferior.getPreferredSize().width, 30));

        /* ------------------------ Etiqueta Límite inferior ------------------------ */
        lblLimiteInferior = new JLabel("Límite inferior");
        lblLimiteInferior.setFont(new Font("Arial", Font.BOLD, 12));

        /* ----------------------------- Añadir eventos ----------------------------- */
        cmbLimInferior.addActionListener(e -> modelo.setLimiteInferior(obtenerNumero()));

        /* --------------------------- Añadir componentes --------------------------- */
        add(lblLimiteInferior);
        add(cmbLimInferior);

    }

    private int obtenerNumero() {
        String numero = cmbLimInferior.getItemAt(cmbLimInferior.getSelectedIndex());

        if (numero.charAt(0) == '-')
            numero = numero.substring(1, numero.length());

        return -Integer.parseInt(numero);
    }
}
