package Tema10InterfazGrafica.Ejercicio13ManejaFicherosImagenes.Vista;

import javax.swing.JFrame;

import Tema10InterfazGrafica.Ejercicio13ManejaFicherosImagenes.Vista.Menu.ManejoFicherosImagenesMenu;

public class ManejoFicherosImagenesMarcoInicial extends JFrame {

     /* ------------------------------- Constructor ------------------------------ */
     public ManejoFicherosImagenesMarcoInicial() {
        setTitle("Ejercicio adicional 13");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new ManejoFicherosImagenesPanelPrincipal());
        setJMenuBar(new ManejoFicherosImagenesMenu());

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
