package InterfazGráfica;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelTextArea extends JPanel {
    private JTextArea jtaAreaTexto;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un área de texto de tipo {@link JTextArea}.
     * 
     * <pre>
     * public PanelTextArea() {
     *     jtaAreaTexto = new JTextArea(5, 20);
     *     add(jtaAreaTexto);
     * }
     * </pre>
     */
    public PanelTextArea() {
        jtaAreaTexto = new JTextArea(5, 20);
        add(jtaAreaTexto);
    }

    /**
     * Crear un panel que contiene un área de texto de tipo {@link JTextArea},
     * con un texto por defecto indicado por parámetro
     * <p>
     * Tamaño por defecto:
     * 
     * <b>fila:</b> 5
     * <b>columnas:</b> 20
     * </p>
     * 
     * @param textoDefecto {@code String} con texto por defecto
     */
    public PanelTextArea(String textoDefecto) {
        if (textoDefecto == null)
            textoDefecto = "";

        jtaAreaTexto = new JTextArea(5, 20);
        jtaAreaTexto.setText(textoDefecto);

        add(jtaAreaTexto);
    }

    /**
     * Crear un panel que contiene un área de texto de tipo {@link JTextArea},
     * con un lineWrap que se le indicará su estado al valor del parámetro
     * <p>
     * Tamaño por defecto:
     * 
     * <b>fila:</b> 5
     * <b>columnas:</b> 20
     * </p>
     * 
     * @param lineWrap {@code boolean} indianco si será true el linewrap
     */
    public PanelTextArea(boolean lineWrap) {
        jtaAreaTexto = new JTextArea(5, 20);

        if (lineWrap)
            jtaAreaTexto.setLineWrap(true);

        add(jtaAreaTexto);
    }

    /**
     * Crear un panel que contiene un área de texto de tipo {@link JTextArea},
     * con un texto por defecto indicado por parámetro junto a un estado del
     * lineWrap
     * <p>
     * Tamaño por defecto:
     * 
     * <b>fila:</b> 5
     * <b>columnas:</b> 20
     * </p>
     * 
     * @param textoDefecto {@code String} con texto por defecto
     * @param lineWrap     {@code boolean} indianco si será true el linewrap
     */
    public PanelTextArea(String textoDefecto, boolean lineWrap) {
        if (textoDefecto == null)
            textoDefecto = "";

        jtaAreaTexto = new JTextArea(5, 20);
        jtaAreaTexto.setText(textoDefecto);

        if (lineWrap)
            jtaAreaTexto.setLineWrap(true);

        add(jtaAreaTexto);
    }

    /**
     * Crea un panel con un área de texto de tipo {@link JTextArea}.
     * Su tamaño estará definido inicialmente por los valores de
     * sus parámetros
     * 
     * @param filas    {@code int} número de filas
     * @param columnas {@code int} número de columnas
     */
    public PanelTextArea(int filas, int columnas) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        jtaAreaTexto = new JTextArea(filas, columnas);
        add(jtaAreaTexto);
    }

    /**
     * Crear un panel que contiene un área de texto de tipo {@link JTextArea},
     * con un texto por defecto indicado por parámetro.
     * <p>
     * Su tamaño estará definido inicialmente por los valores de
     * sus parámetros
     * </p>
     * 
     * @param filas        {@code int} número de filas
     * @param columnas     {@code int} número de columnas
     * @param textoDefecto {@code String} con texto por defecto
     */
    public PanelTextArea(int filas, int columnas, String textoDefecto) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        if (textoDefecto == null)
            textoDefecto = "";

        jtaAreaTexto = new JTextArea(filas, columnas);
        jtaAreaTexto.setText(textoDefecto);

        add(jtaAreaTexto);
    }

    /**
     * Crear un panel que contiene un área de texto de tipo {@link JTextArea},
     * con un lineWrap que se le indicará su estado al valor del parámetro
     * <p>
     * Su tamaño estará definido inicialmente por los valores de
     * sus parámetros
     * </p>
     * 
     * @param filas    {@code int} número de filas
     * @param columnas {@code int} número de columnas
     * @param lineWrap {@code boolean} indianco si será true el linewrap
     */
    public PanelTextArea(int filas, int columnas, boolean lineWrap) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        jtaAreaTexto = new JTextArea(filas, columnas);

        if (lineWrap)
            jtaAreaTexto.setLineWrap(true);

        add(jtaAreaTexto);
    }

    /**
     * Crear un panel que contiene un área de texto de tipo {@link JTextArea},
     * con un texto por defecto indicado por parámetro junto a un estado del
     * lineWrap
     * <p>
     * Su tamaño estará definido inicialmente por los valores de
     * sus parámetros
     * </p>
     * 
     * @param filas        {@code int} número de filas
     * @param columnas     {@code int} número de columnas
     * @param textoDefecto {@code String} con texto por defecto
     * @param lineWrap     {@code boolean} indianco si será true el linewrap
     */
    public PanelTextArea(int filas, int columnas, String textoDefecto, boolean lineWrap) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        if (textoDefecto == null)
            textoDefecto = "";

        jtaAreaTexto = new JTextArea(filas, columnas);
        jtaAreaTexto.setText(textoDefecto);

        if (lineWrap)
            jtaAreaTexto.setLineWrap(true);

        add(jtaAreaTexto);
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo jtaAreaTexto
     * 
     * <pre>
     * private JTextArea jtaAreaTexto;
     * </pre>
     * 
     * @return el campo {@code JTextArea}
     */
    public JTextArea getJtaAreaTexto() {
        return jtaAreaTexto;
    }
}
