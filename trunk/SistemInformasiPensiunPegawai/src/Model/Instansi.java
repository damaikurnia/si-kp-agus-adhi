/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author a9uszT
 */
public class Instansi {

    private String idInstansi;
    private String nmInstansi;
    private String nm_kepala;
    private String nip_kepala;
    private String pangkatGolkepala;
    private PNS pns;

    public Instansi() {
    }

    public Instansi(String idInstansi, String nmInstansi, String nm_kepala, String nip_kepala, String pangkatGolkepala, PNS pns) {
        this.idInstansi = idInstansi;
        this.nmInstansi = nmInstansi;
        this.nm_kepala = nm_kepala;
        this.nip_kepala = nip_kepala;
        this.pangkatGolkepala = pangkatGolkepala;
        this.pns = pns;
    }

  

   

    /**
     * @return the idInstansi
     */
    public String getIdInstansi() {
        return idInstansi;
    }

    /**
     * @param idInstansi the idInstansi to set
     */
    public void setIdInstansi(String idInstansi) {
        this.idInstansi = idInstansi;
    }

    /**
     * @return the nm_kepala
     */
    public String getNm_kepala() {
        return nm_kepala;
    }

    /**
     * @param nm_kepala the nm_kepala to set
     */
    public void setNm_kepala(String nm_kepala) {
        this.nm_kepala = nm_kepala;
    }

    /**
     * @return the nip_kepala
     */
    public String getNip_kepala() {
        return nip_kepala;
    }

    /**
     * @param nip_kepala the nip_kepala to set
     */
    public void setNip_kepala(String nip_kepala) {
        this.nip_kepala = nip_kepala;
    }

    /**
     * @return the pns
     */
    public PNS getPns() {
        return pns;
    }

    /**
     * @param pns the pns to set
     */
    public void setPns(PNS pns) {
        this.pns = pns;
    }

    /**
     * @return the nmInstansi
     */
    public String getNmInstansi() {
        return nmInstansi;
    }

    /**
     * @param nmInstansi the nmInstansi to set
     */
    public void setNmInstansi(String nmInstansi) {
        this.nmInstansi = nmInstansi;
    }

    /**
     * @return the pangkatGolkepala
     */
    public String getPangkatGolkepala() {
        return pangkatGolkepala;
    }

    /**
     * @param pangkatGolkepala the pangkatGolkepala to set
     */
    public void setPangkatGolkepala(String pangkatGolkepala) {
        this.pangkatGolkepala = pangkatGolkepala;
    }
}
