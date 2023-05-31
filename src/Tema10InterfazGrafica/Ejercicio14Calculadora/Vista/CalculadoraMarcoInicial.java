package Tema10InterfazGrafica.Ejercicio14Calculadora.Vista;

import javax.swing.JFrame;

public class CalculadoraMarcoInicial extends JFrame {

     /* ------------------------------- Constructor ------------------------------ */
     public CalculadoraMarcoInicial() {
        setTitle("Ejercicio adicional 13");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new CalculadoraPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
