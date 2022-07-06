/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import com.mycompany.java.essentials.LoginServiceImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author franc
 */
public class LoginScreen {
    public void Login() throws IOException {
        // LIBRARIES
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // CLASS INSTANCE INITIALIZATION
        WelcomeScreen welcome = new WelcomeScreen();
        HomeScreen home = new HomeScreen();
        LoginServiceImpl login = new LoginServiceImpl();
        
        String type;
                
        do {
            // SHOW WELCOME SCREEN AND GET INPUT
            type = "default";
            // GET CHOICE FROM WELCOME SCREEN
            String choice;
            
            do {
                choice = welcome.getWelcomeInput();
                if (!(choice.equals("1") || choice.equals("0"))) System.out.println("\nInvalid Input\n");
            } while(!(choice.equals("1") || choice.equals("0")));
            
            // EVALUATE WELCOME INPUT
            if(choice.equals("1")) {
                System.out.println("""
                                   \n
                                 ***********************
                                 *        LOGIN        *
                                 ***********************
                                 """);

                System.out.println("Username :");
                String userName = input.readLine();
                System.out.println("Password :");
                String passWord = input.readLine();

                type  =  login.checkCredential(userName, passWord);

                if (type.equals("admin")) {
                    home.Admin();
                    break;
                } else if (type.equals("customer")) {
                    home.Customer();
                    break;
                } else {
                    System.out.println("\nInvalid Username or Password\n"); 
                }
            } else if (choice.equals("0")) {
                System.out.println("Thank you for your service!");
                break;
            }
        } while (type.equals(""));
    }
    
}
