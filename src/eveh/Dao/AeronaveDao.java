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
import oracle.jdbc.OracleTypes;

/**
 *
 * @author ecarrizo
 */
public class AeronaveDao {

    Conexion conn;

    public AeronaveDao() {
        conn = new Conexion();
    }

    public int IngresarAeronave(AeronaveClass miAeronave) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_AERONAVE.AGREGAR_AERONAVE(?,?,?,?,?,?,?,?)}");
        cst.setString(1, miAeronave.getMatricula().toString());
        cst.setInt(2, miAeronave.getHorasVuelo());
        cst.setInt(3, miAeronave.getAnioFabricacion());
        cst.setString(4, miAeronave.getFechaMantencion());
        cst.setInt(5, miAeronave.getDisponible());
        cst.setInt(6, miAeronave.getVigencia());
        cst.setInt(7, miAeronave.getTipoAeronave());
        cst.registerOutParameter(8, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(8);
        conn.desonectarBD();
        return respuesta;
    }

    public int ModificarAeronaveDao(AeronaveClass miAeronave) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_TIPO_AERONAVE.MODIFICAR_AERONAVE(?,?,?,?,?,?,?,?,?)}");
        cst.setInt(1, miAeronave.getIdAeronave());
        cst.setString(2, miAeronave.getMatricula());
        cst.setInt(3, miAeronave.getHorasVuelo());
        cst.setInt(4, miAeronave.getAnioFabricacion());
        cst.setString(5, miAeronave.getFechaMantencion());
        cst.setInt(6, miAeronave.getDisponible());
        cst.setInt(7, miAeronave.getVigencia());
        cst.setInt(8, miAeronave.getTipoAeronave());
        cst.registerOutParameter(9, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(8);
        conn.desonectarBD();
        return respuesta;
    }

    public int EliminarAeronaveByMatricula(String matricula) throws SQLException {
        Connection acceso = conn.getCnn();
        CallableStatement cst = acceso.prepareCall("{call PKG_AERONAVE.ELIMINAR_AERONAVE(?,?)}");
        cst.setString(1, matricula);
        cst.registerOutParameter(2, java.sql.Types.NUMERIC);
        cst.execute();
        int respuesta = cst.getInt(2);
        conn.desonectarBD();
        return respuesta;
    }

    public AeronaveClass MostrarAeronaveByMatricula(String matricula) throws SQLException {
        AeronaveClass a = new AeronaveClass();
        Connection acceso = conn.getCnn();

        CallableStatement cst = acceso.prepareCall("{call PKG_AERONAVE.SELECCIONAR_AERONAVE_MATRICULA(?,?)}");
        cst.setString(1, matricula);
        System.out.println(matricula);
        cst.registerOutParameter(2, OracleTypes.CURSOR); //Obtiene la Lista del CURSOR en base a la posicion del parametro. 
        cst.execute();
        ResultSet rs = (ResultSet) cst.getObject(2); //Forma #1	
        while (rs.next()) {

            a.setIdAeronave(rs.getInt("ID_AERONAVE"));
            a.setMatricula(rs.getString("MATRICULA"));
            a.setHorasVuelo(rs.getInt("HORAS_VUELO"));
            a.setAnioFabricacion(rs.getInt("ANIO_FABRICACION"));
            a.setFechaMantencion(rs.getString("FECHA_PROX_MANTENIMIENTO"));
            a.setDisponible(rs.getInt("DISPONIBLE"));
            a.setVigencia(rs.getInt("VIGENCIA"));
            a.setTipoAeronave(rs.getInt("TIPO_AERONAVE_ID_TIPO_AERONAVE"));
        }
        return a;
    }

}
