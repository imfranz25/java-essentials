/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.page;

import com.mycompany.java.essentials.ProductServiceImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author franc
 */
public class OrderScreen {
    public int getProductQuantity(int productId) throws IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int productQuantity = 0;
        
        while(productQuantity < 1) {
            
            System.out.println("""
                               ***********************
                               *     PLACE ORDER     *
                               ***********************
                               """);
            System.out.println("Name:\t"+productService.getProductName(productId));
            System.out.println("Price:\t"+productService.getProductPrice(productId));
            System.out.println("""
                               ....................... \n
                               How many do you want :
                               """);
            try {
                productQuantity = Integer.parseInt(input.readLine());
                if (productQuantity > 0) break;
            } catch(IOException | NumberFormatException e) {
                System.out.println("\nInvalid quantity, it must be higher than 0!");
            }
        }        
        
        return productQuantity;
    }
    
    public String getOrderConfirmation(Double total) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";
        
        while(true) {
            System.out.println("That would be Php\t" + total);
            System.out.println("Proceed with your order (Y/N) : ");
            choice = input.readLine().toUpperCase();
            if((choice.equals("Y") || choice.equals("N"))) {
                break;
            } else {
                System.out.println("Invalid Input, please try again!");
            }
        }
                        
        return choice;
    }
}
