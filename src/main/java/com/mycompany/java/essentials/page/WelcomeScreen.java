/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import java.util.Scanner;
/**
 *
 * @author franc
 */
public class WelcomeScreen {
    public String getWelcomeInput() {
        Scanner input = new Scanner(System.in);
        String choice = null;
        System.out.print("""
                         ********************
                         *Welcome to My Shop*
                         ********************
                         1 - Login
                         ********************
                         0 - Exit
                         ********************
                         What do you want to do? 
                         """);
        choice = input.next();
        return choice;
    }
}
