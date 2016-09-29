/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.controlador;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


import eveh.Class.*;
import eveh.Modelo.*;
import eveh.View.*;

public class CoordinadorComboBox {

    CoordinadorTipoAeronave cta = new CoordinadorTipoAeronave();
    CoordinadorUnidad cu = new CoordinadorUnidad();
    
    public HashMap<String, Integer> ComboUnidad() throws SQLException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ComboBox cbxt;
        ArrayList<UnidadClass> ArrayUnidades = cu.ListarUnidades();
        int largo = ArrayUnidades.size();
        for (int x = 0; x < largo; x++) {
            cbxt = new ComboBox(ArrayUnidades.get(x).getId_unidad(), ArrayUnidades.get(x).getDetalle());
            map.put(cbxt.getValor(), cbxt.getId());
        }
        return map;
    }
    
    
    
    public HashMap<String, Integer> ComboTipoAeronave() throws SQLException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ComboBox cbxt;
        ArrayList<TipoAeronaveClass> ArrayTipoAeronave = cta.ListarTipoAeronave();
        int largo = ArrayTipoAeronave.size();
        for (int x = 0; x < largo; x++) {
            cbxt = new ComboBox(ArrayTipoAeronave.get(x).getId_tipo_Aeronave(), ArrayTipoAeronave.get(x).getDetalle());
            map.put(cbxt.getValor(), cbxt.getId());
        }
        return map;
    }

    public HashMap<String, Integer> ComboVigencia() throws SQLException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ComboBox cbxt;
        cbxt = new ComboBox(1, "Si");
        map.put(cbxt.getValor(), cbxt.getId());
        cbxt = new ComboBox(0, "No");
        map.put(cbxt.getValor(), cbxt.getId());
        return map;
    }

    public HashMap<String, Integer> ComboDisponible() throws SQLException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ComboBox cbxt;
        cbxt = new ComboBox(1, "Si");
        map.put(cbxt.getValor(), cbxt.getId());
        cbxt = new ComboBox(0, "No");
        map.put(cbxt.getValor(), cbxt.getId());
        return map;
    }
    
    
}
