package Tema10InterfazGrafica.Ejercicio8Menu.Vista.PanelIzquierdo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;
import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.Interfaz.InterfazPanel;
import Tema10InterfazGrafica.Ejercicio8Menu.Vista.MenuPanelPrincipal;

public class PanelIzquierdo extends JPanel implements InterfazPanel {
    private JList<String> lstNumeros;
    private DefaultListModel<String> listModel;


    /* ------------------------------- Constructor ------------------------------ */
    public PanelIzquierdo(ModeloMenu modelo) {
        modelo.agregarModeloPanelInterfaz(this);

        setPreferredSize(new Dimension(MenuPanelPrincipal.TAM_X_PANEL, MenuPanelPrincipal.TAM_Y_PANEL));
        setBorder(BorderFactory.createTitledBorder(
                new LineBorder(new Color(132, 132, 246), 2),
                "JList", TitledBorder.RIGHT, TitledBorder.BOTTOM, this.getFont().deriveFont(Font.BOLD), Color.GREEN));

        /* ------------------------------ JList Números ----------------------------- */
        listModel = new DefaultListModel<>();
        listModel.addAll((Arrays.asList(MenuPanelPrincipal.NUMEROS)));

        lstNumeros = new JList<>(listModel);

         /* --------------------------- Añadir componentes --------------------------- */
         add(lstNumeros);
    }

    @Override
    public void addElemento(String elemento) {
        if (!elemento.isBlank()) 
            listModel.addElement(elemento);
    }

    @Override
    public void borrarElemento(String elemento) {
        for (int i = 0; i < listModel.size(); i++) {
            if (listModel.get(i).equals(elemento)) {
                listModel.remove(i);
                break;
            }
        }
    }
}
