/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mich
 */
public class SK_Karpeg {
    private String id_SuratKarpeg;
    private String nip_lama;
    private String nip_baru;
    private String nama_pemilik;
    private String tanggal_lahir;
    private String tmt_cpns;
    
    public SK_Karpeg(){}
    public SK_Karpeg(String id,String nip_lm,String nip_br,String nama,
            String tgl_lhr,String tmt){
        this.id_SuratKarpeg = id;
        this.nip_lama = nip_lm;
        this.nip_baru = nip_br;
        this.nama_pemilik = nama;
        this.tanggal_lahir = tgl_lhr;
        this.tmt_cpns = tmt;
    }
    /**
     * @return the id_SuratKarpeg
     */
    public String getId_SuratKarpeg() {
        return id_SuratKarpeg;
    }

    /**
     * @param id_SuratKarpeg the id_SuratKarpeg to set
     */
    public void setId_SuratKarpeg(String id_SuratKarpeg) {
        this.id_SuratKarpeg = id_SuratKarpeg;
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
     * @return the tmt_cpns
     */
    public String getTmt_cpns() {
        return tmt_cpns;
    }

    /**
     * @param tmt_cpns the tmt_cpns to set
     */
    public void setTmt_cpns(String tmt_cpns) {
        this.tmt_cpns = tmt_cpns;
    }
    
}
