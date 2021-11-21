/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system,RestaurantDirectory resDirectory,Menu menu,CustomerDirectory customerDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, account,system,resDirectory, menu,customerDirectory);
    }
    
}
