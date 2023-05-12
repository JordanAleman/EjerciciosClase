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

    public PanelTextArea(String textoDefecto) {
        if (textoDefecto == null)
            textoDefecto = "";

        jtaAreaTexto = new JTextArea(5, 20);
        jtaAreaTexto.setText(textoDefecto);

        add(jtaAreaTexto);
    }

    public PanelTextArea(boolean lineWrap) {
        jtaAreaTexto = new JTextArea(5, 20);

        if (lineWrap)
            jtaAreaTexto.setLineWrap(true);

        add(jtaAreaTexto);
    }

    public PanelTextArea(String textoDefecto, boolean lineWrap) {
        if (textoDefecto == null)
            textoDefecto = "";

        jtaAreaTexto = new JTextArea(5, 20);
        jtaAreaTexto.setText(textoDefecto);

        if (lineWrap)
            jtaAreaTexto.setLineWrap(true);

        add(jtaAreaTexto);
    }

    public PanelTextArea(int filas, int columnas) {
        if (filas < 1)
            filas = 1;

        if (columnas < 1)
            columnas = 1;

        jtaAreaTexto = new JTextArea(filas, columnas);
        add(jtaAreaTexto);
    }

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
