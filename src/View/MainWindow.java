/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Coordinador;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class MainWindow extends javax.swing.JFrame {

    private Coordinador coordinador;
    private ClientesUI ventanaClientes;
    private EmpleadosInsumosUI ventanaEmpleados;
    private EmpleadosInsumosUI ventanaInsumos;
    private StockUI ventanaStock;
    private MovimientosDiariosUI ventanaMovimientos;
    private ResumenUI ventanaResumenes;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
        clientesMenuItem.addActionListener((ActionEvent ae) -> {
            ventanaClientes.setVisible(true);
            ventanaClientes.toFront();
            JOptionPane.showMessageDialog(ventanaClientes, "Seleccione el criterio de ordenamiento de la lista de clientes.", "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        empleadosMenuItem.addActionListener((ActionEvent ae) -> {
            ventanaEmpleados.setVisible(true);
            ventanaEmpleados.toFront();
        });
        insumosMenuItem.addActionListener((ActionEvent ae) -> {
            ventanaInsumos.setVisible(true);
            ventanaInsumos.toFront();
        });
        stockMenuItem.addActionListener((ActionEvent ae) -> {
            ventanaStock.setVisible(true);
            ventanaStock.toFront();
        });
        resumenMenuItem.addActionListener((ActionEvent ae) -> {
            ventanaResumenes.setVisible(true);
            ventanaResumenes.toFront();
        });
        movimientoMenuItem.addActionListener((ActionEvent ae) -> {
            ventanaMovimientos.setVisible(true);
            ventanaMovimientos.toFront();
        });
        aboutMenuItem.addActionListener((ActionEvent ae) -> {
            JOptionPane.showMessageDialog(MainWindow.this, "Versión 1.0 Realizada por:\n" + 
                                                            "Andrés Garzón Henao\n" + 
                                                            "Edwin Espinosa Zambrano", 
                                                            "Acerca de...", 
                                                            JOptionPane.INFORMATION_MESSAGE);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        clientesMenuItem = new javax.swing.JMenuItem();
        empleadosMenuItem = new javax.swing.JMenuItem();
        insumosMenuItem = new javax.swing.JMenuItem();
        mainMenuSeparator = new javax.swing.JPopupMenu.Separator();
        stockMenuItem = new javax.swing.JMenuItem();
        resumenMenuItem = new javax.swing.JMenuItem();
        movimientoMenuItem = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración Super Chef");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        mainDesktop.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        mainDesktop.setPreferredSize(new java.awt.Dimension(1280, 800));

        jPanel1.setLayout(new java.awt.GridLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jPanel1.add(jButton1);

        mainDesktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainDesktopLayout = new javax.swing.GroupLayout(mainDesktop);
        mainDesktop.setLayout(mainDesktopLayout);
        mainDesktopLayout.setHorizontalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainDesktopLayout.setVerticalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(mainDesktop);

        mainMenu.setText("Menú Inicial");

        clientesMenuItem.setText("Clientes");
        mainMenu.add(clientesMenuItem);

        empleadosMenuItem.setText("Empleados");
        mainMenu.add(empleadosMenuItem);

        insumosMenuItem.setText("Insumos");
        mainMenu.add(insumosMenuItem);
        mainMenu.add(mainMenuSeparator);

        stockMenuItem.setText("Gestionar Stock");
        mainMenu.add(stockMenuItem);

        resumenMenuItem.setText("Resumen de Inventarios");
        mainMenu.add(resumenMenuItem);

        movimientoMenuItem.setText("Movimiento Diario");
        mainMenu.add(movimientoMenuItem);

        menuBar.add(mainMenu);

        optionsMenu.setText("Opciones");
        menuBar.add(optionsMenu);

        aboutMenu.setText("Ayuda");

        aboutMenuItem.setText("Acerca de...");
        aboutMenu.add(aboutMenuItem);

        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem clientesMenuItem;
    private javax.swing.JMenuItem empleadosMenuItem;
    private javax.swing.JMenuItem insumosMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JPopupMenu.Separator mainMenuSeparator;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem movimientoMenuItem;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JMenuItem resumenMenuItem;
    private javax.swing.JMenuItem stockMenuItem;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public void setVentanaClientes(ClientesUI ventanaClientes) {
        this.ventanaClientes = ventanaClientes;
        this.ventanaClientes.setVisible(false);
        mainDesktop.add(this.ventanaClientes);
        
    }

    public void setVentanaEmpleados(EmpleadosInsumosUI ventanaEmpleados) {
        this.ventanaEmpleados = ventanaEmpleados;
        this.ventanaEmpleados.setVisible(false);
        mainDesktop.add(this.ventanaEmpleados);
    }

    public void setVentanaInsumos(EmpleadosInsumosUI ventanaInsumos) {
        this.ventanaInsumos = ventanaInsumos;
        this.ventanaInsumos.setVisible(false);
        mainDesktop.add(this.ventanaInsumos);
    }

    public void setVentanaStock(StockUI ventanaManejoStock) {
        this.ventanaStock = ventanaManejoStock;
        this.ventanaStock.setVisible(false);
        mainDesktop.add(this.ventanaStock);
    }

    public void setVentanaMovimientos(MovimientosDiariosUI ventanaMovimientos) {
        this.ventanaMovimientos = ventanaMovimientos;
        this.ventanaMovimientos.setVisible(false);
        mainDesktop.add(this.ventanaMovimientos);
    }

    public void setVentanaResumenes(ResumenUI ventanaResumenes) {
        this.ventanaResumenes = ventanaResumenes;
        this.ventanaResumenes.setVisible(false);
        mainDesktop.add(this.ventanaResumenes);
    }
}
