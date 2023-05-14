package Tema10InterfazGrafica.Ejercicio11RistraBotones.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class RistraBotonesEjercicioAdicional11Tema10 {
    
    public static void main(String[] args) {
        new RistraBotonesEjercicioAdicional11Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class RistraBotonesEjercicioAdicional11Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public RistraBotonesEjercicioAdicional11Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 11");
        marcoInicial.add(new RistraBotonesEjercicioAdicional11Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class RistraBotonesEjercicioAdicional11Tema10PanelPrincipal extends JPanel {
    
}

