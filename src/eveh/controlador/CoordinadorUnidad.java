/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.controlador;

import eveh.Class.TipoAeronaveClass;
import eveh.Class.UnidadClass;
import eveh.Modelo.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ecarrizo
 */
public class CoordinadorUnidad {

    LogicaUnidad miLogica = new LogicaUnidad();
    
    public boolean IngresarUnidad(UnidadClass unidad) throws SQLException {
        if (miLogica.IngresoUnidad(unidad)) {
            return true;
        }
        return false;
    }

    public ArrayList<UnidadClass> ListarUnidades() throws SQLException {
        ArrayList listaUnidades = new ArrayList();
        listaUnidades = miLogica.ListarUnidades();
        return listaUnidades;
    }    
  
    public boolean ModificarUnidad(UnidadClass unidad) throws SQLException {
        if (miLogica.ModificarUnidad(unidad)) {
            return true;
        }
        return false;
    }    
    
    public boolean EliminarUnidad(int id) throws SQLException {
        if (miLogica.EliminaUnidad(id)) {
            return true;
        }
        return false;
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    




//    public TipoAeronaveClass ListarTipoAeronaveById(int id) throws SQLException {
//        TipoAeronaveClass ta = new TipoAeronaveClass();
//        ta = miLogica.ListarTipoAeronaveById(id);
//        return ta;
//    }






    
}
