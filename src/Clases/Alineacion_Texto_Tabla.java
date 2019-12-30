package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        this.font = new Font("Calibri", 3, font_tam);
        this.columna = col;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (value instanceof JButton) {
            JButton btn = (JButton) value;
            if (isSelected) {
                btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btn.setBackground(Color.LIGHT_GRAY);
                btn.setForeground(Color.white);
            } else {
                btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btn.setBackground(Color.white);
                btn.setForeground(Color.black);
            }
            switch (btn.getName()) {
                case "ver":
                    btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png")));
                    break;
                case "aceptar":
                    btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png")));
                    break;
                case "ver3":
                    btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver3.png")));
                    break;
                case "editar":
                    btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edicion.png")));
                    break;
                case "borrar":
                    btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png")));
                    break;
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

        if ((value != null) && (value instanceof Double)) {
            double valor = (double) value;
            NumberFormat formatomoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
            this.setValue(formatomoneda.format(valor));
        }

        if ((value != null) && (value instanceof Date)) {
            String strDate = new SimpleDateFormat("dd-MM-yyyy").format((Date) value);
            this.setText(strDate);
        }

        if (isSelected) {
            this.setBackground(Color.DARK_GRAY);
            this.setForeground(Color.white);
        } else {
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }

        if (table.getValueAt(row, columna).equals("SI")) {
            if (isSelected) {
                this.setBackground(new Color(51, 153, 0));
                this.setForeground(Color.WHITE);

            } else {
                this.setBackground(new Color(153, 204, 0));
                this.setForeground(Color.black);
            }
        } else {
            if (columna == 5 && !table.getValueAt(row, 8).toString().equals("Finalizada")
                    && !table.getValueAt(row, 8).toString().equals("Retirada")
                    && !table.getValueAt(row, 8).toString().equals("Anulada")) {
                if (!table.getValueAt(row, 5).toString().equals("N/A")) {
                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                    Date d2;
                    Date d1 = new Date();
                    String f1 = table.getValueAt(row, 5).toString();
                    try {
                        d2 = formatoDelTexto.parse(f1);
                        int dias = (int) ((d2.getTime() - d1.getTime()) / 86400000);
                        if (dias < 0) {
                            if (isSelected) {
                                this.setBackground(new Color(255, 147, 147));
                                this.setForeground(new Color(0, 0, 0));
                            } else {
                                this.setBackground(new Color(255, 193, 193));
                                this.setForeground(new Color(0, 0, 0));
                            }
                        } else if (dias >= 0 && dias < 3) {
                            if (isSelected) {
                                this.setBackground(new Color(227, 191, 94));
                                this.setForeground(new Color(0, 0, 0));
                            } else {
                                this.setBackground(new Color(255, 226, 147));
                                this.setForeground(new Color(0, 0, 0));
                            }
                        } else {
                            if (isSelected) {
                                this.setBackground(Color.DARK_GRAY);
                                this.setForeground(Color.white);
                            } else {
                                this.setBackground(Color.white);
                                this.setForeground(Color.black);
                            }
                        }
                    } catch (ParseException e) {
                        Logger.getLogger(Alineacion_Texto_Tabla.class.getName()).log(Level.SEVERE, null, e);
                    }
                } else {
                    if (!table.getValueAt(row, 4).toString().equals("N/A")) {
                        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                        Date d2;
                        Date d1 = new Date();
                        String f1 = table.getValueAt(row, 4).toString();
                        try {
                            d2 = formatoDelTexto.parse(f1);
                            int dias = (int) ((d2.getTime() - d1.getTime()) / 86400000);
                            if (dias < 0) {
                                if (isSelected) {
                                    this.setBackground(new Color(255, 147, 147));
                                    this.setForeground(new Color(0, 0, 0));
                                } else {
                                    this.setBackground(new Color(255, 193, 193));
                                    this.setForeground(new Color(0, 0, 0));
                                }
                            } else if (dias >= 0 && dias < 3) {
                                if (isSelected) {
                                    this.setBackground(new Color(227, 191, 94));
                                    this.setForeground(new Color(0, 0, 0));
                                } else {
                                    this.setBackground(new Color(255, 226, 147));
                                    this.setForeground(new Color(0, 0, 0));
                                }
                            } else {
                                if (isSelected) {
                                    this.setBackground(new Color(162, 219, 238));
                                    this.setForeground(Color.black);
                                } else {
                                    this.setBackground(Color.white);
                                    this.setForeground(Color.black);
                                }
                            }
                        } catch (ParseException e) {
                            Logger.getLogger(Alineacion_Texto_Tabla.class.getName()).log(Level.SEVERE, null, e);
                        }
                    } else {
                        if (isSelected) {
                            this.setBackground(Color.DARK_GRAY);
                            this.setForeground(Color.white);
                        } else {
                            this.setBackground(Color.white);
                            this.setForeground(Color.black);
                        }
                    }
                }
            }
        }
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        if (value instanceof String) {
            switch (table.getValueAt(row, columna).toString()) {
                case "Finalizada":
                    if (isSelected) {
                        this.setBackground(new Color(0, 122, 40));
                        this.setForeground(new Color(211, 244, 184));
                    } else {
                        this.setBackground(new Color(224, 240, 177));
                        this.setForeground(new Color(37, 112, 0));
                    }
                    break;
                case "Creación":
                case "Corrección":
                case "Gestión":
                    if (isSelected) {
                        this.setBackground(new Color(102, 76, 0));
                        this.setForeground(new Color(255, 233, 168));
                    } else {
                        this.setBackground(new Color(227, 191, 94));
                        this.setForeground(new Color(75, 58, 5));
                    }
                    break;
                case "Revisión":
                    if (isSelected) {
                        this.setBackground(new Color(81, 81, 0));
                        this.setForeground(new Color(194, 221, 0));
                    } else {
                        this.setBackground(new Color(194, 221, 0));
                        this.setForeground(new Color(81, 81, 0));
                    }
                    break;
                case "Contabilizar":
                    if (isSelected) {
                        this.setBackground(new Color(0, 64, 163));
                        this.setForeground(new Color(214, 230, 255));
                    } else {
                        this.setBackground(new Color(132, 181, 255));
                        this.setForeground(new Color(0, 64, 163));
                    }
                    break;
                case "Por Pagar":
                    if (isSelected) {
                        this.setBackground(new Color(102, 0, 153));
                        this.setForeground(new Color(223, 209, 255));
                    } else {
                        this.setBackground(new Color(196, 168, 255));
                        this.setForeground(new Color(102, 0, 153));
                    }
                    break;
                case "Sin Asignar":
                    this.setBackground(new Color(242, 88, 5));
                    this.setForeground(Color.WHITE);
                    break;
                case "Retirada":
                case "Anulada":
                case "Rechazada":
                    if (isSelected) {
                        this.setBackground(new Color(168, 0, 0));
                        this.setForeground(new Color(255, 211, 211));
                    } else {
                        this.setBackground(new Color(255, 193, 193));
                        this.setForeground(new Color(168, 0, 0));
                    }
                    break;
                case "Programada":
                    if (isSelected) {
                        this.setBackground(new Color(0, 72, 96));
                        this.setForeground(new Color(112, 219, 255));
                    } else {
                        this.setBackground(new Color(162, 219, 238));
                        this.setForeground(new Color(0, 72, 96));
                    }
                    break;
                case "Aprobación":
                case "Aprobación Area":
                    if (isSelected) {
                        this.setBackground(new Color(119, 55, 23));
                        this.setForeground(new Color(255, 224, 209));
                    } else {
                        this.setBackground(new Color(233, 177, 149));
                        this.setForeground(new Color(119, 55, 23));
                    }
                    break;
                case "TV":
                case "CE":
                case "TB":
                case "Recepción por Compras":
                case "Recepción de Servicios":
                case "Orden de Compra":
                case "Orden de Servicio":
                    if (isSelected) {
                        this.setBackground(new Color(162, 219, 238));
                        this.setForeground(Color.black);
                    } else {
                        this.setBackground(Color.white);
                        this.setForeground(Color.black);
                    }
                    break;
                default:
                    break;
            }
        }
        this.setFont(font);
        return comp;
    }
}
