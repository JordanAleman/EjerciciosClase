package Tema10InterfazGrafica.Ejercicio2PrimerFormulario;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class PrimerFormularioTema10 {
    public static void main(String[] args) {
        PrimerFormularioTema10MarcoInicial marco = new PrimerFormularioTema10MarcoInicial();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setResizable(false);
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class PrimerFormularioTema10MarcoInicial extends JFrame {
    private PrimerFormularioTema10PanelPrincipal miPrimerFormularioTema10PanelPrincipal;

    /* ------------------------------- Constructor ------------------------------ */
    public PrimerFormularioTema10MarcoInicial() {
        setTitle("Ejercicio adicional 2");

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();

        int ancho = tamanioPantalla.width;
        int altura = tamanioPantalla.height;

        setBounds(ancho / 4, altura / 4, 550, 250);

        miPrimerFormularioTema10PanelPrincipal = new PrimerFormularioTema10PanelPrincipal();
        add(miPrimerFormularioTema10PanelPrincipal);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class PrimerFormularioTema10PanelPrincipal extends JPanel implements ActionListener {
    private PanelIzquierdoTextArea miPanelIzquierdoTextArea;
    private PanelDerechoTextField miPanelDerechoTextField;

    /* ------------------------------- Constructor ------------------------------ */
    public PrimerFormularioTema10PanelPrincipal() {
        setLayout(new GridLayout());

        miPanelIzquierdoTextArea = new PanelIzquierdoTextArea();
        add(miPanelIzquierdoTextArea);

        miPanelDerechoTextField = new PanelDerechoTextField();
        add(miPanelDerechoTextField);

        miPanelDerechoTextField.getBoton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (miPanelDerechoTextField.getTextoCampoNombre().trim().equalsIgnoreCase("Salir"));
            System.exit(0);

        if (miPanelDerechoTextField.camposConContenido())
            miPanelIzquierdoTextArea.setTextJTextArea(miPanelDerechoTextField.contenidoJTextField());
    }
}

/* ------------------------ Panel Izquierdo Text Area ----------------------- */
class PanelIzquierdoTextArea extends JPanel {
    private JTextArea areaTexto;
    private JScrollPane laminaScroll;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelIzquierdoTextArea() {
        setLayout(new GridLayout());

        areaTexto = new JTextArea(30, 20);
        areaTexto.setLineWrap(true);
        areaTexto.setBackground(Color.BLACK);
        areaTexto.setForeground(Color.YELLOW);
        areaTexto.setMargin(new Insets(5, 20, 30, 20));
        areaTexto.setEditable(false);

        laminaScroll = new JScrollPane(areaTexto);
        add(laminaScroll);
    }

    /* ------------------ Introducir texto dentro del areaTexto ----------------- */
    public void setTextJTextArea(String text) {
        areaTexto.setText(areaTexto.getText() + "* " + text + "\n");
    }
}

/* ------------------------ Panel Derecho Text Field ------------------------ */
class PanelDerechoTextField extends JPanel {
    private PanelEtiquetaCampo campoNombre, campoApellido, campoNota;
    private PanelBoton botonEnviar;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelDerechoTextField() {
        setLayout(new GridLayout(4, 2));

        /* ------------------------ Paneles etiqueta y campo ------------------------ */
        campoNombre = new PanelEtiquetaCampo("Nombre", 15);
        campoApellido = new PanelEtiquetaCampo("Apellido", 15);
        campoNota = new PanelEtiquetaCampo("Nota", 15);

        campoNombre.establecerFoco();

        add(campoNombre);
        add(campoApellido);
        add(campoNota);

        /* ---------------------------------- Boton --------------------------------- */
        botonEnviar = new PanelBoton();
        botonEnviar.setBorder(new EmptyBorder(0, 0, 0, 30));

        add(botonEnviar);

    }

    /* --------------------------------- Getter --------------------------------- */
    public String getTextoCampoNombre() {
        return campoNombre.getTextoJTextField();
    }

    public String getTextoCampoApellido() {
        return campoApellido.getTextoJTextField();
    }

    public String getTextoCampoNota() {
        return campoNota.getTextoJTextField();
    }

    public JButton getBoton() {
        return botonEnviar.getBotonEnviar();
    }

    /* ---------------- Comprobar que los campos tengan contenido --------------- */
    public boolean camposConContenido() {
        return !getTextoCampoNombre().isBlank() && !getTextoCampoApellido().isBlank()
                && !getTextoCampoNota().isBlank();
    }

    public String contenidoJTextField() {
        return getTextoCampoNombre() + " " + getTextoCampoApellido() + " - " + getTextoCampoNota();
    }

    /* -------------------------------------------------------------------------- */
    /* ------------------ Clases internas para paneles internos ----------------- */
    /* -------------------------------------------------------------------------- */
    /**
     * ============================
     ** PanelEtiquetaCampo
     * ==============================
     **/
    private class PanelEtiquetaCampo extends JPanel {
        private JLabel etiqueta;
        private JTextField campo;



        /* ------------------------------- Constructor ------------------------------ */
        public PanelEtiquetaCampo(String nuevaEtiqueta, int nuevoCampo) {
            setLayout(new FlowLayout(FlowLayout.RIGHT));

            etiqueta = new JLabel(nuevaEtiqueta);
            campo = new JTextField(nuevoCampo);

            campo.setMargin(new Insets(10, 5, 10, 0));

            add(etiqueta);
            add(campo);
        }

        /* ----------------- Acceder al texto dentro del JTextField ----------------- */
        public String getTextoJTextField() {
            return campo.getText();
        }

        /* ----------------------------- Establecer foco ---------------------------- */
        public void establecerFoco() {
            campo.requestFocus();
        }
    }
    // !---- Fin de PanelEtiquetaCampo ----

    /**
     * ============================
     ** PanelBoton
     * ==============================
     **/
    private class PanelBoton extends JPanel {
        private JButton botonEnviar;

        /* ------------------------------- Constructor ------------------------------ */
        public PanelBoton() {
            setLayout(new FlowLayout(FlowLayout.RIGHT));

            botonEnviar = new JButton("Enviar");
            add(botonEnviar);
        }

        /* --------------------------------- Getter --------------------------------- */
        public JButton getBotonEnviar() {
            return botonEnviar;
        }
    }
    // !---- Fin de PanelBoton ----

}
