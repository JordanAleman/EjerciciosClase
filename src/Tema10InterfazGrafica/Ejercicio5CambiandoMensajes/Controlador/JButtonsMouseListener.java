package Tema10InterfazGrafica.Ejercicio5CambiandoMensajes.Controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class JButtonsMouseListener implements MouseListener {
    private JTextArea areaTexto;
    private Color colorActualBackground;
    private Color colorActualForeground;

    /* ------------------------------- Constructor ------------------------------ */
    public JButtonsMouseListener(JTextArea areaTexto) {
        this.areaTexto = areaTexto;
        colorActualForeground = Color.BLACK;
        colorActualBackground = Color.WHITE;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() instanceof JButton boton) {
            switch (boton.getText()) {
                case "Rojo":
                    colorActualForeground = Color.RED;
                    colorActualBackground = Color.WHITE;
                    break;
                case "Azul":
                    colorActualForeground = Color.BLUE;
                    colorActualBackground = Color.WHITE;
                    break;
                case "Amarillo":
                    colorActualForeground = Color.YELLOW;
                    colorActualBackground = Color.BLACK;
                    break;
                case "Verde":
                    colorActualForeground = Color.GREEN;
                    colorActualBackground = Color.BLACK;
                    break;
                default:
                    colorActualForeground = Color.BLACK;
                    colorActualBackground = Color.WHITE;
                    break;
            }
            areaTexto.setForeground(colorActualForeground);
            areaTexto.setBackground(colorActualBackground);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // if (e.getSource() instanceof JButton boton) {
        //     switch (boton.getText()) {
        //         case "Rojo" -> {
        //             areaTexto.setForeground(Color.RED);
        //             areaTexto.setBackground(Color.WHITE);
        //         }
        //         case "Azul" -> {
        //             areaTexto.setForeground(Color.BLUE);
        //             areaTexto.setBackground(Color.WHITE);
        //         }
        //         case "Amarillo" -> {
        //             areaTexto.setForeground(Color.YELLOW);
        //             areaTexto.setBackground(Color.BLACK);
        //         }
        //         case "Verde" -> {
        //             areaTexto.setForeground(Color.GREEN);
        //             areaTexto.setBackground(Color.BLACK);
        //         }
        //         default -> {
        //             areaTexto.setForeground(Color.BLACK);
        //             areaTexto.setBackground(Color.WHITE);
        //         }
        //     }
        // }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // if (e.getSource() instanceof JButton boton) {
        //     areaTexto.setForeground(colorActualForeground);
        //     areaTexto.setBackground(colorActualBackground);
        // }
    }

}
