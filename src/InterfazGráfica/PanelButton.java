package InterfazGráfica;

import java.awt.Cursor;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButton extends JPanel {
    private ArrayList<JButton> btnBotonLista = new ArrayList<>();
    private JButton btnBoton;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un boton sin título.
     * 
     */
    public PanelButton() {
        btnBoton = new JButton();
        btnBoton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnBoton);

    }

    /**
     * Crea un panel con un botón con título.
     * <hr>
     * 
     * @param nombreBoton Título del botón
     * 
     */
    public PanelButton(String nombreBoton) {
        btnBoton = new JButton(nombreBoton);
        btnBoton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnBoton);
    }

    /**
     * Crea en un panel tantos botones sin títulos.
     * <hr>
     * 
     * @param cantidadBotones Cantidad de botones dentro del panel
     * 
     */
    public PanelButton(int cantidadBotones) {
        if (cantidadBotones <= 1) {
            new PanelButton();
        } else {
            for (int i = 0; i < cantidadBotones; i++) {
                btnBotonLista.add(new JButton());
                btnBotonLista.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
                add(btnBotonLista.get(i));
            }
        }
    }

    /**
     * Crear en un panel tantos botones con títulos cada uno. Para que
     * cada botón se le pueda asignar directamente un nombre en su creación
     * se espera que se la pase un array con la lista de los títulos
     * para los botones.
     * <hr>
     * 
     * @param listaNombresBotones {@code String[]} con los títulos de los
     *                            botones que se van a crear
     * 
     */
    public PanelButton(String[] listaNombresBotones) {
        if (listaNombresBotones.length <= 0)
            new PanelButton();

        if (listaNombresBotones.length == 1)
            new PanelButton(listaNombresBotones[0]);

        if (listaNombresBotones.length > 1) {
            for (int i = 0; i < listaNombresBotones.length; i++) {
                btnBotonLista.add(new JButton(listaNombresBotones[i]));
                btnBotonLista.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
                add(btnBotonLista.get(i));
            }
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo btnBotonLista
     * <pre>
     * private ArrayList<JButton> btnBotonLista 
     * </pre>
     * 
     * @return el ArrayList de botones {@code ArrayList<JButton>}
     */
    public ArrayList<JButton> getBtnBotonLista() {
        return btnBotonLista;
    }

    /**
     * Devuelve el valor del atributo JButton
     * <pre>
     * private JButton btnBoton;
     * </pre>
     * 
     * @return el botón {@code JButton}
     */
    public JButton getBtnBoton() {
        return btnBoton;
    }

    public JButton getBtnBotonForIndex(int pos) {
        return btnBotonLista.get(pos);
    }
}
