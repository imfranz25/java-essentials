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
public class ShopScreen extends ProductServiceImpl {
    public String getShopChoice() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                           \n
                           ***********************
                           *         SHOP        *
                           ***********************
                           """);
        System.out.println(getProductInfo());
        System.out.println("""  
                           ........................
                           0 - Back \n
                           What do you want to order ? 
                           """);
        String choice = input.readLine();
        return choice;
    }
}
