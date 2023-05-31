package Tema10InterfazGrafica.Ejercicio9Bordes.Vista;

import javax.swing.SwingUtilities;

public class EjercicioBordesMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BordesMarcoInicial();
        });
    }
}
