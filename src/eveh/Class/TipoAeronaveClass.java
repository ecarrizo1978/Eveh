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
public class TipoAeronaveClass {
    private int id_tipo_Aeronave;
    private String detalle;
    private int vigencia;
    private String Vig;

    public TipoAeronaveClass() {
    }

    public TipoAeronaveClass(int id_tipo_Aeronave, String detalle, int vigencia, String Vig) {
        this.id_tipo_Aeronave = id_tipo_Aeronave;
        this.detalle = detalle;
        this.vigencia = vigencia;
        this.Vig = Vig;
    }

    public int getId_tipo_Aeronave() {
        return id_tipo_Aeronave;
    }

    public void setId_tipo_Aeronave(int id_tipo_Aeronave) {
        this.id_tipo_Aeronave = id_tipo_Aeronave;
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
