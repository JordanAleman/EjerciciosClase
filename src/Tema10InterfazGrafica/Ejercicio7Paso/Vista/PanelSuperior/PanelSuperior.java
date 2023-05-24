package Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelSuperior;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.Modelo;
import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.ModeloListener;

/* ----------------------------- Panel Superior ----------------------------- */
public class PanelSuperior extends JPanel implements ModeloListener {
    private JButton btnDisminuir, btnAumentar;
    private JLabel lblVerCantidad;
    private Modelo modelo;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelSuperior(Modelo modelo) {
        this.modelo = modelo;
        this.modelo.agregarModeloListener(this);
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

        /* ----------------------------- Añadir eventos ----------------------------- */
        btnDisminuir.addActionListener(e -> modelo.disminuirCantidad());
        btnAumentar.addActionListener(e -> modelo.aumentarCantidad());

        /* --------------------------- Añadir componentes --------------------------- */
        add(btnDisminuir, BorderLayout.WEST);
        add(lblVerCantidad, BorderLayout.CENTER);
        add(btnAumentar, BorderLayout.EAST);
    }

    @Override
    public void cantidadActualizada(int cantidad) {
        lblVerCantidad.setText(String.valueOf(cantidad));
    }
}
