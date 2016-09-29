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
public class AeronaveClass {

    private int idAeronave;
    private String matricula;
    private int horasVuelo;
    private int anioFabricacion;
    private String fechaMantencion;
    private int disponible;
    private int vigencia;
    private int tipoAeronave;
    private String fechaCreacion;

    public AeronaveClass() {
    }

    public AeronaveClass(int idAeronave, String matricula, int horasVuelo, int anioFabricacion, String fechaMantencion, int disponible, int vigencia, int tipoAeronave, String fechaCreacion) {
        this.idAeronave = idAeronave;
        this.matricula = matricula;
        this.horasVuelo = horasVuelo;
        this.anioFabricacion = anioFabricacion;
        this.fechaMantencion = fechaMantencion;
        this.disponible = disponible;
        this.vigencia = vigencia;
        this.tipoAeronave = tipoAeronave;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(int idAeronave) {
        this.idAeronave = idAeronave;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getFechaMantencion() {
        return fechaMantencion;
    }

    public void setFechaMantencion(String fechaMantencion) {
        this.fechaMantencion = fechaMantencion;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public int getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(int tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
}
