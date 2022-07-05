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
public class ManageProducts {
    public void Products() {
        Scanner input = new Scanner(System.in);
        String choice = "";
        
        System.out.println("""
                         \n
                         ***********************
                         *      PRODUCTS       *
                         ***********************
                         No products found.
                         .......................
                         1 - Add New Product
                         2 - Remove Product
                         0 - Back
                         """);
        System.out.print("What do you want to do : ");
        choice = input.next();
    }
}
