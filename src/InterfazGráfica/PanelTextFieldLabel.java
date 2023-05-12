package InterfazGráfica;

import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTextFieldLabel extends JPanel {
    private JTextField jtfCampo;
    private JLabel jlbEtiqueta;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel que tendrá una etiqueta de tipo {@link JLabel} y una campo de
     * texto de tipo {@link JTextField}.
     * 
     * <ul>
     * <li>
     * Etiqueta {@code JLabel} a la izquierda y campo {@code JTextField} a la
     * derecha.
     * </li>
     * <li>
     * Tamaño por defecto del campo {@code JTextField} será 20 columnas.
     * </li>
     * </ul>
     * <hr>
     * 
     * @param nombreEtiqueta {@code String} con el nombre del {@code JLabel}
     */
    public PanelTextFieldLabel(String nombreEtiqueta) {
        if (nombreEtiqueta == null)
            nombreEtiqueta = "";

        jlbEtiqueta = new JLabel(nombreEtiqueta);
        jtfCampo = new JTextField(20);

        add(jlbEtiqueta);
        add(jtfCampo);
    }

    /**
     * Crea un panel que tendrá una etiqueta de tipo {@link JLabel} y una campo de
     * texto de tipo {@link JTextField}.
     * 
     * <ul>
     * <li>
     * Si el segundo parámetro está a true, {@code JTextField} a la izquierda y
     * {@code JLabel} a la derecha.
     * </li>
     * <li>
     * Tamaño por defecto del campo {@code JTextField} será 20 columnas.
     * </li>
     * </ul>
     * <hr>
     * 
     * @param nombreEtiqueta  {@code String} con el nombre del {@code JLabel}
     * @param etiquetaDerecha {@code boolean} si está a true el {@code JLabel} se
     *                        pondrá a la derecha del {@code JTextField}
     */
    public PanelTextFieldLabel(String nombreEtiqueta, boolean etiquetaDerecha) {
        if (nombreEtiqueta == null)
            nombreEtiqueta = "";

        jlbEtiqueta = new JLabel(nombreEtiqueta);
        jtfCampo = new JTextField(20);

        if (etiquetaDerecha) {
            add(jtfCampo);
            add(jlbEtiqueta);
        } else {
            add(jtfCampo);
            add(jlbEtiqueta);
        }
    }

    /**
     * Crea un panel que tendrá una etiqueta de tipo {@link JLabel} y una campo de
     * texto de tipo {@link JTextField}.
     * 
     * <ul>
     * <li>
     * Etiqueta {@code JLabel} a la izquierda y campo {@code JTextField} a la
     * derecha.
     * </li>
     * <li>
     * Tamaño por defecto del campo {@code JTextField} será el indicado por
     * el segundo parámetro.
     * </li>
     * </ul>
     * <hr>
     * 
     * @param nombreEtiqueta {@code String} con el nombre del {@code JLabel}
     * @param tamanioCampo   {@code int} cantidad de columnas del {@code JTextField}
     */
    public PanelTextFieldLabel(String nombreEtiqueta, int tamanioCampo) {
        if (nombreEtiqueta == null)
            nombreEtiqueta = "";

        if (tamanioCampo < 1)
            tamanioCampo = 1;

        jlbEtiqueta = new JLabel(nombreEtiqueta);
        jtfCampo = new JTextField(tamanioCampo);

        add(jlbEtiqueta);
        add(jtfCampo);
    }

    /**
     * Crea un panel que tendrá una etiqueta de tipo {@link JLabel} y una campo de
     * texto de tipo {@link JTextField}.
     * 
     * <ul>
     * <li>
     * Si el tercer parámetro está a true, {@code JTextField} a la izquierda y
     * {@code JLabel} a la derecha.
     * </li>
     * <li>
     * Tamaño por defecto del campo {@code JTextField} será el indicado por
     * el segundo parámetro.
     * </li>
     * </ul>
     * <hr>
     * 
     * @param nombreEtiqueta  {@code String} con el nombre del {@code JLabel}
     * @param tamanioCampo    {@code int} cantidad de columnas del
     *                        {@code JTextField}
     * @param etiquetaDerecha {@code boolean} si está a true el {@code JLabel} se
     *                        pondrá a la derecha del {@code JTextField}
     */

    public PanelTextFieldLabel(String nombreEtiqueta, int tamanioCampo, boolean etiquetaDerecha) {
        if (nombreEtiqueta == null)
            nombreEtiqueta = "";

        if (tamanioCampo < 1)
            tamanioCampo = 1;

        jlbEtiqueta = new JLabel(nombreEtiqueta);
        jtfCampo = new JTextField(tamanioCampo);

        if (etiquetaDerecha) {
            add(jtfCampo);
            add(jlbEtiqueta);
        } else {
            add(jtfCampo);
            add(jlbEtiqueta);
        }
    }

    /**
     * Crea un panel que tendrá una etiqueta de tipo {@link JLabel} y una campo de
     * texto de tipo {@link JTextField}.
     * 
     * <ul>
     * <li>
     * Etiqueta {@code JLabel} a la izquierda y campo {@code JTextField} a la
     * derecha.
     * </li>
     * <li>
     * Tamaño por defecto del campo {@code JTextField} será el indicado por
     * el segundo parámetro.
     * </li>
     * <li>
     * Se le asignará un tamaño de margen al {@code JTextField}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param nombreEtiqueta {@code String} con el nombre del {@code JLabel}
     * @param tamanioCampo   {@code int} cantidad de columnas del {@code JTextField}
     * @param marginTop      {@code int} margen interno superior del
     *                       {@code JTextField}
     * @param marginLeft     {@code int} margen interno izquierdo del
     *                       {@code JTextField}
     * @param marginBottom   {@code int} margen interno inferior del
     *                       {@code JTextField}
     * @param marginRight    {@code int} margen interno derecho del
     *                       {@code JTextField}
     */
    public PanelTextFieldLabel(String nombreEtiqueta, int tamanioCampo,
            int marginTop, int marginLeft, int marginBottom, int marginRight) {
        if (nombreEtiqueta == null)
            nombreEtiqueta = "";

        if (tamanioCampo < 1)
            tamanioCampo = 1;

        if (marginTop < 0)
            marginTop = 0;

        if (marginLeft < 0)
            marginLeft = 0;

        if (marginBottom < 0)
            marginBottom = 0;

        if (marginRight < 0)
            marginRight = 0;

        jlbEtiqueta = new JLabel(nombreEtiqueta);
        jtfCampo = new JTextField(tamanioCampo);
        jtfCampo.setMargin(new Insets(marginTop, marginLeft, marginBottom, marginRight));

        add(jlbEtiqueta);
        add(jtfCampo);
    }

    /**
     * Crea un panel que tendrá una etiqueta de tipo {@link JLabel} y una campo de
     * texto de tipo {@link JTextField}.
     * 
     * <ul>
     * <li>
     * Si el tercer parámetro está a true, {@code JTextField} a la izquierda y
     * {@code JLabel} a la derecha.
     * </li>
     * <li>
     * Tamaño por defecto del campo {@code JTextField} será el indicado por
     * el segundo parámetro.
     * </li>
     * <li>
     * Se le asignará un tamaño de margen al {@code JTextField}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param nombreEtiqueta  {@code String} con el nombre del {@code JLabel}
     * @param tamanioCampo    {@code int} cantidad de columnas del
     *                        {@code JTextField}
     * @param marginTop       {@code int} margen interno superior del
     *                        {@code JTextField}
     * @param marginLeft      {@code int} margen interno izquierdo del
     *                        {@code JTextField}
     * @param marginBottom    {@code int} margen interno inferior del
     *                        {@code JTextField}
     * @param marginRight     {@code int} margen interno derecho del
     *                        {@code JTextField}
     * @param etiquetaDerecha {@code boolean} si está a true el {@code JLabel} se
     *                        pondrá a la derecha del {@code JTextField}
     */
    public PanelTextFieldLabel(String nombreEtiqueta, int tamanioCampo,
            int marginTop, int marginLeft, int marginBottom, int marginRight, boolean etiquetaDerecha) {
        if (nombreEtiqueta == null)
            nombreEtiqueta = "";

        if (tamanioCampo < 1)
            tamanioCampo = 1;

        if (marginTop < 0)
            marginTop = 0;

        if (marginLeft < 0)
            marginLeft = 0;

        if (marginBottom < 0)
            marginBottom = 0;

        if (marginRight < 0)
            marginRight = 0;

        jlbEtiqueta = new JLabel(nombreEtiqueta);
        jtfCampo = new JTextField(tamanioCampo);
        jtfCampo.setMargin(new Insets(marginTop, marginLeft, marginBottom, marginRight));

        if (etiquetaDerecha) {
            add(jtfCampo);
            add(jlbEtiqueta);
        } else {
            add(jtfCampo);
            add(jlbEtiqueta);
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo jtfCampo
     * <pre>
     * private JTextField jtfCampo;
     * </pre>
     * 
     * @return el campo {@code JTextField}
     */
    public JTextField getJtfCampo() {
        return jtfCampo;
    }

    /**
     * Devuelve el valor del atributo jlbEtiqueta
     * <pre>
     * private JLabel jlbEtiqueta;
     * </pre>
     * 
     * @return el campo {@code JLabel}
     */
    public JLabel getJlbEtiqueta() {
        return jlbEtiqueta;
    }

    /* ------------------------------ Manejar texto ----------------------------- */
    public void addTexto(String texto) {
        jtfCampo.setText(jtfCampo.getText() + texto);
    }

    public void eliminarTexto() {
        if (jtfCampo.getText().length() > 0)
            jtfCampo.setText(jtfCampo.getText().substring(0, jtfCampo.getText().length() - 1));
    }

    public void limpiarTexto() {
        jtfCampo.setText("");
    }
}
