package Tema10InterfazGrafica.Ejercicio10Tablero.Vista;

import javax.swing.JFrame;

public class TableroMarcoInicial extends JFrame {

     /* ------------------------------- Constructor ------------------------------ */
     public TableroMarcoInicial() {
        setTitle("Ejercicio adicional 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new TableroPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
