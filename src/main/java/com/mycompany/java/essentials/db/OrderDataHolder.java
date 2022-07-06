/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.db;

import com.mycompany.java.essentials.model.OrderData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class OrderDataHolder {
    private static List<OrderData> orderList = new ArrayList<>();
    
    public List<OrderData> getOrderList() {
        return orderList;
    }
    
    public void addOrderToDb(OrderData order){
        OrderDataHolder.orderList.add(order);
    }
}
