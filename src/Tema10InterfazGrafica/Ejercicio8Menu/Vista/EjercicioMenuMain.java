package Tema10InterfazGrafica.Ejercicio8Menu.Vista;

import javax.swing.SwingUtilities;

public class EjercicioMenuMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuMarcoInicial();
        });
    }
}
