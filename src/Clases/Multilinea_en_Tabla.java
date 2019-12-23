package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public Multilinea_en_Tabla(int col, int font_tam) {
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

        if (isSelected) {
            this.setBackground(Color.DARK_GRAY);
            this.setForeground(Color.white);
        } else {
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }

        if (value instanceof String) {
            switch (table.getValueAt(row, columna).toString()) {
                case "Finalizada":
                    if (isSelected) {
                        this.setBackground(new Color(0, 122, 40));
                        this.setForeground(new Color(211, 244, 184));
                    } else {
                        this.setBackground(new Color(174, 235, 124));
                        this.setForeground(new Color(0, 122, 40));
                    }
                    break;
                case "Creación":
                case "Gestión":
                    if (isSelected) {
                        this.setBackground(new Color(102, 76, 0));
                        this.setForeground(new Color(255, 233, 168));
                    } else {
                        this.setBackground(new Color(255, 220, 117));
                        this.setForeground(new Color(102, 76, 0));
                    }
                    break;
                case "Revisión":
                    if (isSelected) {
                        this.setBackground(new Color(81, 81, 0));
                        this.setForeground(new Color(223, 223, 179));
                    } else {
                        this.setBackground(new Color(193, 193, 0));
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
                case "Aprob. Area":
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
            if (table.getColumnCount() >= 8) {
                if (!table.getValueAt(row, 8).toString().equals("Finalizada")
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
                                    this.setBackground(new Color(168, 0, 0));
                                    this.setForeground(new Color(255, 255, 255));
                                } else {
                                    this.setBackground(new Color(255, 193, 193));
                                    this.setForeground(new Color(0, 0, 0));
                                }
                            } else if (dias >= 0 && dias < 3) {
                                if (isSelected) {
                                    this.setBackground(new Color(209, 155, 0));
                                    this.setForeground(new Color(0, 0, 0));
                                } else {
                                    this.setBackground(new Color(255, 220, 117));
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
                            Logger.getLogger(Multilinea_en_Tabla.class.getName()).log(Level.SEVERE, null, e);
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
                                        this.setBackground(new Color(168, 0, 0));
                                        this.setForeground(new Color(255, 255, 255));
                                    } else {
                                        this.setBackground(new Color(255, 193, 193));
                                        this.setForeground(new Color(0, 0, 0));
                                    }
                                } else if (dias >= 0 && dias < 3) {
                                    if (isSelected) {
                                        this.setBackground(new Color(209, 155, 0));
                                        this.setForeground(new Color(0, 0, 0));
                                    } else {
                                        this.setBackground(new Color(255, 220, 117));
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
                                Logger.getLogger(Multilinea_en_Tabla.class.getName()).log(Level.SEVERE, null, e);
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
                    }
                }
            }

        }

        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.setFont(font);
        return this;
    }

    private void adjustRowHeight(JTable table, int row, int column) {
        int cWidth = table.getTableHeader().getColumnModel().getColumn(column).getWidth();
        setSize(new Dimension(cWidth, 1000));
        int prefH = getPreferredSize().height + 2;
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
