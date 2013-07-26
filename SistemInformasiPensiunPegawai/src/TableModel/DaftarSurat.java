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
public class DaftarSurat extends AbstractTableModel {

    private List<PNS> stock = new ArrayList<PNS>();

    public DaftarSurat(List<PNS> KS) {
        this.stock = KS;
    }

    public int getRowCount() {
        return stock.size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        PNS k = stock.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getId_SuratCPNS();
            case 1:
                return k.getId_SuratPangkatTerakhir();
            case 2:
                return k.getId_SuratSPTKGTerakhir();
            case 3:
                return k.getId_SuratKarpeg();
            case 4:
                return k.getId_SuratNikah();
            case 5:
                return k.getId_SuratNIPBaru();
            case 6:
                return k.getId_Suratkk();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "SuratCPNS";
            case 1:
                return "SuratPangkatTerakhir";
            case 2:
                return "SuratSPTKGTerakhir";
            case 3:
                return "SuratKarpeg";
            case 4:
                return "SuratNikah";
            case 5:
                return "SuratNIPBaru";
            case 6:
                return "Suratkk";
            default:
                return "";
        }
    }
}
