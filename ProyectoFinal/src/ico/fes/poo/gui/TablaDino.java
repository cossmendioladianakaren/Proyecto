package ico.fes.poo.gui;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TablaDino extends AbstractTableModel {

    private ArrayList<Elementos> data;

    public TablaDino() {
    }

    public TablaDino(ArrayList<Elementos> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnTitle = "";

        switch (columnIndex) {
            case 0:
                columnTitle = "Nombre";
                break;
            case 1:
                columnTitle = "Especie";
                break;
            case 2:
                columnTitle = "Peso";
                break;
            case 3:
                columnTitle = "Tamaño";
                break;
            case 4:
                columnTitle = "Color";
                break;
            case 5:
                columnTitle = "Núm. de patas";
                break;
        }

        return columnTitle;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            case 3:
                return Float.class;
            case 4:
                return String.class;
            case 5:
                return Integer.class;
            default:
                return String.class;
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Elementos tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getNombre();
            case 1:
                return tmp.getEspecie();
            case 2:
                return tmp.getPeso();
            case 3:
                return tmp.getTamanio();
            case 4:
                return tmp.getColor();
            case 5: 
                return tmp.getNumeroDePatas();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Elementos tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setNombre((String) aValue);
                break;
            case 1:
                tmp.setEspecie((String) aValue);
                break;
            case 2:
                tmp.setPeso((float) aValue);
                break;
            case 3:
                tmp.setTamanio((float) aValue);
                break;
            case 4:
                tmp.setColor((String) aValue);
                break;
            case 5:
                tmp.setNumeroDePatas(((Integer) aValue).intValue());
            default:
                throw new AssertionError();
        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addElementos(Elementos nuevoElementos) {
        data.add(nuevoElementos);
        this.fireTableDataChanged();

    }
}
