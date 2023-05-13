package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextFieldKeyListener implements KeyListener {
    private boolean flagSiguienteMensajeJTextField = true;
    private JTextArea areaTexto;

    public JTextFieldKeyListener(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() instanceof JTextField campoTexto) {
            if (flagSiguienteMensajeJTextField) {
                campoTexto.setText("");
                campoTexto.setForeground(Color.BLACK);
                flagSiguienteMensajeJTextField = false;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() instanceof JTextField campoTexto) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER && campoTexto.getText().length() > 0) {
                areaTexto.setText(areaTexto.getText() + campoTexto.getText() + "\n");
                campoTexto.setText("Siguiente mensaje");
                campoTexto.setForeground(new Color(186, 195, 197));
                flagSiguienteMensajeJTextField = true;   
            }
        }
    }

}
