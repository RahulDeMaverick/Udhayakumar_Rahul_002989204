/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.OrderDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,RestaurantDirectory resDirectory, Menu menu,CustomerDirectory customerDirectory,OrderDirectory orderDir,DeliveryManDirectory deldir) {
        return new CustomerAreaJPanel(userProcessContainer,account,business,resDirectory,menu,customerDirectory,orderDir,deldir);
   
    }
    
    
}