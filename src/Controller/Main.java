/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Logica;
import View.ClientesUI;
import View.EmpleadosInsumosUI;
import View.MainWindow;
import View.MovimientosDiariosUI;
import View.ResumenUI;
import View.StockUI;

/**
 *
 * @author julia
 */
public class Main {

    private MainWindow ventanaPrincipal;
    private ClientesUI ventanaClientes;
    private EmpleadosInsumosUI ventanaEmpleados;
    private EmpleadosInsumosUI ventanaInsumos;
    private MovimientosDiariosUI ventanaMovimientos;
    private ResumenUI ventanaResumenes;
    private StockUI ventanaManejoStock;
    private Logica logica;
    private Coordinador coordinador;
    
    public static void main(String[] args){
        Main application = new Main();
        application.iniciar();
    }

    private void iniciar() {
        ventanaPrincipal = new MainWindow();
        ventanaClientes = new ClientesUI();
        ventanaEmpleados = new EmpleadosInsumosUI("Empleados");
        ventanaInsumos = new EmpleadosInsumosUI("Insumos");
        ventanaManejoStock = new StockUI();
        ventanaMovimientos = new MovimientosDiariosUI();
        ventanaResumenes = new ResumenUI();
        logica = new Logica();
        coordinador = new Coordinador();
        
        ventanaPrincipal.setCoordinador(this.coordinador);
        ventanaClientes.setCoordinador(this.coordinador);
        ventanaEmpleados.setCoordinador(this.coordinador);
        ventanaInsumos.setCoordinador(this.coordinador);
        ventanaManejoStock.setCoordinador(this.coordinador);
        ventanaMovimientos.setCoordinador(this.coordinador);
        ventanaResumenes.setCoordinador(this.coordinador);
        logica.setCoordinador(this.coordinador);
        
        coordinador.setMainWindow(this.ventanaPrincipal);
        coordinador.setVentanaClientes(this.ventanaClientes);
        coordinador.setVentanaEmpleados(this.ventanaEmpleados);
        coordinador.setVentanaInsumos(this.ventanaInsumos);
        coordinador.setVentanaStock(this.ventanaManejoStock);
        coordinador.setVentanaMovimientos(this.ventanaMovimientos);
        coordinador.setVentanaResumenes(this.ventanaResumenes);
        coordinador.setLogica(this.logica);
        
        ventanaPrincipal.setVentanaClientes(ventanaClientes);
        ventanaPrincipal.setVentanaEmpleados(ventanaEmpleados);
        ventanaPrincipal.setVentanaInsumos(ventanaInsumos);
        ventanaPrincipal.setVentanaStock(ventanaManejoStock);
        ventanaPrincipal.setVentanaMovimientos(ventanaMovimientos);
        ventanaPrincipal.setVentanaResumenes(ventanaResumenes);
        ventanaPrincipal.setVisible(logica.login());
        if(!ventanaPrincipal.isShowing()){
            System.exit(1);
        }
    }
    
}
