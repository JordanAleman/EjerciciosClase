package Tema10InterfazGrafica.Ejercicio13ManejaFicherosImagenes.Vista;

import javax.swing.SwingUtilities;

public class EjercicioManejaFicherosImagenesMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManejoFicherosImagenesMarcoInicial();
        });
    }
}
