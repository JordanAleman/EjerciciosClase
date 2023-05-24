package Tema10InterfazGrafica.Ejercicio7Paso.Vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import Tema10InterfazGrafica.Ejercicio7Paso.Modelo.Modelo;
import Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelInferior.PanelInferior;
import Tema10InterfazGrafica.Ejercicio7Paso.Vista.PanelSuperior.PanelSuperior;

/* ----------------------------- Panel principal ---------------------------- */
public class PasoPanelPrincipal extends JPanel {
    private PanelSuperior panelSuperior;
    private PanelInferior panelInferior;
    private Modelo modelo;

    public PasoPanelPrincipal() {
        setLayout(new BorderLayout());
        
        modelo = new Modelo();
        panelSuperior = new PanelSuperior(modelo);
        panelInferior = new PanelInferior(modelo);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.CENTER);
    }
}