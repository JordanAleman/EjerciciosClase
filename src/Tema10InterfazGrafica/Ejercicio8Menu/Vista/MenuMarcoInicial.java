package Tema10InterfazGrafica.Ejercicio8Menu.Vista;

import java.awt.Color;

import javax.swing.JFrame;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;
import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.Interfaz.InterfazMenuColorPanel;
import Tema10InterfazGrafica.Ejercicio8Menu.Vista.Menu.MenuBar;

/* ------------------------------ Marco inicial ----------------------------- */
public class MenuMarcoInicial extends JFrame implements InterfazMenuColorPanel {
    private ModeloMenu modelo;
    private MenuPanelPrincipal menuPanelPrincipal;

    /* ------------------------------- Constructor ------------------------------ */
    public MenuMarcoInicial() {
        modelo = new ModeloMenu();
        modelo.agregarModeloMenuInterfaz(this);

        menuPanelPrincipal = new MenuPanelPrincipal(modelo);

        setTitle("Ejercicio adicional 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setJMenuBar(new MenuBar(modelo));
        add(menuPanelPrincipal);

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void colorActualizado(Color color) {
        menuPanelPrincipal.setBackgroundColor(color);
    }
}