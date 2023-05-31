package Tema10InterfazGrafica.Ejercicio10Tablero.Vista.PanelIzquierdo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.ModeloTablero;
import Tema10InterfazGrafica.Ejercicio10Tablero.Modelo.Interfaz.InterfazInformacionJugadores;

public class PanelIzquierdo extends JPanel implements InterfazInformacionJugadores {
    private JLabel lblTurn;
    private JLabel lblScore;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelIzquierdo(ModeloTablero modeloTablero) {
        modeloTablero.agregarInterfazInformacionJugadores(this);

        /* ---------------------------- Estructura panel ---------------------------- */
        setLayout(new GridLayout(2, 1));
        setBorder(BorderFactory.createTitledBorder(
                        new LineBorder(new Color(205, 219, 233), 1),
                        "Juego Blanco y Negro", TitledBorder.LEFT, TitledBorder.TOP,
                        new Font("Dialog", Font.BOLD, 12), Color.BLACK));

        /* --------------------------------- lblTurn -------------------------------- */
        lblTurn = new JLabel("Turno: Jugador 1");

        lblTurn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK),
                BorderFactory.createEmptyBorder(0, 50, 0, 50)));

        lblTurn.setHorizontalAlignment(JLabel.CENTER);

        /* -------------------------------- lblScore -------------------------------- */
        lblScore = new JLabel("Blancos: 32 - Negros: 32");
        lblScore.setHorizontalAlignment(JLabel.CENTER);

        /* -------------------------- Añadiendo componentes ------------------------- */
        add(lblTurn);
        add(lblScore);
    }

    @Override
    public void setTurnoJugador(String turnoJugador, String puntuacion, Color colorFondoJugador, Color colorLetraJugador) {
        setBackground(colorFondoJugador);
        
        lblTurn.setText(turnoJugador);
        lblScore.setText(puntuacion);
        
        lblTurn.setForeground(colorLetraJugador);
        lblScore.setForeground(colorLetraJugador);

        setBorder(BorderFactory.createTitledBorder(
                        new LineBorder(new Color(205, 219, 233), 1),
                        "Juego Blanco y Negro", TitledBorder.LEFT, TitledBorder.TOP,
                        new Font("Dialog", Font.BOLD, 12), colorLetraJugador));
    }
}


