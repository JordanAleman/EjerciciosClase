package Tema10InterfazGrafica.Ejercicio9Bordes.Modelo;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.border.*;

import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.Interfaz.InterfazBordesPanel;
import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.Interfaz.InterfazBotonSemaforo;

public class ModeloBordes {
    private Color colorBackground;
    private Border tipoBorder;

    private boolean estadoBotonSemaforoEnMarcha;
    private String textoBotonSemaforo;
    private String contadorColorSemaforo;

    private ArrayList<InterfazBordesPanel> listaListenerPanel;
    private ArrayList<InterfazBotonSemaforo> listaListenerBotonSemaforo;

    /* ------------------------------- Constructor ------------------------------ */
    public ModeloBordes() {
        listaListenerPanel = new ArrayList<>();
        listaListenerBotonSemaforo = new ArrayList<>();

        estadoBotonSemaforoEnMarcha = false;
        textoBotonSemaforo = "";
        contadorColorSemaforo = "";
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setColorBackground(Color color) {
        colorBackground = color;
        notificarCambioColor();
    }

    public void setTipoBorder(Border borde) {
        tipoBorder = borde;
        notificarCambioBorde();
    }

    public void setCambioEstadoBotonSemaforo() {
        if (estadoBotonSemaforoEnMarcha)
            textoBotonSemaforo = "Poner en marcha el semáforo";
        else
            textoBotonSemaforo = "Parar el semáforo";

        estadoBotonSemaforoEnMarcha = !estadoBotonSemaforoEnMarcha;
        notificarCambioEstadoBotonSemaforo();
    }

    public void setContadorColorSemaforo(String nuevoContadorColorSemaforo) {
        if (estadoBotonSemaforoEnMarcha) 
            contadorColorSemaforo = nuevoContadorColorSemaforo;
        else
            contadorColorSemaforo = "";
            
        notificarCambioContadorColorSemaforo();
    }

    /* ------------------------- Agregar las interfaces ------------------------- */
    public void agregarInterfazBordesPanel(InterfazBordesPanel listenerPanel) {
        listaListenerPanel.add(listenerPanel);
    
    }
    public void agregarInterfazBotonSemaforo(InterfazBotonSemaforo listenerBotonSemaforo) {
        listaListenerBotonSemaforo.add(listenerBotonSemaforo);
    }

    /* ---------------------- Comunicación con la interfaz ---------------------- */
    public void notificarCambioColor() {
        for (InterfazBordesPanel interfazBordesPanel : listaListenerPanel)
            interfazBordesPanel.setColorBackground(colorBackground);
    }

    public void notificarCambioBorde() {
        for (InterfazBordesPanel interfazBordesPanel : listaListenerPanel)
            interfazBordesPanel.setBordePanel(tipoBorder);
    }

    public void notificarCambioContadorColorSemaforo() {
        for (InterfazBordesPanel interfazBordesPanel : listaListenerPanel)
            interfazBordesPanel.setContadorColorSemaforo(contadorColorSemaforo);
    }

    public void notificarCambioEstadoBotonSemaforo() {
        for (InterfazBotonSemaforo interfazBotonSemaforo : listaListenerBotonSemaforo) 
            interfazBotonSemaforo.cambiarEstadoBotonSemaforo(textoBotonSemaforo);
    }
}
