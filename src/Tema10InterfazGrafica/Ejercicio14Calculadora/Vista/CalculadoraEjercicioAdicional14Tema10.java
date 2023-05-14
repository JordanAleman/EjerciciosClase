package Tema10InterfazGrafica.Ejercicio14Calculadora.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class CalculadoraEjercicioAdicional14Tema10 {
    
    public static void main(String[] args) {
        new CalculadoraEjercicioAdicional14Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class CalculadoraEjercicioAdicional14Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public CalculadoraEjercicioAdicional14Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 14");
        marcoInicial.add(new CalculadoraEjercicioAdicional14Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class CalculadoraEjercicioAdicional14Tema10PanelPrincipal extends JPanel {
    
}

