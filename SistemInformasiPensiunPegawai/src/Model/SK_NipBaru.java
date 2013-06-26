/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mich
 */
public class SK_NipBaru {
    private String id_suratNIPBaru;
    private String nama_pemilik;
    private String nip_lama;
    private String tanggal_lahir;
    private String tmt_cpns;
    private String jenis_kelamin;
    private String nip_baru;
    private String unit_kerja;

    public SK_NipBaru(){}
    public SK_NipBaru(String id,String nama,String nip_lm,String tgl_lhr,
            String tmt_cpns,String jk,String nip_br,String unit){
        this.id_suratNIPBaru = id;
        this.nama_pemilik = nama;
        this.nip_lama = nip_lm;
        this.tanggal_lahir = tgl_lhr;
        this.tmt_cpns = tmt_cpns;
        this.jenis_kelamin = jk;
        this.nip_baru = nip_br;
        this.unit_kerja = unit;
    }
    /**
     * @return the id_suratNIPBaru
     */
    public String getId_suratNIPBaru() {
        return id_suratNIPBaru;
    }

    /**
     * @param id_suratNIPBaru the id_suratNIPBaru to set
     */
    public void setId_suratNIPBaru(String id_suratNIPBaru) {
        this.id_suratNIPBaru = id_suratNIPBaru;
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

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
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
     * @return the unit_kerja
     */
    public String getUnit_kerja() {
        return unit_kerja;
    }

    /**
     * @param unit_kerja the unit_kerja to set
     */
    public void setUnit_kerja(String unit_kerja) {
        this.unit_kerja = unit_kerja;
    }
    
}
