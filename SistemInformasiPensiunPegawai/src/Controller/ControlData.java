/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AnggotaKeluarga;
import Model.DataAPS;
import Model.DataMeninggal;
import Model.Instansi;
import Model.KK;
import Model.Operator;
import Model.PNS;
import Model.SK_CPNS;
import Model.SK_Karpeg;
import Model.SK_PangkatTerakhir;
import Model.SPTKG_Terakhir;
import Model.S_Nikah;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        String query = "SELECT kode_operator,passwordpegawai FROM operator "
                + "where kode_operator=? AND passwordpegawai=? ";
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

    public boolean StatusGuru(String id) throws SQLException {
        PreparedStatement stmt = null;
        boolean cek = false;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT sekolah FROM sptkg_terakhir "
                + "where nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        if (result.next()) {
            if (result.getString(1).contains("SMA") || result.getString(1).contains("SMAN")
                    || result.getString(1).contains("SMPN") || result.getString(1).contains("SMP")
                    || result.getString(1).contains("SD") || result.getString(1).contains("SDN")) {
                cek = true;
            }
        }
        conn.commit();
        return cek;

    }

    public Operator cariPegawai(String id) throws SQLException {
        PreparedStatement stmt = null;
        Operator ptr = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT kode_operator,namaOperator FROM Operator "
                + "where kode_operator=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        if (result.next()) {
            ptr = new Operator();
            ptr.setKode_operator(result.getString(1));
            ptr.setNamaOperator(result.getString(2));
        }
        conn.commit();
        return ptr;

    }

    public String cariJK(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        String jk = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT jk FROM PNS "
                + "where nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            jk = (result.getString(1));
        }
        conn.commit();
        return jk;

    }

    public String cariAnggotaKel(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        String nama = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.nama_lengkap FROM anggotakeluarga a,pns b,kk c "
                + " where b.nip_baru = ? AND c.id_suratkk = b.id_suratkk AND a.id_suratkk = b.id_suratkk "
                + " AND b.nama_pns != a.nama_lengkap AND a.status_hub_keluarga NOT LIKE '%anak%' ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            nama = (result.getString(1));
        }
        conn.commit();
        return nama;

    }

    public DataMeninggal dataPegawaiMeninggal(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        DataMeninggal data = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT tanggal_meninggal,no from data_meninggal where NIP= ? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            data = new DataMeninggal();
            data.setTglMeninggal(result.getString(1));
            data.setNo(result.getString(2));
        }
        conn.commit();
        return data;

    }

    public DataAPS dataPegawaiaps(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        DataAPS data = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT tanggalAPS,AlasanAPS from  data_aps where NIP= ? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            data = new DataAPS();
            data.setTanggalAPS(result.getString(1));
            data.setAlasan(result.getString(2));
        }
        conn.commit();
        return data;

    }

    public String cariAlamat(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        String nama = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT c.alamat FROM anggotakeluarga a,pns b,kk c "
                + " where b.nip_baru = ? AND c.id_suratkk = b.id_suratkk AND a.id_suratkk = b.id_suratkk "
                + " AND b.nama_pns != a.nama_lengkap ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            nama = (result.getString(1));
        }
        conn.commit();
        return nama;

    }

    public KK cariAlamatLengkap(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        KK k = null;
        String nama = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT c.alamat,c.Kabupaten_kota FROM anggotakeluarga a,pns b,kk c "
                + " where b.nip_baru = ? AND c.id_suratkk = b.id_suratkk AND a.id_suratkk = b.id_suratkk "
                + " AND b.nama_pns != a.nama_lengkap ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            k = new KK();
            k.setAlamat(result.getString(1));
            k.setKabupaten_Kota(result.getString(2));
        }
        conn.commit();
        return k;

    }

    public String cariPekerjaan(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        String nama = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
//        String query = "SELECT a.pekerjaan FROM anggotakeluarga a,pns b,kk c "
//                + " where b.nip_baru = ? AND c.id_suratkk = b.id_suratkk AND a.id_suratkk = b.id_suratkk "
//                + " AND b.nama_pns != a.nama_lengkap AND a.status_hub_keluarga != '%anak%' ";

        String query = "SELECT a.pekerjaan FROM anggotakeluarga a,pns b,kk c  WHERE b.nip_baru = ? AND c.id_suratkk = b.id_suratkk "
                + "AND a.id_suratkk = b.id_suratkk  AND b.nama_pns != a.nama_lengkap "
                + "AND a.status_hub_keluarga NOT LIKE '%ANAK%'";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, NIP);
        result = stmt.executeQuery();
        if (result.next()) {
            nama = (result.getString(1));
        }
        conn.commit();
        return nama;

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

    public List<PNS> SearchPNS_NIPLama(String id) throws SQLException {
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT nip_lama,nip_baru,nama_pns FROM PNS "
                + "where nip_lama=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (result.next()) {
            cek = new PNS();
            cek.setNip_lama(result.getString(1));
            cek.setNip_baru(result.getString(2));
            cek.setNama_pns(result.getString(3));
            pns.add(cek);
        }
        conn.commit();
        return pns;
    }

    public List<PNS> SearchDataPNS_NIPLama(String id) throws SQLException {
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM PNS "
                + "where nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (result.next()) {
            cek = new PNS();
            cek.setId_SuratCPNS(result.getString(4));
            cek.setId_SuratPangkatTerakhir(result.getString(5));
            cek.setId_SuratSPTKGTerakhir(result.getString(6));
            cek.setId_SuratKarpeg(result.getString(7));
            cek.setId_SuratNikah(result.getString(8));
            cek.setId_Suratkk(result.getString(10));
            pns.add(cek);
        }
        conn.commit();
        return pns;
    }

    public List<PNS> SearchDataPNS_NIPBaru(String id) throws SQLException {
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM PNS "
                + "where nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (result.next()) {
            cek = new PNS();
            cek.setNip_baru(result.getString(1));
            cek.setNama_pns(result.getString(3));
            cek.setId_SuratCPNS(result.getString(4));
            cek.setId_SuratPangkatTerakhir(result.getString(5));
            cek.setId_SuratSPTKGTerakhir(result.getString(6));
            cek.setId_SuratKarpeg(result.getString(7));
            cek.setId_SuratNikah(result.getString(8));
            cek.setId_Suratkk(result.getString(9));
            pns.add(cek);
        }
        conn.commit();
        return pns;
    }

    public List<PNS> SearchDataPNS_Nama(String id) throws SQLException {
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM PNS "
                + "where Upper (nama_pns) like '%" + id.toUpperCase() + "%'";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (result.next()) {
            cek = new PNS();
            cek.setId_SuratCPNS(result.getString(4));
            cek.setId_SuratPangkatTerakhir(result.getString(5));
            cek.setId_SuratSPTKGTerakhir(result.getString(6));
            cek.setId_SuratKarpeg(result.getString(7));
            cek.setId_SuratNikah(result.getString(8));
            cek.setId_Suratkk(result.getString(10));
            pns.add(cek);
        }
        conn.commit();
        return pns;
    }

    public List<PNS> SearchPNS_NIPBaru(String id) throws SQLException {
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT nip_lama,nip_baru,nama_pns FROM PNS "
                + "where nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (result.next()) {
            cek = new PNS();
            cek.setNip_lama(result.getString(1));
            cek.setNip_baru(result.getString(2));
            cek.setNama_pns(result.getString(3));
            pns.add(cek);
        }
        conn.commit();
        return pns;
    }

    public List<PNS> SearchPNS_Nama(String id) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from pns ";
//        String query = "SELECT nip_lama,nip_baru,nama_pns FROM PNS "
//                + "where Upper (nama_pns) like '%" + id.toUpperCase() + "%'";
        psmt = conn.prepareStatement(query);
        rset = psmt.executeQuery();

        psmt = conn.prepareStatement(query);
        rset = psmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        if (rset.next()) {
            PNS cek = new PNS();
            cek.setNip_lama(rset.getString(1));
            cek.setNip_baru(rset.getString(2));
            cek.setNama_pns(rset.getString(3));
            pns.add(cek);
        }
        conn.commit();
        return pns;
    }

    public void insertDataMeninggal(DataMeninggal dm, String idOP) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO data_meninggal VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dm.getNo());
        stmt.setString(2, dm.getNIP());
        stmt.setString(3, dm.getNama().toUpperCase());
        stmt.setString(4, dm.getTglMeninggal());
        stmt.setString(5, dm.getAnggota_nama().toUpperCase());
        stmt.setString(6, dm.getAnggota_alamat().toUpperCase());
        stmt.setString(7, dm.getKabupaten().toUpperCase());
        stmt.setString(8, dm.getAnggota_pekerjaan().toUpperCase());
        stmt.setString(9, idOP);

        stmt.executeUpdate();
        conn.commit();
    }

    public void insertDataAPS(DataAPS dm, String idOP) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO data_APS VALUES(?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dm.getNip());
        stmt.setString(2, dm.getNama().toUpperCase());
        stmt.setString(3, dm.getTanggalAPS());
        stmt.setString(4, dm.getAlasan());
        stmt.setString(5, idOP);

        stmt.executeUpdate();
        conn.commit();
    }

    public void insertPNS(PNS k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO pns VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getNip_baru());
        stmt.setString(2, k.getNip_lama());
        stmt.setString(3, k.getNama_pns().toUpperCase());
        stmt.setString(4, k.getId_SuratCPNS());
        stmt.setString(5, k.getId_SuratPangkatTerakhir());
        stmt.setString(6, k.getId_SuratSPTKGTerakhir());
        stmt.setString(7, k.getId_SuratKarpeg());
        stmt.setString(8, k.getId_SuratNikah());
        stmt.setString(9, k.getId_Suratkk());
        stmt.setString(10, k.getJk().toUpperCase());
        stmt.setString(11, k.getStatus().toUpperCase());
        stmt.executeUpdate();
        conn.commit();
    }

    public void updatePNS(String kodeSandi, String nip, String idSurat) throws SQLException {
        PreparedStatement stmt = null;
        if (kodeSandi.equals("CPNS")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_suratcpns = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat.toUpperCase());
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("PANGKATTERAKHIR")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratPangkatTerakhir = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat.toUpperCase());
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("SPTKG")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratSPTKGTerakhir = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat.toUpperCase());
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("KARPEG")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratKarpeg = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat.toUpperCase());
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("NIKAH")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratNikah = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat.toUpperCase());
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("KK")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_Suratkk = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, idSurat.toUpperCase());
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        }
    }

    public void insertCPNS(SK_CPNS k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO sk_cpns VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratCPNS().toUpperCase());
        stmt.setString(2, k.getTempat_surat().toUpperCase());
        stmt.setString(3, k.getTanggal_surat());
        stmt.setString(4, k.getNama_pemilik().toUpperCase());
        stmt.setString(5, k.getTempat_lahir().toUpperCase());
        stmt.setString(6, k.getTanggal_lahir());
        stmt.setString(7, k.getProfesi().toUpperCase());
        stmt.setString(8, k.getSekolah().toUpperCase());
        stmt.setString(9, k.getTmt_cpns());
        stmt.setString(10, k.getNip_lama());
        stmt.setString(11, k.getNip_baru());
        stmt.setString(12, k.getMasa_kerja_tahun());
        stmt.setString(13, k.getMasa_kerja_bulan());
        stmt.setString(14, k.getGolongan());
        stmt.setString(15, k.getBerijazah().toUpperCase());
        stmt.setString(16, k.getKode_operator().toUpperCase());
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

    public int cek_BUP(String id) throws SQLException {
        PreparedStatement stmt = null;
        int cek = 0;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT YEAR(CURRENT_DATE)- YEAR(sk_pangkatterakhir.tanggal_lahir) "
                + "FROM sk_pangkatterakhir,pns WHERE pns.nip_baru=? "
                + "and pns.id_SuratPangkatTerakhir=sk_pangkatterakhir.id_SuratPangkatTerakhir";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        if (result.next()) {
            cek = result.getInt(1);
        }
        conn.commit();
        return cek;

    }

    public String cekGolongan(String id) throws SQLException {
        PreparedStatement stmt = null;
        String cek = "";
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT golongan_ruang_baru FROM sptkg_terakhir WHERE nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        if (result.next()) {
            cek = result.getString(1);
        }
        conn.commit();
        return cek;

    }

    public void insertSK_PangkatTerakhir(SK_PangkatTerakhir k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO sk_pangkatterakhir VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratPangkatTerakhir().toUpperCase());
        stmt.setString(2, k.getNama_pemilik().toUpperCase());
        stmt.setString(3, k.getTempat_lahir());
        stmt.setString(4, k.getTanggal_lahir());
        stmt.setString(5, k.getNip_lama());
        stmt.setString(6, k.getNip_baru());
        stmt.setString(7, k.getPendidikan().toUpperCase());
        stmt.setString(8, k.getProfesi().toUpperCase());
        stmt.setString(9, k.getSekolah().toUpperCase());
        stmt.setString(10, k.getPangkat_baru().toUpperCase());
        stmt.setString(11, k.getGolongan_baru().toUpperCase());
        stmt.setString(12, k.getTmt_baru());
        stmt.setString(13, k.getMasa_kerja_golongan_tahun());
        stmt.setString(14, k.getMasa_kerja_golongan_bulan());
        stmt.setString(15, k.getGaji_pokok());
        stmt.setString(16, k.getKode_operator().toUpperCase());
        stmt.executeUpdate();
        conn.commit();
    }

    public void insertSPTKG_Terakhir(SPTKG_Terakhir k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO sptkg_terakhir VALUES(?,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratSPTKGTerakhir().toUpperCase());
        stmt.setString(2, k.getTempat_surat().toUpperCase());
        stmt.setString(3, k.getTanggal_surat());
        stmt.setString(4, k.getNama_pemilik().toUpperCase());
        stmt.setString(5, k.getNip_baru());
        stmt.setString(6, k.getPangkat_baru().toUpperCase());
        stmt.setString(7, k.getGolongan_ruang_baru());
        stmt.setString(8, k.getSekolah().toUpperCase());
        stmt.setString(9, k.getGajipokok_lama());
        stmt.setInt(10, Integer.parseInt(k.getGajipokok_baru()));
        stmt.setString(11, k.getTmt_baru());
        stmt.setString(12, k.getNip_lama());
        stmt.setString(13, k.getKode_operator().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public void insertSK_Karpeg(SK_Karpeg k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO sk_karpeg VALUES(?,?,?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratKarpeg().toUpperCase());
        stmt.setString(2, k.getNip_lama());
        stmt.setString(3, k.getNip_baru());
        stmt.setString(4, k.getNama_pemilik().toUpperCase());
        stmt.setString(5, k.getTanggal_lahir());
        stmt.setString(6, k.getTmt_cpns());
        stmt.setString(7, k.getKode_operator().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public void insertS_Nikah(S_Nikah k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO s_nikah VALUES(?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratNikah().toUpperCase());
        stmt.setString(2, k.getTanggal_nikah());
        stmt.setString(3, k.getNama_suami().toUpperCase());
        stmt.setString(4, k.getNama_istri().toUpperCase());
        stmt.setString(5, k.getKode_operator().toUpperCase());
        stmt.executeUpdate();
        conn.commit();
    }

    public void insertKK(KK k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO kk VALUES(?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_Suratkk().toUpperCase());
        stmt.setString(2, k.getNama_kk().toUpperCase());
        stmt.setString(3, k.getAlamat().toUpperCase());
        stmt.setString(4, k.getRT().toUpperCase());
        stmt.setString(5, k.getRW().toUpperCase());
        stmt.setString(6, k.getKelurahan_Desa().toUpperCase());
        stmt.setString(7, k.getKecamatan().toUpperCase());
        stmt.setString(8, k.getKabupaten_Kota().toUpperCase());
        stmt.setString(9, k.getKode_pos().toUpperCase());
        stmt.setString(10, k.getProvinsi().toUpperCase());
        stmt.setString(11, k.getKode_operator().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public List<AnggotaKeluarga> tampilAllAnggotaKeluarga() throws SQLException {
        PreparedStatement stmt = null;
        AnggotaKeluarga a = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM anggotakeluarga WHERE id_suratKK  "
                + " ORDER BY tanggal_lahir";
        stmt = conn.prepareStatement(query);
//        stmt.setString(1, idSuratKK);
        result = stmt.executeQuery();
        List<AnggotaKeluarga> at = new ArrayList<AnggotaKeluarga>();
        if (result.next()) {
            a = new AnggotaKeluarga();
            a.setNama_lengkap(result.getString(1));
            a.setNik(result.getString(2));
            a.setJenis_kelamin(result.getString(3));
            a.setTempat_lahir(result.getString(4));
            a.setTanggal_lahir(result.getString(5));
            a.setAgama(result.getString(6));
            a.setPendidikan(result.getString(7));
            a.setPekerjaan(result.getString(8));
            a.setStatus_perkawinan(result.getString(9));
            a.setStatus_hub_keluarga(result.getString(10));
            a.setKewarganegaraan(result.getString(11));
            a.setNo_paspor(result.getString(12));
            a.setNo_kitas_kitab(result.getString(13));
            a.setNama_ayah(result.getString(14));
            a.setNama_ibu(result.getString(15));
            at.add(a);
        }
        conn.commit();
        return at;
    }

    public void insertAnggotaKeluarga(AnggotaKeluarga k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO anggotakeluarga VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getNik().toUpperCase());
        stmt.setString(2, k.getNama_lengkap().toUpperCase());
        stmt.setString(3, k.getJenis_kelamin());
        stmt.setString(4, k.getTempat_lahir().toUpperCase());
        stmt.setString(5, k.getTanggal_lahir());
        stmt.setString(6, k.getAgama());
        stmt.setString(7, k.getPendidikan());
        stmt.setString(8, k.getPekerjaan().toUpperCase());
        stmt.setString(9, k.getStatus_perkawinan());
        stmt.setString(10, k.getStatus_hub_keluarga());
        stmt.setString(11, k.getKewarganegaraan());
        stmt.setString(12, k.getNo_paspor().toUpperCase());
        stmt.setString(13, k.getNo_kitas_kitab().toUpperCase());
        stmt.setString(14, k.getNama_ayah().toUpperCase());
        stmt.setString(15, k.getNama_ibu().toUpperCase());
        stmt.setString(16, k.getId_suratkk().getId_Suratkk().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public SK_CPNS tampilSK_CPNS(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        SK_CPNS cpns = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.id_SuratCPNS,a.tempat_surat,a.tanggal_surat,"
                + "a.nama_pemilik,a.tempat_lahir,a.tanggal_lahir,a.tmt_cpns,"
                + "a.Profesi,a.Sekolah,a.nip_lama,a.nip_baru,"
                + "a.masa_kerja_tahun,a.masa_kerja_bulan,"
                + "a.golongan,a.berijazah,"
                + "a.tanggal_penyimpanan_surat,a.kode_operator "
                + "FROM sk_cpns a, pns b WHERE a.id_SuratCPNS = b.id_SuratCPNS "
                + "AND b.nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            cpns = new SK_CPNS();
            cpns.setId_SuratCPNS(result.getString(1));
            cpns.setTempat_surat(result.getString(2));
            cpns.setTanggal_surat(result.getString(3));
            cpns.setNama_pemilik(result.getString(4));
            cpns.setTempat_lahir(result.getString(5));
            cpns.setTanggal_lahir(result.getString(6));
            cpns.setTmt_cpns(result.getString(7));
            cpns.setProfesi(result.getString(8));
            cpns.setSekolah(result.getString(9));
            cpns.setNip_lama(result.getString(10));
            cpns.setNip_baru(result.getString(11));
            cpns.setMasa_kerja_tahun(result.getString(12));
            cpns.setMasa_kerja_bulan(result.getString(13));
            cpns.setGolongan(result.getString(14));
            cpns.setBerijazah(result.getString(15));
            cpns.setTanggal_penyimpanan_surat(result.getString(16));
            cpns.setKode_operator(result.getString(17));
        }
        conn.commit();
        return cpns;
    }

    public SK_PangkatTerakhir tampilSK_PangkatTerakhir(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        SK_PangkatTerakhir skpt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.id_SuratPangkatTerakhir,a.nama_pemilik,"
                + "a.tempat_lahir,a.tanggal_lahir,a.nip_lama,a.nip_baru,a.pendidikan,"
                + "a.Profesi,a.Sekolah,a.pangkat_baru,a.golongan_baru,"
                + "a.tmt_baru,a.masa_kerja_golongan_tahun,"
                + "a.masa_kerja_golongan_bulan,a.gaji_pokok,a.tanggal_penyimpanan_surat,"
                + "a.kode_operator"
                + " FROM sk_pangkatterakhir a, pns b "
                + "WHERE a.id_SuratPangkatTerakhir = b.id_SuratPangkatTerakhir "
                + "AND b.nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            skpt = new SK_PangkatTerakhir();
            skpt.setId_SuratPangkatTerakhir(result.getString(1));
            skpt.setNama_pemilik(result.getString(2));
            skpt.setTempat_lahir(result.getString(3));
            skpt.setTanggal_lahir(result.getString(4));
            skpt.setNip_lama(result.getString(5));
            skpt.setNip_baru(result.getString(6));
            skpt.setPendidikan(result.getString(7));
            skpt.setProfesi(result.getString(8));
            skpt.setSekolah(result.getString(9));
            skpt.setPangkat_baru(result.getString(10));
            skpt.setGolongan_baru(result.getString(11));
            skpt.setTmt_baru(result.getString(12));
            skpt.setMasa_kerja_golongan_tahun(result.getString(13));
            skpt.setMasa_kerja_golongan_bulan(result.getString(14));
            skpt.setGaji_pokok(result.getString(15));
            skpt.setTanggal_penyimpanan_surat(result.getString(16));
            skpt.setKode_operator(result.getString(17));
        }
        conn.commit();
        return skpt;
    }

    public SPTKG_Terakhir tampilSPTKG_Terakhir(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        SPTKG_Terakhir sptkg = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.id_SuratSPTKGTerakhir,a.tempat_surat,"
                + "a.tanggal_surat,a.nama_pemilik,a.nip_baru,a.pangkat_baru,"
                + "a.golongan_ruang_baru,a.Sekolah,a.gajipokok_lama,"
                + "a.gajipokok_baru,a.tmt_baru,a.nip_lama,a.tanggal_penyimpanan_surat,"
                + "a.kode_operator FROM sptkg_terakhir a, pns b WHERE "
                + "a.id_SuratSPTKGTerakhir = b.id_SuratSPTKGTerakhir AND "
                + "b.nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            sptkg = new SPTKG_Terakhir();
            sptkg.setId_SuratSPTKGTerakhir(result.getString(1));
            sptkg.setTempat_surat(result.getString(2));
            sptkg.setTanggal_surat(result.getString(3));
            sptkg.setNama_pemilik(result.getString(4));
            sptkg.setNip_baru(result.getString(5));
            sptkg.setPangkat_baru(result.getString(6));
            sptkg.setGolongan_ruang_baru(result.getString(7));
            sptkg.setSekolah(result.getString(8));
            sptkg.setGajipokok_lama(result.getString(9));
            sptkg.setGajipokok_baru(result.getString(10));
            sptkg.setTmt_baru(result.getString(11));
            sptkg.setNip_lama(result.getString(12));
            sptkg.setTanggal_penyimpanan_surat(result.getString(13));
            sptkg.setKode_operator(result.getString(14));
        }
        conn.commit();
        return sptkg;
    }

    public SK_Karpeg tampilSK_Karpeg(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        SK_Karpeg karpeg = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.id_SuratKarpeg,a.nip_lama,a.nip_baru,"
                + "a.nama_pemilik,a.tanggal_lahir,a.tmt_cpns,a.tanggal_penyimpanan_surat,"
                + "a.kode_operator FROM sk_karpeg a, pns b WHERE "
                + "a.id_SuratKarpeg = b.id_SuratKarpeg AND b.nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            karpeg = new SK_Karpeg();
            karpeg.setId_SuratKarpeg(result.getString(1));
            karpeg.setNip_lama(result.getString(2));
            karpeg.setNip_baru(result.getString(3));
            karpeg.setNama_pemilik(result.getString(4));
            karpeg.setTanggal_lahir(result.getString(5));
            karpeg.setTmt_cpns(result.getString(6));
            karpeg.setTanggal_penyimpanan_surat(result.getString(7));
            karpeg.setKode_operator(result.getString(8));
        }
        conn.commit();
        return karpeg;
    }

    public Instansi tampil_tempat_instansi(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        Instansi instansi = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * from instansi WHERE  nipPegawai = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            instansi = new Instansi();
            instansi.setIdInstansi(result.getString(1));
            instansi.setNmInstansi(result.getString(2));
            instansi.setNm_kepala(result.getString(3));
            instansi.setPangkatGolkepala(result.getString(4));
            instansi.setNip_kepala(result.getString(5));
            PNS pns = new PNS();
            pns.setNip_baru(result.getString(7));
            pns.setNama_pns(result.getString(6));
            instansi.setPns(pns);
        }
        conn.commit();
        return instansi;
    }

    public S_Nikah tampilS_Nikah(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        S_Nikah sn = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.id_SuratNikah,a.tanggal_nikah,a.nama_suami,"
                + "a.nama_istri,a.tanggal_penyimpanan_surat,a.kode_operator "
                + "FROM s_nikah a, pns b WHERE a.id_SuratNikah = b.id_SuratNikah "
                + "AND b.nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            sn = new S_Nikah();
            sn.setId_SuratNikah(result.getString(1));
            sn.setTanggal_nikah(result.getString(2));
            sn.setNama_suami(result.getString(3));
            sn.setNama_istri(result.getString(4));
            sn.setTanggal_penyimpanan_surat(result.getString(5));
            sn.setKode_operator(result.getString(6));
        }
        conn.commit();
        return sn;
    }

    public KK tampilKK(String nipBaru) throws SQLException {
        PreparedStatement stmt = null;
        KK kk = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.id_Suratkk,a.nama_kk,a.Alamat,a.RT,a.RW,"
                + "a.Kelurahan_Desa,a.Kecamatan,a.Kabupaten_Kota,a.kode_pos,"
                + "a.provinsi,a.tanggal_penyimpanan_surat,a.kode_operator "
                + "FROM kk a, pns b WHERE a.id_Suratkk = b.id_Suratkk AND "
                + "b.nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, nipBaru);
        result = stmt.executeQuery();
        if (result.next()) {
            kk = new KK();
            kk.setId_Suratkk(result.getString(1));
            kk.setNama_kk(result.getString(2));
            kk.setAlamat(result.getString(3));
            kk.setRT(result.getString(4));
            kk.setRW(result.getString(5));
            kk.setKelurahan_Desa(result.getString(6));
            kk.setKecamatan(result.getString(7));
            kk.setKabupaten_Kota(result.getString(8));
            kk.setKode_pos(result.getString(9));
            kk.setProvinsi(result.getString(10));
            kk.setTanggal_penyimpanan_surat(result.getString(11));
            kk.setKode_operator(result.getString(12));
        }
        conn.commit();
        return kk;
    }

    public List<PNS> SearchAllPNS(String id) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String query = "SELECT nip_lama,nip_baru,nama_pns FROM PNS "
                + "where Upper (nama_pns) like '%" + id.toUpperCase() + "%'";
        psmt = conn.prepareStatement(query);
        rset = psmt.executeQuery();
        List<PNS> pns = new ArrayList<PNS>();
        while (rset.next()) {
            PNS brg = new PNS();
            brg.setNip_lama(rset.getString(1));
            brg.setNip_baru(rset.getString(2));
            brg.setNama_pns(rset.getString(3));
            pns.add(brg);
        }
        conn.commit();
        return pns;
    }

    public List<AnggotaKeluarga> SearchAllAnggota(String id) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT a.nik,a.nama_lengkap,a.jenis_kelamin,"
                + "a.tempat_lahir,a.tanggal_lahir,a.agama,a.pendidikan,a.pekerjaan,"
                + "a.status_perkawinan,a.status_hub_keluarga,a.kewarganegaraan,"
                + "a.no_paspor,a.no_kitas_kitap,a.nama_ayah,a.nama_ibu FROM anggotakeluarga a,"
                + "kk b WHERE a.id_suratKK = b.id_Suratkk AND a.id_suratKK = ? "
                + "ORDER BY a.tanggal_lahir";
        psmt = conn.prepareStatement(query);
        psmt.setString(1, id);
        result = psmt.executeQuery();
        List<AnggotaKeluarga> at = new ArrayList<AnggotaKeluarga>();
        while (result.next()) {
            AnggotaKeluarga a = new AnggotaKeluarga();
            a.setNo(Integer.toString(result.getRow()));
            a.setNik(result.getString(1));
            a.setNama_lengkap(result.getString(2));
            a.setJenis_kelamin(result.getString(3));
            a.setTempat_lahir(result.getString(4));
            a.setTanggal_lahir(result.getString(5));
            a.setAgama(result.getString(6));
            a.setPendidikan(result.getString(7));
            a.setPekerjaan(result.getString(8));
            a.setStatus_perkawinan(result.getString(9));
            a.setStatus_hub_keluarga(result.getString(10));
            a.setKewarganegaraan(result.getString(11));
            a.setNo_paspor(result.getString(12));
            a.setNo_kitas_kitab(result.getString(13));
            a.setNama_ayah(result.getString(14));
            a.setNama_ibu(result.getString(15));
            at.add(a);
        }
        conn.commit();
        return at;
    }

    public void delete_PNS(String NIP) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from PNS where NIP_baru=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, NIP);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_sptkg_terakhir(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from sptkg_terakhir where id_SuratSPTKGTerakhir=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_sk_pangkatterakhir(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from sk_pangkatterakhir where id_SuratPangkatTerakhir=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_sk_karpeg(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from sk_karpeg where id_SuratKarpeg=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_sk_cpns(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from sk_cpns where id_suratCPNS=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_srt_nikah(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from s_nikah where id_suratNikah=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_kk(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from kk where id_suratKK=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void delete_tmt_instansi(String id) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from instansi where nipPegawai=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void Deleteanggotakeluarga(String NIK) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from anggotakeluarga where nik=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, NIK);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void DeleteAllanggotakeluarga(String NIK) throws SQLException {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String query = "delete from anggotakeluarga where id_suratKK=? ";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, NIK);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
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

    public void updateCPNS(SK_CPNS cpns) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE sk_cpns SET tempat_surat = ?,tanggal_surat = ?,"
                + "tempat_lahir = ?,tanggal_lahir = ?,"
                + "Profesi = ?,Sekolah = ?,tmt_cpns = ?,"
                + "masa_kerja_tahun = ?,masa_kerja_bulan = ?,golongan = ?,berijazah = ?,"
                + "tanggal_penyimpanan_surat = CURRENT_DATE,kode_operator = ?,id_suratCPNS=? "
                + "WHERE nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, cpns.getTempat_surat().toUpperCase());
        stmt.setString(2, cpns.getTanggal_surat());
        stmt.setString(3, cpns.getTempat_lahir().toUpperCase());
        stmt.setString(4, cpns.getTanggal_lahir());
        stmt.setString(5, cpns.getProfesi().toUpperCase());
        stmt.setString(6, cpns.getSekolah().toUpperCase());
        stmt.setString(7, cpns.getTmt_cpns());
        stmt.setString(8, cpns.getMasa_kerja_tahun());
        stmt.setString(9, cpns.getMasa_kerja_bulan());
        stmt.setString(10, cpns.getGolongan().toUpperCase());
        stmt.setString(11, cpns.getBerijazah().toUpperCase());
        stmt.setString(12, cpns.getKode_operator().toUpperCase());
        stmt.setString(13, cpns.getId_SuratCPNS());
        stmt.setString(14, cpns.getNip_baru());
        stmt.executeUpdate();
        conn.commit();
    }

    public void updateSK_PangkatTerakhir(SK_PangkatTerakhir pt) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE sk_pangkatterakhir SET tempat_lahir = ?,tanggal_lahir = ?,"
                + "pendidikan = ?,"
                + "Profesi = ?,Sekolah = ?,pangkat_baru = ?,golongan_baru = ?,tmt_baru = ?,"
                + "masa_kerja_golongan_tahun = ?,masa_kerja_golongan_bulan = ?,gaji_pokok = ?,"
                + "tanggal_penyimpanan_surat = CURRENT_DATE,kode_operator = ? ,id_SuratPangkatTerakhir = ?"
                + "WHERE nip_baru = ? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, pt.getTempat_lahir().toUpperCase());
        stmt.setString(2, pt.getTanggal_lahir());
        stmt.setString(3, pt.getPendidikan().toUpperCase());
        stmt.setString(4, pt.getProfesi().toUpperCase());
        stmt.setString(5, pt.getSekolah().toUpperCase());
        stmt.setString(6, pt.getPangkat_baru().toUpperCase());
        stmt.setString(7, pt.getGolongan_baru().toUpperCase());
        stmt.setString(8, pt.getTmt_baru());
        stmt.setString(9, pt.getMasa_kerja_golongan_tahun());
        stmt.setString(10, pt.getMasa_kerja_golongan_bulan());
        stmt.setString(11, pt.getGaji_pokok());
        stmt.setString(12, pt.getKode_operator().toUpperCase());
        stmt.setString(13, pt.getId_SuratPangkatTerakhir());
        stmt.setString(14, pt.getNip_baru());
        stmt.executeUpdate();
        conn.commit();
    }

    public void updateSPTKG_Terakhir(SPTKG_Terakhir k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE sptkg_terakhir SET tempat_surat = ?,tanggal_surat = ?,"
                + "pangkat_baru = ?,golongan_ruang_baru = ?,Sekolah = ?,"
                + "gajipokok_lama = ?,gajipokok_baru = ?,tmt_baru = ?,"
                + "tanggal_penyimpanan_surat = CURRENT_DATE,kode_operator = ?,id_SuratSPTKGTerakhir = ? "
                + "WHERE nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getTempat_surat().toUpperCase());
        stmt.setString(2, k.getTanggal_surat());
        stmt.setString(3, k.getPangkat_baru().toUpperCase());
        stmt.setString(4, k.getGolongan_ruang_baru().toUpperCase());
        stmt.setString(5, k.getSekolah().toUpperCase());
        stmt.setString(6, k.getGajipokok_lama());
        stmt.setInt(7, Integer.parseInt(k.getGajipokok_baru()));
        stmt.setString(8, k.getTmt_baru());
        stmt.setString(9, k.getKode_operator().toUpperCase());
        stmt.setString(10, k.getId_SuratSPTKGTerakhir());
        stmt.setString(11, k.getNip_baru());
        stmt.executeUpdate();
        conn.commit();
    }

    public void updateSK_Karpeg(SK_Karpeg k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE sk_karpeg SET tanggal_lahir = ?,tmt_cpns = ?,"
                + "tanggal_penyimpanan_surat = CURRENT_DATE,kode_operator = ?,id_SuratKarpeg = ? "
                + "WHERE nip_baru = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getTanggal_lahir());
        stmt.setString(2, k.getTmt_cpns());
        stmt.setString(3, k.getKode_operator().toUpperCase());
        stmt.setString(4, k.getId_SuratKarpeg());
        stmt.setString(5, k.getNip_baru());
        stmt.executeUpdate();
        conn.commit();
    }

    public void updateS_Nikah(S_Nikah k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE s_nikah SET tanggal_nikah = ?, nama_suami = ?,"
                + "nama_istri = ?, tanggal_penyimpanan_surat = CURRENT_DATE,"
                + "kode_operator = ? WHERE id_SuratNikah = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getTanggal_nikah());
        stmt.setString(2, k.getNama_suami().toUpperCase());
        stmt.setString(3, k.getNama_istri().toUpperCase());
        stmt.setString(4, k.getKode_operator().toUpperCase());
        stmt.setString(5, k.getId_SuratNikah());
        stmt.executeUpdate();
        conn.commit();
    }

    public void updateKK(KK k) throws SQLException { //BELOM
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE kk SET nama_kk = ?,Alamat = ?,RT = ?, RW = ?,"
                + "Kelurahan_Desa = ?,Kecamatan = ?,Kabupaten_Kota = ?,kode_pos = ?,"
                + "provinsi = ?,tanggal_penyimpanan_surat = CURRENT_DATE,"
                + "kode_operator = ? WHERE id_Suratkk = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getNama_kk().toUpperCase());
        stmt.setString(2, k.getAlamat().toUpperCase());
        stmt.setString(3, k.getRT().toUpperCase());
        stmt.setString(4, k.getRW().toUpperCase());
        stmt.setString(5, k.getKelurahan_Desa().toUpperCase());
        stmt.setString(6, k.getKecamatan().toUpperCase());
        stmt.setString(7, k.getKabupaten_Kota().toUpperCase());
        stmt.setString(8, k.getKode_pos().toUpperCase());
        stmt.setString(9, k.getProvinsi().toUpperCase());
        stmt.setString(10, k.getKode_operator().toUpperCase());
        stmt.setString(11, k.getId_Suratkk().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public void updateAnggotaKeluarga(AnggotaKeluarga k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE anggotakeluarga SET nama_lengkap = ?,jenis_kelamin = ?,"
                + "tempat_lahir = ?,tanggal_lahir = ?,agama = ?,pendidikan = ?,pekerjaan = ?,"
                + "status_perkawinan = ?,status_hub_keluarga = ?,kewarganegaraan = ?,"
                + "no_paspor = ?,no_kitas_kitap = ?,nama_ayah = ?, nama_ibu = ? "
                + "WHERE id_suratKK = ? AND nik = ?";
        stmt = conn.prepareStatement(query);

        stmt.setString(1, k.getNama_lengkap().toUpperCase());
        stmt.setString(2, k.getJenis_kelamin());
        stmt.setString(3, k.getTempat_lahir().toUpperCase());
        stmt.setString(4, k.getTanggal_lahir());
        stmt.setString(5, k.getAgama());
        stmt.setString(6, k.getPendidikan());
        stmt.setString(7, k.getPekerjaan().toUpperCase());
        stmt.setString(8, k.getStatus_perkawinan());
        stmt.setString(9, k.getStatus_hub_keluarga());
        stmt.setString(10, k.getKewarganegaraan());
        stmt.setString(11, k.getNo_paspor().toUpperCase());
        stmt.setString(12, k.getNo_kitas_kitab().toUpperCase());
        stmt.setString(13, k.getNama_ayah().toUpperCase());
        stmt.setString(14, k.getNama_ibu().toUpperCase());
        stmt.setString(15, k.getId_suratkk().getId_Suratkk().toUpperCase());
        stmt.setString(16, k.getNik().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public void updateDataPNS(String kodeSandi, String nip) throws SQLException {
        PreparedStatement stmt = null;
        if (kodeSandi.equals("SK CPNS")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_suratcpns = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "-");
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("SK PANGKAT TERAKHIR")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratPangkatTerakhir = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "-");
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("SPTKG TERAKHIR")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratSPTKGTerakhir = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "-");
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("SK KARPEG")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratKarpeg = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "-");
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("SURAT NIKAH")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_SuratNikah = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "-");
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        } else if (kodeSandi.equals("KK")) {
            conn.setAutoCommit(false);
            String query = "update pns set id_Suratkk = ? where nip_baru = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "-");
            stmt.setString(2, nip);

            stmt.executeUpdate();
            conn.commit();
        }
    }

    public void delete_AllData(String id) {
        try {
            delete_PNS(id);
            delete_kk(id);
            delete_sk_cpns(id);
            delete_sk_karpeg(id);
            delete_sk_pangkatterakhir(id);
            delete_sptkg_terakhir(id);
            delete_srt_nikah(id);
        } catch (SQLException ex) {
            Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addTempatBekerja(Instansi instansi) {
        try {
            PreparedStatement stmt = null;
            conn.setAutoCommit(false);
            String query = "INSERT INTO instansi VALUES(?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, instansi.getIdInstansi());
            stmt.setString(2, instansi.getNmInstansi().toUpperCase());
            stmt.setString(3, instansi.getNm_kepala().toUpperCase());
            stmt.setString(4, instansi.getPangkatGolkepala().toUpperCase());
            stmt.setString(5, instansi.getNip_kepala());
            stmt.setString(6, instansi.getPns().getNama_pns().toUpperCase());
            stmt.setString(7, instansi.getPns().getNip_baru());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ControlData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTempatInstansi(Instansi inst) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "UPDATE instansi SET idInstansi = ?,namaInstansi = ?,"
                + "namaKepala = ?,pangkatGol = ?,nipKepala = ? WHERE nipPegawai = ? ";
        stmt = conn.prepareStatement(query);

        stmt.setString(1, inst.getIdInstansi().toUpperCase());
        stmt.setString(2, inst.getNmInstansi().toUpperCase());
        stmt.setString(3, inst.getNm_kepala().toUpperCase());
        stmt.setString(4, inst.getPangkatGolkepala().toUpperCase());
        stmt.setString(5, inst.getNip_kepala());
        stmt.setString(6, inst.getPns().getNip_baru());
        stmt.executeUpdate();
        conn.commit();
    }
}
