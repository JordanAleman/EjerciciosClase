package Tema10InterfazGrafica.Ejercicio9Bordes.Vista.PanelCentral;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.ModeloBordes;
import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.Interfaz.InterfazBordesPanel;

public class PanelCentral extends JPanel implements InterfazBordesPanel {
    private JLabel lblContadorColoresSemaforo;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelCentral(ModeloBordes modelo) {
        /* -------------------------- Administrar el modelo ------------------------- */
        modelo.agregarInterfazBordesPanel(this);

        /* -------------------------- Estructura del panel -------------------------- */
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(350, 0));
        setBackground(Color.RED);
        setBorder(BorderFactory.createTitledBorder(
                new LineBorder(new Color(206, 144, 159), 2),
                "Título", TitledBorder.LEFT, TitledBorder.TOP,
                this.getFont().deriveFont(Font.BOLD), Color.BLACK));

        /* ----------------------- lblContadorColoresSemaforo ----------------------- */
        lblContadorColoresSemaforo = new JLabel("");
        lblContadorColoresSemaforo.setHorizontalAlignment(JLabel.CENTER);
        lblContadorColoresSemaforo.setFont(new Font("Arial", Font.BOLD, 26));
        lblContadorColoresSemaforo.setForeground(Color.BLACK);
        
        /* -------------------------- Añadiendo componentes ------------------------- */
        add(lblContadorColoresSemaforo, BorderLayout.CENTER);
    }

    @Override
    public void setColorBackground(Color color) {
        setBackground(color);
    }

    @Override
    public void setBordePanel(Border border) {
        setBorder(border);
    }

    @Override
    public void setContadorColorSemaforo(String contadorColorSemaforo) {
        lblContadorColoresSemaforo.setText(contadorColorSemaforo);
    }
}
