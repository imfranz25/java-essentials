/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.java.essentials.service;

/**
 *
 * @author franc
 */
public interface OrderService {
    public void addOrder(int productId, int productQuantity);
    public Double calculateTotal(int productQuantity, Double productPrice);
    public String viewOrder();
    public boolean checkOrder(String referenceNumber);
    public void updateOrderStatus(String referenceNumber);
}
