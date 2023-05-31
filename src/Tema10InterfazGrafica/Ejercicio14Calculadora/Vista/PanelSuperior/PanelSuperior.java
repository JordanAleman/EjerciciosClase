package Tema10InterfazGrafica.Ejercicio14Calculadora.Vista.PanelSuperior;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSuperior extends JPanel {
    private JLabel lblOperacion;
    private JTextField txtResultado;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelSuperior() {
        /* ---------------------------- Estructura panel ---------------------------- */
        setLayout(new BorderLayout());

        /* ------------------------------ lblOperacion ------------------------------ */
        lblOperacion = new JLabel("");
        lblOperacion.setBorder(BorderFactory.createEmptyBorder(5, 2, 0, 2));
        
        lblOperacion.setFont(new Font("Gerogia", Font.BOLD, 14));
        lblOperacion.setForeground(new Color(138, 138, 138));
        lblOperacion.setHorizontalAlignment(JTextField.RIGHT);

        /* ------------------------------ txtResultado ------------------------------ */
        txtResultado = new JTextField(20);
        txtResultado.setBorder(BorderFactory.createEmptyBorder(0, 2, 5, 2));

        txtResultado.setEditable(false);
        txtResultado.setMargin(new Insets(0, 2, 5, 2));
        
        txtResultado.setFont(new Font("Gerogia", Font.BOLD, 24));
        txtResultado.setHorizontalAlignment(JTextField.RIGHT);
        txtResultado.setText("0");

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(lblOperacion, BorderLayout.NORTH);
        add(txtResultado, BorderLayout.SOUTH);
    }
}
