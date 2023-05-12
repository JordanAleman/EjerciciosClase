package Tema10InterfazGrafica.Ejercicio1AbejaBotonera;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AbejaBotonera {
    public static void main(String[] args) {
        new AbejaBotoneraMarcoInicial();
    }
}

class AbejaBotoneraMarcoInicial extends JFrame {
    /* ------------------------------- Constructor ------------------------------ */
    public AbejaBotoneraMarcoInicial() {
        setTitle("Ejercicio adicional 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();

        int ancho = tamanioPantalla.width;
        int altura = tamanioPantalla.height;

        setBounds(ancho / 4, altura / 4, ancho / 2, altura / 2);


        AbejaBotoneraPanelPrincipal miPanelPrincipal = new AbejaBotoneraPanelPrincipal();
        add(miPanelPrincipal);

        setVisible(true);

    }
}

/* ----------------------------- Panel principal ---------------------------- */
class AbejaBotoneraPanelPrincipal extends JPanel {
    private JLabel etiquetaNorth; // Etiqueta "Hola"
    private JButton botonWest; // Etiqueta "Posicionar"
    private JButton botonEast; // Etiqueta "Salir"

    private AbejaBotoneraPanelCentral panelCentral;
    private AbejaBotoneraPanelInferior panelInferior;

    /* ------------------------------- Constructor ------------------------------ */
    public AbejaBotoneraPanelPrincipal() {
        setLayout(new BorderLayout());

        /* ------------------------------ EtiquetaNorth ----------------------------- */
        etiquetaNorth = new JLabel("Hola", JLabel.CENTER);
        etiquetaNorth.setBackground(Color.RED);
        etiquetaNorth.setOpaque(true);
        add(etiquetaNorth, BorderLayout.NORTH);

        /* -------------------------------- BotonWest ------------------------------- */
        botonWest = new JButton("Posicionar");
        botonWest.setFont(new Font("Comic Sans MS Bold", Font.ITALIC, 24));
        botonWest.setBackground(Color.GREEN);
        add(botonWest, BorderLayout.WEST);

        botonWest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (panelCentral.getBotonSouth().getHorizontalTextPosition() == JButton.LEFT)
                    panelCentral.getBotonSouth().setHorizontalTextPosition(JButton.RIGHT);
                else
                    panelCentral.getBotonSouth().setHorizontalTextPosition(JButton.LEFT);
            }
        });

        /* -------------------------------- BotonEast ------------------------------- */
        botonEast = new JButton("Salir", null);
        botonEast.setBackground(Color.YELLOW);
        add(botonEast, BorderLayout.EAST);

        botonEast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        /* ------------------------------ PanelCentral ------------------------------ */
        panelCentral = new AbejaBotoneraPanelCentral();
        add(panelCentral, BorderLayout.CENTER);

        /* ------------------------------ PanelInferior ----------------------------- */
        panelInferior = new AbejaBotoneraPanelInferior();
        add(panelInferior, BorderLayout.SOUTH);
    }

}

/* ------------------------------ PanelCentral ------------------------------ */
class AbejaBotoneraPanelCentral extends JPanel {
    private JLabel etiquetaNorth; // Etiqueta "Etiqueta"
    private JButton botonSouth; // Etiqueta "Boton" + Dibujo Abeja

    private final String PATH = "src\\Tema10InterfazGrafica\\Ejercicio1AbejaBotonera\\";

    /* ------------------------------- Constructor ------------------------------ */
    public AbejaBotoneraPanelCentral() {
        setLayout(new GridLayout(2, 1));

        /* ------------------------------ EtiquetaNorth ----------------------------- */
        etiquetaNorth = new JLabel("Etiqueta", JLabel.CENTER);
        etiquetaNorth.setIcon(new ImageIcon(PATH + "dado.png"));
        add(etiquetaNorth);

        /* ------------------------------- botonSouth ------------------------------- */
        botonSouth = new JButton("Botón", new ImageIcon(PATH + "abeja.png"));
        botonSouth.setHorizontalTextPosition(JButton.LEFT);
        add(botonSouth);
    }

    /* --------------------------------- Getter --------------------------------- */
    public JButton getBotonSouth() {
        return botonSouth;
    }

}

/* ------------------------------ PanelInferior ----------------------------- */
class AbejaBotoneraPanelInferior extends JPanel {
    private JButton[] arrayBotones;

    /* ------------------------------- Constructor ------------------------------ */
    public AbejaBotoneraPanelInferior() {
        arrayBotones = new JButton[3];
        arrayBotones[0] =  new JButton("Pulsar");
        arrayBotones[0].setVisible(true);

        arrayBotones[1] =  new JButton("Pul");
        arrayBotones[2] =  new JButton("Sar");
        arrayBotones[1].setVisible(false);
        arrayBotones[2].setVisible(false);



        /* ----------- Asignar propiedades a cada botón además de eventos ----------- */
        for (int i = 0; i < arrayBotones.length; i++) {
            arrayBotones[i].setBackground(Color.BLUE);
            arrayBotones[i].setForeground(Color.ORANGE);

            arrayBotones[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int j = 0; j < arrayBotones.length; j++) 
                        arrayBotones[j].setVisible(!arrayBotones[j].isVisible());
                }
            });

            add(arrayBotones[i]);
        }


   
    }
}