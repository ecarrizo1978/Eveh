/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Dao;

import eveh.Class.LoginClass;
import eveh.Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ecarrizo
 */
public class LoginDao {

    Conexion conn;

    public LoginDao() {
        conn = new Conexion();
    }

    public Boolean ConsultaUsuario(LoginClass miLogin) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_USUARIO.VALIDAR_USUARIO(?,?,?)}");
        cst.setString(1, miLogin.getUsuario());
        cst.setString(2, miLogin.getPassword());
        cst.registerOutParameter(3, java.sql.Types.NUMERIC);
        cst.execute();

        int respuesta = cst.getInt(3);

        conn.desonectarBD();

        if (respuesta == 0) {
            return false;
        } else {
            return true;
        }
    }

}
