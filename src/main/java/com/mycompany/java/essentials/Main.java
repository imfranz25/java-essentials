/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

// Imports
import com.mycompany.java.essentials.model.UserData;
import com.mycompany.java.essentials.db.UserDataHolder;
/**
 *
 * @author franc
 */
public class Main {
    public static void main (String[]args) {
        
        // INITIALIZE ACCOUNT DETAILS
        UserData userData_1 = new UserData(0, "francis", "54321", "admin");
        UserData userData_2 = new UserData(1, "guest", "12345", "customer");
        
        // USER HOLDER -> STORE USERS DATA
        UserDataHolder userHolder = new UserDataHolder();

        // ADD TO USER LIST
        userHolder.setUserList(userData_1);
        userHolder.setUserList(userData_2);

    }
}
