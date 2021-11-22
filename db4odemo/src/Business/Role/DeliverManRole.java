/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,RestaurantDirectory resDirectory, Menu menu,CustomerDirectory customerDirectory,OrderDirectory orderDir,DeliveryManDirectory deldir) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business,resDirectory,menu,customerDirectory,orderDir,deldir);//To change body of generated methods, choose Tools | Templates.
  
    }
    
}