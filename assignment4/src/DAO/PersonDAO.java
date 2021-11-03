/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author rahuludhayakumar
 */
public class PersonDAO {



    public static void poulatedata(PersonDirectory personList) {
        
        String dbURL = "jdbc:mysql://127.0.0.1:3306/local_db";
    String username = "root";
    String password = "Apple@950826";
   // Connection conn;
    try  {
       // Connection conn = DriverManager.getConnection(dbURL, username, password);
        for (Person vs : personList.getPersonList()) {
       
            //for (int i = 1; i < personList.getPersonList().size(); i++) {
            //int id = vs.getId();
            String fullname =vs.getFullname();
            int age = vs.getAge();
            String gender = vs.getGender();
            String address = vs.getAddress();
            String community = vs.getCommunity();
            String city = vs.getCity();
           // System.out.print("id"+id);
        
       Connection conn = DriverManager.getConnection(dbURL, username, password); 
   String sql = "INSERT INTO person1 (Name,Age,Sex,Apartment_Number,Community,City) VALUES (?,?,?,?,?,?)";
    PreparedStatement statement = conn.prepareStatement(sql);
    //statement.setString(1,  Integer.toString(id));
    statement.setString(1, fullname);
    statement.setString(2, Integer.toString(age));
    statement.setString(3, gender);
    statement.setString(4, address);
    statement.setString(5, community);
    statement.setString(6, city);
    

 
int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) {
    System.out.println("A new user was inserted successfully!");
}
    conn.close();
    }
    }
 catch (SQLException ex) {
    ex.printStackTrace();
}     
    }

    public static void updateTable() {


    }
    
 
    
}
