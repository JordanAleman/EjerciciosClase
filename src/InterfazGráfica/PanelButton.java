package InterfazGráfica;

import java.awt.Cursor;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButton extends JPanel {
    private ArrayList<JButton> jtbBotonLista = new ArrayList<>();
    private JButton jtbBoton;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un boton sin título.
     * 
     */
    public PanelButton() {
        jtbBoton = new JButton();
        jtbBoton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(jtbBoton);

    }

    /**
     * Crea un panel con un botón con título.
     * <hr>
     * 
     * @param nombreBoton Título del botón
     * 
     */
    public PanelButton(String nombreBoton) {
        jtbBoton = new JButton(nombreBoton);
        jtbBoton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(jtbBoton);
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
                jtbBotonLista.add(new JButton());
                jtbBotonLista.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
                add(jtbBotonLista.get(i));
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
                jtbBotonLista.add(new JButton(listaNombresBotones[i]));
                jtbBotonLista.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
                add(jtbBotonLista.get(i));
            }
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo jtbBotonLista
     * <pre>
     * private ArrayList<JButton> jtbBotonLista 
     * </pre>
     * 
     * @return el ArrayList de botones {@code ArrayList<JButton>}
     */
    public ArrayList<JButton> getJtbBotonLista() {
        return jtbBotonLista;
    }

    /**
     * Devuelve el valor del atributo JButton
     * <pre>
     * private JButton jtbBoton;
     * </pre>
     * 
     * @return el botón {@code JButton}
     */
    public JButton getJtbBoton() {
        return jtbBoton;
    }
}
