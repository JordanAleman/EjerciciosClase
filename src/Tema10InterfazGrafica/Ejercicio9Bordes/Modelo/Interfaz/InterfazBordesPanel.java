package Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.Interfaz;

import java.awt.Color;

import javax.swing.border.Border;

public interface InterfazBordesPanel {
    void setColorBackground(Color color);
    void setBordePanel(Border border);
    void setContadorColorSemaforo(String contadorColorSemaforo);
}
