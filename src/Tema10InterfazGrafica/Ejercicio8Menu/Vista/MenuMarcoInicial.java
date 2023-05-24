package Tema10InterfazGrafica.Ejercicio8Menu.Vista;

import javax.swing.JFrame;

/* ------------------------------ Marco inicial ----------------------------- */
public class MenuMarcoInicial extends JFrame {

    /* ------------------------------- Constructor ------------------------------ */
    public MenuMarcoInicial() {
        setTitle("Ejercicio adicional 7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add(new PasoPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}