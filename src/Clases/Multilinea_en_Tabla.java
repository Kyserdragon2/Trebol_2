package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

public class Multilinea_en_Tabla extends JTextArea implements TableCellRenderer {

    private final List<List<Integer>> rowColHeight = new ArrayList<>();
    private static final int MAX_LEN = 265;
    int columna;
    Font font;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Multilinea_en_Tabla(int col,int font_tam) {
        super();
        setLineWrap(true);
        setWrapStyleWord(true);
        setOpaque(true);
        this.font = new Font("Calibri", Font.BOLD, font_tam);
        this.columna = col;
    }

    protected String shortener(String str) {
        if (str.length() < MAX_LEN) {
            return str;
        } else {
            return str.substring(0, MAX_LEN - 10) + "...";
        }
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if (hasFocus) {
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
            if (table.isCellEditable(row, column)) {
                setForeground(UIManager.getColor("Table.focusCellForeground"));
                setBackground(UIManager.getColor("Table.focusCellBackground"));
            }
        } else {
            setBorder(new EmptyBorder(1, 2, 1, 2));
        }
        if (value != null) {
            setText(shortener(value.toString()));
        } else {
            setText("");
        }
        if (value instanceof JButton) {
            JButton btn = (JButton) value;
            return btn;
        }
        adjustRowHeight(table, row, columna);

        if (row % 2 != 0) {
            if (isSelected) {
                this.setBackground(new Color(138,193,213));
                this.setForeground(Color.black);
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            } else {
                this.setBackground(new Color(183,217,229));
                this.setForeground(Color.black);
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            }
        } else {
            if (isSelected) {
                this.setBackground(new Color(219, 219, 219));
                this.setForeground(Color.black);
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            } else {
                this.setBackground(Color.white);
                this.setForeground(Color.black);
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            }
        }
        this.setFont(font);
        return this;
    }

    private void adjustRowHeight(JTable table, int row, int column) {
        int cWidth = table.getTableHeader().getColumnModel().getColumn(column).getWidth();
        setSize(new Dimension(cWidth, 1000));
        int prefH = getPreferredSize().height+2;
        while (rowColHeight.size() <= row) {
            rowColHeight.add(new ArrayList<>(column));
        }
        List<Integer> colHeights = rowColHeight.get(row);
        while (colHeights.size() <= column) {
            colHeights.add(0);
        }
        colHeights.set(column, prefH);
        int maxH = prefH;
        for (Integer colHeight : colHeights) {
            if (colHeight > maxH) {
                maxH = colHeight;
            }
        }
        if (table.getRowHeight(row) != maxH) {
            table.setRowHeight(row, maxH);
        }
    }
}
