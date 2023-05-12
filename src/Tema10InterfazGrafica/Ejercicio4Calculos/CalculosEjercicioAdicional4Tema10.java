package Tema10InterfazGrafica.Ejercicio4Calculos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculosEjercicioAdicional4Tema10 {
    public static void main(String[] args) {
        new CalculosEjercicioAdicional4Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class CalculosEjercicioAdicional4Tema10MarcoInicial extends JFrame {
    /* ------------------------------- Constructor ------------------------------ */
    public CalculosEjercicioAdicional4Tema10MarcoInicial() {
        setTitle("Ejercicio adicional 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();

        int ancho = tamanioPantalla.width;
        int altura = tamanioPantalla.height;

        setBounds(ancho / 4, altura / 4, 600, 300);

        add(new CalculosEjercicioAdicional4Tema10PanelPrincipal());

        setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class CalculosEjercicioAdicional4Tema10PanelPrincipal extends JPanel {
    private PanelIzquierdo pnlIzquierdo;
    private PanelDerecho pnlDerecho;

    /* ------------------------------- Construtor ------------------------------- */
    public CalculosEjercicioAdicional4Tema10PanelPrincipal() {
        setLayout(new GridLayout(1, 2));

        pnlIzquierdo = new PanelIzquierdo();
        pnlDerecho = new PanelDerecho();

        add(pnlIzquierdo);
        add(pnlDerecho);
    }

    /* ----------------------------- Panel izquierdo ---------------------------- */
    private class PanelIzquierdo extends JPanel {
        private PanelJTextFieldNorte pnlNorte;
        private PanelJTextAreaSur pnlSur;

        /* ------------------------------- Construtor ------------------------------- */
        public PanelIzquierdo() {
            setLayout(new BorderLayout());

            pnlNorte = new PanelJTextFieldNorte();
            pnlSur = new PanelJTextAreaSur();

            add(pnlNorte, BorderLayout.NORTH);
            add(pnlSur, BorderLayout.SOUTH);
        }

        /* ------------------------- Manejar texto TextField ------------------------ */
        String leerTextoTextField() {
            return pnlNorte.jtfCampo.getText();
        }

        /* ------------------------- Manejar texto TextArea ------------------------- */
        void establecerTextoTextArea(String texto) {
            pnlSur.jtaAreaTexto.setText(texto);
            pnlNorte.jtfCampo.requestFocus();
        }

        void limpiarTextoTexArea() {
            pnlSur.jtaAreaTexto.setText("");
            pnlNorte.jtfCampo.setText("");
            pnlNorte.jtfCampo.requestFocus();
        }

        /* ------------------------- Panel JTextField Norte ------------------------- */
        private class PanelJTextFieldNorte extends JPanel {
            JTextField jtfCampo;

            /* ------------------------------- Constructor ------------------------------ */
            public PanelJTextFieldNorte() {
                jtfCampo = new JTextField("Introduce número", 25);
                jtfCampo.setMargin(new Insets(2, 5, 2, 0));

                jtfCampo.addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent e) {
                        if (jtfCampo.getText().equals("Introduce número"))
                            jtfCampo.setText("");

                        if (!Character.isDigit(e.getKeyChar()) || jtfCampo.getText().length() >= 9)
                            e.consume();
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

                add(jtfCampo);
            }
        }

        /* --------------------------- Panel JTextArea Sur -------------------------- */
        private class PanelJTextAreaSur extends JPanel {
            JTextArea jtaAreaTexto;

            /* ------------------------------- Constructor ------------------------------ */
            public PanelJTextAreaSur() {
                jtaAreaTexto = new JTextArea(13, 25);
                jtaAreaTexto.setText("Aquí va el resultado");
                jtaAreaTexto.setLineWrap(true);

                add(jtaAreaTexto);
            }
        }
    }

    /* ------------------------------ Panel derecho ----------------------------- */
    private class PanelDerecho extends JPanel {
        private JButton[] btnBotones;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelDerecho() {
            setLayout(new GridLayout(4, 1));

            btnBotones = new JButton[4];

            btnBotones[0] = new JButton("Factorial");
            btnBotones[1] = new JButton("Primo");
            btnBotones[2] = new JButton("Limpiar");
            btnBotones[3] = new JButton("Salir");

            for (JButton jButton : btnBotones) {
                jButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (jButton.getText()) {
                            case "Factorial":
                                if (!pnlIzquierdo.leerTextoTextField().matches("\\d*"))
                                    pnlIzquierdo.establecerTextoTextArea("Escriba algún número");
                                else {
                                    int numero = Integer.parseInt(pnlIzquierdo.leerTextoTextField());
                                    String resultado = "";

                                    if (numero > 10) {
                                        resultado += "Máximo número para factorizar es 10. Resultado = ";
                                        numero = 10;
                                    }

                                    pnlIzquierdo
                                            .establecerTextoTextArea(resultado + Operaciones.factorial(numero) + "");
                                }
                                break;

                            case "Primo":
                                if (!pnlIzquierdo.leerTextoTextField().matches("\\d*"))
                                    pnlIzquierdo.establecerTextoTextArea("Escriba algún número");
                                else {
                                    int numero = Integer.parseInt(pnlIzquierdo.leerTextoTextField());
                                    pnlIzquierdo.establecerTextoTextArea(Operaciones.esPrimo(numero) + "");
                                }
                                break;

                            case "Limpiar":
                                pnlIzquierdo.limpiarTextoTexArea();
                                break;
                            case "Salir":
                                System.exit(0);
                        }
                    }
                });

                /* ----------- Tras añadir los eventos añadimos el botón al panel ----------- */
                add(jButton);
            }
        }
    }
}
