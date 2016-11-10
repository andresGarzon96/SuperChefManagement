/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

/**
 *
 * @author julia
 */
public class Insumo {
    
    private String codInsumo;
    private String descripcion;

    public Insumo(String codInsumo, String descripcion) {
        this.codInsumo = codInsumo;
        this.descripcion = descripcion;
    }

    public String getCodInsumo() {
        return codInsumo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodInsumo(String codInsumo) {
        this.codInsumo = codInsumo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
