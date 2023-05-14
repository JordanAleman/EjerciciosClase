package InterfazGráfica;

import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTextFieldLabel extends JPanel {
    private JTextField txtCampo;
    private JLabel lblEtiqueta;

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

        lblEtiqueta = new JLabel(nombreEtiqueta);
        txtCampo = new JTextField(20);

        add(lblEtiqueta);
        add(txtCampo);
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

        lblEtiqueta = new JLabel(nombreEtiqueta);
        txtCampo = new JTextField(20);

        if (etiquetaDerecha) {
            add(txtCampo);
            add(lblEtiqueta);
        } else {
            add(txtCampo);
            add(lblEtiqueta);
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

        lblEtiqueta = new JLabel(nombreEtiqueta);
        txtCampo = new JTextField(tamanioCampo);

        add(lblEtiqueta);
        add(txtCampo);
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

        lblEtiqueta = new JLabel(nombreEtiqueta);
        txtCampo = new JTextField(tamanioCampo);

        if (etiquetaDerecha) {
            add(txtCampo);
            add(lblEtiqueta);
        } else {
            add(txtCampo);
            add(lblEtiqueta);
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

        lblEtiqueta = new JLabel(nombreEtiqueta);
        txtCampo = new JTextField(tamanioCampo);
        txtCampo.setMargin(new Insets(marginTop, marginLeft, marginBottom, marginRight));

        add(lblEtiqueta);
        add(txtCampo);
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

        lblEtiqueta = new JLabel(nombreEtiqueta);
        txtCampo = new JTextField(tamanioCampo);
        txtCampo.setMargin(new Insets(marginTop, marginLeft, marginBottom, marginRight));

        if (etiquetaDerecha) {
            add(txtCampo);
            add(lblEtiqueta);
        } else {
            add(txtCampo);
            add(lblEtiqueta);
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo txtCampo
     * <pre>
     * private JTextField txtCampo;
     * </pre>
     * 
     * @return el campo {@code JTextField}
     */
    public JTextField getTxtCampo() {
        return txtCampo;
    }

    /**
     * Devuelve el valor del atributo lblEtiqueta
     * <pre>
     * private JLabel lblEtiqueta;
     * </pre>
     * 
     * @return el campo {@code JLabel}
     */
    public JLabel getLblEtiqueta() {
        return lblEtiqueta;
    }

    /* ------------------------------ Manejar texto ----------------------------- */
    public void addTexto(String texto) {
        txtCampo.setText(txtCampo.getText() + texto);
    }

    public void eliminarTexto() {
        if (txtCampo.getText().length() > 0)
            txtCampo.setText(txtCampo.getText().substring(0, txtCampo.getText().length() - 1));
    }

    public void limpiarTexto() {
        txtCampo.setText("");
    }
}
