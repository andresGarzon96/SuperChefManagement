/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Coordinador;
import Model.DAO.ClientesDAO;
import Model.VO.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Logica {
    
    public boolean login(){
        String user = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña de acceso");
        
        return user.equals("admin") && password.equals("superchef");
    }

    public void agregarCliente(Cliente c){
        ClientesDAO cDAO;
        if (c.getCedulaDueño().length() > 6 &&
                c.getDireccionTienda() != null &&
                c.getNitTienda().length() > 10 &&
                c.getNombreTienda() != null &&
                c.getTelefonoTienda().length() > 6){
            
            cDAO = new ClientesDAO();
            cDAO.registrarCliente(c);
            JOptionPane.showInternalMessageDialog(null, "Cliente Registrado!", "SuperChef", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showInternalMessageDialog(null, "Hay inconsistencias en los datos ingresados.\n Por favor revise.", 
                                                        "Error al registrar el cliente nuevo", 
                                                        JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inhabilitarCliente(Cliente c){
        int confirm = JOptionPane.showConfirmDialog(null, "Seguro que desea inhabilitar el cliente?");
        
        if(confirm == JOptionPane.YES_OPTION){
            c.setInhabilitado(true);
        }
    }
    
    public void setCoordinador(Coordinador coordinador) {
    }
    
}
