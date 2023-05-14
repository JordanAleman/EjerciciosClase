package Tema10InterfazGrafica.Ejercicio13ManejaFicherosImagenes.Vista;

import javax.swing.JPanel;

import InterfazGráfica.MarcoCentrado;

public class ManejoFicherosImagenesEjercicioAdicional13Tema10 {
    
    public static void main(String[] args) {
        new ManejoFicherosImagenesEjercicioAdicional13Tema10MarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class ManejoFicherosImagenesEjercicioAdicional13Tema10MarcoInicial {
    /* ------------------------------- Constructor ------------------------------ */
    public ManejoFicherosImagenesEjercicioAdicional13Tema10MarcoInicial() {
        MarcoCentrado marcoInicial = new MarcoCentrado(470, 280, "Ejercicio adicional 13");
        marcoInicial.add(new ManejoFicherosImagenesEjercicioAdicional13Tema10PanelPrincipal());
        marcoInicial.setResizable(false);
        marcoInicial.setVisible(true);
    }
}

/* ----------------------------- Panel principal ---------------------------- */
class ManejoFicherosImagenesEjercicioAdicional13Tema10PanelPrincipal extends JPanel {
    
}

