/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Dao;

import eveh.Class.*;
import eveh.Conexion.Conexion;
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
public class UnidadDao {
    
    Conexion conn;

    public UnidadDao() {
        conn = new Conexion();
    }

    public int IngrsarUnidad(UnidadClass unidad) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_UNIDAD.AGREGAR_UNIDAD(?,?,?)}");
        cst.setString(1, unidad.getDetalle());
        cst.setInt(2, unidad.getVigencia());
        cst.registerOutParameter(3, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(3);
        conn.desonectarBD();
        return respuesta;
    }

    public ArrayList<UnidadClass> MostrarUnidades() throws SQLException {
        ArrayList listaUnidades = new ArrayList();
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_UNIDAD.SELECCIONAR_TODO_UNIDAD(?)}");
        cst.registerOutParameter(1, OracleTypes.CURSOR); //Obtiene la Lista del CURSOR en base a la posicion del parametro. 
        cst.execute();
        ResultSet rs = (ResultSet) cst.getObject(1); //Forma #1	
        while (rs.next()) {
            UnidadClass uc = new UnidadClass();
            uc.setId_unidad(rs.getInt("ID_UNIDAD"));
            uc.setDetalle(rs.getString("DESCRIPCION"));
            uc.setVigencia(rs.getInt("VIGENCIA"));
            listaUnidades.add(uc);
        }
        return listaUnidades;
    }

    public int ModificarUnidad(UnidadClass unidad) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_UNIDAD.MODIFICAR_UNIDAD(?,?,?,?)}");
        cst.setInt(1, unidad.getId_unidad());
        cst.setString(2, unidad.getDetalle());
        cst.setInt(3, unidad.getVigencia());
        cst.registerOutParameter(4, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(4);
        conn.desonectarBD();
        System.out.println(respuesta);
        return respuesta;
    }    
    
    public int EliminarUnidadByID(int id) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_UNIDAD.ELIMINAR_UNIDAD(?,?)}");
        cst.setInt(1, id);
        cst.registerOutParameter(2, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(2);
        conn.desonectarBD();
        return respuesta;
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    
//    public TipoAeronaveClass MostrarTipoAeronaveByID(int id) throws SQLException {
//        TipoAeronaveClass ta = new TipoAeronaveClass();
//        Connection acceso = conn.getCnn();
//
//        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.SELECCIONAR_TIPO_AERONAVE_ID(?,?)}");
//        cst.setInt(1, id);
//        cst.registerOutParameter(2, OracleTypes.CURSOR); //Obtiene la Lista del CURSOR en base a la posicion del parametro. 
//        cst.execute();
//        ResultSet rs = (ResultSet) cst.getObject(2); //Forma #1	
//        while (rs.next()) {
//            ta.setId_tipo_Aeronave(rs.getInt("ID_TIPO_AERONAVE"));
//            ta.setDetalle(rs.getString("DETALLE"));
//            ta.setVigencia(rs.getInt("VIGENCIA"));
//        }
//        return ta;
//    }




}
