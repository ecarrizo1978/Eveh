/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.controlador;

import eveh.Class.TipoAeronaveClass;
import eveh.Modelo.Logica;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ecarrizo
 */
public class CoordinadorTipoAeronave {
    
    Logica miLogica = new Logica();
    
    public boolean EliminarTipoAeronave(int id) throws SQLException {
        if (miLogica.EliminaTipoAeronave(id)) {
            return true;
        }
        return false;
    }

    public boolean ModificarTipoAeronave(int id,String deta,int vig) throws SQLException {
        TipoAeronaveClass ta = new TipoAeronaveClass();
        ta.setId_tipo_Aeronave(id);
        ta.setDetalle(deta);
        ta.setVigencia(vig);
        if (miLogica.ModificarTipoAeronave(ta)) {
            return true;
        }
        return false;
    }

    public TipoAeronaveClass ListarTipoAeronaveById(int id) throws SQLException {
        TipoAeronaveClass ta = new TipoAeronaveClass();
        ta = miLogica.ListarTipoAeronaveById(id);
        return ta;
    }

    public ArrayList<TipoAeronaveClass> ListarTipoAeronave() throws SQLException {
        ArrayList listaTiposAeronaves = new ArrayList();
        listaTiposAeronaves = miLogica.ListarTipoAeronave();
        return listaTiposAeronaves;
    }

    public boolean IngresarTipoAeronave(String deta,int vig) throws SQLException {
        TipoAeronaveClass ta = new TipoAeronaveClass();
        ta.setDetalle(deta);
        ta.setVigencia(vig);
        if (miLogica.IngresoTipoAeronave(ta)) {
            return true;
        }
        return false;
    }
    
    
}
