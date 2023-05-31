package Tema10InterfazGrafica.Ejercicio8Menu.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;

public class ActionListenerMenuAdd implements ActionListener {
    private ModeloMenu modelo;
    private String texto;

    /* ------------------------------- Constructor ------------------------------ */
    public ActionListenerMenuAdd(ModeloMenu modelo) {
        this.modelo = modelo;
        texto = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            texto = (String) JOptionPane.showInputDialog(
                null,
                "Elemento nuevo a añadir: ", 
                "Entrada",
                JOptionPane.QUESTION_MESSAGE);
    
            if (texto != null && !texto.isBlank()) 
                modelo.setTexto(texto.trim());
    }
}
