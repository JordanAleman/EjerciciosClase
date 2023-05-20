package Tema10InterfazGrafica.Ejercicio6Dibujo.Controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;

public class JRadioButtonItemListenerTamLetra implements ItemListener {
    private int anchoTextoDibujo;
    private int tamFuenteTextoDibujo;

    /* ------------------------------- Constructor ------------------------------ */
    public JRadioButtonItemListenerTamLetra(int anchoTextoDibujo, int tamFuenteTextoDibujo) {
        this.anchoTextoDibujo = anchoTextoDibujo;
        this.tamFuenteTextoDibujo = tamFuenteTextoDibujo;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JRadioButton radioButton) {
            
            switch (radioButton.getText()) {
                case "8" -> {
                    anchoTextoDibujo = 500;
                    tamFuenteTextoDibujo = 20;
                    System.out.println(anchoTextoDibujo + " Tamaño Fuente Texto Dibujo: " + tamFuenteTextoDibujo);

                }
                case "12" -> {System.out.println(anchoTextoDibujo);}
                case "16" -> {System.out.println(anchoTextoDibujo);}
                case "20" -> {System.out.println(anchoTextoDibujo);}
                case "26" -> {System.out.println(anchoTextoDibujo);}
                case "30" -> {System.out.println(anchoTextoDibujo);}
            }

            
        }
    }

}
