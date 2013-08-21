/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a9uszT
 */
public class DataAPS {

    private String nip;
    private String nama;
    private String tanggalAPS;
    private String alasan;

    public DataAPS() {
    }

    public DataAPS(String nip, String nama, String tanggalAPS, String alasan) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalAPS = tanggalAPS;
        this.alasan = alasan;
    }

    
    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tanggalAPS
     */
    public String getTanggalAPS() {
        return tanggalAPS;
    }

    /**
     * @param tanggalAPS the tanggalAPS to set
     */
    public void setTanggalAPS(String tanggalAPS) {
        this.tanggalAPS = tanggalAPS;
    }

    /**
     * @return the alasan
     */
    public String getAlasan() {
        return alasan;
    }

    /**
     * @param alasan the alasan to set
     */
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
}
