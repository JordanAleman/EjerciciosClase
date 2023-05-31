package Tema10InterfazGrafica.Ejercicio12MatrizBotones.Vista;

import javax.swing.SwingUtilities;

public class EjercicioMatrizBotonesMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MatrizBotonesMarcoInicial();
        });
    }
}
