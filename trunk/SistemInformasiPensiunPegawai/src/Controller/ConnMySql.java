/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author a9uszT
 */
public class ConnMySql {

//    private static String jdbcURL = "jdbc:mysql://localhost:3306/SI-Pensiun";
//    private static String user = "root";
//    private static String password = "";
    
//    private static String jdbcURL = "jdbc:mysql://10.40.41.142:3306/SI-Pensiun-kp";//setinganku
//    private static String user = "simdinas";
//    private static String password = "simdinas";
    
    private static String jdbcURL = "jdbc:mysql://localhost:3306/si-Pensiun-kp";
    private static String user = "root";
    private static String password = "";
    private static Connection connection = null;

    /**
     * Creates a new instance of UserConnection
     */

    public static Connection getConnections() throws Exception {
        if (connection == null) {
            Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(jdbcURL, user, password);
        }
        return connection;
    }
}
