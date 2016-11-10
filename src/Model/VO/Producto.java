/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

import java.util.LinkedList;

/**
 *
 * @author julia
 */
public class Producto {

    private String codPdto;
    private String nombrePdto;
    private double precioGramo;
    private double presentacion;
    private double valor;
    private LinkedList<Insumo> listaInsumos; // La lista de insumos que se usan para su producción.

    public Producto(String nombrePdto, double presentacion, double valor) {
        this.nombrePdto = nombrePdto;
        this.presentacion = presentacion;
        this.valor = valor;
        this.precioGramo = this.valor/this.presentacion;
    }

    public String getCodPdto() {
        return codPdto;
    }

    public String getNombrePdto() {
        return nombrePdto;
    }

    public double getPrecioGramo() {
        return precioGramo;
    }

    public double getPresentacion() {
        return presentacion;
    }

    public double getValor() {
        return valor;
    }

    public void setCodPdto(String codPdto) {
        this.codPdto = codPdto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNombrePdto(String nombrePdto) {
        this.nombrePdto = nombrePdto;
    }

    public void setPresentacion(double presentacion) {
        this.presentacion = presentacion;
    }

    public LinkedList<Insumo> getListaInsumos() {
        return listaInsumos;
    }

    public void setListaInsumos(LinkedList<Insumo> listaInsumos) {
        this.listaInsumos = listaInsumos;
    }
}
