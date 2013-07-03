/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a9uszT
 */
public class SK_CPNS {
    private String id_SuratCPNS;
    private String tempat_surat;
    private String tanggal_surat;
    private String nama_pemilik;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String partikelir;
    private String tmt_partikelir;
    private String Profesi;
    private String Sekolah;
    private String nip_lama;
    private String nip_baru;
    private String gp_bulanan;
    private String dari_gaji;
    private String masa_kerja_tahun;
    private String masa_kerja_bulan;
    private String golongan;
    private String berijazah;
    private String persetujuan_dr;
    private String nmr_persetujuan;
    private String tmt_persetujuan;
    private String tanggal_penyimpanan_surat;
    private String kode_operator;

    public SK_CPNS() {
    }

    public SK_CPNS(String id_SuratCPNS, String tempat_surat, String tanggal_surat,
            String nama_pemilik, String tempat_lahir, String tanggal_lahir,
            String partikelir, String tmt_partikelir, String Profesi,
            String Sekolah, String nip_lama, String nip_baru, String gp_bulanan,
            String dari_gaji, String m_tahun, String m_bulan, String gol,
            String ijazah, String persetujuan_dr, String nmr_persetujuan,
            String tmt_persetujuan, String tgl_edit_surat,String kode_op) {
        this.id_SuratCPNS = id_SuratCPNS;
        this.tempat_surat = tempat_surat;
        this.tanggal_surat = tanggal_surat;
        this.nama_pemilik = nama_pemilik;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.partikelir = partikelir;
        this.tmt_partikelir = tmt_partikelir;
        this.Profesi = Profesi;
        this.Sekolah = Sekolah;
        this.nip_lama = nip_lama;
        this.nip_baru = nip_baru;
        this.gp_bulanan = gp_bulanan;
        this.dari_gaji = dari_gaji;
        this.masa_kerja_tahun = m_tahun;
        this.masa_kerja_bulan = m_bulan;
        this.golongan = gol;
        this.berijazah = ijazah;
        this.persetujuan_dr = persetujuan_dr;
        this.nmr_persetujuan = nmr_persetujuan;
        this.tmt_persetujuan = tmt_persetujuan;
        this.tanggal_penyimpanan_surat = tgl_edit_surat;
        this.kode_operator = kode_op;
    }

    /**
     * @return the id_SuratCPNS
     */
    public String getId_SuratCPNS() {
        return id_SuratCPNS;
    }

    /**
     * @param id_SuratCPNS the id_SuratCPNS to set
     */
    public void setId_SuratCPNS(String id_SuratCPNS) {
        this.id_SuratCPNS = id_SuratCPNS;
    }

    /**
     * @return the tempat_surat
     */
    public String getTempat_surat() {
        return tempat_surat;
    }

    /**
     * @param tempat_surat the tempat_surat to set
     */
    public void setTempat_surat(String tempat_surat) {
        this.tempat_surat = tempat_surat;
    }

    /**
     * @return the tanggal_surat
     */
    public String getTanggal_surat() {
        return tanggal_surat;
    }

    /**
     * @param tanggal_surat the tanggal_surat to set
     */
    public void setTanggal_surat(String tanggal_surat) {
        this.tanggal_surat = tanggal_surat;
    }

    /**
     * @return the nama_pemilik
     */
    public String getNama_pemilik() {
        return nama_pemilik;
    }

    /**
     * @param nama_pemilik the nama_pemilik to set
     */
    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    /**
     * @return the tempat_lahir
     */
    public String getTempat_lahir() {
        return tempat_lahir;
    }

    /**
     * @param tempat_lahir the tempat_lahir to set
     */
    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    /**
     * @return the tanggal_lahir
     */
    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    /**
     * @param tanggal_lahir the tanggal_lahir to set
     */
    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    /**
     * @return the partikelir
     */
    public String getPartikelir() {
        return partikelir;
    }

    /**
     * @param partikelir the partikelir to set
     */
    public void setPartikelir(String partikelir) {
        this.partikelir = partikelir;
    }

    /**
     * @return the tmt_partikelir
     */
    public String getTmt_partikelir() {
        return tmt_partikelir;
    }

    /**
     * @param tmt_partikelir the tmt_partikelir to set
     */
    public void setTmt_partikelir(String tmt_partikelir) {
        this.tmt_partikelir = tmt_partikelir;
    }

    /**
     * @return the Profesi
     */
    public String getProfesi() {
        return Profesi;
    }

    /**
     * @param Profesi the Profesi to set
     */
    public void setProfesi(String Profesi) {
        this.Profesi = Profesi;
    }

    /**
     * @return the Sekolah
     */
    public String getSekolah() {
        return Sekolah;
    }

    /**
     * @param Sekolah the Sekolah to set
     */
    public void setSekolah(String Sekolah) {
        this.Sekolah = Sekolah;
    }

    /**
     * @return the nip_lama
     */
    public String getNip_lama() {
        return nip_lama;
    }

    /**
     * @param nip_lama the nip_lama to set
     */
    public void setNip_lama(String nip_lama) {
        this.nip_lama = nip_lama;
    }

    /**
     * @return the nip_baru
     */
    public String getNip_baru() {
        return nip_baru;
    }

    /**
     * @param nip_baru the nip_baru to set
     */
    public void setNip_baru(String nip_baru) {
        this.nip_baru = nip_baru;
    }

    /**
     * @return the gp_bulanan
     */
    public String getGp_bulanan() {
        return gp_bulanan;
    }

    /**
     * @param gp_bulanan the gp_bulanan to set
     */
    public void setGp_bulanan(String gp_bulanan) {
        this.gp_bulanan = gp_bulanan;
    }

    /**
     * @return the dari_gaji
     */
    public String getDari_gaji() {
        return dari_gaji;
    }

    /**
     * @param dari_gaji the dari_gaji to set
     */
    public void setDari_gaji(String dari_gaji) {
        this.dari_gaji = dari_gaji;
    }

    /**
     * @return the masa_kerja_tahun
     */
    public String getMasa_kerja_tahun() {
        return masa_kerja_tahun;
    }

    /**
     * @param masa_kerja_tahun the masa_kerja_tahun to set
     */
    public void setMasa_kerja_tahun(String masa_kerja_tahun) {
        this.masa_kerja_tahun = masa_kerja_tahun;
    }

    /**
     * @return the masa_kerja_bulan
     */
    public String getMasa_kerja_bulan() {
        return masa_kerja_bulan;
    }

    /**
     * @param masa_kerja_bulan the masa_kerja_bulan to set
     */
    public void setMasa_kerja_bulan(String masa_kerja_bulan) {
        this.masa_kerja_bulan = masa_kerja_bulan;
    }

    /**
     * @return the golongan
     */
    public String getGolongan() {
        return golongan;
    }

    /**
     * @param golongan the golongan to set
     */
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    /**
     * @return the berijazah
     */
    public String getBerijazah() {
        return berijazah;
    }

    /**
     * @param berijazah the berijazah to set
     */
    public void setBerijazah(String berijazah) {
        this.berijazah = berijazah;
    }

    /**
     * @return the persetujuan_dr
     */
    public String getPersetujuan_dr() {
        return persetujuan_dr;
    }

    /**
     * @param persetujuan_dr the persetujuan_dr to set
     */
    public void setPersetujuan_dr(String persetujuan_dr) {
        this.persetujuan_dr = persetujuan_dr;
    }

    /**
     * @return the nmr_persetujuan
     */
    public String getNmr_persetujuan() {
        return nmr_persetujuan;
    }

    /**
     * @param nmr_persetujuan the nmr_persetujuan to set
     */
    public void setNmr_persetujuan(String nmr_persetujuan) {
        this.nmr_persetujuan = nmr_persetujuan;
    }

    /**
     * @return the tmt_persetujuan
     */
    public String getTmt_persetujuan() {
        return tmt_persetujuan;
    }

    /**
     * @param tmt_persetujuan the tmt_persetujuan to set
     */
    public void setTmt_persetujuan(String tmt_persetujuan) {
        this.tmt_persetujuan = tmt_persetujuan;
    }

    /**
     * @return the tanggal_penyimpanan_surat
     */
    public String getTanggal_penyimpanan_surat() {
        return tanggal_penyimpanan_surat;
    }

    /**
     * @param tanggal_penyimpanan_surat the tanggal_penyimpanan_surat to set
     */
    public void setTanggal_penyimpanan_surat(String tanggal_penyimpanan_surat) {
        this.tanggal_penyimpanan_surat = tanggal_penyimpanan_surat;
    }

    /**
     * @return the kode_operator
     */
    public String getKode_operator() {
        return kode_operator;
    }

    /**
     * @param kode_operator the kode_operator to set
     */
    public void setKode_operator(String kode_operator) {
        this.kode_operator = kode_operator;
    }
}
