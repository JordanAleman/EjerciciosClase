package Tema10InterfazGrafica.Ejercicio8Menu.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class Menu {
    
    public static void main(String[] args) {
        new MenuMarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class MenuMarcoInicial {
    
    /* ------------------------------- Constructor ------------------------------ */
    public MenuMarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 8");
        marcoInicial.add(new MenuPanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class MenuPanelPrincipal extends JPanel {
    
}

