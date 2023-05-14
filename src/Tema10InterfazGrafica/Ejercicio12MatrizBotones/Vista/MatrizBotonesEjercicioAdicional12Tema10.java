package Tema10InterfazGrafica.Ejercicio12MatrizBotones.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class MatrizBotonesEjercicioAdicional12Tema10 {
    
    public static void main(String[] args) {
        new MatrizBotonesEjercicioAdicional12Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class MatrizBotonesEjercicioAdicional12Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public MatrizBotonesEjercicioAdicional12Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 12");
        marcoInicial.add(new MatrizBotonesEjercicioAdicional12Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class MatrizBotonesEjercicioAdicional12Tema10PanelPrincipal extends JPanel {
    
}

