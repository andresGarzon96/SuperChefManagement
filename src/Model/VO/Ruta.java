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
public class Ruta {
    
    private final String codigoRuta;
    private String diaSemana;
    private String nombreLoteria;

    public Ruta(String codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getNombreLoteria() {
        return nombreLoteria;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setNombreLoteria(String nombreLoteria) {
        this.nombreLoteria = nombreLoteria;
    }
}
