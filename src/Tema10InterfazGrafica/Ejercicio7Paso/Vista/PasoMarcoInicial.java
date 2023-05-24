package Tema10InterfazGrafica.Ejercicio7Paso.Vista;

import javax.swing.JFrame;

/* ------------------------------ Marco inicial ----------------------------- */
public class PasoMarcoInicial extends JFrame {

    /* ------------------------------- Constructor ------------------------------ */
    public PasoMarcoInicial() {
        setTitle("Ejercicio adicional 7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new PasoPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
