package Tema10InterfazGrafica.Ejercicio6Dibujo.Vista;

import javax.swing.JFrame;

public class Dibujo {

    public static void main(String[] args) {
        new DibujoMarcoInicial();
    }
}

/* ------------------------------ Marco inicial ----------------------------- */
class DibujoMarcoInicial extends JFrame {

    /* ------------------------------- Constructor ------------------------------ */
    public DibujoMarcoInicial() {
        setTitle("Ejercicio adicional 6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DibujoPanelPrincipal());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
