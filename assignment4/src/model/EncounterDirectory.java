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
public class EncounterDirectory {
    
    private ArrayList<Encounter> encounterCount;
    
    public EncounterDirectory() {
        encounterCount = new ArrayList();
    }


    public ArrayList<Encounter> getEncounterCount() {
        return encounterCount;
    }
    
    public Encounter addEncounter()
    {
        Encounter newec = new Encounter();
        encounterCount.add(newec);
        return newec;  
    }
    
}
