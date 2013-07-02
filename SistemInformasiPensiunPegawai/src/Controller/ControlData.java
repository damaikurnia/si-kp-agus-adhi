/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PNS;
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
            cek=new PNS();
            cek.setNip_baru(result.getString(1));
            cek.setNama_pns(result.getString(2));
            pns.add(cek);
        }
        conn.commit();
        return pns;

    }
    
        public void insertPNS(PNS k) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "INSERT INTO pns VALUES(?,?,?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, k.getNip_baru());
            stmt.setString(2, k.getNip_lama());
            stmt.setString(3, k.getNama_pns());
            stmt.setString(4, k.getId_SuratCPNS());
            stmt.setString(5, k.getId_SuratPangkatTerakhir());
            stmt.setString(6, k.getId_SuratSPTKGTerakhir());
            stmt.setString(7, k.getId_SuratKarpeg());
            stmt.setString(9, k.getId_SuratNikah());
            stmt.setString(9, k.getId_SuratNIPBaru());
            stmt.setString(10, k.getId_Suratkk());

            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException se) {
            conn.rollback();
            throw se;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                try {
                    throw e;
                } catch (Exception ex) {
                    Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}