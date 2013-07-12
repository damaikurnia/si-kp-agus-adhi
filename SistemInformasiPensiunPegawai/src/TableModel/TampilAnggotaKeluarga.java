/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.AnggotaKeluarga;
import Model.PNS;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mich
 */
public class TampilAnggotaKeluarga extends AbstractTableModel {

    private List<AnggotaKeluarga> stock = new ArrayList<AnggotaKeluarga>();

    public TampilAnggotaKeluarga(List<AnggotaKeluarga> KS) {
        this.stock = KS;
    }

    public int getRowCount() {
        return stock.size();
    }

    public int getColumnCount() {
        return 15;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        AnggotaKeluarga k = stock.get(rowIndex);
        int nomor = 0;
        switch (columnIndex) {
            case 0:
                nomor = nomor + 1;
                return nomor;
            case 1:
                return k.getNama_lengkap();
            case 2:
                return k.getNik();
            case 3:
                return k.getJenis_kelamin();
            case 4:
                return k.getTempat_lahir();
            case 5:
                return k.getTanggal_lahir();
            case 6:
                return k.getAgama();
            case 7:
                return k.getPendidikan();
            case 8:
                return k.getPekerjaan();
            case 9:
                return k.getStatus_perkawinan();
            case 10:
                return k.getStatus_hub_keluarga();
            case 11:
                return k.getKewarganegaraan();
            case 12:
                return k.getNo_paspor();
            case 13:
                return k.getNama_ayah();
            case 14:
                return k.getNama_ibu();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No";
            case 1:
                return "Nama Lengkap";
            case 2:
                return "NIK";
            case 3:
                return "JK";
            case 4:
                return "Tempat Lahir";
            case 5:
                return "Tanggal Lahir";
            case 6:
                return "Agama";
            case 7:
                return "Pendidikan";
            case 8:
                return "Pekerjaan";
            case 9:
                return "Status Perkawinan";
            case 10:
                return "Hub Keluarga";
            case 11:
                return "Kewarganegaraan";
            case 12:
                return "No Paspor/Kitas";
            case 13:
                return "Nama Ayah";
            case 14:
                return "Nama Ibu";
            default:
                return "";
        }
    }
}
