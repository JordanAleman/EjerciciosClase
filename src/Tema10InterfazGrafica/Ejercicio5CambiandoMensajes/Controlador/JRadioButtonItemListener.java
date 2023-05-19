package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Modelo.ControlRadioButton;

public class JRadioButtonItemListener implements ItemListener {
    private JTextArea areaTexto;

    public static ControlRadioButton estadoRadioButton = ControlRadioButton.NORMAL;

    /* ------------------------------- Constructor ------------------------------ */
    public JRadioButtonItemListener(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JRadioButton radioButton) {

            switch (radioButton.getText()) {
                case "Mayusculas" -> {
                    if (radioButton.isSelected()) {
                        areaTexto.setText(areaTexto.getText().toUpperCase());
                        estadoRadioButton = ControlRadioButton.MAYUSCULA;
                    }
                }

                case "Minusculas" -> {
                    if (radioButton.isSelected()) {
                        areaTexto.setText(areaTexto.getText().toLowerCase());
                        estadoRadioButton = ControlRadioButton.MINUSCULA;
                    }
                }

                case "Normal" -> {
                    if (radioButton.isSelected()) {
                        areaTexto.setText(JTextFieldKeyListener.textoOriginal);
                        estadoRadioButton = ControlRadioButton.NORMAL;
                    }
                }
            }

        }
    }

}
