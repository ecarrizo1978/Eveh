/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.controlador;

import eveh.Class.*;
import eveh.Modelo.*;

import eveh.View.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ecarrizo
 */
public class Coordinador {

    MenuView m = new MenuView();
    Logica miLogica = new Logica();

    public boolean IngresarAeronave(AeronaveClass aeronave) throws SQLException {
        if (miLogica.IngresoAeronave(aeronave)) {
            return true;
        }
        return false;
    }

    public boolean EliminarAeronave(String matricula) throws SQLException {
        if (miLogica.EliminaAeronave(matricula)) {
            return true;
        }
        return false;
    }

    public boolean ModificarAeronave(AeronaveClass aeronave) throws SQLException {
        if (miLogica.ModificarAeronave(aeronave)) {
            return true;
        }
        return false;
    }

    public AeronaveClass ListarAeronaveByMatricula(String matricula) throws SQLException {
        AeronaveClass a = new AeronaveClass();
        a = miLogica.ListarAeronaveByMatricula(matricula);
        return a;
    }

    public boolean EliminarTipoAeronave(int id) throws SQLException {
        if (miLogica.EliminaTipoAeronave(id)) {
            return true;
        }
        return false;
    }

    public boolean ModificarTipoAeronave(TipoAeronaveClass tAeronave) throws SQLException {
        if (miLogica.ModificarTipoAeronave(tAeronave)) {
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

    public boolean IngresarTipoAeronave(TipoAeronaveClass tAeronave) throws SQLException {
        if (miLogica.IngresoTipoAeronave(tAeronave)) {
            return true;
        }
        return false;
    }

    public boolean ValidaLogin(LoginClass login) throws SQLException {
        if (miLogica.validaLogin(login)) {
            this.mostrarVentanaMenu();
            return true;
        }
        return false;
    }

////////////////////////////////////////////////////////////    
    public void mostrarVentanaMenu() {
        m.setExtendedState(JFrame.MAXIMIZED_BOTH);
        m.setVisible(true);
        
    }

    public HashMap<String, Integer> ComboTipo() throws SQLException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ComboBox cbxt;
        ArrayList<TipoAeronaveClass> ArrayTipoAeronave = ListarTipoAeronave();
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
