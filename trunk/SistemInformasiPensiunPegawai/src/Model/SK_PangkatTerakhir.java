/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mich
 */
public class SK_PangkatTerakhir {
    private String id_SuratPangkatTerakhir;
    private String nama_pemilik;
    private String tanggal_lahir;
    private String nip_lama;
    private String nip_baru;
    private String pendidikan;
    private String pangkat_lama;
    private String golongan_lama;
    private String tmt_lama;
    private String pangkat_baru;
    private String golongan_baru;
    private String tmt_baru;
    private String masa_kerja_golongan;
    private String gaji_pokok;

    public SK_PangkatTerakhir(){}
    
    public SK_PangkatTerakhir(String id,String nama,String tgl_lhr,String nip_lama,
            String nip_baru,String pend,String pngkt_lm,String gol_lm,String tmt_lm,
            String pngkt_br,String gol_br,String tmt_br,String masa,String gaji){
        this.id_SuratPangkatTerakhir = id;
        this.nama_pemilik = nama;
        this.tanggal_lahir = tgl_lhr;
        this.nip_lama = nip_lama;
        this.nip_baru = nip_baru;
        this.pendidikan = pend;
        this.pangkat_lama = pngkt_lm;
        this.golongan_lama = gol_lm;
        this.tmt_lama = tmt_lm;
        this.pangkat_baru = pngkt_br;
        this.golongan_baru = gol_br;
        this.tmt_baru = tmt_br;
        this.masa_kerja_golongan = masa;
        this.gaji_pokok = gaji;
    }
    /**
     * @return the id_SuratPangkatTerakhir
     */
    public String getId_SuratPangkatTerakhir() {
        return id_SuratPangkatTerakhir;
    }

    /**
     * @param id_SuratPangkatTerakhir the id_SuratPangkatTerakhir to set
     */
    public void setId_SuratPangkatTerakhir(String id_SuratPangkatTerakhir) {
        this.id_SuratPangkatTerakhir = id_SuratPangkatTerakhir;
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
     * @return the pendidikan
     */
    public String getPendidikan() {
        return pendidikan;
    }

    /**
     * @param pendidikan the pendidikan to set
     */
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    /**
     * @return the pangkat_lama
     */
    public String getPangkat_lama() {
        return pangkat_lama;
    }

    /**
     * @param pangkat_lama the pangkat_lama to set
     */
    public void setPangkat_lama(String pangkat_lama) {
        this.pangkat_lama = pangkat_lama;
    }

    /**
     * @return the golongan_lama
     */
    public String getGolongan_lama() {
        return golongan_lama;
    }

    /**
     * @param golongan_lama the golongan_lama to set
     */
    public void setGolongan_lama(String golongan_lama) {
        this.golongan_lama = golongan_lama;
    }

    /**
     * @return the tmt_lama
     */
    public String getTmt_lama() {
        return tmt_lama;
    }

    /**
     * @param tmt_lama the tmt_lama to set
     */
    public void setTmt_lama(String tmt_lama) {
        this.tmt_lama = tmt_lama;
    }

    /**
     * @return the pangkat_baru
     */
    public String getPangkat_baru() {
        return pangkat_baru;
    }

    /**
     * @param pangkat_baru the pangkat_baru to set
     */
    public void setPangkat_baru(String pangkat_baru) {
        this.pangkat_baru = pangkat_baru;
    }

    /**
     * @return the golongan_baru
     */
    public String getGolongan_baru() {
        return golongan_baru;
    }

    /**
     * @param golongan_baru the golongan_baru to set
     */
    public void setGolongan_baru(String golongan_baru) {
        this.golongan_baru = golongan_baru;
    }

    /**
     * @return the tmt_baru
     */
    public String getTmt_baru() {
        return tmt_baru;
    }

    /**
     * @param tmt_baru the tmt_baru to set
     */
    public void setTmt_baru(String tmt_baru) {
        this.tmt_baru = tmt_baru;
    }

    /**
     * @return the masa_kerja_golongan
     */
    public String getMasa_kerja_golongan() {
        return masa_kerja_golongan;
    }

    /**
     * @param masa_kerja_golongan the masa_kerja_golongan to set
     */
    public void setMasa_kerja_golongan(String masa_kerja_golongan) {
        this.masa_kerja_golongan = masa_kerja_golongan;
    }

    /**
     * @return the gaji_pokok
     */
    public String getGaji_pokok() {
        return gaji_pokok;
    }

    /**
     * @param gaji_pokok the gaji_pokok to set
     */
    public void setGaji_pokok(String gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }
    
}
