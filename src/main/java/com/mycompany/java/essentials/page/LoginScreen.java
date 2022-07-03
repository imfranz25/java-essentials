/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import java.io.*;
import com.mycompany.java.essentials.LoginServiceImpl;
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
        LoginServiceImpl login = new LoginServiceImpl();

        // SHOW WELCOME SCREEN AND GET INPUT
        String choice = welcome.getWelcomeInput();

        // EVALUATE WELCOME INPUT
        if(choice.equals("1")) {
            
            String type = "";
            
            do {
                System.out.println("""
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
                    System.out.print("Your an admin");
                    break;
                } else if (type.equals("customer")) {
                    System.out.print("Your a customer");
                    break;
                } else {
                    System.out.println(type); 
                }
            } while(type.equals(""));
        } else if (choice.equals("0")) {
            System.out.println("Thank you for your service!");
        } else {
            System.out.println("Invalid Input");
        }
    }
    
}
