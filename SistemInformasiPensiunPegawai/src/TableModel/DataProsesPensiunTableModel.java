/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a9uszT
 */
public class DataProsesPensiunTableModel extends AbstractTableModel {

    private List<PNS> stock = new ArrayList<PNS>();

    public DataProsesPensiunTableModel(List<PNS> KS) {
        this.stock = KS;
    }

    public int getRowCount() {
        return stock.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        PNS k = stock.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getNip_baru();
            case 1:
                return k.getNama_pns();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIP";
            case 1:
                return "Nama Lengkap";
            default:
                return "";
        }
    }
}
