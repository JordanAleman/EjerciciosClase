package Tema10InterfazGrafica.Ejercicio8Menu.Controlador;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JColorChooser;
import javax.swing.JMenuBar;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;

public class MouseListenerMenuColorPanel extends MouseAdapter {
    private JMenuBar componente;
    private ModeloMenu modelo;

    /* ------------------------------- Constructor ------------------------------ */
    public MouseListenerMenuColorPanel(JMenuBar componente, ModeloMenu modelo) {
        this.componente = componente;
        this.modelo = modelo;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Color color = JColorChooser.showDialog(componente, "Establecer color panel", Color.GREEN);// Cancelar(null)

        if (color != null)
            modelo.setColor(color);
    }
}
