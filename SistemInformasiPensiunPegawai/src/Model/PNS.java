/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a9uszT
 */
public class PNS {
    private String nip_baru;
    private String nip_lama;
    private String nama_pns;
    private String id_SuratCPNS;
    private String id_SuratPangkatTerakhir;
    private String id_SuratSPTKGTerakhir;
    private String id_SuratKarpeg;
    private String id_SuratNikah;
    private String id_SuratNIPBaru;
    private String id_Suratkk;
    private String jk;
    private String status;

    public PNS(String nip_baru, String nip_lama, String nama_pns, 
            String id_SuratCPNS, String id_SuratPangkatTerakhir,
            String id_SuratSPTKGTerakhir, String id_SuratKarpeg,
            String id_SuratNikah, String id_SuratNIPBaru, String id_Suratkk,
            String jk,String status) {
        this.nip_baru = nip_baru;
        this.nip_lama = nip_lama;
        this.nama_pns = nama_pns;
        this.id_SuratCPNS = id_SuratCPNS;
        this.id_SuratPangkatTerakhir = id_SuratPangkatTerakhir;
        this.id_SuratSPTKGTerakhir = id_SuratSPTKGTerakhir;
        this.id_SuratKarpeg = id_SuratKarpeg;
        this.id_SuratNikah = id_SuratNikah;
        this.id_SuratNIPBaru = id_SuratNIPBaru;
        this.id_Suratkk = id_Suratkk;
        this.jk = jk;
        this.status = status;
    }

    public PNS() {
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
     * @return the nama_pns
     */
    public String getNama_pns() {
        return nama_pns;
    }

    /**
     * @param nama_pns the nama_pns to set
     */
    public void setNama_pns(String nama_pns) {
        this.nama_pns = nama_pns;
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
     * @return the id_SuratSPTKGTerakhir
     */
    public String getId_SuratSPTKGTerakhir() {
        return id_SuratSPTKGTerakhir;
    }

    /**
     * @param id_SuratSPTKGTerakhir the id_SuratSPTKGTerakhir to set
     */
    public void setId_SuratSPTKGTerakhir(String id_SuratSPTKGTerakhir) {
        this.id_SuratSPTKGTerakhir = id_SuratSPTKGTerakhir;
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
     * @return the id_SuratNIPBaru
     */
    public String getId_SuratNIPBaru() {
        return id_SuratNIPBaru;
    }

    /**
     * @param id_SuratNIPBaru the id_SuratNIPBaru to set
     */
    public void setId_SuratNIPBaru(String id_SuratNIPBaru) {
        this.id_SuratNIPBaru = id_SuratNIPBaru;
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
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
