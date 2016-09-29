/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ecarrizo
 */
public class Conexion {

    private final String USERNAME = "portafolio";
    private final String PASSWORD = "portafolio";
    private final String PORT = "1521";
    private final String HOST = "localhost";
    private final String SID = "xe";
    private final String CLASSNAME = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@" + HOST + ":" + PORT + ":" + SID;
    private Connection cnn;

    public Conexion() {
        this.conectarBD();
    }

    public Connection getCnn() {
        return cnn;
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }

    private void conectarBD() {

        try {
            Class.forName(CLASSNAME);
            try {
                this.setCnn(DriverManager.getConnection(URL, USERNAME, PASSWORD));
                System.out.println("CONEXION CORRECTA");
            } catch (SQLException ee) {
                System.out.println(ee.getMessage());
            }
        } catch (ClassNotFoundException ee) {
            System.out.println(ee.getMessage());
        }
    }

    public void desonectarBD() {
        try {
            this.getCnn().close();
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

    }

}
