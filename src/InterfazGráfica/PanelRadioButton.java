package InterfazGráfica;

import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelRadioButton extends JPanel {
    private ArrayList<JRadioButton> jrdRadioButtonsLista = new ArrayList<>();
    private ArrayList<ButtonGroup> btgRadioButtonLista = new ArrayList<>();

    private JRadioButton jrdRadioButton;
    private ButtonGroup btgRadioButton;

    /* ------------------------------- Constructor ------------------------------ */
    public PanelRadioButton() {
        btgRadioButton = new ButtonGroup();
        jrdRadioButton = new JRadioButton();

        btgRadioButton.add(jrdRadioButton);
        add(jrdRadioButton);
    }

    public PanelRadioButton(String etiquetaRadioButton) {
        if (etiquetaRadioButton == null)
            etiquetaRadioButton = "";

        btgRadioButton = new ButtonGroup();
        jrdRadioButton = new JRadioButton(etiquetaRadioButton);

        btgRadioButton.add(jrdRadioButton);
        add(jrdRadioButton);
    }

    public PanelRadioButton(int cantidadRadioButtons) {
        if (cantidadRadioButtons <= 1)
            new PanelRadioButton();
        else {
            btgRadioButton = new ButtonGroup();

            for (int i = 0; i < cantidadRadioButtons; i++) {
                jrdRadioButtonsLista.add(new JRadioButton());
                btgRadioButton.add(jrdRadioButtonsLista.get(i));
                add(jrdRadioButtonsLista.get(i));
            }
        }
    }

    public PanelRadioButton(String[] listaEtiquetasRadioButtons) {
        if (listaEtiquetasRadioButtons.length <= 0)
            new PanelRadioButton();

        if (listaEtiquetasRadioButtons.length == 1)
            new PanelRadioButton(listaEtiquetasRadioButtons[0]);

        if (listaEtiquetasRadioButtons.length > 1) {
            btgRadioButton = new ButtonGroup();

            for (int i = 0; i < listaEtiquetasRadioButtons.length; i++) {
                jrdRadioButtonsLista.add(new JRadioButton(listaEtiquetasRadioButtons[i]));
                btgRadioButton.add(jrdRadioButtonsLista.get(i));
                add(jrdRadioButtonsLista.get(i));
            }
        }
    }

    public PanelRadioButton(String[] listaEtiquetasRadioButtons, boolean alineacionVertical) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        if (listaEtiquetasRadioButtons.length <= 0)
            new PanelRadioButton();

        if (listaEtiquetasRadioButtons.length == 1)
            new PanelRadioButton(listaEtiquetasRadioButtons[0]);

        if (listaEtiquetasRadioButtons.length > 1 && alineacionVertical) {
            btgRadioButton = new ButtonGroup();

            for (int i = 0; i < listaEtiquetasRadioButtons.length; i++) {
                jrdRadioButtonsLista.add(new JRadioButton(listaEtiquetasRadioButtons[i]));
                btgRadioButton.add(jrdRadioButtonsLista.get(i));
                add(jrdRadioButtonsLista.get(i));
                add(Box.createVerticalStrut(5));
            }
        } else 
            new PanelButton(listaEtiquetasRadioButtons);
    }

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

                for (int j = 0, k = recorridoLista; k < listaEtiquetasRadioButtons[i].length + recorridoLista; j++, k++) {
                    jrdRadioButtonsLista.add(new JRadioButton(listaEtiquetasRadioButtons[i][j]));
                    btgRadioButtonLista.get(i).add(jrdRadioButtonsLista.get(k));
                    add(jrdRadioButtonsLista.get(k));
                }

                recorridoLista += listaEtiquetasRadioButtons[i].length;
            }

        }
    }

    /* --------------------------------- Getter --------------------------------- */
    public ArrayList<JRadioButton> getJrdRadioButtonsLista() {
        return jrdRadioButtonsLista;
    }

    public ArrayList<ButtonGroup> getBtgRadioButtonLista() {
        return btgRadioButtonLista;
    }

    public JRadioButton getJrdRadioButton() {
        return jrdRadioButton;
    }

    public ButtonGroup getBtgRadioButton() {
        return btgRadioButton;
    }
}
