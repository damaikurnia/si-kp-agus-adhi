/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a9uszT
 */
public class S_Nikah {
    private String id_SuratNikah;
    private String tanggal_nikah;
    private String nama_suami;
    private String nama_istri;
    private String tanggal_penyimpanan_surat;
    private String kode_operator;

    public S_Nikah() {
    }

    /**
     * @return the id_SuratNikah
     */
    public String getId_SuratNikah() {
        return id_SuratNikah;
    }

    /**
     * @param id_SuratNikah the id_SuratNikah to set
     */
    public void setId_SuratNikah(String id_SuratNikah) {
        this.id_SuratNikah = id_SuratNikah;
    }

    /**
     * @return the tanggal_nikah
     */
    public String getTanggal_nikah() {
        return tanggal_nikah;
    }

    /**
     * @param tanggal_nikah the tanggal_nikah to set
     */
    public void setTanggal_nikah(String tanggal_nikah) {
        this.tanggal_nikah = tanggal_nikah;
    }

    /**
     * @return the nama_suami
     */
    public String getNama_suami() {
        return nama_suami;
    }

    /**
     * @param nama_suami the nama_suami to set
     */
    public void setNama_suami(String nama_suami) {
        this.nama_suami = nama_suami;
    }

    /**
     * @return the nama_istri
     */
    public String getNama_istri() {
        return nama_istri;
    }

    /**
     * @param nama_istri the nama_istri to set
     */
    public void setNama_istri(String nama_istri) {
        this.nama_istri = nama_istri;
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
