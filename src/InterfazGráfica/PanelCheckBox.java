package InterfazGráfica;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PanelCheckBox extends JPanel {
    private ArrayList<JCheckBox> jcbCheckBoxLista = new ArrayList<>();
    private JCheckBox jcbCheckBox;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelCheckBox() {
        jcbCheckBox = new JCheckBox();
        add(jcbCheckBox);
    }

    public PanelCheckBox(String etiquetaCheckBox) {
        if (etiquetaCheckBox == null)
            etiquetaCheckBox = "";

        jcbCheckBox = new JCheckBox(etiquetaCheckBox);
        add(jcbCheckBox);

    }

    public PanelCheckBox(String[] listaEtiquetasCheckBox) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1) {
            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                jcbCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));
                add(jcbCheckBoxLista.get(i));
            }
        }
    }

    public PanelCheckBox(String[] listaEtiquetasCheckBox, boolean alineacionVertical) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1 && alineacionVertical) {
            setLayout(new GridLayout(listaEtiquetasCheckBox.length, 1));

            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                jcbCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));
                add(jcbCheckBoxLista.get(i));
            }
        } else
            new PanelCheckBox(listaEtiquetasCheckBox);
    }

    public PanelCheckBox(String[] listaEtiquetasCheckBox, int cualSelected) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1) {
            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                jcbCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                if (cualSelected == i)
                    jcbCheckBoxLista.get(i).setSelected(true);

                add(jcbCheckBoxLista.get(i));
            }
        }
    }

    public PanelCheckBox(String[] listaEtiquetasCheckBox, int cualSelected, boolean alineacionVertical) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1 && alineacionVertical) {
            setLayout(new GridLayout(listaEtiquetasCheckBox.length, 1));

            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                jcbCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                if (cualSelected == i)
                    jcbCheckBoxLista.get(i).setSelected(true);

                add(jcbCheckBoxLista.get(i));
            }
        } else
            new PanelCheckBox(listaEtiquetasCheckBox, cualSelected);
    }

    public PanelCheckBox(String[] listaEtiquetasCheckBox, int[] cualSelected) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1) {
            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                jcbCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                for (int j = 0; j < cualSelected.length; j++) {
                    if (cualSelected[j] == i) {
                        jcbCheckBoxLista.get(i).setSelected(true);
                        break;
                    }
                }

                add(jcbCheckBoxLista.get(i));
            }
        }
    }

    public PanelCheckBox(String[] listaEtiquetasCheckBox, int[] cualSelected, boolean alineacionVertical) {
        if (listaEtiquetasCheckBox.length <= 0)
            new PanelCheckBox();

        if (listaEtiquetasCheckBox.length == 1)
            new PanelCheckBox(listaEtiquetasCheckBox[0]);

        if (listaEtiquetasCheckBox.length > 1 && alineacionVertical) {
            setLayout(new GridLayout(listaEtiquetasCheckBox.length, 1));

            for (int i = 0; i < listaEtiquetasCheckBox.length; i++) {
                jcbCheckBoxLista.add(new JCheckBox(listaEtiquetasCheckBox[i]));

                for (int j = 0; j < cualSelected.length; j++) {
                    if (cualSelected[j] == i) {
                        jcbCheckBoxLista.get(i).setSelected(true);
                        break;
                    }
                }

                add(jcbCheckBoxLista.get(i));
            }
        } else {
            new PanelCheckBox(listaEtiquetasCheckBox, cualSelected);
        }
    }

    /* --------------------------------- Getters -------------------------------- */
    /**
     * Devuelve el valor del atributo jcbCheckBoxLista
     * 
     * <pre>
     * private ArrayList<JCheckBox> jcbCheckBoxLista;
     * </pre>
     * 
     * @return el campo {@code ArrayList<JCheckBox>}
     */
    public ArrayList<JCheckBox> getJcbCheckBoxLista() {
        return jcbCheckBoxLista;
    }

    /**
     * Devuelve el valor del atributo jcbCheckBox
     * 
     * <pre>
     * private JCheckBox jcbCheckBox;
     * </pre>
     * 
     * @return el campo {@code JCheckBox}
     */
    public JCheckBox getJcbCheckBox() {
        return jcbCheckBox;
    }
}
