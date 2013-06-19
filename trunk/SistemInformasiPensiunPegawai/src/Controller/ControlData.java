/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.sql.Connection;



/**
 *
 * @author a9uszT
 */
public class ControlData {
private Connection conn;

    public ControlData(Connection conn) {
        this.conn = conn;
    }

    public static ControlData getKoneksi() throws Exception {
        ControlData control = new ControlData(ConnMySql.getConnections());
        return control;
    }

    public boolean Login(String id, String passwd) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String cariPegawai(String id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
