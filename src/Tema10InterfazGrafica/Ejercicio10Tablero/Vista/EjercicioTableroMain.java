package Tema10InterfazGrafica.Ejercicio10Tablero.Vista;

import javax.swing.SwingUtilities;

public class EjercicioTableroMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TableroMarcoInicial();
        });
    }
}
