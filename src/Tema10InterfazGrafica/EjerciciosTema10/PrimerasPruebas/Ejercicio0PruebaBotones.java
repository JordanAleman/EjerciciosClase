package Tema10InterfazGrafica.EjerciciosTema10.PrimerasPruebas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio0PruebaBotones extends JFrame {
    public static void main(String[] args) {
        MarcoConBoton marco = new MarcoConBoton();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConBoton extends JFrame {
    private final String PATH = "src\\Tema10InterfazGrafica\\EjerciciosTema10\\PrimerasPruebas\\";

    /* ------------------------------- Constructor ------------------------------ */
    public MarcoConBoton() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        Image miIcono = miPantalla.getImage(PATH + "Nier.gif");

        int ancho = tamanioPantalla.width;
        int altura = tamanioPantalla.height;

        setTitle("Mi ventana con botón");
        setBounds(ancho/4, altura/4, ancho/2, altura/2);
        setIconImage(miIcono);

        MiPanelConBoton panel = new MiPanelConBoton();
        panel.setBackground(Color.BLUE);
        add(panel);

    }
}

class MiPanelConBoton extends JPanel implements ActionListener {
    private JButton boton;
    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta;
    private boolean flag;

    public MiPanelConBoton() {
        boton = new JButton("Pulsar");
        boton1 = new JButton("Pul");
        boton2 = new JButton("sar");

        boton1.setVisible(false);
        boton2.setVisible(false);

        boton.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        flag = false;
        add(boton);
        add(boton1);
        add(boton2);

        etiqueta = new JLabel();
        add(etiqueta);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!flag) {
            boton.setVisible(false);
            boton1.setVisible(true);
            boton2.setVisible(true);
            flag = true;
        } else {
            boton.setVisible(true);
            boton1.setVisible(false);
            boton2.setVisible(false);
            flag = false;
        }
    }
}