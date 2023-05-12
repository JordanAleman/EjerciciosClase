package InterfazGráfica;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelRadioButton extends JPanel {
    private ArrayList<JRadioButton> jrbRadioButtonsLista = new ArrayList<>();
    private ArrayList<ButtonGroup> btgRadioButtonLista = new ArrayList<>();
    private ArrayList<Component> struts = new ArrayList<>();

    private JRadioButton jrbRadioButton;
    private ButtonGroup btgRadioButton;

    /* ------------------------------- Constructor ------------------------------ */
    /**
     * Crea un panel con un RadioButton de tipo {@link JRadioButton} dentro de un
     * ButtonGroup del tipo {@link ButtonGroup}
     * 
     * <pre>
     * public PanelRadioButton() {
     *     btgRadioButton = new ButtonGroup();
     *     jrbRadioButton = new JRadioButton();
     * 
     *     btgRadioButton.add(jrbRadioButton);
     *     add(jrbRadioButton);
     * }
     * </pre>
     * 
     * @apiNote El {@code JRadioButton} se crea sin etiqueta
     */
    public PanelRadioButton() {
        btgRadioButton = new ButtonGroup();
        jrbRadioButton = new JRadioButton();

        btgRadioButton.add(jrbRadioButton);
        add(jrbRadioButton);
    }

    /**
     * Crea un panel con un RadioButton de tipo {@link JRadioButton} con una
     * etiqueta pasada por parámetro dentro de un
     * ButtonGroup del tipo {@link ButtonGroup}
     * 
     * @param etiquetaRadioButton {@code String} nombre de la etiqueta del
     *                            {@code JRadioButton}
     */
    public PanelRadioButton(String etiquetaRadioButton) {
        if (etiquetaRadioButton == null)
            etiquetaRadioButton = "";

        btgRadioButton = new ButtonGroup();
        jrbRadioButton = new JRadioButton(etiquetaRadioButton);

        btgRadioButton.add(jrbRadioButton);
        add(jrbRadioButton);
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de RadioButton de
     * tipo {@link JRadioButton} dentro de un
     * ButtonGroup del tipo {@link ButtonGroup}
     * 
     * @param cantidadRadioButtons {@code int} cantidad de {@code JRadioButton}
     *                             dentro del {@code ButtonGroup}
     * @apiNote Los {@code JRadioButton} se crean sin etiqueta
     */
    public PanelRadioButton(int cantidadRadioButtons) {
        if (cantidadRadioButtons <= 1)
            new PanelRadioButton();
        else {
            btgRadioButton = new ButtonGroup();

            for (int i = 0; i < cantidadRadioButtons; i++) {
                jrbRadioButtonsLista.add(new JRadioButton());
                btgRadioButton.add(jrbRadioButtonsLista.get(i));
                add(jrbRadioButtonsLista.get(i));
            }
        }
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de RadioButton de
     * tipo {@link JRadioButton} dentro de un
     * ButtonGroup del tipo {@link ButtonGroup}
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JRadioButton} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JRadioButton} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JRadioButton} sin etiqueta dentro de un {@code ButtonGroup}
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JRadioButton}
     * con etiqueta igual al único contenido del array dentro de un
     * {@code ButtonGroup}
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JRadioButton} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array. Todo se añadirá a un {@code ButtonGroup}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasRadioButtons {@code String[]} array de etiquetas para
     *                                   los {@code JRadioButton}
     */
    public PanelRadioButton(String[] listaEtiquetasRadioButtons) {
        if (listaEtiquetasRadioButtons.length <= 0)
            new PanelRadioButton();

        if (listaEtiquetasRadioButtons.length == 1)
            new PanelRadioButton(listaEtiquetasRadioButtons[0]);

        if (listaEtiquetasRadioButtons.length > 1) {
            btgRadioButton = new ButtonGroup();

            for (int i = 0; i < listaEtiquetasRadioButtons.length; i++) {
                jrbRadioButtonsLista.add(new JRadioButton(listaEtiquetasRadioButtons[i]));
                btgRadioButton.add(jrbRadioButtonsLista.get(i));
                add(jrbRadioButtonsLista.get(i));
            }
        }
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de RadioButton de
     * tipo {@link JRadioButton} dentro de un ButtonGroup del tipo
     * {@link ButtonGroup}.
     * Tiene un segundo parámetro que indica la alineación de los botones
     * {@code JRadioButton}
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JRadioButton} que se crean está definido por el tamaño
     * del array que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JRadioButton} son cada uno de los valores del
     * array pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con el array pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño del array es menor o igual a 0</b> se creará un simple
     * {@code JRadioButton} sin etiqueta dentro de un {@code ButtonGroup}
     * </li>
     * <li>
     * Si el <b>tamaño del array es igual a 1</b> se creará un simple
     * {@code JRadioButton}
     * con etiqueta igual al único contenido del array dentro de un
     * {@code ButtonGroup}
     * </li>
     * <li>
     * Si el <b>tamaño del array es superior a 1</b> se creará una lista de
     * {@code JRadioButton} igual al tamaño del array, cada uno con el nombre de
     * cada posición del array. Todo se añadirá a un {@code ButtonGroup}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasRadioButtons {@code String[]} array de etiquetas para
     *                                   los {@code JRadioButton}
     * @param alineacionVertical         {@code boolean} si true entonces la
     *                                   alineación de los botones será en vertical
     */
    public PanelRadioButton(String[] listaEtiquetasRadioButtons, boolean alineacionVertical) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        if (listaEtiquetasRadioButtons.length <= 0)
            new PanelRadioButton();

        if (listaEtiquetasRadioButtons.length == 1)
            new PanelRadioButton(listaEtiquetasRadioButtons[0]);

        if (listaEtiquetasRadioButtons.length > 1 && alineacionVertical) {
            btgRadioButton = new ButtonGroup();

            for (int i = 0; i < listaEtiquetasRadioButtons.length; i++) {
                jrbRadioButtonsLista.add(new JRadioButton(listaEtiquetasRadioButtons[i]));
                btgRadioButton.add(jrbRadioButtonsLista.get(i));
                add(jrbRadioButtonsLista.get(i));
                struts.add(add(Box.createVerticalStrut(5)));
            }
        } else
            new PanelButton(listaEtiquetasRadioButtons);
    }

    /**
     * Crea un panel con una cierta cantidad pasada por parámetro de RadioButton de
     * tipo {@link JRadioButton} dentro de una cierta cantidad de
     * ButtonGroup del tipo {@link ButtonGroup}
     * 
     * Por parámetro será pasado un array de dos dimensiones que a partir de este
     * momento se estará llamando "matriz"
     * 
     * <ul>
     * <li>
     * La cantidad de {@code JRadioButton} que se crean está definido por el tamaño
     * de la primera dimensión de la matriz que se pasa por parámetro
     * </li>
     * <li>
     * Los etiquetas de los {@code JRadioButton} son cada uno de los valores de la
     * primera dimensión la matriz pasado por parámetro
     * </li>
     * </ul>
     * 
     * <h4>Consideraciones con la matriz pasado por parámetro</h4>
     * <ul>
     * <li>
     * Si el <b>tamaño de la primera dimensión de la matriz es menor o igual a 0</b>
     * se creará un simple {@code JRadioButton} sin etiqueta dentro de un
     * {@code ButtonGroup}
     * </li>
     * <li>
     * Si el <b>tamaño de la primera dimensión de la matriz es igual a 1</b> se
     * creará un simple {@code JRadioButton} con etiqueta igual al único contenido
     * de la matriz dentro de un {@code ButtonGroup}
     * </li>
     * <li>
     * <p>
     * Si el <b>tamaño de la primera dimensión de la matriz es superior a 1</b> se
     * creará una lista de {@code JRadioButton} igual al tamaño de la matriz, cada
     * uno con el nombre de cada posición de la matriz.
     * </p>
     * <p>
     * La segunda dimensión de la matriz define la cantidad de {@code JRadioButton}
     * que se irán añadiendo a una lista de {@code ButtonGroup}. Por ejemplo
     * </p>
     * 
     * <pre>
     * String[][] ejemploMatriz = new String[3][];
     * ejemploMatriz[0] = new String[] { "A", "B", "C" };
     * ejemploMatriz[1] = new String[] { "D", "E" };
     * ejemploMatriz[2] = new String[] { "F", "G", "H", "I", "J" };
     * </pre>
     * 
     * Donde tendríamos 10 {@code JRadioButton} y 3 {@code ButtonGroup}
     * </li>
     * </ul>
     * <hr>
     * 
     * @param listaEtiquetasRadioButtons {@code String[][]} matriz de etiquetas para
     *                                   los {@code JRadioButton} y de grupos
     *                                   {@code ButtonGroup}
     */
    public PanelRadioButton(String[][] listaEtiquetasRadioButtons) {
        System.out.println(listaEtiquetasRadioButtons.length);
        if (listaEtiquetasRadioButtons.length <= 0)
            new PanelRadioButton();

        if (listaEtiquetasRadioButtons.length == 1)
            new PanelRadioButton(listaEtiquetasRadioButtons[0]);

        if (listaEtiquetasRadioButtons.length > 1) {
            int recorridoLista = 0;

            for (int i = 0; i < listaEtiquetasRadioButtons.length; i++) {
                btgRadioButtonLista.add(new ButtonGroup());

                for (int j = 0,
                        k = recorridoLista; k < listaEtiquetasRadioButtons[i].length + recorridoLista; j++, k++) {
                    jrbRadioButtonsLista.add(new JRadioButton(listaEtiquetasRadioButtons[i][j]));
                    btgRadioButtonLista.get(i).add(jrbRadioButtonsLista.get(k));
                    add(jrbRadioButtonsLista.get(k));
                }

                recorridoLista += listaEtiquetasRadioButtons[i].length;
            }

        }
    }

    /* --------------------------------- Getter --------------------------------- */
    /**
     * Devuelve el valor del atributo jrbRadioButtonsLista
     * 
     * <pre>
     * private ArrayList<JRadioButton> jrbRadioButtonsLista;
     * </pre>
     * 
     * @return el campo {@code ArrayList<JRadioButton>}
     */
    public ArrayList<JRadioButton> getJrdRadioButtonsLista() {
        return jrbRadioButtonsLista;
    }

    /**
     * Devuelve el valor del atributo btgRadioButtonLista
     * 
     * <pre>
     * private ArrayList<ButtonGroup> btgRadioButtonLista;
     * </pre>
     * 
     * @return el campo {@code ArrayList<ButtonGroup>}
     */
    public ArrayList<ButtonGroup> getBtgRadioButtonLista() {
        return btgRadioButtonLista;
    }

    /**
     * Devuelve el valor del atributo struts que contiene el tamaño de la distancia
     * que hay entre cada {@code JRadioButton} en la alineación vertical
     * 
     * <pre>
     * private ArrayList<Component> struts;
     * </pre>
     * 
     * @return el campo {@code ArrayList<Component>}
     */
    public ArrayList<Component> getStruts() {
        return struts;
    }

    /**
     * Devuelve el valor del atributo jrbRadioButton
     * 
     * <pre>
     * private JRadioButton jrbRadioButton;
     * </pre>
     * 
     * @return el campo {@code JRadioButton}
     */
    public JRadioButton getJrdRadioButton() {
        return jrbRadioButton;
    }

    /**
     * Devuelve el valor del atributo btgRadioButton
     * 
     * <pre>
     * private ButtonGroup btgRadioButton;
     * </pre>
     * 
     * @return el campo {@code ButtonGroup}
     */
    public ButtonGroup getBtgRadioButton() {
        return btgRadioButton;
    }

    /* ---------------------------- Modificar struts ---------------------------- */
    /**
     * Los "struts" indican el tamaño de separación que habrá entre cada
     * {@code JRadioButton} cuando la alineación es vertical.
     * 
     * <pre>
     * private ArrayList<Component> struts
     * .
     * .
     * .
     * struts.add(add(Box.createVerticalStrut(5)));
     * </pre>
     * 
     * Ese tamaño de separación se cambiará según el valor indicado por parámetro
     * 
     * @param nuevoTamanio {@code int} nuevo tamaño de separación vertical en
     *                     píxeles
     */
    public void modificarStruts(int nuevoTamanio) {
        if (nuevoTamanio <= 0)
            return;

        for (Component strut : struts) {
            Dimension newSize = new Dimension(strut.getPreferredSize().width, nuevoTamanio);
            strut.setMinimumSize(newSize);
            strut.setMaximumSize(newSize);
            strut.setPreferredSize(newSize);
        }
    }
}
