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

    public S_Nikah() {
    }

    public S_Nikah(String id_SuratNikah, String tanggal_nikah, String nama_suami, String nama_istri) {
        this.id_SuratNikah = id_SuratNikah;
        this.tanggal_nikah = tanggal_nikah;
        this.nama_suami = nama_suami;
        this.nama_istri = nama_istri;
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
    
}
