package Tema10InterfazGrafica.Ejercicio8Menu.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class MenuEjercicioAdicional8Tema10 {
    
    public static void main(String[] args) {
        new MenuEjercicioAdicional8Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class MenuEjercicioAdicional8Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public MenuEjercicioAdicional8Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 8");
        marcoInicial.add(new MenuEjercicioAdicional8Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class MenuEjercicioAdicional8Tema10PanelPrincipal extends JPanel {
    
}

