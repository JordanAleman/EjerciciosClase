package Tema10InterfazGrafica.Ejercicio9Bordes.Vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio9Bordes.Controlador.ActionListenerBotonSemaforo;
import Tema10InterfazGrafica.Ejercicio9Bordes.Controlador.ImagenRedimensionada;
import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.ModeloBordes;
import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.Interfaz.InterfazBotonSemaforo;
import Tema10InterfazGrafica.Ejercicio9Bordes.Vista.PanelCentral.PanelCentral;
import Tema10InterfazGrafica.Ejercicio9Bordes.Vista.PanelIzquierdo.PanelIzquierdo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class BordesPanelPrincipal extends JPanel implements InterfazBotonSemaforo {
    private PanelIzquierdo panelIzquierdo;
    private PanelCentral panelCentral;
    private JButton btnSur; // Dará comienzo al timer del semáforo

    private ModeloBordes modelo;

    private final String PATH = "src\\Tema10InterfazGrafica\\Ejercicio9Bordes\\Vista\\";

    /* ------------------------------- Constructor ------------------------------ */
    public BordesPanelPrincipal() {
        modelo = new ModeloBordes();
        modelo.agregarInterfazBotonSemaforo(this);

        setLayout(new BorderLayout());

        /* ----------------------------- Panel izquierdo ---------------------------- */
        panelIzquierdo = new PanelIzquierdo(modelo);

        /* ------------------------------ PanelCentral ------------------------------ */
        panelCentral = new PanelCentral(modelo);

        /* -------------------------------- Botón sur ------------------------------- */
        btnSur = new JButton("Poner en marcha el semáforo",
                ImagenRedimensionada.ImageIconRedimensionada(PATH + "on.png", 20, 20));
        btnSur.setPreferredSize(new Dimension(0, 50));
        btnSur.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));

        btnSur.addActionListener(new ActionListenerBotonSemaforo(modelo));

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(panelIzquierdo, BorderLayout.WEST);
        add(panelCentral, BorderLayout.CENTER);
        add(btnSur, BorderLayout.SOUTH);
    }

    @Override
    public void cambiarEstadoBotonSemaforo(String textoBoton) {
        btnSur.setText(textoBoton);
    }
}
