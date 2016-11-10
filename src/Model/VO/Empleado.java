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
public class Empleado {
    
    private String codEmpleado;
    private String cedulaEmpleado;
    private String nombreCompleto;
    private String direccionEmpleado;
    private String telefonoEmpleado;
    private String emailEmpleado;
    private LinkedList<Ruta> rutasAsignadas;

    public Empleado(String cedulaEmpleado, String nombreCompleto, String direccionEmpleado, String telefonoEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.direccionEmpleado = direccionEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public LinkedList<Ruta> getRutasAsignadas() {
        return rutasAsignadas;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public void setRutasAsignadas(LinkedList<Ruta> rutasAsignadas) {
        this.rutasAsignadas = rutasAsignadas;
    }
}
