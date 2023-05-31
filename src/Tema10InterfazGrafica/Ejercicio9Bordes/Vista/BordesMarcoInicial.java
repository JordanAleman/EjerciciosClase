package Tema10InterfazGrafica.Ejercicio9Bordes.Vista;

import javax.swing.JFrame;

public class BordesMarcoInicial extends JFrame {

     /* ------------------------------- Constructor ------------------------------ */
     public BordesMarcoInicial() {
        setTitle("Ejercicio adicional 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new BordesPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
