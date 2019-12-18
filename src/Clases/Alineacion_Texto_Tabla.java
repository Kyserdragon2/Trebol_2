package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Alineacion_Texto_Tabla extends DefaultTableCellRenderer {

    Color background;
    Color foreground;
    Font font;
    int columna;
    String alineacion;

    public Alineacion_Texto_Tabla(String align, Color background, Color foreground, int col, int font_tam) {
        super();
        this.alineacion = align;
        this.background = background;
        this.foreground = foreground;
        this.font = new Font("Calibri", Font.BOLD, font_tam);
        this.columna = col;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (value instanceof JButton) {
            JButton btn = (JButton) value;
            if (row % 2 != 0) {
                switch (btn.getName()) {
                    case "ver":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(138, 193, 213));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(183, 217, 229));
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "aceptar":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(138, 193, 213));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(183, 217, 229));
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "ver3":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver3.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(138, 193, 213));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(183, 217, 229));
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "editar":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edicion.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(138, 193, 213));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(183, 217, 229));
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "borrar":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(138, 193, 213));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(183, 217, 229));
                            btn.setForeground(Color.black);
                        }
                        break;
                    default:
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(138, 193, 213));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(183, 217, 229));
                            btn.setForeground(Color.black);
                        }
                        break;
                }
            } else {
                switch (btn.getName()) {
                    case "ver":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(219, 219, 219));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(Color.white);
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "aceptar":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(219, 219, 219));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(Color.white);
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "ver3":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver3.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(219, 219, 219));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(Color.white);
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "editar":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edicion.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(219, 219, 219));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(Color.white);
                            btn.setForeground(Color.black);
                        }
                        break;
                    case "borrar":
                        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png")));
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(219, 219, 219));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(Color.white);
                            btn.setForeground(Color.black);
                        }
                        break;
                    default:
                        if (isSelected) {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(new Color(219, 219, 219));
                            btn.setForeground(Color.black);
                        } else {
                            btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            btn.setBackground(Color.white);
                            btn.setForeground(Color.black);
                        }
                        break;
                }
            }
            btn.setContentAreaFilled(false);
            btn.setBorderPainted(true);
            btn.setOpaque(true);
            btn.setPreferredSize(new Dimension(40, 19));
            btn.setSize(40, 19);
            btn.setFont(font);
            return btn;
        }

        switch (alineacion) {
            case "derecha":
                this.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                break;
            case "izquierda":
                this.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                break;
            case "centrado":
                this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                break;
            default:
                this.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                break;
        }

        if (row % 2 != 0) {
            if (isSelected) {
                this.setBackground(new Color(138, 193, 213));
                this.setForeground(Color.black);
                this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            } else {
                this.setBackground(new Color(183, 217, 229));
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

        if ((value != null) && (value instanceof Double)) {
            double valor = (double) value;
            NumberFormat formatomoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
            this.setValue(formatomoneda.format(valor));
        }

        if ((value != null) && (value instanceof Date)) {
            String strDate = new SimpleDateFormat("dd-MM-yyyy").format((Date) value);
            this.setText(strDate);
        }

        this.setFont(font);
        return comp;
    }
}
