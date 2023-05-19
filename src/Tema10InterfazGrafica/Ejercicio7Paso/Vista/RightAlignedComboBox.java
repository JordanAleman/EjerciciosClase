package Tema10InterfazGrafica.Ejercicio7Paso.Vista;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

public class RightAlignedComboBox extends JComboBox<String> {

    public RightAlignedComboBox(String[] items) {
        super(items);
        setRenderer(new RightAlignedCellRenderer());
    }

    private class RightAlignedCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (component instanceof JLabel) {
                ((JLabel) component).setHorizontalAlignment(JLabel.RIGHT);
            }
            return component;
        }
    }
}
