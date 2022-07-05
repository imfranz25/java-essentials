/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

// Imports
import com.mycompany.java.essentials.model.UserData;
import com.mycompany.java.essentials.model.ProductData;
import com.mycompany.java.essentials.db.UserDataHolder;
import com.mycompany.java.essentials.db.ProductDataHolder;
import com.mycompany.java.essentials.page.LoginScreen;
import java.io.IOException;

/**
 *
 * @author franc
 */
public class Main {
    public static void main (String[]args) throws IOException {
        
        // LOGIN SCREEN INSTANCE
        LoginScreen loginScreen = new LoginScreen();
        
        // INITIALIZE ACCOUNT DETAILS
        UserData userData_1 = new UserData(0, "francis", "54321", "admin");
        UserData userData_2 = new UserData(1, "guest", "12345", "customer");
        
        // USER HOLDER -> STORE USERS DATA
        UserDataHolder userHolder = new UserDataHolder();

        // ADD TO USER LIST
        userHolder.setUserList(userData_1);
        userHolder.setUserList(userData_2);
        
        // INITIAL PRODUCTS
        ProductData product_1 = new ProductData(0, "Bread", 25.0);
        ProductData product_2 = new ProductData(0, "Ice Cream", 15.0);
        
        // PRODUCT HOLDER -> STORE PRODUCT DATA
        ProductDataHolder productHolder = new ProductDataHolder();
        
        // ADD TO USER LIST
        productHolder.addProductToDb(product_1);
        productHolder.addProductToDb(product_2);
        
        // RUN LOGIN SCREEN
        loginScreen.Login();
        
    }
}
