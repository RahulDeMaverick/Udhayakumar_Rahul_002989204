/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rahuludhayakumar
 */
public class History {
   
    private ArrayList<cars> carshistory;
    
    public History(){
        
       this.carshistory = new ArrayList<cars>();
        
}

    public ArrayList<cars> getCarshistory() {
        return carshistory;
    }

    public void setCarshistory(ArrayList<cars> carshistory) {
        this.carshistory = carshistory;
    }
    
    
    public cars addcars()
    {
        cars newcars = new cars();
        carshistory.add(newcars);
        return newcars;  
    }

    public void deletecars(cars cr) {
       carshistory.remove(cr);
    }
    
}
