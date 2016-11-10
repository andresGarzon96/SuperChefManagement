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
public class Cliente {
    
    private String codigoTienda;
    private String nombreTienda;
    private String cedulaDueño;
    private String nitTienda;
    private String direccionTienda;
    private String telefonoTienda;
    private String emailTienda;
    private Ruta ruta;
    private boolean inhabilitado;

    public Cliente(String nombreTienda, String cedulaDueño, String nitTienda, String direccionTienda, String telefonoTienda) {
        this.nombreTienda = nombreTienda;
        this.cedulaDueño = cedulaDueño;
        this.nitTienda = nitTienda;
        this.direccionTienda = direccionTienda;
        this.telefonoTienda = telefonoTienda;
        this.inhabilitado = false;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getCedulaDueño() {
        return cedulaDueño;
    }

    public String getNitTienda() {
        return nitTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public String getTelefonoTienda() {
        return telefonoTienda;
    }

    public String getEmailTienda() {
        return emailTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }

    public void setNitTienda(String nitTienda) {
        this.nitTienda = nitTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public void setTelefonoTienda(String telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }

    public void setEmailTienda(String emailTienda) {
        this.emailTienda = emailTienda;
    }    

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public void setInhabilitado(boolean state) {
        this.inhabilitado = state;
    }
}
