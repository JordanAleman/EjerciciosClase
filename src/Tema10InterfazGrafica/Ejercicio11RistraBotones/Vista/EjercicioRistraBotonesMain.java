package Tema10InterfazGrafica.Ejercicio11RistraBotones.Vista;

import javax.swing.SwingUtilities;

public class EjercicioRistraBotonesMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RistraBotonesMarcoInicial();
        });
    }
}
