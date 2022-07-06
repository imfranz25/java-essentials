/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

import com.mycompany.java.essentials.ProductServiceImpl;
import com.mycompany.java.essentials.page.HomeScreen;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author franc
 */
public class ManageProducts extends ProductServiceImpl{
    public void Products() throws IOException {
        HomeScreen home = new HomeScreen();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";
        
        do {
            System.out.println("""
                         \n
                         ***********************
                         *      PRODUCTS       *
                         ***********************
                         """);
            System.out.println(getProductInfo());
            System.out.println("""
                             .......................
                             1 - Add New Product
                             2 - Remove Product
                             0 - Back
                             """);
            System.out.println("What do you want to do : ");
            choice = input.readLine();

            String productName;
            Double productPrice;

            if(choice.equals("0")) {
                home.Admin();
                break;
            } else if(choice.equals("1")) {
                System.out.println("""
                                    \n
                                    ***********************
                                    *     ADD PRODUCT     *
                                    ***********************
                                    """); 

                do {
                    System.out.println("Enter product name: ");
                    productName = input.readLine();
                    if (!productName.trim().equals("")) {
                        break;
                    } else {
                        System.out.println("Invalid input");
                    }
                } while(true);

                 do {
                    System.out.println("Enter product price: ");
                    productPrice = Double.parseDouble(input.readLine());
                    if (productPrice > 0) {
                        break;
                    } else {
                        System.out.println("Invalid input");
                    }
                } while(true);

                do {
                    System.out.println("Are you sure you want to add this product (Y/N) : ");
                    String isProductAdd = input.readLine();
                    if(isProductAdd.toUpperCase().equals("Y")) {
                        addProduct(productName, productPrice);
                        System.out.println("Product added successfully");
                        break;
                    } else if(isProductAdd.toUpperCase().equals("N")) {
                        System.out.println("Action Cancelled");
                        break;
                    } else {
                        System.out.println("Invalid input");
                    }

                } while(true);
            } else if(choice.equals("2")) {
                System.out.println("""
                                    \n
                                    ***********************
                                    *    REMOVE PRODUCT   *
                                    ***********************
                                   \n
                                    """); 
                do {
                    System.out.println("Enter Product ID: ");
                    try {
                        int productId = Integer.parseInt(input.readLine());
                        if (checkProduct(productId)) {
                            System.out.println(getProductName(productId)+" has been removed");
                            removeProduct(productId);
                            break;
                        } else{
                            System.out.println("Product does not exist !");
                            break;
                        }
                    } catch(IOException | NumberFormatException e) {
                        System.out.println("Invalid Id");
                    }
                } while(true);
            } else {
                System.out.println("Invalid Input");
            }
        } while (true);
    }
}
