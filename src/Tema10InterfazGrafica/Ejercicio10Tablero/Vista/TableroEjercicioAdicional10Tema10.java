package Tema10InterfazGrafica.Ejercicio10Tablero.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class TableroEjercicioAdicional10Tema10 {
    
    public static void main(String[] args) {
        new TableroEjercicioAdicional10Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class TableroEjercicioAdicional10Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public TableroEjercicioAdicional10Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 10");
        marcoInicial.add(new TableroEjercicioAdicional10Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class TableroEjercicioAdicional10Tema10PanelPrincipal extends JPanel {
    
}

