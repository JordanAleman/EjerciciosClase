package Tema10InterfazGrafica.Ejercicio8Menu.Modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.Interfaz.InterfazMenuColorPanel;
import Tema10InterfazGrafica.Ejercicio8Menu.Modelo.Interfaz.InterfazPanel;

public class ModeloMenu {
    private Color colorBackground;
    private InterfazMenuColorPanel listenerMenu;

    private String elemento;
    private HashSet<String> listaElementosExistentes;
    private ArrayList<InterfazPanel> listaListenerPanel;
    
    private final String[] NUMEROS = { "Uno", "Dos", "Tres", "Cuatro", "Cinco" };

    /* ------------------------------- Constructor ------------------------------ */
    public ModeloMenu() {
        colorBackground = Color.WHITE;
        listaListenerPanel = new ArrayList<>();

        listaElementosExistentes = new HashSet<>(Arrays.asList(NUMEROS));
    }

    /**
     * Este método interactúa con el menú de la ventana principal. Actuará sobre la
     * opción de `Color Panel`. El modelo sólo se encargará de indicar cuál es el
     * nuevo color que se va a establecer para el fondo del panel y luego se lo
     * comunica a la interfaz
     * 
     * @param color {@code Color} Indica el color que se establecerá
     */
    public void setColor(Color color) {
        colorBackground = color;
        notificarCambioColor();
    }

    public void setTexto(String nuevoElemento) {
        if (!listaElementosExistentes.contains(nuevoElemento.trim())) {
            listaElementosExistentes.add(nuevoElemento.trim());
            elemento = nuevoElemento;
        } else 
            elemento = "";

        notificarNuevoElemento();
    }

    public void setBorrarTexto(String elementoBorrar) {
        listaElementosExistentes.remove(elementoBorrar);
        elemento = elementoBorrar;
        notificarElementoBorrar();
    }

    /* ------------------------- Agregar las interfaces ------------------------- */
    public void agregarModeloMenuInterfaz(InterfazMenuColorPanel listenerMenu) {
        this.listenerMenu = listenerMenu;
    
    }
    
    public void agregarModeloPanelInterfaz(InterfazPanel listenerPanel) {
        listaListenerPanel.add(listenerPanel);
    }

    /**
     * Comunicación con la interfaz para indicar el cambio de color del panel 
     */
    public void notificarCambioColor() {
        listenerMenu.colorActualizado(colorBackground);
    }

    public void notificarNuevoElemento() {
        for (InterfazPanel interfazPanel : listaListenerPanel) 
            interfazPanel.addElemento(elemento);
    }

    public void notificarElementoBorrar() {
        for (InterfazPanel interfazPanel : listaListenerPanel) 
            interfazPanel.borrarElemento(elemento);
    }
}
