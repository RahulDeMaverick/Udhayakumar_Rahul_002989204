/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.EcoSystem;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rahul Udhayakumar
 */
public class RestaurantDirectory {
    
       private ArrayList<Restaurant> resDirectory;

    public RestaurantDirectory(){
      this.resDirectory = new ArrayList<Restaurant>();
 
    }

    public ArrayList<Restaurant> getResDirectory() {
        return resDirectory;
    }

    public void setResDirectory(ArrayList<Restaurant> resDirectory) {
        this.resDirectory = resDirectory;
    }
    
    
    public void addRestaurant(Restaurant restaurant) {
       restaurant.setResNo("Restaurant "+(resDirectory.size()+1));
       resDirectory.add(restaurant);
    }
        public void deleteRestaurant(int index,EcoSystem system){
        String id = resDirectory.get(index).getResNo();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        resDirectory.remove(index);
    }
    
}
