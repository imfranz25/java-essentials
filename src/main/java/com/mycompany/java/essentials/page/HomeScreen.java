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
    
    private LoginScreen login = new LoginScreen();
    private Scanner input = new Scanner(System.in);
    private String choice = "";

    public void Admin() throws IOException {
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
        this.choice = input.next();
        if (this.choice.equals("0")) {
            this.login.Login();
        } else if (this.choice.equals("1")) {
            System.out.print("Products");
        } else {
            System.out.print("Orders");
        }
    }
    
    public void Customer() throws IOException {
        System.out.print("""
                         \n
                         ***********************
                         *      CUSTOMER       *
                         ***********************
                         1 - Shop
                         2 - My Orders
                         ........................
                         0 - Logout \n
                         What do you want to do? 
                         """);
        this.choice = input.next();
        if (this.choice.equals("0")) {
            this.login.Login();
        } else if (this.choice.equals("1")) {
            System.out.print("Shop");
        } else {
            System.out.print("My Orders");
        }
    }
}
