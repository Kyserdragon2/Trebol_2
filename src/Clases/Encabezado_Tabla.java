package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Encabezado_Tabla implements TableCellRenderer {

    Color background;
    Color foreground;
    Font font;
    TableCellRenderer defaultRenderer;

    public Encabezado_Tabla(Color background, Color foreground, TableCellRenderer defaultRenderer, int font_tam) {
        this.background = background;
        this.foreground = foreground;
        this.defaultRenderer = defaultRenderer;
        this.font = new Font("Calibri", Font.BOLD, font_tam);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (comp instanceof JLabel) {
            JLabel label = (JLabel) comp;
            label.setFont(font);
            label.setOpaque(true);
            label.setForeground(foreground);
            label.setBackground(background);
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        }
        return comp;
    }

}
