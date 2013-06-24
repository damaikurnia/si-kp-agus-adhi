/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a9uszT
 */
public class KK {
    private String id_Suratkk;
    private String nama_kk;
    private String Alamat;
    private String RT;
    private String RW;
    private String Kelurahan_Desa;
    private String Kecamatan;
    private String Kabupaten_Kota;
    private String kode_pos;
    private String provinsi;

    public KK() {
    }

    public KK(String id_Suratkk, String nama_kk, String Alamat, String RT, String RW, String Kelurahan_Desa, String Kecamatan, String Kabupaten_Kota, String kode_pos, String provinsi) {
        this.id_Suratkk = id_Suratkk;
        this.nama_kk = nama_kk;
        this.Alamat = Alamat;
        this.RT = RT;
        this.RW = RW;
        this.Kelurahan_Desa = Kelurahan_Desa;
        this.Kecamatan = Kecamatan;
        this.Kabupaten_Kota = Kabupaten_Kota;
        this.kode_pos = kode_pos;
        this.provinsi = provinsi;
    }

    /**
     * @return the id_Suratkk
     */
    public String getId_Suratkk() {
        return id_Suratkk;
    }

    /**
     * @param id_Suratkk the id_Suratkk to set
     */
    public void setId_Suratkk(String id_Suratkk) {
        this.id_Suratkk = id_Suratkk;
    }

    /**
     * @return the nama_kk
     */
    public String getNama_kk() {
        return nama_kk;
    }

    /**
     * @param nama_kk the nama_kk to set
     */
    public void setNama_kk(String nama_kk) {
        this.nama_kk = nama_kk;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * @return the RT
     */
    public String getRT() {
        return RT;
    }

    /**
     * @param RT the RT to set
     */
    public void setRT(String RT) {
        this.RT = RT;
    }

    /**
     * @return the RW
     */
    public String getRW() {
        return RW;
    }

    /**
     * @param RW the RW to set
     */
    public void setRW(String RW) {
        this.RW = RW;
    }

    /**
     * @return the Kelurahan_Desa
     */
    public String getKelurahan_Desa() {
        return Kelurahan_Desa;
    }

    /**
     * @param Kelurahan_Desa the Kelurahan_Desa to set
     */
    public void setKelurahan_Desa(String Kelurahan_Desa) {
        this.Kelurahan_Desa = Kelurahan_Desa;
    }

    /**
     * @return the Kecamatan
     */
    public String getKecamatan() {
        return Kecamatan;
    }

    /**
     * @param Kecamatan the Kecamatan to set
     */
    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    /**
     * @return the Kabupaten_Kota
     */
    public String getKabupaten_Kota() {
        return Kabupaten_Kota;
    }

    /**
     * @param Kabupaten_Kota the Kabupaten_Kota to set
     */
    public void setKabupaten_Kota(String Kabupaten_Kota) {
        this.Kabupaten_Kota = Kabupaten_Kota;
    }

    /**
     * @return the kode_pos
     */
    public String getKode_pos() {
        return kode_pos;
    }

    /**
     * @param kode_pos the kode_pos to set
     */
    public void setKode_pos(String kode_pos) {
        this.kode_pos = kode_pos;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
}
