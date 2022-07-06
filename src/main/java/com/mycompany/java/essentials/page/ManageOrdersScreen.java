/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import com.mycompany.java.essentials.OrderServiceImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author franc
 */
public class ManageOrdersScreen {
    public String setDelivered() throws IOException {
        OrderServiceImpl orderService = new OrderServiceImpl();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String choice = "default";
        while(true) {
            System.out.println("""
                              \n
                              ***********************
                              *       ORDERS        *
                              ***********************
                              """);
            System.out.println(orderService.viewOrder());
            System.out.println("""
                              .......................
                              1 - Mark Order As Delivered
                              0 - Back \n
                              What do you want to do?
                              """);
            choice = input.readLine();
            if((choice.equals("1") || choice.equals("0"))) {
                break;
            } else {
                System.out.println("\nInvalid input, please try again!");
            }
        }
        
        return choice;
    }
    
    public String UpdateOrderConfirmation() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String choice;

        System.out.println("""
                           \n
                           ***********************
                           * UPDATE ORDER STATUS *
                           ***********************
                           Order Reference (X to Cancel): 
                           """);
        choice = input.readLine();
        
        return choice;
    }
}
