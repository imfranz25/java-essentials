/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.java.essentials.service;

/**
 *
 * @author franc
 */
public interface ProductService {
    
    public String getProductInfo();
    public void addProduct(String productName, Double productPrice);
    public void removeProduct(int id);
    public boolean checkProduct(int id);
    public String getProductName(int id);
    public Double getProductPrice(int id);
    
}
