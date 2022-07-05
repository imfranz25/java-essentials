/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.db;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.java.essentials.model.ProductData;

/**
 *
 * @author franc
 */
public class ProductDataHolder {
    public static List<ProductData> productList = new ArrayList<>();
    
    public List<ProductData> getProductList() {
        return ProductDataHolder.productList;
    } 
    
    public void addProductToDb(ProductData product) {
        ProductDataHolder.productList.add(product);
    }
    
    public void removeProductToDb(ProductData product) {
        ProductDataHolder.productList.remove(product);
    }
}
