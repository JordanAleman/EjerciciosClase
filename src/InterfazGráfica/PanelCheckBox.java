package InterfazGráfica;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PanelCheckBox extends JPanel {
    private ArrayList<JCheckBox> cbxCheckBoxLista = new ArrayList<>();
    private JCheckBox cbxCheckBox;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un CheckBox de tipo {@link JCheckBox}
     * 
     * <pre>
     * public PanelCheckBox() {
     *     cbxCheckBox = new JCheckBox();
     *     add(cbxCheckBox);
     * }
     * </pre>
     * 
     * @apiNote El {@code JCheckBox} se crea sin etiqueta
     */
    public PanelCheckBox() {
        cbxCheckBox = new JCheckBox();
        add(cbxCheckBox);
    }

    /**
     * Crea un panel con un CheckBox de tipo {@link JCheckBox} con una etiqueta
     * pasada por parámetro
     * 
     * 
     * @param etiquetaCheckBox {@code String} nombre de la etiqueta del
     *                         {@code JCheckBox}
     */
    public PanelCheckBox(String etiquetaCheckBox) {
        if (etiquetaCheckBox == null)
            etiquetaCheckBox = "";

        cbxCheckBox = new JCheckBox(etiquetaCheckBox);
        add(cbxCheckBox);

    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de CheckBox de
     * tipo {@link JCheckBox}
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JCheckBox} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JCheckBox} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JCheckBox} sin etiqueta
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JCheckBox} con etiqueta igual al único contenido del array
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JCheckBox} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasCheckBoxs {@code String[]} array de etiquetas para
     *                                los {@code JCheckBox}
     */
    public PanelCheckBox(String[] listaEtiquetasCheckBox) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1) {
            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                cbxCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));
                add(cbxCheckBoxLista.get(i));
            }
        }
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de CheckBox de
     * tipo {@link JCheckBox}.
     * Tiene un segundo parámetro que indica la alineación de los botones
     * {@code JCheckBox}
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JCheckBox} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JCheckBox} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JCheckBox} sin etiqueta
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JCheckBox} con etiqueta igual al único contenido del array
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JCheckBox} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasCheckBoxs {@code String[]} array de etiquetas para
     *                                los {@code JCheckBox}
     * @param alineacionVertical      {@code boolean} si true entonces la
     *                                alineación de los botones será en vertical
     */
    public PanelCheckBox(String[] listaEtiquetasCheckBox, boolean alineacionVertical) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1 && alineacionVertical) {
            setLayout(new GridLayout(listaEtiquetasCheckBox.length, 1));

            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                cbxCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));
                add(cbxCheckBoxLista.get(i));
            }
        } else
            new PanelCheckBox(listaEtiquetasCheckBox);
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de CheckBox de
     * tipo {@link JCheckBox}.
     * Tiene un segundo parámetro que indica si alguno de los {@code JCheckBox} que
     * se van a crear comienzan directamente seleccionados.
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JCheckBox} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JCheckBox} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JCheckBox} sin etiqueta
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JCheckBox} con etiqueta igual al único contenido del array
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JCheckBox} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasCheckBoxs {@code String[]} array de etiquetas para
     *                                los {@code JCheckBox}
     * @param cualSelected            {@code int} posición del array que indica cual
     *                                {@code JCheckBox} comienza directamente
     *                                seleccionado
     */
    public PanelCheckBox(String[] listaEtiquetasCheckBox, int cualSelected) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if ((listaEtiquetasCheckBox.length <= 0 || listaEtiquetasCheckBox.length == 1) && cualSelected == 0)
            cbxCheckBox.setSelected(true);

        if (listaEtiquetasCheckBox.length > 1) {
            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                cbxCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                if (cualSelected == i)
                    cbxCheckBoxLista.get(i).setSelected(true);

                add(cbxCheckBoxLista.get(i));
            }
        }
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de CheckBox de
     * tipo {@link JCheckBox}.
     * Tiene un segundo parámetro que indica si alguno de los {@code JCheckBox} que
     * se van a crear comienzan directamente seleccionados.
     * Tiene un tercer parámetro que indica la alineación de los botones
     * {@code JCheckBox}
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JCheckBox} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JCheckBox} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JCheckBox} sin etiqueta
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JCheckBox} con etiqueta igual al único contenido del array
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JCheckBox} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasCheckBoxs {@code String[]} array de etiquetas para
     *                                los {@code JCheckBox}
     * @param cualSelected            {@code int} posición del array que indica cual
     *                                {@code JCheckBox} comienza directamente
     *                                seleccionado
     * @param alineacionVertical      {@code boolean} si true entonces la
     *                                alineación de los botones será en vertical
     */
    public PanelCheckBox(String[] listaEtiquetasCheckBox, int cualSelected, boolean alineacionVertical) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if ((listaEtiquetasCheckBox.length <= 0 || listaEtiquetasCheckBox.length == 1) && cualSelected == 0)
            cbxCheckBox.setSelected(true);

        if (listaEtiquetasCheckBox.length > 1 && alineacionVertical) {
            setLayout(new GridLayout(listaEtiquetasCheckBox.length, 1));

            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                cbxCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                if (cualSelected == i)
                    cbxCheckBoxLista.get(i).setSelected(true);

                add(cbxCheckBoxLista.get(i));
            }
        } else
            new PanelCheckBox(listaEtiquetasCheckBox, cualSelected);
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de CheckBox de
     * tipo {@link JCheckBox}.
     * Tiene un segundo parámetro que indica cuales de los {@code JCheckBox} que
     * se van a crear comienzan directamente seleccionados.
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JCheckBox} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JCheckBox} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JCheckBox} sin etiqueta
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JCheckBox} con etiqueta igual al único contenido del array
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JCheckBox} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array
     * </li>
     * </ul>
     * 
     * En cuanto al segundo parámetro no importa si los números se repiten o están
     * fuera de rango. Se evaluarán los números válidos y así se escogerá que
     * {@code JCheckBox} comenzarán directamente seleccionados
     * <hr>
     * 
     * @param listaEtiquetasCheckBoxs {@code String[]} array de etiquetas para
     *                                los {@code JCheckBox}
     * @param cualSelected            {@code int[]} posiciones del array que indica
     *                                cuáles {@code JCheckBox} comienzan
     *                                directamente seleccionados
     */
    public PanelCheckBox(String[] listaEtiquetasCheckBox, int[] cualSelected) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        boolean posicion0 = false;
        for (int i = 0; i < cualSelected.length; i++) {
            if (cualSelected[i] == 0) {
                posicion0 = true;
                break;
            }
        }

        if ((listaEtiquetasCheckBox.length <= 0 || listaEtiquetasCheckBox.length == 1) && posicion0)
            cbxCheckBox.setSelected(true);

        if (listaEtiquetasCheckBox.length > 1) {
            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                cbxCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                for (int j = 0; j < cualSelected.length; j++) {
                    if (cualSelected[j] == i) {
                        cbxCheckBoxLista.get(i).setSelected(true);
                        break;
                    }
                }

                add(cbxCheckBoxLista.get(i));
            }
        }
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de CheckBox de
     * tipo {@link JCheckBox}.
     * Tiene un segundo parámetro que indica cuales de los {@code JCheckBox} que
     * se van a crear comienzan directamente seleccionados.
     * Tiene un tercer parámetro que indica la alineación de los botones
     * {@code JCheckBox}
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JCheckBox} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JCheckBox} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JCheckBox} sin etiqueta
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JCheckBox} con etiqueta igual al único contenido del array
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JCheckBox} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array
     * </li>
     * </ul>
     * 
     * En cuanto al segundo parámetro no importa si los números se repiten o están
     * fuera de rango. Se evaluarán los números válidos y así se escogerá que
     * {@code JCheckBox} comenzarán directamente seleccionados
     * <hr>
     * 
     * @param listaEtiquetasCheckBoxs {@code String[]} array de etiquetas para
     *                                los {@code JCheckBox}
     * @param cualSelected            {@code int[]} posiciones del array que indica
     *                                cuáles {@code JCheckBox} comienzan
     *                                directamente seleccionados
     * @param alineacionVertical      {@code boolean} si true entonces la
     *                                alineación de los botones será en vertical
     */
    public PanelCheckBox(String[] listaEtiquetasCheckBox, int[] cualSelected, boolean alineacionVertical) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        boolean posicion0 = false;
        for (int i = 0; i < cualSelected.length; i++) {
            if (cualSelected[i] == 0) {
                posicion0 = true;
                break;
            }
        }

        if ((listaEtiquetasCheckBox.length <= 0 || listaEtiquetasCheckBox.length == 1) && posicion0)
            cbxCheckBox.setSelected(true);

        if (listaEtiquetasCheckBox.length > 1 && alineacionVertical) {
            setLayout(new GridLayout(listaEtiquetasCheckBox.length, 1));

            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                cbxCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                for (int j = 0; j < cualSelected.length; j++) {
                    if (cualSelected[j] == i) {
                        cbxCheckBoxLista.get(i).setSelected(true);
                        break;
                    }
                }

                add(cbxCheckBoxLista.get(i));
            }
        } else {
            new PanelCheckBox(listaEtiquetasCheckBox, cualSelected);
        }
    }

    /* --------------------------------- Getters -------------------------------- */
    /**
     * Devuelve el valor del atributo cbxCheckBoxLista
     * 
     * <pre>
     * private ArrayList<JCheckBox> cbxCheckBoxLista;
     * </pre>
     * 
     * @return el campo {@code ArrayList<JCheckBox>}
     */
    public ArrayList<JCheckBox> getCbxCheckBoxLista() {
        return cbxCheckBoxLista;
    }

    /**
     * Devuelve el valor del atributo cbxCheckBox
     * 
     * <pre>
     * private JCheckBox cbxCheckBox;
     * </pre>
     * 
     * @return el campo {@code JCheckBox}
     */
    public JCheckBox getCbxCheckBox() {
        return cbxCheckBox;
    }
}
