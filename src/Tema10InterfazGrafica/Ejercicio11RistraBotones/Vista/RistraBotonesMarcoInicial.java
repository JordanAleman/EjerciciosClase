package Tema10InterfazGrafica.Ejercicio11RistraBotones.Vista;

import javax.swing.JFrame;

public class RistraBotonesMarcoInicial extends JFrame {

     /* ------------------------------- Constructor ------------------------------ */
     public RistraBotonesMarcoInicial() {
        setTitle("Ejercicio adicional 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new RistraBotonesPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
