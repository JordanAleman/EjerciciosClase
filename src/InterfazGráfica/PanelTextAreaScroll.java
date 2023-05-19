package InterfazGráfica;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelTextAreaScroll extends JPanel {
    private JTextArea txaAreaTexto;
    private JScrollPane scpLaminaScroll;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un área de texto de tipo {@link JTextArea}.
     * 
     * <pre>
     * public PanelTextAreaScroll() {
     *     txaAreaTexto = new JTextArea(5, 20);
     *     scpLaminaScroll = new JScrollPane(txaAreaTexto);
     *     add(scpLaminaScroll);
     * }
     * </pre>
     */
    public PanelTextAreaScroll() {
        txaAreaTexto = new JTextArea(5, 20);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
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
    public PanelTextAreaScroll(String textoDefecto) {
        if (textoDefecto == null)
            textoDefecto = "";

        txaAreaTexto = new JTextArea(5, 20);
        txaAreaTexto.setText(textoDefecto);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
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
    public PanelTextAreaScroll(boolean lineWrap) {
        txaAreaTexto = new JTextArea(5, 20);

        if (lineWrap)
            txaAreaTexto.setLineWrap(true);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
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
    public PanelTextAreaScroll(String textoDefecto, boolean lineWrap) {
        if (textoDefecto == null)
            textoDefecto = "";

        txaAreaTexto = new JTextArea(5, 20);
        txaAreaTexto.setText(textoDefecto);

        if (lineWrap)
            txaAreaTexto.setLineWrap(true);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
    }

    /**
     * Crea un panel con un área de texto de tipo {@link JTextArea}.
     * Su tamaño estará definido inicialmente por los valores de
     * sus parámetros
     * 
     * @param filas    {@code int} número de filas
     * @param columnas {@code int} número de columnas
     */
    public PanelTextAreaScroll(int filas, int columnas) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        txaAreaTexto = new JTextArea(filas, columnas);
        
        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
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
    public PanelTextAreaScroll(int filas, int columnas, String textoDefecto) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        if (textoDefecto == null)
            textoDefecto = "";

        txaAreaTexto = new JTextArea(filas, columnas);
        txaAreaTexto.setText(textoDefecto);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
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
    public PanelTextAreaScroll(int filas, int columnas, boolean lineWrap) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        txaAreaTexto = new JTextArea(filas, columnas);

        if (lineWrap)
            txaAreaTexto.setLineWrap(true);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
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
    public PanelTextAreaScroll(int filas, int columnas, String textoDefecto, boolean lineWrap) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        if (textoDefecto == null)
            textoDefecto = "";

        txaAreaTexto = new JTextArea(filas, columnas);
        txaAreaTexto.setText(textoDefecto);

        if (lineWrap)
            txaAreaTexto.setLineWrap(true);

        scpLaminaScroll = new JScrollPane(txaAreaTexto);
        add(scpLaminaScroll);
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo txaAreaTexto
     * 
     * <pre>
     * private JTextArea txaAreaTexto;
     * </pre>
     * 
     * @return el campo {@code JTextArea}
     */
    public JTextArea getTxaAreaTexto() {
        return txaAreaTexto;
    }
}
