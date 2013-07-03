/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Operator;
import Model.PNS;
import Model.SK_CPNS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a9uszT
 */
public class ControlData {

    private Connection conn;

    public ControlData(Connection conn) {
        this.conn = conn;
    }

    public static ControlData getKoneksi() throws Exception {
        ControlData control = new ControlData(ConnMySql.getConnections());
        return control;
    }

    public boolean Login(String id, String password) throws SQLException {
        PreparedStatement stmt = null;
        boolean cek = false;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT idPegawai,passwordpegawai FROM operator "
                + "where idPegawai=? AND passwordpegawai=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        stmt.setString(2, password);
        result = stmt.executeQuery();
        if (result.next()) {
            cek = true;
        }
        conn.commit();
        return cek;

    }

    public String cariPegawai(String id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<PNS> SearchPNS(String id) throws SQLException {
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT nip_baru,nama_pns FROM PNS "
                + "where nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (result.next()) {
            cek = new PNS();
            cek.setNip_baru(result.getString(1));
            cek.setNama_pns(result.getString(2));
            pns.add(cek);
        }
        conn.commit();
        return pns;

    }

    public void insertPNS(PNS k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO pns VALUES(?,?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getNip_baru());
        stmt.setString(2, k.getNip_lama());
        stmt.setString(3, k.getNama_pns().toUpperCase());
        stmt.setString(4, k.getId_SuratCPNS());
        stmt.setString(5, k.getId_SuratPangkatTerakhir());
        stmt.setString(6, k.getId_SuratSPTKGTerakhir());
        stmt.setString(7, k.getId_SuratKarpeg());
        stmt.setString(8, k.getId_SuratNikah());
        stmt.setString(9, k.getId_SuratNIPBaru());
        stmt.setString(10, k.getId_Suratkk());

        stmt.executeUpdate();
        conn.commit();
    }

    public void updatePNS(String kodeSandi, String nip,String idSurat) throws SQLException {
        PreparedStatement stmt = null;
        if (kodeSandi.equals("CPNS")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_suratcpns = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat);
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        }
    }

    public void insertCPNS(SK_CPNS k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO sk_cpns VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratCPNS().toUpperCase());
        stmt.setString(2, k.getTempat_surat().toUpperCase());
        stmt.setString(3, k.getTanggal_surat());
        stmt.setString(4, k.getNama_pemilik().toUpperCase());
        stmt.setString(5, k.getTempat_lahir().toUpperCase());
        stmt.setString(6, k.getTanggal_lahir());
        stmt.setString(7, k.getPartikelir().toUpperCase());
        stmt.setString(8, k.getTmt_partikelir());
        stmt.setString(9, k.getProfesi().toUpperCase());
        stmt.setString(10, k.getSekolah().toUpperCase());
        stmt.setString(11, k.getNip_lama());
        stmt.setString(12, k.getNip_baru());
        stmt.setString(13, k.getGp_bulanan());
        stmt.setString(14, k.getDari_gaji());
        stmt.setString(15, k.getMasa_kerja_tahun());
        stmt.setString(16, k.getMasa_kerja_bulan());
        stmt.setString(17, k.getGolongan());
        stmt.setString(18, k.getBerijazah().toUpperCase());
        stmt.setString(19, k.getPersetujuan_dr().toUpperCase());
        stmt.setString(20, k.getNmr_persetujuan());
        stmt.setString(21, k.getTmt_persetujuan());
        stmt.setString(22, k.getKode_operator().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public Operator tampilOperator(String id) throws SQLException {
        PreparedStatement statement = null;
        boolean cari = false;
        ResultSet result = null;

        conn.setAutoCommit(false);
        statement = conn.prepareStatement("select * from operator where kode_operator = ? ");
        statement.setString(1, id);
        result = statement.executeQuery();
        Operator op = new Operator();
        if (result.next()) {
            op.setKode_operator(result.getString(1));
            op.setPasswordPegawai(result.getString(2));
            op.setKode_operator(result.getString(3));
        }
        conn.commit();
        return op;
    }
}