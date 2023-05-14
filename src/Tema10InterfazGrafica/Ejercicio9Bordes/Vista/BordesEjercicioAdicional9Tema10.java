package Tema10InterfazGrafica.Ejercicio9Bordes.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class BordesEjercicioAdicional9Tema10 {
    
    public static void main(String[] args) {
        new BordesEjercicioAdicional9Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class BordesEjercicioAdicional9Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public BordesEjercicioAdicional9Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 9");
        marcoInicial.add(new BordesEjercicioAdicional9Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class BordesEjercicioAdicional9Tema10PanelPrincipal extends JPanel {
    
}

