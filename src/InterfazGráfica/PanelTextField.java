package InterfazGráfica;

import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTextField extends JPanel {
    private ArrayList<JTextField> txtCampoLista = new ArrayList<>();
    private JTextField txtCampo;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un campo de texto de tipo {@link JTextField}.
     * 
     * <pre>
     * public PanelTextField() {
     *     txtCampo = new JTextField(20);
     *     add(txtCampo);
     * }
     * </pre>
     */
    public PanelTextField() {
        txtCampo = new JTextField(20);
        add(txtCampo);
    }

    /**
     * Crear un panel que contiene una campo de tipo {@link JTextField}
     * de tamaño indicado por parámetro
     * 
     * 
     * @param tamanioCampo Tamaño del campo {@code JTextField}
     */
    public PanelTextField(int tamanioCampo) {
        if (tamanioCampo < 1)
            tamanioCampo = 1;

        txtCampo = new JTextField(tamanioCampo);
        add(txtCampo);
    }

    /**
     * Crear un panel que contiene una lista de {@link JTextField}
     * de tamaño indicado por parámetro
     * 
     * <ul>
     * <li>Crear un ArrayList que contiene tantos {@code JTextField}
     * como los indicados por parámetro
     * </li>
     * </ul>
     * 
     * @param tamanioCampo   Tamaño del campo {@code JTextField}
     * @param cantidadCampos Cantidad de {@code JTextField} en el
     *                       ArraList
     */
    public PanelTextField(int tamanioCampo, int cantidadCampos) {
        if (tamanioCampo < 1)
            tamanioCampo = 1;

        if (cantidadCampos < 1)
            cantidadCampos = 1;

        for (int i = 0; i < cantidadCampos; i++) {
            txtCampoLista.add(new JTextField(tamanioCampo));
            add(txtCampoLista.get(i));
        }
    }

    /**
     * Crear un panel que contiene una campo de tipo {@link JTextField}
     * de tamaño indicado por parámetro
     * 
     * <ul>
     * <li>
     * Se le asignará un tamaño de margen al {@code JTextField}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param tamanioCampo Tamaño del campo {@code JTextField}
     * @param marginTop    {@code int} margen interno superior del
     *                     {@code JTextField}
     * @param marginLeft   {@code int} margen interno izquierdo del
     *                     {@code JTextField}
     * @param marginBottom {@code int} margen interno inferior del
     *                     {@code JTextField}
     * @param marginRight  {@code int} margen interno derecho del
     *                     {@code JTextField}
     */
    public PanelTextField(int tamanioCampo,
            int marginTop, int marginLeft, int marginBottom, int marginRight) {

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

        txtCampo = new JTextField(tamanioCampo);
        txtCampo.setMargin(new Insets(marginTop, marginLeft, marginBottom, marginRight));
        add(txtCampo);
    }

    /**
     * Crear un panel que contiene una lista de {@link JTextField}
     * de tamaño indicado por parámetro
     * 
     * <ul>
     * <li>Crear un ArrayList que contiene tantos {@code JTextField}
     * como los indicados por parámetro
     * </li>
     * <li>
     * Se le asignará un tamaño de margen al {@code JTextField}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param tamanioCampo   Tamaño del campo {@code JTextField}
     * @param cantidadCampos Cantidad de {@code JTextField} en el
     *                       ArraList
     * @param marginTop      {@code int} margen interno superior del
     *                       {@code JTextField}
     * @param marginLeft     {@code int} margen interno izquierdo del
     *                       {@code JTextField}
     * @param marginBottom   {@code int} margen interno inferior del
     *                       {@code JTextField}
     * @param marginRight    {@code int} margen interno derecho del
     *                       {@code JTextField}
     */
    public PanelTextField(int tamanioCampo, int cantidadCampos,
            int marginTop, int marginLeft, int marginBottom, int marginRight) {

        if (tamanioCampo < 1)
            tamanioCampo = 1;

        if (cantidadCampos < 1)
            cantidadCampos = 1;

        if (marginTop < 0)
            marginTop = 0;

        if (marginLeft < 0)
            marginLeft = 0;

        if (marginBottom < 0)
            marginBottom = 0;

        if (marginRight < 0)
            marginRight = 0;

        for (int i = 0; i < cantidadCampos; i++) {
            txtCampoLista.add(new JTextField(tamanioCampo));
            txtCampoLista.get(i).setMargin(new Insets(marginTop, marginLeft, marginBottom, marginRight));
            add(txtCampoLista.get(i));
        }
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo txtCampoLista
     * 
     * <pre>
     * private ArrayList<JTextField> txtCampoLista;
     * </pre>
     * 
     * @return el campo {@code ArrayList<JTextField>}
     */
    public ArrayList<JTextField> getTxtCampoLista() {
        return txtCampoLista;
    }

    /**
     * Devuelve el valor del atributo txtCampo
     * 
     * <pre>
     * private JTextField txtCampo;
     * </pre>
     * 
     * @return el campo {@code JTextField}
     */
    public JTextField getTxtCampo() {
        return txtCampo;
    }

    /* ------------------------------ Manejar texto ----------------------------- */
    /**
     * Añade el texto mandado por parámetro al campo del {@code JTextField}
     * 
     * @param texto {@code String} que será mandado
     */
    public void addTexto(String texto) {
        txtCampo.setText(txtCampo.getText() + texto);
    }

    /**
     * Añade el texto mandado por parámetro al campo del
     * {@code ArrayList<JTextField>}
     * 
     * @param texto         {@code String} que será mandado
     * @param posicionCampo {@code int} posición de la lista donde se encuentra el
     *                      {@code JTextField} al que se le quiere pasar el texto
     */
    public void addTexto(String texto, int posicionCampo) {
        if (posicionCampo < 0 || posicionCampo >= txtCampoLista.size())
            return;

        txtCampoLista.get(posicionCampo).setText(txtCampoLista.get(posicionCampo).getText() + texto);
    }

    /**
     * Elimina la última letra del campo del {@code JTextField}
     * 
     */
    public void eliminarTexto() {
        if (txtCampo.getText().length() > 0)
            txtCampo.setText(txtCampo.getText().substring(0, txtCampo.getText().length() - 1));
    }

    /**
     * Elimina el último dígito del campo del {@code JTextField} dentro de la lista
     * que se encuentra en la posición indicada por parámetro
     * 
     * @param posicionCampo {@code int} posición de la lista donde se encuentra el
     *                      {@code JTextField} al que se le quiere eliminar el
     *                      último dígito
     */
    public void eliminarTexto(int posicionCampo) {
        if (posicionCampo < 0 || posicionCampo >= txtCampoLista.size())
            return;

        if (txtCampoLista.get(posicionCampo).getText().length() > 0)
            txtCampoLista.get(posicionCampo).setText(
                    txtCampoLista.get(posicionCampo).getText().substring(
                            0, txtCampoLista.get(posicionCampo).getText().length() - 1));
    }

    /**
     * Elimina todo el texto del campo del {@code JTextField}
     */
    public void limpiarTexto() {
        txtCampo.setText("");
    }

    /**
     * Elimina todo el texto del campo del {@code JTextField} dentro de la lista
     * que se encuentra en la posición indicada por parámetro
     * 
     * @param posicionCampo {@code int} posición de la lista donde se encuentra el
     *                      {@code JTextField} al que se le quiere eliminar todo el
     *                      texto
     * 
     */
    public void limpiarTexto(int posicionCampo) {
        if (posicionCampo < 0 || posicionCampo >= txtCampoLista.size())
            return;

        txtCampoLista.get(posicionCampo).setText("");
    }

    /**
     * Elimina todo el texto de todos los campos del {@code JTextField} que se
     * encuentran en el panel
     * 
     * @param todo {@code boolean} al estar a 'true' se elimina el texto de todos
     *             los campos del panel
     */
    public void limpiarTexto(boolean todo) {
        if (todo) {
            for (JTextField jTextField : txtCampoLista)
                jTextField.setText("");
        }
    }
}
