package Tema10InterfazGrafica.Ejercicio8Menu.Vista.PanelDerecho;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.ModeloMenu;
import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.Interfaz.InterfazPanel;
import Tema10InterfazGrafica.Ejercicio8Menu.Vista.MenuPanelPrincipal;

public class PanelDerecho extends JPanel implements InterfazPanel {
    private JComboBox<String> cmbNumeros;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelDerecho(ModeloMenu modelo) {
        modelo.agregarModeloPanelInterfaz(this);

        setPreferredSize(new Dimension(MenuPanelPrincipal.TAM_X_PANEL, MenuPanelPrincipal.TAM_Y_PANEL));
        setBorder(BorderFactory.createTitledBorder(
                new LineBorder(Color.BLACK, 2),
                "JComboBox", TitledBorder.LEFT, TitledBorder.TOP, this.getFont().deriveFont(Font.BOLD), Color.RED));
        /* ---------------------------- JComboBox Números --------------------------- */
        cmbNumeros = new JComboBox<>(MenuPanelPrincipal.NUMEROS);

        /* --------------------------- Añadir componentes --------------------------- */
        add(cmbNumeros);

        /* ---------------------- Comunicación con la interfaz ---------------------- */

    }

    @Override
    public void addElemento(String elTexto) {
        if (!elTexto.isEmpty()) 
            cmbNumeros.addItem(elTexto);
    }

    @Override
    public void borrarElemento(String elTexto) {
        cmbNumeros.removeItem(elTexto);
    }

}
