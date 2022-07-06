/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

import com.mycompany.java.essentials.page.HomeScreen;
import com.mycompany.java.essentials.page.OrderScreen;
import com.mycompany.java.essentials.page.ShopScreen;
import com.mycompany.java.essentials.page.MyOrdersScreen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author franc
 */
public class ManageOrders extends OrderServiceImpl {
    public void Shop() throws IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        ShopScreen shopScreen = new ShopScreen();
        HomeScreen home = new HomeScreen();
        OrderScreen order = new OrderScreen();
        
        // CHOICE INITIALIZATION
        int optionChoice;
        
        while(true) {
            try {
                optionChoice = Integer.parseInt(shopScreen.getShopChoice());
                if(optionChoice == 0) {
                    home.Customer();
                    break;
                } else {
                    if(productService.checkProduct(optionChoice)) {
                        
                        // optionChoice -> will be the product Id of users choice
                        int productQuantity = order.getProductQuantity(optionChoice);
                        // get the confirmation from user
                        String orderConfirmation = order.getOrderConfirmation(calculateTotal(productQuantity,productService.getProductPrice(optionChoice)));
                        if (orderConfirmation.equals("Y")) {
                            addOrder(optionChoice,productQuantity);
                            System.out.println("Order placed successfully");
                        } else {
                            System.out.println("\nOrder cancelled");
                        }
                    } else {
                        System.out.println("\nProduct does not exist !");
                    }
                }
            } catch(IOException | NumberFormatException e) {
                System.out.println("\nInvalid Input, Please try again!\n");
            }
        }
    }
    
    public void MyOrders() throws IOException {
        MyOrdersScreen orderScreen = new MyOrdersScreen();
        HomeScreen home = new HomeScreen();
        String enter;
        while(true) {
            enter = orderScreen.showOrders();
            if(enter.equals("")) {
                home.Customer();
                break;
            }
        }
    }
}
