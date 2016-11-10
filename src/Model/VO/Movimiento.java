/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

import java.util.Date;

/**
 *
 * @author julia
 */
public class Movimiento {
    
    private String numTransaccion;
    private String nombreBanco;
    private Double cantidad;
    private Empleado cobrador;
    private Cliente cliente;
    private Date fechaMovimiento;

    public Movimiento(String numTransaccion, String nombreBanco, Double cantidad, Empleado cobrador, Cliente cliente) {
        this.numTransaccion = numTransaccion;
        this.nombreBanco = nombreBanco;
        this.cantidad = cantidad;
        this.cobrador = cobrador;
        this.cliente = cliente;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public Empleado getCobrador() {
        return cobrador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }
}
