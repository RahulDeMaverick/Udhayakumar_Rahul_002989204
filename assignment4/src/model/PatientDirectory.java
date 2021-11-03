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
public class PatientDirectory {
    
    private ArrayList<Patient> patientData;
    
    public PatientDirectory() {
        patientData = new ArrayList();
    }


    public ArrayList<Patient> getPatientData() {
        return patientData;
    }
    
    public Patient addpatient()
    {
        Patient newpatient = new Patient();
        patientData.add(newpatient);
        return newpatient;  
    }
    
}
