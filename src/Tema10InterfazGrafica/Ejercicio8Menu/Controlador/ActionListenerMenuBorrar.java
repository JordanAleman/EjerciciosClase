package Tema10InterfazGrafica.Ejercicio8Menu.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;

public class ActionListenerMenuBorrar implements ActionListener {
    private ModeloMenu modelo;
    
    /* ------------------------------- Constructor ------------------------------ */
    public ActionListenerMenuBorrar(ModeloMenu modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setBorrarTexto(e.getActionCommand());
    }
    
}
