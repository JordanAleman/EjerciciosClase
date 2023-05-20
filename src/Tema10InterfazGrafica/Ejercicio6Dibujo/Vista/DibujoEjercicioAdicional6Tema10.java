package Tema10InterfazGrafica.Ejercicio6Dibujo.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DibujoEjercicioAdicional6Tema10 {

    public static void main(String[] args) {
        new DibujoEjercicioAdicional6Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class DibujoEjercicioAdicional6Tema10MarcoInicial extends JFrame {

    /* ------------------------------- Constructor ------------------------------ */
    public DibujoEjercicioAdicional6Tema10MarcoInicial() {
        setTitle("Ejercicio adicional 6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DibujoEjercicioAdicional6Tema10PanelPrincipal());

        pack();
        // setSize(770, 380);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class DibujoEjercicioAdicional6Tema10PanelPrincipal extends JPanel {
    private PanelIzquierdoDibujo pnlIzquierdoDibujo;
    private PanelDerechoOpciones pnlDerechoOpciones;

    private Graphics2D dibujo;
    private int anchoTextoDibujo;
    private int tamFuenteTextoDibujo;

    private final Color COLOR_BORDE_PANEL_DERECHO = new Color(39, 44, 252);
    private final int TAM_LINEAS_BORDE_PANEL_DERECHO = 2;

    /* ------------------------------- Constructor ------------------------------ */
    public DibujoEjercicioAdicional6Tema10PanelPrincipal() {
        setLayout(new BorderLayout());

        /* -------------------- Componente panel izquierdo dibujo ------------------- */
        pnlIzquierdoDibujo = new PanelIzquierdoDibujo();
        // pnlIzquierdoDibujo.addMouseListener(new MouseAdapter() {
        // @Override
        // public void mouseClicked(MouseEvent e) {
        // pnlIzquierdoDibujo.setTamFuenteTextoDibujo(30);
        // }
        // });

        /* -------------------- Componente panel derecho opciones ------------------- */
        pnlDerechoOpciones = new PanelDerechoOpciones();
        pnlDerechoOpciones.setBorder(
                BorderFactory.createLineBorder(COLOR_BORDE_PANEL_DERECHO, TAM_LINEAS_BORDE_PANEL_DERECHO));

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(pnlIzquierdoDibujo, BorderLayout.CENTER);
        add(pnlDerechoOpciones, BorderLayout.EAST);

    }

    /* ------------------------- Panel izquierdo dibujo ------------------------- */
    private class PanelIzquierdoDibujo extends JPanel {

        private final String TEXTO_DIBUJO = "Estamos aprendiendo Swing";

        /* ------------------------------- Constructor ------------------------------ */
        public PanelIzquierdoDibujo() {
            // Tamaño del texto dibujo más 20 a la izquierda y 20 a la derecha
            anchoTextoDibujo = 426;
            tamFuenteTextoDibujo = 16;

            setPreferredSize(new Dimension(anchoTextoDibujo, 380));

        }

        /* --------------------------- Pintar componentes --------------------------- */
        @Override
        public void paintComponent(Graphics grafico) {
            super.paintComponent(grafico);
            dibujo = (Graphics2D) grafico;
            setBackground(Color.PINK);// color del panel

            /* ----------------------------- Añadir dibujos ----------------------------- */
            addTexto();
        }

        /* ------------------------ Componente dibujo String ------------------------ */
        public void addTexto() {
            dibujo.setColor(Color.GREEN);// color del pincel
            dibujo.setFont(new Font("Arial", Font.BOLD, tamFuenteTextoDibujo));

            // dibujo.getFontMetrics().stringWidth(TEXTO_DIBUJO) = 386
            dibujo.drawString(TEXTO_DIBUJO, 20, 75);

        }

        // public void setTamFuenteTextoDibujo(int nuevoTamFuente) {
        //     tamFuenteTextoDibujo = nuevoTamFuente;
        //     repaint();
        // }
    }

    /* ------------------------- Panel derecho opciones ------------------------- */
    private class PanelDerechoOpciones extends JPanel {
        private PanelSuperiorColores pnlSuperiorColores;
        private PanelCentralGrosorRectangulo pnlCentralGrosorRectangulo;
        private PanelInferiorTamLetraString pnlInferiorTamLetraString;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelDerechoOpciones() {
            setLayout(new GridLayout(3, 1));
            // setPreferredSize(new Dimension(570, 380));

            /* -------------------- Componente panel superior colores ------------------- */
            pnlSuperiorColores = new PanelSuperiorColores();

            /* --------------- Componente panel central grosor rectángulo --------------- */
            pnlCentralGrosorRectangulo = new PanelCentralGrosorRectangulo();
            pnlCentralGrosorRectangulo.setBorder(
                    BorderFactory.createMatteBorder(
                            TAM_LINEAS_BORDE_PANEL_DERECHO, 0, TAM_LINEAS_BORDE_PANEL_DERECHO, 0,
                            COLOR_BORDE_PANEL_DERECHO));

            /* -------------- Componente panel inferior tamaño letra String ------------- */
            pnlInferiorTamLetraString = new PanelInferiorTamLetraString();

            /* --------------------------- Añadir componentes --------------------------- */
            add(pnlSuperiorColores);
            add(pnlCentralGrosorRectangulo);
            add(pnlInferiorTamLetraString);
        }

        /* ------------------------- Panel superior colores ------------------------- */
        private class PanelSuperiorColores extends JPanel {
            private ArrayList<JRadioButton> radBotonesLista = new ArrayList<>();
            private ButtonGroup rdbRadioButton;

            private final String[] nombreBotones = new String[] { "Red", "Green", "Blue", "Black", "White", "Gray" };

            /* ------------------------------- Constructor ------------------------------ */
            public PanelSuperiorColores() {
                setLayout(new GridLayout(3, 2));

                rdbRadioButton = new ButtonGroup();

                for (int i = 0; i < nombreBotones.length; i++) {
                    radBotonesLista.add(new JRadioButton(nombreBotones[i]));
                    rdbRadioButton.add(radBotonesLista.get(i));
                    add(radBotonesLista.get(i));
                }
            }
        }

        /* --------------------- Panel central grosor rectángulo -------------------- */
        private class PanelCentralGrosorRectangulo extends JPanel {
            private ArrayList<JRadioButton> radBotonesLista = new ArrayList<>();
            private ButtonGroup rdbRadioButton;

            private final String[] nombreBotones = new String[] { "1", "2", "4", "8", "15", "25" };

            /* ------------------------------- Constructor ------------------------------ */
            public PanelCentralGrosorRectangulo() {
                setLayout(new GridLayout(3, 2));

                rdbRadioButton = new ButtonGroup();

                for (int i = 0; i < nombreBotones.length; i++) {
                    radBotonesLista.add(new JRadioButton(nombreBotones[i]));
                    rdbRadioButton.add(radBotonesLista.get(i));
                    add(radBotonesLista.get(i));
                }
            }
        }

        /* ------------------- Panel inferior tamaño letra String ------------------- */
        private class PanelInferiorTamLetraString extends JPanel {
            private ArrayList<JRadioButton> radBotonesLista = new ArrayList<>();
            private ButtonGroup rdbRadioButton;

            private final String[] nombreBotones = new String[] { "8", "12", "16", "20", "26", "30" };

            /* ------------------------------- Constructor ------------------------------ */
            public PanelInferiorTamLetraString() {
                setLayout(new GridLayout(3, 2));

                rdbRadioButton = new ButtonGroup();

                for (int i = 0; i < nombreBotones.length; i++) {
                    radBotonesLista.add(new JRadioButton(nombreBotones[i]));
                    // radBotonesLista.get(i).addItemListener(new JRadioButtonItemListenerTamLetra(
                    // anchoTextoDibujo, tamFuenteTextoDibujo, pnlIzquierdoDibujo));
                    rdbRadioButton.add(radBotonesLista.get(i));
                    add(radBotonesLista.get(i));
                }

                radBotonesLista.get(2).setSelected(true);
            }
        }
    }
}
