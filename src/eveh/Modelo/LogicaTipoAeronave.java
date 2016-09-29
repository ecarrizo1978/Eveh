/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Modelo;

import eveh.Class.TipoAeronaveClass;
import eveh.Dao.TipoAeronveDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ecarrizo
 */
public class LogicaTipoAeronave {
    
    public boolean EliminaTipoAeronave(int id) throws SQLException {

        TipoAeronveDao miTAeronave = new TipoAeronveDao();
        int res = miTAeronave.EliminarTipoAeronaveByID(id);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, " Eliminación Exitosa ", "Error", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (res == 3) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Tipo Aeronave ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Error... ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean IngresoTipoAeronave(TipoAeronaveClass tAeronave) throws SQLException {
        TipoAeronveDao miTAeronave = new TipoAeronveDao();
        int res = miTAeronave.IngrsarTipoAeronaveDao(tAeronave);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, " Ingreso Exitoso ", "Error", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (res == 3) {
            JOptionPane.showMessageDialog(null, "Error al ingresar Tipo Aeronave ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Error Tipo Aeronave ya existe ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public ArrayList<TipoAeronaveClass> ListarTipoAeronave() throws SQLException {
        ArrayList listaTiposAeronaves = new ArrayList();
        TipoAeronveDao miTAeronave = new TipoAeronveDao();
        listaTiposAeronaves = miTAeronave.MostrarTipoAeronave();
        return listaTiposAeronaves;
    }

    public TipoAeronaveClass ListarTipoAeronaveById(int id) throws SQLException {
        TipoAeronaveClass ta = new TipoAeronaveClass();
        TipoAeronveDao miTAeronave = new TipoAeronveDao();
        ta = miTAeronave.MostrarTipoAeronaveByID(id);
        return ta;
    }

    public boolean ModificarTipoAeronave(TipoAeronaveClass tAeronave) throws SQLException {
        TipoAeronveDao miTAeronave = new TipoAeronveDao();
        int res = miTAeronave.ModificarTipoAeronaveDao(tAeronave);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, " Modificación Exitosa ", "Error", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (res == 3) {
            JOptionPane.showMessageDialog(null, "Error al ingresar Tipo Aeronave ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Error Tipo Aeronave ya existe ", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }    
    
    
}
