/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Class;

/**
 *
 * @author ecarrizo
 */
public class UnidadClass {
    
    public int id_unidad;
    public String detalle;
    public int vigencia;
    private String Vig;
    
    public UnidadClass() {
    }

    public UnidadClass(int id_unidad, String detalle, int vigencia, String Vig) {
        this.id_unidad = id_unidad;
        this.detalle = detalle;
        this.vigencia = vigencia;
        this.Vig = Vig;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public String getVig() {
        return Vig;
    }

    public void setVig(String Vig) {
        this.Vig = Vig;
    }

    
    
    
}
