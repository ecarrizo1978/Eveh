/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Dao;

import eveh.Class.*;
import eveh.Conexion.Conexion;
import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author ecarrizo
 */
public class TipoAeronveDao {

    Conexion conn;

    public TipoAeronveDao() {
        conn = new Conexion();
    }

    public int IngrsarTipoAeronaveDao(TipoAeronaveClass tAeronave) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.AGREGAR_TIPO_AERONAVE(?,?,?)}");
        cst.setString(1, tAeronave.getDetalle());
        cst.setInt(2, tAeronave.getVigencia());
        cst.registerOutParameter(3, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(3);
        conn.desonectarBD();
        return respuesta;
    }

    public ArrayList<TipoAeronaveClass> MostrarTipoAeronave() throws SQLException {
        ArrayList listaTiposAeronaves = new ArrayList();
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.SELECCIONAR_TODO_TIPO_AERONAVE(?)}");
        cst.registerOutParameter(1, OracleTypes.CURSOR); //Obtiene la Lista del CURSOR en base a la posicion del parametro. 
        cst.execute();
        ResultSet rs = (ResultSet) cst.getObject(1); //Forma #1	

        while (rs.next()) {
            TipoAeronaveClass ta = new TipoAeronaveClass();
            ta.setId_tipo_Aeronave(rs.getInt("ID_TIPO_AERONAVE"));
            ta.setDetalle(rs.getString("DETALLE"));
            ta.setVigencia(rs.getInt("VIGENCIA"));
            listaTiposAeronaves.add(ta);
        }
        return listaTiposAeronaves;
    }

    public TipoAeronaveClass MostrarTipoAeronaveByID(int id) throws SQLException {
        TipoAeronaveClass ta = new TipoAeronaveClass();
        Connection acceso = conn.getCnn();

        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.SELECCIONAR_TIPO_AERONAVE_ID(?,?)}");
        cst.setInt(1, id);
        cst.registerOutParameter(2, OracleTypes.CURSOR); //Obtiene la Lista del CURSOR en base a la posicion del parametro. 
        cst.execute();
        ResultSet rs = (ResultSet) cst.getObject(2); //Forma #1	
        while (rs.next()) {
            ta.setId_tipo_Aeronave(rs.getInt("ID_TIPO_AERONAVE"));
            ta.setDetalle(rs.getString("DETALLE"));
            ta.setVigencia(rs.getInt("VIGENCIA"));
        }
        return ta;
    }

    public int ModificarTipoAeronaveDao(TipoAeronaveClass tAeronave) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.MODIFICAR_TIPO_AERONAVE(?,?,?,?)}");
        cst.setInt(1, tAeronave.getId_tipo_Aeronave());
        cst.setString(2, tAeronave.getDetalle());
        cst.setInt(3, tAeronave.getVigencia());
        cst.registerOutParameter(4, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(4);
        conn.desonectarBD();
        System.out.println(respuesta);
        return respuesta;
    }

    public int EliminarTipoAeronaveByID(int id) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.ELIMINAR_TIPO_AERONAVE(?,?)}");
        cst.setInt(1, id);
        cst.registerOutParameter(2, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(2);
        conn.desonectarBD();
        return respuesta;
    }

}
