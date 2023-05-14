package Tema10InterfazGrafica.Ejercicio6Dibujo.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class DibujoEjercicioAdicional6Tema10 {
    
    public static void main(String[] args) {
        new DibujoEjercicioAdicional6Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class DibujoEjercicioAdicional6Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public DibujoEjercicioAdicional6Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 6");
        marcoInicial.add(new DibujoEjercicioAdicional6Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class DibujoEjercicioAdicional6Tema10PanelPrincipal extends JPanel {
    
}
