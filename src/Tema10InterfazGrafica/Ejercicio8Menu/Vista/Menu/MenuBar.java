package Tema10InterfazGrafica.Ejercicio8Menu.Vista.Menu;

import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Tema10InterfazGrafica.Ejercicio8Menu.Controlador.MouseListenerMenuColorPanel;
import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;

public class MenuBar extends JMenuBar {
    private ArrayList<AbstractButton> menuInicial, menuElementos;
    private ArrayList<JMenuItem> menuItemElemBorrar;

    /* ------------------------------- Constructor ------------------------------ */
    public MenuBar(ModeloMenu modelo) {
        menuInicial = new ArrayList<>();
        menuElementos = new ArrayList<>();
        menuItemElemBorrar = new ArrayList<>();

        /* ------------------------ Opciones menu principales ----------------------- */

        menuInicial.add(new JMenu("Elementos"));
        menuInicial.add(new JMenu("Color Panel"));

        // Menú de la opción Elementos
        menuElementos.add(new JMenuItem("Añadir"));
        menuElementos.add(new JMenu("Borrar"));
        menuElementos.add(new JMenuItem("Salir"));

        /* ------------------------------- Menu items ------------------------------- */
        // Submenú de la opción Borrar
        menuItemElemBorrar.add(new JMenuItem("Uno"));
        menuItemElemBorrar.add(new JMenuItem("Dos"));
        menuItemElemBorrar.add(new JMenuItem("Tres"));
        menuItemElemBorrar.add(new JMenuItem("Cuatro"));
        menuItemElemBorrar.add(new JMenuItem("Cinco"));

        /* -------------------------- Añadiendo componentes ------------------------- */
        for (AbstractButton jMenu : menuInicial)
            add(jMenu);

        for (AbstractButton jMenuElementos : menuElementos)
            menuInicial.get(0).add(jMenuElementos);

        for (JMenuItem jMenuItemElemBorrar : menuItemElemBorrar)
            menuElementos.get(1).add(jMenuItemElemBorrar);

        /* ---------------------------- Añadiendo eventos --------------------------- */
        // if (menuInicial.get(0)) {
            
        // }

        // Evento de escoger color de fondo para todo el panel
        if (menuInicial.get(1) instanceof JMenu menuColorPanel) 
            menuColorPanel.addMouseListener(new MouseListenerMenuColorPanel(this, modelo));

        
    }
}
