package Tema10InterfazGrafica.Ejercicio3TeclasTeclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TeclasTecladoTema10 {
    public static void main(String[] args) {
        new TeclasTecladoTema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class TeclasTecladoTema10MarcoInicial extends JFrame {
    /* ------------------------------- Constructor ------------------------------ */
    public TeclasTecladoTema10MarcoInicial() {
        setTitle("Ejercicio adicional 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();

        int ancho = tamanioPantalla.width;
        int altura = tamanioPantalla.height;

        setBounds(ancho / 4, altura / 4, 400, 300);

        add(new TeclasTecladoTema10PanelPrincipal());

        setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class TeclasTecladoTema10PanelPrincipal extends JPanel {
    private PanelTeclado pnlPanelTeclado;
    private PanelCampoTexto pnlPanelCampoTexto;

    /* ------------------------------- Constructor ------------------------------ */
    public TeclasTecladoTema10PanelPrincipal() {
        setLayout(new BorderLayout());
        pnlPanelTeclado = new PanelTeclado();
        pnlPanelCampoTexto = new PanelCampoTexto();

        add(pnlPanelTeclado, BorderLayout.NORTH);
        add(pnlPanelCampoTexto, BorderLayout.SOUTH);
    }

    private class PanelTeclado extends JPanel {
        private ArrayList<JButton> jbtListaBotones;
        private String[] ARRAY_ALFABETO = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "BS", "CL" };

        public PanelTeclado() {
            setLayout(new GridLayout(6, 5));
            setBackground(new Color(100, 100, 199));
            setBorder(new TitledBorder(new LineBorder(
                    new Color(141, 153, 213), 2), "Teclado"));

            jbtListaBotones = new ArrayList<>();

            ActionListener listener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (((JButton) e.getSource()).getText()) {
                        case "BS" -> pnlPanelCampoTexto.eliminarTexto();
                        case "CL" -> pnlPanelCampoTexto.limpiarTexto();
                        default -> pnlPanelCampoTexto.addTexto(e.getActionCommand());
                    }
                } 
            };

            for (int i = 0; i < ARRAY_ALFABETO.length; i++) {
                jbtListaBotones.add(new JButton(ARRAY_ALFABETO[i]));
                JButton boton = jbtListaBotones.get(i);

                boton.setFont(new Font(getFont().getFontName(), Font.ITALIC + Font.BOLD, 15));
                boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                boton.addActionListener(listener);

                add(boton);
            }
        }
    }

    /* ------------------------ Panel del campo de texto ------------------------ */
    private class PanelCampoTexto extends JPanel {
        private JTextField jtfCampo;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelCampoTexto() {
            setBorder(new TitledBorder(new LineBorder(
                    new Color(142, 153, 214), 2), "Texto"));

            jtfCampo = new JTextField(30);
            jtfCampo.setMargin(new Insets(2, 5, 2, 0));
            jtfCampo.setEditable(false);

            add(jtfCampo);
        }

        /* ------------------------------ Manejar texto ----------------------------- */
        void addTexto(String texto) {
            jtfCampo.setText(jtfCampo.getText() + texto);
        }

        void eliminarTexto() {
            if (jtfCampo.getText().length() > 0)
                jtfCampo.setText(jtfCampo.getText().substring(0, jtfCampo.getText().length() - 1));
        }

        void limpiarTexto() {
            jtfCampo.setText("");
        }
    }
}
