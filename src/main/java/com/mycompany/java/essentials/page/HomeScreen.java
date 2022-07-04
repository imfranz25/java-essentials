/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author franc
 */
public class HomeScreen {
    public void Admin() throws IOException {
        LoginScreen login = new LoginScreen();
        Scanner input = new Scanner(System.in);
        String choice = "";
        System.out.print("""
                         \n
                         ***********************
                         *    ADMINISTRATOR    *
                         ***********************
                         1 - Manage Products
                         2 - Manage Orders
                         ........................
                         0 - Logout \n
                         What do you want to do? 
                         """);
        choice = input.next();
        if (choice.equals("0")) {
            login.Login();
        } else if (choice.equals("1")) {
            System.out.print("Products");
        } else {
            System.out.print("Orders");
        }
        
    }
}
