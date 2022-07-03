/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import java.util.Scanner;
import com.mycompany.java.essentials.LoginServiceImpl;
/**
 *
 * @author franc
 */
public class LoginScreen {
    
    public void Login() {
        // LIBRARIES
        Scanner input = new Scanner(System.in);
        // CLASS INSTANCE INITIALIZATION
        WelcomeScreen welcome = new WelcomeScreen();
        LoginServiceImpl login = new LoginServiceImpl();

        // SHOW WELCOME SCREEN AND GET INPUT
        String choice = welcome.getWelcomeInput();

        // EVALUATE WELCOME INPUT
        if(choice.equals("1")) {
            loop:
                while(true) {
                    System.out.println("""
                                     ***********************
                                     *        LOGIN        *
                                     ***********************
                                     """);
                    
                    System.out.print("Username :");
                    String userName = input.nextLine();
                    System.out.print("Password :");
                    String passWord = input.nextLine();
                    
                    String type  =  login.checkCredential(userName, passWord);
                    
                    if (type.equals("admin")) {
                        System.out.print("Your an admin");
                        break loop;
                    } else if (type.equals("customer")) {
                        System.out.print("Your an customer");
                        break loop;
                    } else {
                        System.out.println(type); 
                    }
                    
                }
        } else if (choice.equals("0")) {
            System.out.println("Thank you for your service!");
        } else {
            System.out.println("Invalid Input");
        }
    }
    
}
