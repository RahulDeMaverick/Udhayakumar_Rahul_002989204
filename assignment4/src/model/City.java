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
public class City {
    
 private ArrayList<Community> communityData;
    
    public City() {
        communityData = new ArrayList();
    }


    public ArrayList<Community> getCommunityData() {
        return communityData;
    }
    
    public Community addCommunityData()
    {
        Community newcomm= new Community();
        communityData.add(newcomm);
        return newcomm;  
    }
    
}
