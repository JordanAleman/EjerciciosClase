package Tema10InterfazGrafica.Ejercicio15Cartas.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class CartasEjercicioAdicional15Tema10 {
    
    public static void main(String[] args) {
        new CartasEjercicioAdicional15Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class CartasEjercicioAdicional15Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public CartasEjercicioAdicional15Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 15");
        marcoInicial.add(new CartasEjercicioAdicional15Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class CartasEjercicioAdicional15Tema10PanelPrincipal extends JPanel {
    
}

