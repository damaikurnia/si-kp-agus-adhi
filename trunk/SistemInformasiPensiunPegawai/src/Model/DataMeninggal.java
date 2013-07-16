/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author a9uszT
 */
public class DataMeninggal {
private String no;
    private String nama;
    private String NIP;
    private String tglMeninggal;
    private String anggota_nama;
    private String anggota_alamat;
    private String anggota_pekerjaan;
    private  String Kabupaten;

    public DataMeninggal() {
    }

    public DataMeninggal(String no, String nama, String NIP, String tglMeninggal, String anggota_nama, String anggota_alamat, String anggota_pekerjaan, String Kabupaten) {
        this.no = no;
        this.nama = nama;
        this.NIP = NIP;
        this.tglMeninggal = tglMeninggal;
        this.anggota_nama = anggota_nama;
        this.anggota_alamat = anggota_alamat;
        this.anggota_pekerjaan = anggota_pekerjaan;
        this.Kabupaten = Kabupaten;
    }

   

    
    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
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
     * @return the NIP
     */
    public String getNIP() {
        return NIP;
    }

    /**
     * @param NIP the NIP to set
     */
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    /**
     * @return the tglMeninggal
     */
    public String getTglMeninggal() {
        return tglMeninggal;
    }

    /**
     * @param tglMeninggal the tglMeninggal to set
     */
    public void setTglMeninggal(String tglMeninggal) {
        this.tglMeninggal = tglMeninggal;
    }

    /**
     * @return the anggota_nama
     */
    public String getAnggota_nama() {
        return anggota_nama;
    }

    /**
     * @param anggota_nama the anggota_nama to set
     */
    public void setAnggota_nama(String anggota_nama) {
        this.anggota_nama = anggota_nama;
    }

    /**
     * @return the anggota_alamat
     */
    public String getAnggota_alamat() {
        return anggota_alamat;
    }

    /**
     * @param anggota_alamat the anggota_alamat to set
     */
    public void setAnggota_alamat(String anggota_alamat) {
        this.anggota_alamat = anggota_alamat;
    }

    /**
     * @return the anggota_pekerjaan
     */
    public String getAnggota_pekerjaan() {
        return anggota_pekerjaan;
    }

    /**
     * @param anggota_pekerjaan the anggota_pekerjaan to set
     */
    public void setAnggota_pekerjaan(String anggota_pekerjaan) {
        this.anggota_pekerjaan = anggota_pekerjaan;
    }

    /**
     * @return the Kabupaten
     */
    public String getKabupaten() {
        return Kabupaten;
    }

    /**
     * @param Kabupaten the Kabupaten to set
     */
    public void setKabupaten(String Kabupaten) {
        this.Kabupaten = Kabupaten;
    }

}
