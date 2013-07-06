/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.PNS;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a9uszT
 */
public class CariPegawaiTableModel extends AbstractTableModel {

    private List<PNS> stock = new ArrayList<PNS>();

    public CariPegawaiTableModel(List<PNS> KS) {
        this.stock = KS;
    }

    public int getRowCount() {
        return stock.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        PNS k = stock.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getNip_lama();
            case 1:
                return k.getNip_baru();
            case 2:
                return k.getNama_pns();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIP lama";
            case 1:
                return "NIP baru";
            case 2:
                return "Nama Lengkap";
            default:
                return "";
        }
    }
}
