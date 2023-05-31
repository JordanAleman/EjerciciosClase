package Tema10InterfazGrafica.Ejercicio12MatrizBotones.Vista;

import javax.swing.JFrame;

public class MatrizBotonesMarcoInicial extends JFrame {

     /* ------------------------------- Constructor ------------------------------ */
     public MatrizBotonesMarcoInicial() {
        setTitle("Ejercicio adicional 12");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new MatrizBotonesPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
