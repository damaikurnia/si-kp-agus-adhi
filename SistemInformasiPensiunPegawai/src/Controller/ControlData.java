/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AnggotaKeluarga;
import Model.DataMeninggal;
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
            cek = true;
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
                + " AND b.nama_pns != a.nama_lengkap AND a.status_hub_keluarga != 'anak' ";
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
            data=new DataMeninggal();
            data.setTglMeninggal(result.getString(1));
            data.setNo(result.getString(2));
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
        String query = "SELECT a.pekerjaan FROM anggotakeluarga a,pns b,kk c "
                + " where b.nip_baru = ? AND c.id_suratkk = b.id_suratkk AND a.id_suratkk = b.id_suratkk "
                + " AND b.nama_pns != a.nama_lengkap AND a.status_hub_keluarga != 'anak' ";
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
        PreparedStatement stmt = null;
        PNS cek = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT nip_lama,nip_baru,nama_pns FROM PNS "
                + "where Upper (nama_pns) like '%" + id.toUpperCase() + "%'";
        stmt = conn.prepareStatement(query);
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

    public void insertDataMeninggal(DataMeninggal dm) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO data_meninggal VALUES(?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dm.getNo());
        stmt.setString(2, dm.getNIP());
        stmt.setString(3, dm.getNama().toUpperCase());
        stmt.setString(4, dm.getTglMeninggal());
        stmt.setString(5, dm.getAnggota_nama().toUpperCase());
        stmt.setString(6, dm.getAnggota_alamat().toUpperCase());
        stmt.setString(7, dm.getKabupaten().toUpperCase());
        stmt.setString(8, dm.getAnggota_pekerjaan().toUpperCase());

        stmt.executeUpdate();
        conn.commit();
    }

    public void insertPNS(PNS k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO pns VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
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
        stmt.setString(11, k.getJk().toUpperCase());
        stmt.setString(12, k.getStatus().toUpperCase());

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

    public int cek_BUP(String id) throws SQLException {
        PreparedStatement stmt = null;
        int cek = 0;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT YEAR(CURRENT_DATE)- YEAR(sk_nipbaru.tanggal_lahir) "
                + "FROM sk_nipbaru WHERE nip_baru=? ";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        result = stmt.executeQuery();
        if (result.next()) {
            cek = result.getInt(1);
        }
        conn.commit();
        return cek;

    }

    public void insertSK_PangkatTerakhir(SK_PangkatTerakhir k) throws SQLException {
        PreparedStatement stmt = null;
        conn.setAutoCommit(false);
        String query = "INSERT INTO sk_pangkatterakhir VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,CURRENT_DATE,?,?,?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, k.getId_SuratPangkatTerakhir().toUpperCase());
        stmt.setString(2, k.getNama_pemilik().toUpperCase());
        stmt.setString(3, k.getTanggal_lahir());
        stmt.setString(4, k.getNip_lama());
        stmt.setString(5, k.getNip_baru());
        stmt.setString(6, k.getPendidikan().toUpperCase());
        stmt.setString(7, k.getPangkat_lama().toUpperCase());
        stmt.setString(8, k.getGolongan_lama().toUpperCase());
        stmt.setString(9, k.getTmt_lama());
        stmt.setString(10, k.getPangkat_baru().toUpperCase());
        stmt.setString(11, k.getGolongan_baru().toUpperCase());
        stmt.setString(12, k.getTmt_baru());
        stmt.setString(13, k.getMasa_kerja_golongan().toUpperCase());
        stmt.setString(14, k.getGaji_pokok());
        stmt.setString(15, k.getMasa_kerja_golongan_bulan().toUpperCase());
        stmt.setString(16, k.getKode_operator().toUpperCase());
        stmt.setString(17, k.getProfesi().toUpperCase());
        stmt.setString(18, k.getSekolah().toUpperCase());

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

    public List<AnggotaKeluarga> tampilAnggotaKeluarga(String idSuratKK) throws SQLException {
        PreparedStatement stmt = null;
        AnggotaKeluarga a = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT * FROM anggotakeluarga,kk WHERE kk.id_suratKK = '" + idSuratKK + "' "
                + "and kk.id_suratKK=anggotakeluarga.id_suratKK  ORDER BY tanggal_lahir";
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
            KK kartu = new KK();
            kartu.setId_Suratkk(result.getString(16));
            a.setId_suratkk(kartu);
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
                + "a.nama_pemilik,a.tempat_lahir,a.tanggal_lahir,a.partikelir,"
                + "a.tmt_partikelir,a.Profesi,a.Sekolah,a.nip_lama,a.nip_baru,"
                + "a.gp_bulanan,a.dari_gaji,a.masa_kerja_tahun,a.masa_kerja_bulan,"
                + "a.golongan,a.berijazah,a.persetujuan_dr,a.nmr_persetujuan,"
                + "a.tmt_persetujuan,a.tanggal_penyimpanan_surat,a.kode_operator "
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
            cpns.setPartikelir(result.getString(7));
            cpns.setTmt_partikelir(result.getString(8));
            cpns.setProfesi(result.getString(9));
            cpns.setSekolah(result.getString(10));
            cpns.setNip_lama(result.getString(11));
            cpns.setNip_baru(result.getString(12));
            cpns.setGp_bulanan(result.getString(13));
            cpns.setDari_gaji(result.getString(14));
            cpns.setMasa_kerja_tahun(result.getString(15));
            cpns.setMasa_kerja_bulan(result.getString(16));
            cpns.setGolongan(result.getString(17));
            cpns.setBerijazah(result.getString(18));
            cpns.setPersetujuan_dr(result.getString(19));
            cpns.setNmr_persetujuan(result.getString(20));
            cpns.setTmt_persetujuan(result.getString(21));
            cpns.setTanggal_penyimpanan_surat(result.getString(22));
            cpns.setKode_operator(result.getString(23));
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
                + "a.tanggal_lahir,a.nip_lama,a.nip_baru,a.pendidikan,a.pangkat_lama,"
                + "a.golongan_lama,a.tmt_lama,a.pangkat_baru,a.golongan_baru,"
                + "a.tmt_baru,a.masa_kerja_golongan,a.gaji_pokok,"
                + "a.masa_kerja_golongan_bulan,a.tanggal_penyimpanan_surat,"
                + "a.kode_operator,a.Profesi,a.Sekolah,a.tempat_lahir"
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
            skpt.setTanggal_lahir(result.getString(3));
            skpt.setNip_lama(result.getString(4));
            skpt.setNip_baru(result.getString(5));
            skpt.setPendidikan(result.getString(6));
            skpt.setPangkat_lama(result.getString(7));
            skpt.setGolongan_lama(result.getString(8));
            skpt.setTmt_lama(result.getString(9));
            skpt.setPangkat_baru(result.getString(10));
            skpt.setGolongan_baru(result.getString(11));
            skpt.setTmt_baru(result.getString(12));
            skpt.setMasa_kerja_golongan(result.getString(13));
            skpt.setGaji_pokok(result.getString(14));
            skpt.setMasa_kerja_golongan_bulan(result.getString(15));
            skpt.setTanggal_penyimpanan_surat(result.getString(16));
            skpt.setKode_operator(result.getString(17));
            skpt.setProfesi(result.getString(18));
            skpt.setSekolah(result.getString(19));
            skpt.setTempat_lahir(result.getString(20));
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

    public SK_Karpeg tampilSK_Karpeg(String nipBaru) throws SQLException{
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
}
