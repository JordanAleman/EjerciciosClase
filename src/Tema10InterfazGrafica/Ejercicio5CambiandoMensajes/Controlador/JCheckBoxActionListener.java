package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class JCheckBoxActionListener implements ActionListener {
    private JTextArea areaTexto;

    public JCheckBoxActionListener(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fuente = areaTexto.getFont().getStyle();

        if (e.getSource() instanceof JCheckBox checkButton) {
            switch (checkButton.getText()) {
                case "Negrita":
                    if (checkButton.isSelected())
                        fuente += Font.BOLD;
                    else 
                        fuente -= Font.BOLD;
                    break;

                case "Cursiva":
                    if (checkButton.isSelected())
                        fuente += Font.ITALIC;
                    else
                        fuente -= Font.ITALIC;
                    break;
            }

            // areaTexto.setFont(new Font(areaTexto.getFont().getName(), fuente, areaTexto.getFont().getSize()));
            areaTexto.setFont(areaTexto.getFont().deriveFont(fuente));;
        }
    }

}
