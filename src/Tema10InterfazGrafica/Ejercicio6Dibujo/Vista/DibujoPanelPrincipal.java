package Tema10InterfazGrafica.Ejercicio6Dibujo.Vista;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class DibujoPanelPrincipal extends JPanel {
    private PanelIzquierdoDibujo pnlIzquierdoDibujo;
    private PanelDerechoOpciones pnlDerechoOpciones;

    private Graphics2D dibujo;

    private final Color COLOR_BORDE_PANEL_IZQUIERDO = new Color(128, 39, 51);
    private final int TAM_LINEAS_BORDE_PANEL_IZQUIERDO = 2;

    private final Color COLOR_BORDE_PANEL_DERECHO = new Color(39, 44, 252);
    private final int TAM_LINEAS_BORDE_PANEL_DERECHO = 2;

    /* ------------------------------- Constructor ------------------------------ */
    public DibujoPanelPrincipal() {
        setLayout(new BorderLayout());

        /* -------------------- Componente panel izquierdo dibujo ------------------- */
        pnlIzquierdoDibujo = new PanelIzquierdoDibujo();
        pnlIzquierdoDibujo.setBorder(
                BorderFactory.createLineBorder(COLOR_BORDE_PANEL_IZQUIERDO, TAM_LINEAS_BORDE_PANEL_IZQUIERDO));

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
        private int tamFuenteTextoDibujo = 16;
        private int strokeRectangulo = 1;
        private Color colorElipse = Color.BLACK;

        private double distancia_X_Elipse;
        private double distancia_Y_Elipse;
        private double tamElipse;

        private final String TEXTO_DIBUJO = "Estamos aprendiendo Swing";
        private final double DISTANCIA_X_ELIPSE_ORIGINAL = 75;
        private final double DISTANCIA_Y_ELIPSE_ORIGINAL = 60;
        private final double TAM_ELIPSE_ORIGINAL = 300;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelIzquierdoDibujo() {
            setPreferredSize(new Dimension(450, 385));

            distancia_X_Elipse = DISTANCIA_X_ELIPSE_ORIGINAL;
            distancia_Y_Elipse = DISTANCIA_Y_ELIPSE_ORIGINAL;
            tamElipse = TAM_ELIPSE_ORIGINAL;
        }

        /* --------------------------- Pintar componentes --------------------------- */
        @Override
        public void paintComponent(Graphics grafico) {
            super.paintComponent(grafico);
            dibujo = (Graphics2D) grafico;
            setBackground(new Color(237, 222, 233));// color del panel

            /* ----------------------------- Añadir dibujos ----------------------------- */
            addTexto();
            addElipse();
            addRectangulo();
        }

        /* ------------------------ Componente dibujo String ------------------------ */
        public void addTexto() {
            dibujo.setColor(Color.BLACK);// color del pincel
            dibujo.setFont(new Font("Arial", Font.BOLD, tamFuenteTextoDibujo));
            // System.out.println(dibujo.getFontMetrics().stringWidth(TEXTO_DIBUJO));
            // dibujo.getFontMetrics().stringWidth(TEXTO_DIBUJO);
            dibujo.drawString(TEXTO_DIBUJO, 20, 35);
        }

        public void setTamFuenteTextoDibujo(int nuevoTamFuente) {
            tamFuenteTextoDibujo = nuevoTamFuente;
            repaint();
        }

        /* ---------------------- Componente dibujo rectángulo ---------------------- */
        public void addRectangulo() {
            dibujo.setColor(Color.RED);
            dibujo.setStroke(new BasicStroke(strokeRectangulo));
            Rectangle2D rectangulo = new Rectangle2D.Double(75, 60, 300, 300);
            dibujo.draw(rectangulo);
        }

        public void setStrokeRectangulo(int nuevoStroke) {
            strokeRectangulo = nuevoStroke;
            distancia_X_Elipse = DISTANCIA_X_ELIPSE_ORIGINAL + (nuevoStroke / 2) - 1;
            distancia_Y_Elipse = DISTANCIA_Y_ELIPSE_ORIGINAL + (nuevoStroke / 2) - 1;
            tamElipse = TAM_ELIPSE_ORIGINAL - nuevoStroke + 1;
            repaint();
        }

        /* ------------------------ Componente dibujo elipse ------------------------ */
        public void addElipse() {
            dibujo.setColor(colorElipse);
            // dibujo.fill(new Ellipse2D.Double(87, 72, 276, 276));
            dibujo.fill(new Ellipse2D.Double(distancia_X_Elipse, distancia_Y_Elipse, tamElipse, tamElipse));
        }

        public void setColorElipse(Color nuevoColor) {
            colorElipse = nuevoColor;
            repaint();
        }
    }

    /* ------------------------- Panel derecho opciones ------------------------- */
    private class PanelDerechoOpciones extends JPanel {
        private PanelSuperiorColores pnlSuperiorColores;
        private PanelCentralGrosorRectangulo pnlCentralGrosorRectangulo;
        private PanelInferiorTamLetraString pnlInferiorTamLetraString;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelDerechoOpciones() {
            setLayout(new GridLayout(3, 1));

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
                      // Nombre a los botones
                      radBotonesLista.add(new JRadioButton(nombreBotones[i]));

                      // Evento a los botones
                      radBotonesLista.get(i).addActionListener(
                              new JRadioButtonActionListenerColorElipse(pnlIzquierdoDibujo));
  
                      // Botones añadidos a un grupo de botones
                      rdbRadioButton.add(radBotonesLista.get(i));
  
                      // Botones añadidos al panel
                      add(radBotonesLista.get(i));
                }

                radBotonesLista.get(3).setSelected(true);
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
                    // Nombre a los botones
                    radBotonesLista.add(new JRadioButton(nombreBotones[i]));

                    // Evento a los botones
                    radBotonesLista.get(i).addActionListener(
                            new JRadioButtonActionListenerGrosorRectangulo(pnlIzquierdoDibujo));

                    // Botones añadidos a un grupo de botones
                    rdbRadioButton.add(radBotonesLista.get(i));

                    // Botones añadidos al panel
                    add(radBotonesLista.get(i));
                }

                radBotonesLista.get(0).setSelected(true);
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
                    // Nombre a los botones
                    radBotonesLista.add(new JRadioButton(nombreBotones[i]));

                    // Evento a los botones
                    radBotonesLista.get(i).addActionListener(
                            new JRadioButtonActionListenerTamLetra(pnlIzquierdoDibujo));

                    // Botones añadidos a un grupo de botones
                    rdbRadioButton.add(radBotonesLista.get(i));

                    // Botones añadidos al panel
                    add(radBotonesLista.get(i));
                }

                radBotonesLista.get(2).setSelected(true);
            }
        }
    }

    /* --------------------------------- Eventos -------------------------------- */
    /* ------------------ JRadioButton del PanelSuperiorColores ----------------- */
    private class JRadioButtonActionListenerColorElipse implements ActionListener {
        private PanelIzquierdoDibujo pnlIzquierdoDibujo;

        /* ------------------------------- Constructor ------------------------------ */
        public JRadioButtonActionListenerColorElipse(PanelIzquierdoDibujo pnlIzquierdoDibujo) {
            this.pnlIzquierdoDibujo = pnlIzquierdoDibujo;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JRadioButton radioButton) {
                switch (radioButton.getText()) {
                    case "Red" -> pnlIzquierdoDibujo.setColorElipse(Color.RED);
                    case "Green" -> pnlIzquierdoDibujo.setColorElipse(Color.GREEN);
                    case "Blue" -> pnlIzquierdoDibujo.setColorElipse(Color.BLUE);
                    case "Black" -> pnlIzquierdoDibujo.setColorElipse(Color.BLACK);
                    case "White" -> pnlIzquierdoDibujo.setColorElipse(Color.WHITE);
                    case "Gray" -> pnlIzquierdoDibujo.setColorElipse(Color.GRAY);
                }
            }
        }
    }

    /* -------------- JRadioButton del PanelCentralGrosorRectangulo ------------- */
    private class JRadioButtonActionListenerGrosorRectangulo implements ActionListener {
        private PanelIzquierdoDibujo pnlIzquierdoDibujo;

        /* ------------------------------- Constructor ------------------------------ */
        public JRadioButtonActionListenerGrosorRectangulo(PanelIzquierdoDibujo pnlIzquierdoDibujo) {
            this.pnlIzquierdoDibujo = pnlIzquierdoDibujo;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JRadioButton radioButton) {
                // Obtener el tamaño del grosor del botón seleccionado
                int nuevoStroke = Integer.parseInt(radioButton.getText());

                // Actualiza el tamaño del grosor del rectángulo
                pnlIzquierdoDibujo.setStrokeRectangulo(nuevoStroke);
            }
        }
    }

    /* -------------- JRadioButton del PanelInferiorTamLetraString -------------- */
    private class JRadioButtonActionListenerTamLetra implements ActionListener {
        private PanelIzquierdoDibujo pnlIzquierdoDibujo;

        /* ------------------------------- Constructor ------------------------------ */
        public JRadioButtonActionListenerTamLetra(PanelIzquierdoDibujo pnlIzquierdoDibujo) {
            this.pnlIzquierdoDibujo = pnlIzquierdoDibujo;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JRadioButton radioButton) {
                // Obtener el tamaño de la fuente del botón seleccionado
                int nuevoTamFuente = Integer.parseInt(radioButton.getText());

                // Actualiza el tamaño de la fuente en el panel de dibujo
                pnlIzquierdoDibujo.setTamFuenteTextoDibujo(nuevoTamFuente);
            }
        }
    }
}
