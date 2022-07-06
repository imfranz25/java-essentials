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
public class MyOrdersScreen {
    
    public String showOrders() throws IOException {
        // INITIALIZATION
        OrderServiceImpl orders = new OrderServiceImpl();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String enter;
        
        System.out.println("""
                           ***********************
                           *      MY ORDERS      *
                           ***********************
                           """);
        System.out.println(orders.viewOrder());
        System.out.println("""
                           .......................
                           
                           Press "ENTER" to continue...
                           """);
        
        enter = input.readLine();
        
        return enter;
    }
    
}
