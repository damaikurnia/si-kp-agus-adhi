/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mich
 */
public class Operator {

    private String idPegawai;
    private String passwordPegawai;
    private String kode_operator;

    public Operator() {
    }

    public Operator(String id, String password, String kode_op) {
        this.idPegawai = id;
        this.passwordPegawai = password;
        this.kode_operator = kode_op;
    }

    /**
     * @return the idPegawai
     */
    public String getIdPegawai() {
        return idPegawai;
    }

    /**
     * @param idPegawai the idPegawai to set
     */
    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    /**
     * @return the passwordPegawai
     */
    public String getPasswordPegawai() {
        return passwordPegawai;
    }

    /**
     * @param passwordPegawai the passwordPegawai to set
     */
    public void setPasswordPegawai(String passwordPegawai) {
        this.passwordPegawai = passwordPegawai;
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
