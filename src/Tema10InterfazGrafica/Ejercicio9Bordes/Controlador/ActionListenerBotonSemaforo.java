package Tema10InterfazGrafica.Ejercicio9Bordes.Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Tema10InterfazGrafica.Ejercicio9Bordes.Modelo.ModeloBordes;

public class ActionListenerBotonSemaforo implements ActionListener {
    private ModeloBordes modelo;
    private Timer timer;
    private Timer contadorTimer;

    private int contador = 0;

    private static final int DELAY_ROJO = 5000; // 5 segundos
    private static final int DELAY_AMARILLO = 2000; // 2 segundos
    private static final int DELAY_VERDE = 8000; // 8 segundos

    private final int VERDE_A_ROJO = 0;
    private final int ROJO_A_AMARILLO = 1;
    private final int AMARILLO_A_VERDE = 2;

    private int tiempoRojo;
    private int tiempoAmarillo;
    private int tiempoVerde;

    /* ------------------------------- Constructor ------------------------------ */
    public ActionListenerBotonSemaforo(ModeloBordes modelo) {
        this.modelo = modelo;
        reiniciarContadoresTiempoColorSemaforo();

        timer = new Timer(0, null);
        timer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                switch (contador % 3) {
                    case VERDE_A_ROJO -> {
                        modelo.setColorBackground(Color.RED);
                        timer.setDelay(DELAY_AMARILLO); // Prepara el tiempo que durará el siguiente color (Amarillo).
                    }
                    case ROJO_A_AMARILLO -> {
                        modelo.setColorBackground(Color.YELLOW);
                        timer.setDelay(DELAY_VERDE); // Prepara el tiempo que durará el siguiente color (Verde).
                    }
                    case AMARILLO_A_VERDE -> {
                        modelo.setColorBackground(Color.GREEN);
                        timer.setDelay(DELAY_ROJO); // Prepara el tiempo que durará el siguiente color (Rojo).
                    }
                }
                contador++;
            }
        });

        contadorTimer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (contador % 3) {
                    case VERDE_A_ROJO -> {
                        modelo.setContadorColorSemaforo("Verde: " + tiempoVerde-- + " segundos");
                        if (tiempoVerde == 0)
                            tiempoVerde = DELAY_VERDE / 1000;
                    }
                    case ROJO_A_AMARILLO -> {
                        modelo.setContadorColorSemaforo("Rojo: " + tiempoRojo-- + " segundos");
                        if (tiempoRojo == 0)
                            tiempoRojo = DELAY_ROJO / 1000;
                    }
                    case AMARILLO_A_VERDE -> {
                        modelo.setContadorColorSemaforo("Amarillo: " + tiempoAmarillo-- + " segundos");
                        if (tiempoAmarillo == 0)
                            tiempoAmarillo = DELAY_AMARILLO / 1000;
                    }
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setCambioEstadoBotonSemaforo();

        if (timer.isRunning()) {

            timer.stop();
            contadorTimer.stop();
        } else {
            timer.start();
            contador = 0;
            timer.setDelay(DELAY_ROJO); // Prepara el tiempo que durará el siguiente color (Rojo).

            contadorTimer.start();
            contadorTimer.setDelay(1000);
            reiniciarContadoresTiempoColorSemaforo();
        }
    }

    private void reiniciarContadoresTiempoColorSemaforo() {
        tiempoRojo = DELAY_ROJO / 1000;
        tiempoAmarillo = DELAY_AMARILLO / 1000;
        tiempoVerde = DELAY_VERDE / 1000;
    }

}
