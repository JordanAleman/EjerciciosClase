package Tema10InterfazGrafica.EjerciciosTema10.PrimerasPruebas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio1PruebaColoresFondo {

    public static void main(String[] args) {
        new MarcoConBotones();
    }
}

class MarcoConBotones extends JFrame {
    /* ------------------------------- Constructor ------------------------------ */
    public MarcoConBotones() {
        setTitle("Mi ventana con botones");
        setBounds(200, 200, 500, 300);
        MiPanelConBotones panel = new MiPanelConBotones();
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class MiPanelConBotones extends JPanel implements ActionListener {
    private JButton botonAzul;
    private JButton botonRojo;
    private JButton botonAmarillo;
    private JLabel etiqueta;

    public MiPanelConBotones() {
        botonAzul = new JButton("Azul");
        botonRojo = new JButton("Rojo");
        botonAmarillo = new JButton("Amarillo");

        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
        botonAmarillo.addActionListener(this);

        add(botonAzul);
        add(botonRojo);
        add(botonAmarillo);

        etiqueta = new JLabel();
        add(etiqueta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAzul)
            setBackground(Color.BLUE);
        if (e.getSource() == botonRojo)
            setBackground(Color.RED);
        if (e.getSource() == botonAmarillo)
            setBackground(Color.YELLOW);
    }
}