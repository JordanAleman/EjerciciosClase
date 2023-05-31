package Tema10InterfazGrafica.Ejercicio8Menu.Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;
import Tema10InterfazGrafica.Ejercicio8Menu.Vista.PanelDerecho.PanelDerecho;
import Tema10InterfazGrafica.Ejercicio8Menu.Vista.PanelIzquierdo.PanelIzquierdo;

/* -------------------------- Menu panel principal -------------------------- */
public class MenuPanelPrincipal extends JPanel {
    private PanelIzquierdo panelIzquierdo;
    private PanelDerecho panelDerecho;

    public static final String[] NUMEROS = { "Uno", "Dos", "Tres", "Cuatro", "Cinco" };
    public static final int TAM_X_PANEL = 300;
    public static final int TAM_Y_PANEL = 250;

    /* ------------------------------- Constructor ------------------------------ */
    public MenuPanelPrincipal(ModeloMenu modelo) {
        setLayout(new BorderLayout());
        
        /* ----------------------------- Panel izquierdo ---------------------------- */
        panelIzquierdo = new PanelIzquierdo(modelo);
        
        /* ------------------------------ Panel derecho ----------------------------- */
        panelDerecho = new PanelDerecho(modelo);

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(panelIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.EAST);
    }

    public void setBackgroundColor(Color color) {
        panelIzquierdo.setBackground(color);
        panelDerecho.setBackground(color);
    }
}
