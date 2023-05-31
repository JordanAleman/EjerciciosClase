package Tema10InterfazGrafica.Ejercicio14Calculadora.Vista;

import javax.swing.SwingUtilities;

public class EjercicioCalculadoraMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraMarcoInicial();
        });
    }
}
