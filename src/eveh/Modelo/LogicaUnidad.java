/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Modelo;

import eveh.Class.*;
import eveh.Dao.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ecarrizo
 */
public class LogicaUnidad {
    
    public boolean IngresoUnidad(UnidadClass unidad) throws SQLException {
        UnidadDao miUnidad = new UnidadDao();
        int res = miUnidad.IngrsarUnidad(unidad);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, " Ingreso Exitoso ", "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (res == 3) {
            JOptionPane.showMessageDialog(null, "Problemas para ingresar Unidad", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Unidad ya existe ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public ArrayList<UnidadClass> ListarUnidades() throws SQLException {
        ArrayList listaUnidades = new ArrayList();
        UnidadDao miUnidad = new UnidadDao();
        listaUnidades = miUnidad.MostrarUnidades();
        return listaUnidades;
    }    
    
    public boolean ModificarUnidad(UnidadClass unidad) throws SQLException {
        UnidadDao miUnidad = new UnidadDao();
        int res = miUnidad.ModificarUnidad(unidad);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, " Modificación Exitosa ", "Error", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (res == 3) {
            JOptionPane.showMessageDialog(null, "Error al cambiar Vigencia, Unidad utilizada... ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Error Unidad ya existe ", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }        
    
    public boolean EliminaUnidad(int id) throws SQLException {
        UnidadDao miUnidad = new UnidadDao();
        int res = miUnidad.EliminarUnidadByID(id);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, " Eliminación Exitosa ", "Error", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (res == 3) {
            JOptionPane.showMessageDialog(null, "Error al eliminar, Unidad utilizada...", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Error Inesperado... ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }


    
    
}
