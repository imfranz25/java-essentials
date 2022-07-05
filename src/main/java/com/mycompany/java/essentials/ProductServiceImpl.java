/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

import com.mycompany.java.essentials.service.ProductService;
import com.mycompany.java.essentials.db.ProductDataHolder;
import com.mycompany.java.essentials.model.ProductData;
import java.util.List;

/**
 *
 * @author franc
 */
public class ProductServiceImpl implements ProductService {

    /*
    This function get the product list -> from the ProductDataHolders
    */
    
    @Override
    public String getProductInfo() {
        String productList = "ID\tname\tPrice\n";
        ProductDataHolder productHolder = new ProductDataHolder();
        List<ProductData> productData = productHolder.getProductList();
        for(ProductData product: productData) {
            productList = productList.concat(product.getId()+
                    "\t"+product.getProductName()+
                    "\t"+product.getProductPrice()+"\n");
        }
        
        return productList;
    }

    @Override
    public void addProduct(String productName, Double productPrice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeProduct(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean checkProduct(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /*
    @param id -> id of the product
    This function get the product name -> based on the id passed as parameter
    */

    @Override
    public String getProductName(int id) {
        String productName = "";
        ProductDataHolder productHolder = new ProductDataHolder();
        List<ProductData> productList = productHolder.getProductList();
        
        for (ProductData product: productList) {
            if (product.getId()==id) {
                productName = product.getProductName();
                break;
            }
        }
        
        return productName;
    }
    
    /*
    @param id -> id of the product
    This function get the product price -> based on the id passed as parameter
    */

    @Override
    public Double getProductPrice(int id) {
        Double productPrice = 0d;
        ProductDataHolder productHolder = new ProductDataHolder();
        List<ProductData> productList = productHolder.getProductList();
        
        for (ProductData product: productList) {
            if (product.getId()==id) {
                productPrice = product.getProductPrice();
                break;
            }
        }
        
        return productPrice;
    }

    
}
